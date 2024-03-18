

# BulkimportsStartNewMigrationRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**configurationUrl** | **String** | Source GitLab instance URL |  |
|**configurationAccessToken** | **String** | Access token to the source GitLab instance |  |
|**entitiesSourceType** | [**List&lt;EntitiesSourceTypeEnum&gt;**](#List&lt;EntitiesSourceTypeEnum&gt;) | Source entity type |  |
|**entitiesSourceFullPath** | **List&lt;String&gt;** | Relative path of the source entity to import |  |
|**entitiesDestinationNamespace** | **List&lt;String&gt;** | Destination namespace for the entity |  |
|**entitiesDestinationSlug** | **List&lt;String&gt;** | Destination slug for the entity |  [optional] |
|**entitiesDestinationName** | **List&lt;String&gt;** | Deprecated: Use :destination_slug instead. Destination slug for the entity |  [optional] |
|**entitiesMigrateProjects** | **List&lt;Boolean&gt;** | Indicates group migration should include nested projects |  [optional] |



## Enum: List&lt;EntitiesSourceTypeEnum&gt;

| Name | Value |
|---- | -----|
| GROUP_ENTITY | &quot;group_entity&quot; |
| PROJECT_ENTITY | &quot;project_entity&quot; |



