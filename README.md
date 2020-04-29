# upsource rpc kotlin client library

Usage:
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

### Update teamcity schemas
```
UPSOURCE_URL=https://upsource.example.com ./gen/schemas/update-schemas.sh
cd ./gen
node ./generator.js
```
