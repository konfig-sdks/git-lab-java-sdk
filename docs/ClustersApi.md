# ClustersApi

All URIs are relative to *https://www.gitlab.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addExistingKubernetesInstanceCluster**](ClustersApi.md#addExistingKubernetesInstanceCluster) | **POST** /api/v4/admin/clusters/add | Add existing instance cluster |
| [**deleteInstanceCluster**](ClustersApi.md#deleteInstanceCluster) | **DELETE** /api/v4/admin/clusters/{cluster_id} | Delete instance cluster |
| [**getSingleInstanceCluster**](ClustersApi.md#getSingleInstanceCluster) | **GET** /api/v4/admin/clusters/{cluster_id} | Get a single instance cluster |
| [**listInstanceClusters**](ClustersApi.md#listInstanceClusters) | **GET** /api/v4/admin/clusters | List instance clusters |
| [**updateInstanceCluster**](ClustersApi.md#updateInstanceCluster) | **PUT** /api/v4/admin/clusters/{cluster_id} | Edit instance cluster |


<a name="addExistingKubernetesInstanceCluster"></a>
# **addExistingKubernetesInstanceCluster**
> APIEntitiesCluster addExistingKubernetesInstanceCluster(clustersAddExistingKubernetesInstanceClusterRequest).execute();

Add existing instance cluster

This feature was introduced in GitLab 13.2. Adds an existing Kubernetes instance cluster.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GitLab;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ClustersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://www.gitlab.com/api";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    GitLab client = new GitLab(configuration);
    String name = "name_example"; // Cluster name
    String platformKubernetesAttributesApiUrl = "platformKubernetesAttributesApiUrl_example"; // URL to access the Kubernetes API
    String platformKubernetesAttributesToken = "platformKubernetesAttributesToken_example"; // Token to authenticate against Kubernetes
    Boolean enabled = true; // Determines if cluster is active or not, defaults to true
    String environmentScope = "*"; // The associated environment to the cluster
    Boolean namespacePerEnvironment = true; // Deploy each environment to a separate Kubernetes namespace
    String domain = "domain_example"; // Cluster base domain
    Integer managementProjectId = 56; // The ID of the management project
    Boolean managed = true; // Determines if GitLab will manage namespaces and service accounts for this cluster, defaults to true
    String platformKubernetesAttributesCaCert = "platformKubernetesAttributesCaCert_example"; // TLS certificate (needed if API is using a self-signed TLS certificate)
    String platformKubernetesAttributesNamespace = "platformKubernetesAttributesNamespace_example"; // Unique namespace related to Project
    String platformKubernetesAttributesAuthorizationType = "unknown_authorization"; // Cluster authorization type, defaults to RBAC
    try {
      APIEntitiesCluster result = client
              .clusters
              .addExistingKubernetesInstanceCluster(name, platformKubernetesAttributesApiUrl, platformKubernetesAttributesToken)
              .enabled(enabled)
              .environmentScope(environmentScope)
              .namespacePerEnvironment(namespacePerEnvironment)
              .domain(domain)
              .managementProjectId(managementProjectId)
              .managed(managed)
              .platformKubernetesAttributesCaCert(platformKubernetesAttributesCaCert)
              .platformKubernetesAttributesNamespace(platformKubernetesAttributesNamespace)
              .platformKubernetesAttributesAuthorizationType(platformKubernetesAttributesAuthorizationType)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getDomain());
      System.out.println(result.getEnabled());
      System.out.println(result.getManaged());
      System.out.println(result.getProviderType());
      System.out.println(result.getPlatformType());
      System.out.println(result.getEnvironmentScope());
      System.out.println(result.getClusterType());
      System.out.println(result.getNamespacePerEnvironment());
      System.out.println(result.getUser());
      System.out.println(result.getPlatformKubernetes());
      System.out.println(result.getProviderGcp());
      System.out.println(result.getManagementProject());
    } catch (ApiException e) {
      System.err.println("Exception when calling ClustersApi#addExistingKubernetesInstanceCluster");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<APIEntitiesCluster> response = client
              .clusters
              .addExistingKubernetesInstanceCluster(name, platformKubernetesAttributesApiUrl, platformKubernetesAttributesToken)
              .enabled(enabled)
              .environmentScope(environmentScope)
              .namespacePerEnvironment(namespacePerEnvironment)
              .domain(domain)
              .managementProjectId(managementProjectId)
              .managed(managed)
              .platformKubernetesAttributesCaCert(platformKubernetesAttributesCaCert)
              .platformKubernetesAttributesNamespace(platformKubernetesAttributesNamespace)
              .platformKubernetesAttributesAuthorizationType(platformKubernetesAttributesAuthorizationType)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ClustersApi#addExistingKubernetesInstanceCluster");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **clustersAddExistingKubernetesInstanceClusterRequest** | [**ClustersAddExistingKubernetesInstanceClusterRequest**](ClustersAddExistingKubernetesInstanceClusterRequest.md)|  | |

### Return type

[**APIEntitiesCluster**](APIEntitiesCluster.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Add existing instance cluster |  -  |
| **400** | Validation error |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |

<a name="deleteInstanceCluster"></a>
# **deleteInstanceCluster**
> APIEntitiesCluster deleteInstanceCluster(clusterId).execute();

Delete instance cluster

This feature was introduced in GitLab 13.2. Deletes an existing instance cluster. Does not remove existing resources within the connected Kubernetes cluster.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GitLab;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ClustersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://www.gitlab.com/api";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    GitLab client = new GitLab(configuration);
    Integer clusterId = 56; // The cluster ID
    try {
      APIEntitiesCluster result = client
              .clusters
              .deleteInstanceCluster(clusterId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getDomain());
      System.out.println(result.getEnabled());
      System.out.println(result.getManaged());
      System.out.println(result.getProviderType());
      System.out.println(result.getPlatformType());
      System.out.println(result.getEnvironmentScope());
      System.out.println(result.getClusterType());
      System.out.println(result.getNamespacePerEnvironment());
      System.out.println(result.getUser());
      System.out.println(result.getPlatformKubernetes());
      System.out.println(result.getProviderGcp());
      System.out.println(result.getManagementProject());
    } catch (ApiException e) {
      System.err.println("Exception when calling ClustersApi#deleteInstanceCluster");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<APIEntitiesCluster> response = client
              .clusters
              .deleteInstanceCluster(clusterId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ClustersApi#deleteInstanceCluster");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **clusterId** | **Integer**| The cluster ID | |

### Return type

[**APIEntitiesCluster**](APIEntitiesCluster.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Delete instance cluster |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |

<a name="getSingleInstanceCluster"></a>
# **getSingleInstanceCluster**
> APIEntitiesCluster getSingleInstanceCluster(clusterId).execute();

Get a single instance cluster

This feature was introduced in GitLab 13.2. Returns a single instance cluster.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GitLab;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ClustersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://www.gitlab.com/api";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    GitLab client = new GitLab(configuration);
    Integer clusterId = 56; // The cluster ID
    try {
      APIEntitiesCluster result = client
              .clusters
              .getSingleInstanceCluster(clusterId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getDomain());
      System.out.println(result.getEnabled());
      System.out.println(result.getManaged());
      System.out.println(result.getProviderType());
      System.out.println(result.getPlatformType());
      System.out.println(result.getEnvironmentScope());
      System.out.println(result.getClusterType());
      System.out.println(result.getNamespacePerEnvironment());
      System.out.println(result.getUser());
      System.out.println(result.getPlatformKubernetes());
      System.out.println(result.getProviderGcp());
      System.out.println(result.getManagementProject());
    } catch (ApiException e) {
      System.err.println("Exception when calling ClustersApi#getSingleInstanceCluster");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<APIEntitiesCluster> response = client
              .clusters
              .getSingleInstanceCluster(clusterId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ClustersApi#getSingleInstanceCluster");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **clusterId** | **Integer**| The cluster ID | |

### Return type

[**APIEntitiesCluster**](APIEntitiesCluster.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get a single instance cluster |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |

<a name="listInstanceClusters"></a>
# **listInstanceClusters**
> List&lt;APIEntitiesCluster&gt; listInstanceClusters().execute();

List instance clusters

This feature was introduced in GitLab 13.2. Returns a list of instance clusters.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GitLab;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ClustersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://www.gitlab.com/api";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    GitLab client = new GitLab(configuration);
    try {
      List<APIEntitiesCluster> result = client
              .clusters
              .listInstanceClusters()
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClustersApi#listInstanceClusters");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<APIEntitiesCluster>> response = client
              .clusters
              .listInstanceClusters()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ClustersApi#listInstanceClusters");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;APIEntitiesCluster&gt;**](APIEntitiesCluster.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List instance clusters |  -  |
| **403** | Forbidden |  -  |

<a name="updateInstanceCluster"></a>
# **updateInstanceCluster**
> APIEntitiesCluster updateInstanceCluster(clusterId).clustersUpdateInstanceClusterRequest(clustersUpdateInstanceClusterRequest).execute();

Edit instance cluster

This feature was introduced in GitLab 13.2. Updates an existing instance cluster.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GitLab;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ClustersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://www.gitlab.com/api";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    GitLab client = new GitLab(configuration);
    Integer clusterId = 56; // The cluster ID
    String name = "name_example"; // Cluster name
    Boolean enabled = true; // Enable or disable Gitlab's connection to your Kubernetes cluster
    String environmentScope = "environmentScope_example"; // The associated environment to the cluster
    Boolean namespacePerEnvironment = true; // Deploy each environment to a separate Kubernetes namespace
    String domain = "domain_example"; // Cluster base domain
    Integer managementProjectId = 56; // The ID of the management project
    Boolean managed = true; // Determines if GitLab will manage namespaces and service accounts for this cluster
    String platformKubernetesAttributesApiUrl = "platformKubernetesAttributesApiUrl_example"; // URL to access the Kubernetes API
    String platformKubernetesAttributesToken = "platformKubernetesAttributesToken_example"; // Token to authenticate against Kubernetes
    String platformKubernetesAttributesCaCert = "platformKubernetesAttributesCaCert_example"; // TLS certificate (needed if API is using a self-signed TLS certificate)
    String platformKubernetesAttributesNamespace = "platformKubernetesAttributesNamespace_example"; // Unique namespace related to Project
    try {
      APIEntitiesCluster result = client
              .clusters
              .updateInstanceCluster(clusterId)
              .name(name)
              .enabled(enabled)
              .environmentScope(environmentScope)
              .namespacePerEnvironment(namespacePerEnvironment)
              .domain(domain)
              .managementProjectId(managementProjectId)
              .managed(managed)
              .platformKubernetesAttributesApiUrl(platformKubernetesAttributesApiUrl)
              .platformKubernetesAttributesToken(platformKubernetesAttributesToken)
              .platformKubernetesAttributesCaCert(platformKubernetesAttributesCaCert)
              .platformKubernetesAttributesNamespace(platformKubernetesAttributesNamespace)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getDomain());
      System.out.println(result.getEnabled());
      System.out.println(result.getManaged());
      System.out.println(result.getProviderType());
      System.out.println(result.getPlatformType());
      System.out.println(result.getEnvironmentScope());
      System.out.println(result.getClusterType());
      System.out.println(result.getNamespacePerEnvironment());
      System.out.println(result.getUser());
      System.out.println(result.getPlatformKubernetes());
      System.out.println(result.getProviderGcp());
      System.out.println(result.getManagementProject());
    } catch (ApiException e) {
      System.err.println("Exception when calling ClustersApi#updateInstanceCluster");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<APIEntitiesCluster> response = client
              .clusters
              .updateInstanceCluster(clusterId)
              .name(name)
              .enabled(enabled)
              .environmentScope(environmentScope)
              .namespacePerEnvironment(namespacePerEnvironment)
              .domain(domain)
              .managementProjectId(managementProjectId)
              .managed(managed)
              .platformKubernetesAttributesApiUrl(platformKubernetesAttributesApiUrl)
              .platformKubernetesAttributesToken(platformKubernetesAttributesToken)
              .platformKubernetesAttributesCaCert(platformKubernetesAttributesCaCert)
              .platformKubernetesAttributesNamespace(platformKubernetesAttributesNamespace)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ClustersApi#updateInstanceCluster");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **clusterId** | **Integer**| The cluster ID | |
| **clustersUpdateInstanceClusterRequest** | [**ClustersUpdateInstanceClusterRequest**](ClustersUpdateInstanceClusterRequest.md)|  | [optional] |

### Return type

[**APIEntitiesCluster**](APIEntitiesCluster.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Edit instance cluster |  -  |
| **400** | Validation error |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |

