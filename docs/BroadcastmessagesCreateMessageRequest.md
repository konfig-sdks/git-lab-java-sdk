

# BroadcastmessagesCreateMessageRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**message** | **String** | Message to display |  |
|**startsAt** | **OffsetDateTime** | Starting time |  [optional] |
|**endsAt** | **OffsetDateTime** | Ending time |  [optional] |
|**color** | **String** | Background color |  [optional] |
|**font** | **String** | Foreground color |  [optional] |
|**targetAccessLevels** | [**List&lt;TargetAccessLevelsEnum&gt;**](#List&lt;TargetAccessLevelsEnum&gt;) | Target user roles |  [optional] |
|**targetPath** | **String** | Target path |  [optional] |
|**broadcastType** | [**BroadcastTypeEnum**](#BroadcastTypeEnum) | Broadcast type. Defaults to banner |  [optional] |
|**dismissable** | **Boolean** | Is dismissable |  [optional] |



## Enum: List&lt;TargetAccessLevelsEnum&gt;

| Name | Value |
|---- | -----|
| NUMBER_10 | 10 |
| NUMBER_20 | 20 |
| NUMBER_30 | 30 |
| NUMBER_40 | 40 |
| NUMBER_50 | 50 |



## Enum: BroadcastTypeEnum

| Name | Value |
|---- | -----|
| BANNER | &quot;banner&quot; |
| NOTIFICATION | &quot;notification&quot; |



