

# ClustersUpdateInstanceClusterRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Cluster name |  [optional] |
|**enabled** | **Boolean** | Enable or disable Gitlab&#39;s connection to your Kubernetes cluster |  [optional] |
|**environmentScope** | **String** | The associated environment to the cluster |  [optional] |
|**namespacePerEnvironment** | **Boolean** | Deploy each environment to a separate Kubernetes namespace |  [optional] |
|**domain** | **String** | Cluster base domain |  [optional] |
|**managementProjectId** | **Integer** | The ID of the management project |  [optional] |
|**managed** | **Boolean** | Determines if GitLab will manage namespaces and service accounts for this cluster |  [optional] |
|**platformKubernetesAttributesApiUrl** | **String** | URL to access the Kubernetes API |  [optional] |
|**platformKubernetesAttributesToken** | **String** | Token to authenticate against Kubernetes |  [optional] |
|**platformKubernetesAttributesCaCert** | **String** | TLS certificate (needed if API is using a self-signed TLS certificate) |  [optional] |
|**platformKubernetesAttributesNamespace** | **String** | Unique namespace related to Project |  [optional] |



