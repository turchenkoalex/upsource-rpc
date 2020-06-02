# Upsource rpc kotlin client library ![Build Status](https://github.com/turchenkoalex/upsource-rpc/workflows/Gradle%20Check/badge.svg)

## Libraries

Core libraries:
* `client` - Core library. Contains RPC client class and DTO classes
* `webhooks` - Webhooks parser (based on jakson deserializer)

Serializers (required for `client`). Please use one of:
* `gson-serializer` - Gson TypeAdapters for core DTO classes
* `jakson-serializer` - Jakson Serializers and Deserializers for core DTO classes

Transports (required for `client`). Please use one of:
* `httpclient` - JDK 11 HttpClient wrapper
* `apache-httpclient` - Apache Commons Http Client wrapper

## Usage

### Upsource client

Create connection settings
```kotlin
val upsourceConnection = UpsourceConnection(
    serverUrl = "https://upsource.example.com",
    username = "user",
    password = "password"
)
```

Create client with default configuration (gson + JDK11 HttpClient)
```kotlin
val client = UpsourceRPC.newBuilder()
    .withHttpClient(upsourceConnection) // or .withApacheHttpClient(upsourceConnection)
    .withGsonSerializer() // or .withJaksonSerializer()
    .build()
```
Or use Apache Commons httpclient and jakson (or mix them)
```kotlin
val client = UpsourceRPC.newBuilder()
    .withApacheHttpClient(upsourceConnection)
    .withJaksonSerializer()
    .build()
```

You can configure httpclient
```kotlin
val httpClient = HttpClient.newBuilder()
                .connectTimeout(Duration.ofSeconds(5))
                .build()

val transport = HttpRpcTransport(upsourceConnection, httpClient)
val serializer = GsonSerializer()

val client = UpsourceRPC.newBuilder()
    .withTransport(transport)
    .withSerializer(serializer)
    .build()
```

Non fluent client factory method 
```kotlin
val transport = HttpRpcTransport(upsourceConnection) // or ApacheHttpRpcTransport(upsourceConnection)
val serializer = GsonSerializer() // or JaksonSerializer()
val client = ClientFactory.newUpsourceRPC(transport, serializer)
```

Client usage:
```kotlin
val closeRequest = CloseReviewRequestDTO(
    reviewId = ReviewIdDTO(projectId = "project", reviewId = "REVIEW-ID-101"),
    isFlagged = true
)

val closeResponse = client.closeReview(closeRequest) // rpc call
println(closeResponse)
```

Result of rpc call is RpcResponse sealed class
```kotlin
val revisionList = client.getRevisionReviewInfo(
    RevisionListDTO(
        projectId = "project",
        revisionId = listOf("006ga6b12c330cb1599184bc27bgf12bc521311")
    )
)

when (revisionList) {
    is RpcResponse.Ok -> {
        println(revisionList.result)
    }
    is RpcResponse.Error -> throw Error(revisionList.errorMessage)
}
```

### Webhooks parser usage example

```kotlin
val parser = Webhooks.newParser()

val response: String = req.someReadHttpResponseContent() // read input from http
val webhook = parser.parse(response)

when (webhook) {
    is Webhook.NewRevisionEventBeanWebhook -> {
        onReceiveNewRevision(webhook.data.revisionId)
    }
    else -> {
        // skip
    }
}
```

## Compatibility Matrix

|              | Upsource 2019.1.1644 |
|--------------|:--------------------:|
| Client 0.9.3 |           ✓          |

## Code generation

### Update upsource schema for code generation
```shell script
UPSOURCE_URL=https://upsource.example.com ./codegen/download-schema-jsons.sh
```

### Start client code generation
```shell script
./gradlew codegen:generate
```
