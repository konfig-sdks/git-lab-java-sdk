

# ClustersAddExistingKubernetesInstanceClusterRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Cluster name |  |
|**enabled** | **Boolean** | Determines if cluster is active or not, defaults to true |  [optional] |
|**environmentScope** | **String** | The associated environment to the cluster |  [optional] |
|**namespacePerEnvironment** | **Boolean** | Deploy each environment to a separate Kubernetes namespace |  [optional] |
|**domain** | **String** | Cluster base domain |  [optional] |
|**managementProjectId** | **Integer** | The ID of the management project |  [optional] |
|**managed** | **Boolean** | Determines if GitLab will manage namespaces and service accounts for this cluster, defaults to true |  [optional] |
|**platformKubernetesAttributesApiUrl** | **String** | URL to access the Kubernetes API |  |
|**platformKubernetesAttributesToken** | **String** | Token to authenticate against Kubernetes |  |
|**platformKubernetesAttributesCaCert** | **String** | TLS certificate (needed if API is using a self-signed TLS certificate) |  [optional] |
|**platformKubernetesAttributesNamespace** | **String** | Unique namespace related to Project |  [optional] |
|**platformKubernetesAttributesAuthorizationType** | [**PlatformKubernetesAttributesAuthorizationTypeEnum**](#PlatformKubernetesAttributesAuthorizationTypeEnum) | Cluster authorization type, defaults to RBAC |  [optional] |



## Enum: PlatformKubernetesAttributesAuthorizationTypeEnum

| Name | Value |
|---- | -----|
| UNKNOWN_AUTHORIZATION | &quot;unknown_authorization&quot; |
| RBAC | &quot;rbac&quot; |
| ABAC | &quot;abac&quot; |



