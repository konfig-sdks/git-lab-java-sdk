

# APIEntitiesJob

API_Entities_Job model

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | The ID of the job |  [optional] |
|**name** | **String** | The name of the job |  [optional] |
|**status** | **String** | The current status of the job |  [optional] |
|**stage** | **String** | The stage of the job in the CI/CD pipeline |  [optional] |
|**createdAt** | **OffsetDateTime** | The creation time of the job |  [optional] |
|**startedAt** | **OffsetDateTime** | The start time of the job |  [optional] |
|**finishedAt** | **OffsetDateTime** | The finish time of the job |  [optional] |
|**commit** | [**APIEntitiesCommit**](APIEntitiesCommit.md) |  |  [optional] |
|**archived** | **Boolean** | Indicates if the job is archived |  [optional] |
|**allowFailure** | **Boolean** | Indicates if the job is allowed to fail |  [optional] |
|**erasedAt** | **OffsetDateTime** | The time when the job was erased, if applicable |  [optional] |
|**duration** | **Integer** | The duration of the job in seconds |  [optional] |
|**queuedDuration** | **Double** | The duration the job was queued before execution, in seconds |  [optional] |
|**ref** | **String** | The reference for the job |  [optional] |
|**artifacts** | **List** | The artifacts produced by the job |  [optional] |
|**tag** | **Boolean** | Indicates if the job is tagged |  [optional] |
|**webUrl** | **String** | The URL for accessing the job in the web interface |  [optional] |
|**project** | [**APIEntitiesJobProject**](APIEntitiesJobProject.md) |  |  [optional] |
|**user** | [**APIEntitiesUserBasic**](APIEntitiesUserBasic.md) |  |  [optional] |



