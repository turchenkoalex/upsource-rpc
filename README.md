# Upsource rpc kotlin client library ![Build Status](https://github.com/turchenkoalex/upsource-rpc/workflows/Gradle%20Check/badge.svg)

### Client

```
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

```
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
```
val parser = Webhooks.newParser()

val response: String = req.someReadHttpResponseContent()
val webhook = parser.parse(response)

when (webhook) {
    is Webhook.NewRevisionEventBeanWebhook -> {
        onReceiveNewRevision(webhook.data.revisionId)
    }
}
```

### Update upsource schema for code generation
```
UPSOURCE_URL=https://upsource.example.com ./codegen/download-schema-jsons.sh
```

### Start client code generation
```
./gradlew codegen:generate
```
