# Upsource rpc kotlin client library ![Build Status](https://github.com/turchenkoalex/upsource-rpc/workflows/Gradle%20Check/badge.svg) ![Release](https://img.shields.io/github/v/release/turchenkoalex/upsource-rpc)

## Libraries

Core libraries:
* `client` - Core library. Contains RPC client class and DTO classes
* `webhooks` - Webhooks parser (based on jackson deserializer)

Serializers (required for `client`). Please use one of:
* `gson-serializer` - Gson TypeAdapters for core DTO classes
* `jackson-serializer` - Jackson Serializers and Deserializers for core DTO classes

Transports (required for `client`). Please use one of:
* `httpclient` - JDK 11 HttpClient wrapper
* `apache-httpclient` - Apache Commons Http Client wrapper


## Usage

### Upsource client

Add build dependencies (gradle)
```groovy
repositories {
    maven {
        url = uri("https://maven.pkg.github.com/turchenkoalex/upsource-rpc")
        credentials {
            username = "github login"
            password = "access token with read packages"
        }
    }
}

dependencies {
    implementation("com.ecwid.upsource-rpc:client:0.9.7")

    // use one of:
    implementation("com.ecwid.upsource-rpc:gson-serializer:0.9.7")
    implementation("com.ecwid.upsource-rpc:jackson-serializer:0.9.7")

    // use one of:
    implementation("com.ecwid.upsource-rpc:httpclient:0.9.7")
    implementation("com.ecwid.upsource-rpc:apache-httpclient:0.9.7")
}
```
[How to create personal access token in github?](https://help.github.com/en/github/authenticating-to-github/creating-a-personal-access-token-for-the-command-line)


Create connection settings
```kotlin
val upsourceConnection = com.ecwid.upsource.transport.UpsourceConnection(
    serverUrl = "https://upsource.example.com",
    username = "user",
    password = "password"
)
```

Create client with default configuration (gson + JDK11 HttpClient)
```kotlin
import com.ecwid.upsource.serializer.gson.withGsonSerializer
import com.ecwid.upsource.transport.httpclient.withHttpClient

val client = com.ecwid.upsource.rpc.UpsourceRPC.newBuilder()
    .withHttpClient(upsourceConnection) // or .withApacheHttpClient(upsourceConnection)
    .withGsonSerializer() // or .withJacksonSerializer()
    .build()
```
Or use Apache Commons httpclient and jackson (or mix them)
```kotlin
import com.ecwid.upsource.serializer.jackson.withJacksonSerializer
import com.ecwid.upsource.transport.apache.withApacheHttpClient

val client = UpsourceRPC.newBuilder()
    .withApacheHttpClient(upsourceConnection)
    .withJacksonSerializer()
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
val serializer = GsonSerializer() // or JacksonSerializer()
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
    is RpcResponse.Error -> throw Error(revisionList.message)
}
```

### Extending library

#### Custom transport

Implement transport interface and use it with `.withTransport` method
```kotlin
class SampleTransport : com.ecwid.upsource.transport.RpcTransport {
    override fun makeRequest(methodPath: String, request: String): RpcTransportResponse {
        return RpcTransportResponse(statusCode = 200, content = "{}")
    }
}

val client = UpsourceRPC.newBuilder()
    .withTransport(SampleTransport())
    .withGsonSerializer()
    .build()
```

#### Custom serializer

Implement serializer interface and use it with `.withSerializer` method
```kotlin
class SampleSerializer : com.ecwid.upsource.serializer.Serializer {
    override fun serialize(request: Any): String {
        return "{}" // request json
    }

    override fun <T> deserialize(response: RpcTransportResponse, clazz: Class<T>): RpcResponse<T> {
        return RpcResponse.Error(code = 400, message = "Not implemented")
    }
}

val client = UpsourceRPC.newBuilder()
    .withHttpClient(upsourceConnection)
    .withSerializer(SampleSerializer())
.build()
```

## Webhooks

#### Usage

Add build dependencies (gradle)
```groovy
repositories {
    maven {
        url = uri("https://maven.pkg.github.com/turchenkoalex/upsource-rpc")
        credentials {
            username = "github login"
            password = "access token with read packages"
        }
    }
}

dependencies {
    implementation("com.ecwid.upsource-rpc:webhooks:0.9.7")
}
```
[How to create personal access token in github?](https://help.github.com/en/github/authenticating-to-github/creating-a-personal-access-token-for-the-command-line)

Create parser
```kotlin
val parser = WebhookParser.newParser()
```

Parse http request
```kotlin
val request: String = myReq.readRequestBody() // read input from http
val webhook: Webhook = parser.parse(response)

when (webhook) {
    is Webhook.NewRevisionEventBeanWebhook -> {
        // Use type safe webhook DTO
        onReceiveNewRevision(webhook.data.revisionId)
    }
    else -> {
        // skip
    }
}
```

#### Supported webhook types
* DeleteBranchEventBean
* DiscussionFeedEventBean
* FeedEventBean
* MergedToDefaultBranchEventBean
* NewBranchEventBean
* NewParticipantInReviewFeedEventBean
* NewRevisionEventBean
* ParticipantStateChangedFeedEventBean
* PullRequestMergedFeedEventBean
* ReactionToggledEventBean
* RemovedParticipantFromReviewFeedEventBean
* ReviewCreatedFeedEventBean
* ReviewDeadlineUpdatedFeedEventBean
* ReviewLabelChangedEventBean
* ReviewRemovedFeedEventBean
* ReviewSquashedFeedEventBean
* ReviewStateChangedFeedEventBean
* ReviewStoppedBranchTrackingFeedEventBean
* RevisionAddedToReviewFeedEventBean
* RevisionRemovedFromReviewFeedEventBean
* UserIdBean


## Compatibility Matrix

| Client |  Upsource   |
|--------|:-----------:|
| 0.9.8  | 2020.1.1815 |
|        | 2020.1.1802 |
|        | 2020.1.1782 |
|        | 2020.1.1774 |
|        | 2020.1.1759 |
| 0.9.7  | 2020.1.1793 |
|        | 2020.1.1782 |
|        | 2020.1.1774 |
|        | 2020.1.1759 |
| 0.9.6  | 2019.1.1717 |
| 0.9.5  | 2019.1.1717 |
| 0.9.4  | 2019.1.1644 | 


## Code generation

### Update upsource schema for code generation
```shell script
UPSOURCE_URL=https://upsource.example.com ./codegen/download-schema-jsons.sh
```

### Start client code generation
```shell script
./gradlew codegen:generate
```
