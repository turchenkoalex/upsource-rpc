# Upsource rpc kotlin client library ![Build Status](https://github.com/turchenkoalex/upsource-rpc/workflows/Gradle%20Check/badge.svg)

### Libraries

| Library           | Description                                             |
|-------------------|---------------------------------------------------------|
| client            | Core library. Contains RPC client class and DTO classes |
| webhooks          | Webhooks parser (based on jakson deserializer)          |

| Serializers (use one of) | Description                                               |
|--------------------------|-----------------------------------------------------------|
| gson-serializer          | Gson TypeAdapters for core DTO classes                    |
| jakson-serializer        | Jakson Serializers and Deserializers for core DTO classes |


| Transports (use one of) | Description                        |
|-------------------------|------------------------------------|
| httpclient              | JDK 11 HttpClient wrapper          |
| apache-httpclient       | Apache Commons Http Client wrapper |

### Client

```kotlin
val upsourceConnection = UpsourceConnection(
    serverUrl = "https://upsource.example.com",
    username = "user",
    password = "password"
)

val httpClient = HttpClient.newBuilder()
                .connectTimeout(Duration.ofSeconds(5))
                .build()

val transport = HttpRpcTransport(upsourceConnection, httpClient)
val serializer = GsonSerializer()

val client = UpsourceRPC.newBuilder()
    .withTransport(transport)
    .withSerializer(serializer)
    .build()

// or just use extensions

val client = UpsourceRPC.newBuilder()
    .withHttpClient(upsourceConnection)
    .withGsonSerializer()
    .build()


val closeRequest = CloseReviewRequestDTO(
    reviewId = ReviewIdDTO(projectId = "project", reviewId = "REVIEW-ID-101"),
    isFlagged = true
)

val closeResponse = client.closeReview(closeRequest)
println(closeResponse)
```

OR use with one line builder

```kotlin
val upsourceConnection = UpsourceConnection(
    serverUrl = "https://upsource.example.com",
    username = "user",
    password = "password"
)

val transport = HttpRpcTransport(upsourceConnection)
val serializer = GsonSerializer()
val client = ClientFactory.newUpsourceRPC(transport, serializer)

val revisionList = client.getRevisionReviewInfo(
    RevisionListDTO(
        projectId = "project",
        revisionId = listOf("006ga6b12c330cb1599184bc27bgf12bc521311")
    )
)

when (revisionList) {
    is RpcResponse.Ok -> {
        // some logic
    }
    is RpcResponse.Error -> throw Error("Error")
}
```

### Webhooks parser
```kotlin
val parser = Webhooks.newParser()

val response: String = req.someReadHttpResponseContent()
val webhook = parser.parse(response)

when (webhook) {
    is Webhook.NewRevisionEventBeanWebhook -> {
        onReceiveNewRevision(webhook.data.revisionId)
    }
}
```

### Compatibility Matrix

|              | Upsource 2019.1.1644 |
|--------------|:--------------------:|
| Client 0.9.3 |           ✓          |

### Update upsource schema for code generation
```shell script
UPSOURCE_URL=https://upsource.example.com ./codegen/download-schema-jsons.sh
```

### Start client code generation
```shell script
./gradlew codegen:generate
```
