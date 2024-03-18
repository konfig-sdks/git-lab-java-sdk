

# PlanlimitsModifyLimitsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**planName** | [**PlanNameEnum**](#PlanNameEnum) | Name of the plan to update |  |
|**ciPipelineSize** | **Integer** | Maximum number of jobs in a single pipeline |  [optional] |
|**ciActiveJobs** | **Integer** | Total number of jobs in currently active pipelines |  [optional] |
|**ciProjectSubscriptions** | **Integer** | Maximum number of pipeline subscriptions to and from a project |  [optional] |
|**ciPipelineSchedules** | **Integer** | Maximum number of pipeline schedules |  [optional] |
|**ciNeedsSizeLimit** | **Integer** | Maximum number of DAG dependencies that a job can have |  [optional] |
|**ciRegisteredGroupRunners** | **Integer** | Maximum number of runners registered per group |  [optional] |
|**ciRegisteredProjectRunners** | **Integer** | Maximum number of runners registered per project |  [optional] |
|**conanMaxFileSize** | **Integer** | Maximum Conan package file size in bytes |  [optional] |
|**enforcementLimit** | **Integer** | Maximum storage size for the root namespace enforcement in MiB |  [optional] |
|**genericPackagesMaxFileSize** | **Integer** | Maximum generic package file size in bytes |  [optional] |
|**helmMaxFileSize** | **Integer** | Maximum Helm chart file size in bytes |  [optional] |
|**mavenMaxFileSize** | **Integer** | Maximum Maven package file size in bytes |  [optional] |
|**notificationLimit** | **Integer** | Maximum storage size for the root namespace notifications in MiB |  [optional] |
|**npmMaxFileSize** | **Integer** | Maximum NPM package file size in bytes |  [optional] |
|**nugetMaxFileSize** | **Integer** | Maximum NuGet package file size in bytes |  [optional] |
|**pypiMaxFileSize** | **Integer** | Maximum PyPI package file size in bytes |  [optional] |
|**terraformModuleMaxFileSize** | **Integer** | Maximum Terraform Module package file size in bytes |  [optional] |
|**storageSizeLimit** | **Integer** | Maximum storage size for the root namespace in MiB |  [optional] |
|**pipelineHierarchySize** | **Integer** | Maximum number of downstream pipelines in a pipeline&#39;s hierarchy tree |  [optional] |



## Enum: PlanNameEnum

| Name | Value |
|---- | -----|
| DEFAULT | &quot;default&quot; |
| FREE | &quot;free&quot; |
| BRONZE | &quot;bronze&quot; |
| SILVER | &quot;silver&quot; |
| PREMIUM | &quot;premium&quot; |
| GOLD | &quot;gold&quot; |
| ULTIMATE | &quot;ultimate&quot; |
| ULTIMATE_TRIAL | &quot;ultimate_trial&quot; |
| PREMIUM_TRIAL | &quot;premium_trial&quot; |
| OPENSOURCE | &quot;opensource&quot; |



