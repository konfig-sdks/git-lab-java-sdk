# MetadataApi

All URIs are relative to *https://www.gitlab.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getInformation**](MetadataApi.md#getInformation) | **GET** /api/v4/metadata | Retrieve metadata information for this GitLab instance |
| [**getVersionInformation**](MetadataApi.md#getVersionInformation) | **GET** /api/v4/version | Retrieves version information for the GitLab instance |


<a name="getInformation"></a>
# **getInformation**
> APIEntitiesMetadata getInformation().execute();

Retrieve metadata information for this GitLab instance

This feature was introduced in GitLab 15.2.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GitLab;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MetadataApi;
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
      APIEntitiesMetadata result = client
              .metadata
              .getInformation()
              .execute();
      System.out.println(result);
      System.out.println(result.getVersion());
      System.out.println(result.getRevision());
      System.out.println(result.getKas());
      System.out.println(result.getEnterprise());
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataApi#getInformation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<APIEntitiesMetadata> response = client
              .metadata
              .getInformation()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataApi#getInformation");
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

[**APIEntitiesMetadata**](APIEntitiesMetadata.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retrieve metadata information for this GitLab instance |  -  |
| **401** | Unauthorized |  -  |

<a name="getVersionInformation"></a>
# **getVersionInformation**
> APIEntitiesMetadata getVersionInformation().execute();

Retrieves version information for the GitLab instance

This feature was introduced in GitLab 8.13 and deprecated in 15.5. We recommend you instead use the Metadata API.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GitLab;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MetadataApi;
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
      APIEntitiesMetadata result = client
              .metadata
              .getVersionInformation()
              .execute();
      System.out.println(result);
      System.out.println(result.getVersion());
      System.out.println(result.getRevision());
      System.out.println(result.getKas());
      System.out.println(result.getEnterprise());
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataApi#getVersionInformation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<APIEntitiesMetadata> response = client
              .metadata
              .getVersionInformation()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MetadataApi#getVersionInformation");
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

[**APIEntitiesMetadata**](APIEntitiesMetadata.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retrieves version information for the GitLab instance |  -  |
| **401** | Unauthorized |  -  |

