

# APIEntitiesBulkImport

API_Entities_BulkImport model

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**sourceType** | **String** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| CREATED | &quot;created&quot; |
| STARTED | &quot;started&quot; |
| FINISHED | &quot;finished&quot; |
| TIMEOUT | &quot;timeout&quot; |
| FAILED | &quot;failed&quot; |



