

# APIEntitiesBulkImports

API_Entities_BulkImports model

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [optional] |
|**bulkImportId** | **Integer** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**entityType** | [**EntityTypeEnum**](#EntityTypeEnum) |  |  [optional] |
|**sourceFullPath** | **String** |  |  [optional] |
|**destinationFullPath** | **String** |  |  [optional] |
|**destinationName** | **String** |  |  [optional] |
|**destinationSlug** | **String** |  |  [optional] |
|**destinationNamespace** | **String** |  |  [optional] |
|**parentId** | **Integer** |  |  [optional] |
|**namespaceId** | **Integer** |  |  [optional] |
|**projectId** | **Integer** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |
|**failures** | [**List&lt;APIEntitiesBulkImportsEntityFailure&gt;**](APIEntitiesBulkImportsEntityFailure.md) |  |  [optional] |
|**migrateProjects** | **Boolean** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| CREATED | &quot;created&quot; |
| STARTED | &quot;started&quot; |
| FINISHED | &quot;finished&quot; |
| TIMEOUT | &quot;timeout&quot; |
| FAILED | &quot;failed&quot; |



## Enum: EntityTypeEnum

| Name | Value |
|---- | -----|
| GROUP | &quot;group&quot; |
| PROJECT | &quot;project&quot; |



