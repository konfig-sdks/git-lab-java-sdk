# AlertManagementApi

All URIs are relative to *https://www.gitlab.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**authorizeMetricImageUpload**](AlertManagementApi.md#authorizeMetricImageUpload) | **POST** /api/v4/projects/{id}/alert_management_alerts/{alert_iid}/metric_images/authorize |  |
| [**getMetricImagesForAlert**](AlertManagementApi.md#getMetricImagesForAlert) | **GET** /api/v4/projects/{id}/alert_management_alerts/{alert_iid}/metric_images |  |
| [**removeMetricImage**](AlertManagementApi.md#removeMetricImage) | **DELETE** /api/v4/projects/{id}/alert_management_alerts/{alert_iid}/metric_images/{metric_image_id} |  |
| [**updateMetricImage**](AlertManagementApi.md#updateMetricImage) | **PUT** /api/v4/projects/{id}/alert_management_alerts/{alert_iid}/metric_images/{metric_image_id} |  |
| [**uploadMetricImage**](AlertManagementApi.md#uploadMetricImage) | **POST** /api/v4/projects/{id}/alert_management_alerts/{alert_iid}/metric_images |  |


<a name="authorizeMetricImageUpload"></a>
# **authorizeMetricImageUpload**
> authorizeMetricImageUpload(id, alertIid).execute();



Workhorse authorize metric image file upload

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GitLab;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AlertManagementApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://www.gitlab.com/api";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    GitLab client = new GitLab(configuration);
    String id = "id_example"; // The ID or URL-encoded path of the project
    Integer alertIid = 56; // The IID of the Alert
    try {
      client
              .alertManagement
              .authorizeMetricImageUpload(id, alertIid)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AlertManagementApi#authorizeMetricImageUpload");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .alertManagement
              .authorizeMetricImageUpload(id, alertIid)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AlertManagementApi#authorizeMetricImageUpload");
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
| **id** | **String**| The ID or URL-encoded path of the project | |
| **alertIid** | **Integer**| The IID of the Alert | |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Workhorse authorize metric image file upload |  -  |
| **403** | Forbidden |  -  |

<a name="getMetricImagesForAlert"></a>
# **getMetricImagesForAlert**
> List&lt;APIEntitiesMetricImage&gt; getMetricImagesForAlert(id, alertIid).execute();



Metric Images for alert

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GitLab;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AlertManagementApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://www.gitlab.com/api";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    GitLab client = new GitLab(configuration);
    String id = "id_example"; // The ID or URL-encoded path of the project
    Integer alertIid = 56; // The IID of the Alert
    try {
      List<APIEntitiesMetricImage> result = client
              .alertManagement
              .getMetricImagesForAlert(id, alertIid)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlertManagementApi#getMetricImagesForAlert");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<APIEntitiesMetricImage>> response = client
              .alertManagement
              .getMetricImagesForAlert(id, alertIid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AlertManagementApi#getMetricImagesForAlert");
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
| **id** | **String**| The ID or URL-encoded path of the project | |
| **alertIid** | **Integer**| The IID of the Alert | |

### Return type

[**List&lt;APIEntitiesMetricImage&gt;**](APIEntitiesMetricImage.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Metric Images for alert |  -  |
| **404** | Not found |  -  |

<a name="removeMetricImage"></a>
# **removeMetricImage**
> APIEntitiesMetricImage removeMetricImage(id, alertIid, metricImageId).execute();



Remove a metric image for an alert

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GitLab;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AlertManagementApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://www.gitlab.com/api";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    GitLab client = new GitLab(configuration);
    String id = "id_example"; // The ID or URL-encoded path of the project
    Integer alertIid = 56; // The IID of the Alert
    Integer metricImageId = 56; // The ID of metric image
    try {
      APIEntitiesMetricImage result = client
              .alertManagement
              .removeMetricImage(id, alertIid, metricImageId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getFilename());
      System.out.println(result.getFilePath());
      System.out.println(result.getUrl());
      System.out.println(result.getUrlText());
    } catch (ApiException e) {
      System.err.println("Exception when calling AlertManagementApi#removeMetricImage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<APIEntitiesMetricImage> response = client
              .alertManagement
              .removeMetricImage(id, alertIid, metricImageId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AlertManagementApi#removeMetricImage");
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
| **id** | **String**| The ID or URL-encoded path of the project | |
| **alertIid** | **Integer**| The IID of the Alert | |
| **metricImageId** | **Integer**| The ID of metric image | |

### Return type

[**APIEntitiesMetricImage**](APIEntitiesMetricImage.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Remove a metric image for an alert |  -  |
| **403** | Forbidden |  -  |
| **422** | Unprocessable entity |  -  |

<a name="updateMetricImage"></a>
# **updateMetricImage**
> APIEntitiesMetricImage updateMetricImage(id, alertIid, metricImageId).url(url).urlText(urlText).alertmanagementUpdateMetricImageRequest(alertmanagementUpdateMetricImageRequest).execute();



Update a metric image for an alert

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GitLab;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AlertManagementApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://www.gitlab.com/api";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    GitLab client = new GitLab(configuration);
    String id = "id_example"; // The ID or URL-encoded path of the project
    Integer alertIid = 56; // The IID of the Alert
    Integer metricImageId = 56; // The ID of metric image
    String url = "url_example"; // The url to view more metric info
    String urlText = "urlText_example"; // A description of the image or URL
    try {
      APIEntitiesMetricImage result = client
              .alertManagement
              .updateMetricImage(id, alertIid, metricImageId)
              .url(url)
              .urlText(urlText)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getFilename());
      System.out.println(result.getFilePath());
      System.out.println(result.getUrl());
      System.out.println(result.getUrlText());
    } catch (ApiException e) {
      System.err.println("Exception when calling AlertManagementApi#updateMetricImage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<APIEntitiesMetricImage> response = client
              .alertManagement
              .updateMetricImage(id, alertIid, metricImageId)
              .url(url)
              .urlText(urlText)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AlertManagementApi#updateMetricImage");
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
| **id** | **String**| The ID or URL-encoded path of the project | |
| **alertIid** | **Integer**| The IID of the Alert | |
| **metricImageId** | **Integer**| The ID of metric image | |
| **url** | **String**| The url to view more metric info | [optional] |
| **urlText** | **String**| A description of the image or URL | [optional] |
| **alertmanagementUpdateMetricImageRequest** | [**AlertmanagementUpdateMetricImageRequest**](AlertmanagementUpdateMetricImageRequest.md)|  | [optional] |

### Return type

[**APIEntitiesMetricImage**](APIEntitiesMetricImage.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update a metric image for an alert |  -  |
| **403** | Forbidden |  -  |
| **422** | Unprocessable entity |  -  |

<a name="uploadMetricImage"></a>
# **uploadMetricImage**
> APIEntitiesMetricImage uploadMetricImage(id, alertIid, _file, alertmanagementUploadMetricImageRequest).url(url).urlText(urlText).execute();



Upload a metric image for an alert

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GitLab;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AlertManagementApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://www.gitlab.com/api";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    GitLab client = new GitLab(configuration);
    String id = "id_example"; // The ID or URL-encoded path of the project
    Integer alertIid = 56; // The IID of the Alert
    File _file = new File("/path/to/file"); // The image file to be uploaded
    String url = "url_example"; // The url to view more metric info
    String urlText = "urlText_example"; // A description of the image or URL
    try {
      APIEntitiesMetricImage result = client
              .alertManagement
              .uploadMetricImage(id, alertIid, _file)
              .url(url)
              .urlText(urlText)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getFilename());
      System.out.println(result.getFilePath());
      System.out.println(result.getUrl());
      System.out.println(result.getUrlText());
    } catch (ApiException e) {
      System.err.println("Exception when calling AlertManagementApi#uploadMetricImage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<APIEntitiesMetricImage> response = client
              .alertManagement
              .uploadMetricImage(id, alertIid, _file)
              .url(url)
              .urlText(urlText)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AlertManagementApi#uploadMetricImage");
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
| **id** | **String**| The ID or URL-encoded path of the project | |
| **alertIid** | **Integer**| The IID of the Alert | |
| **_file** | **File**| The image file to be uploaded | |
| **alertmanagementUploadMetricImageRequest** | [**AlertmanagementUploadMetricImageRequest**](AlertmanagementUploadMetricImageRequest.md)|  | |
| **url** | **String**| The url to view more metric info | [optional] |
| **urlText** | **String**| A description of the image or URL | [optional] |

### Return type

[**APIEntitiesMetricImage**](APIEntitiesMetricImage.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Upload a metric image for an alert |  -  |
| **403** | Forbidden |  -  |

