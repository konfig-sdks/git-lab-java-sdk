# ApplicationsApi

All URIs are relative to *https://www.gitlab.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewApplication**](ApplicationsApi.md#createNewApplication) | **POST** /api/v4/applications | Create a new application |
| [**deleteSpecificApplication**](ApplicationsApi.md#deleteSpecificApplication) | **DELETE** /api/v4/applications/{id} | Delete an application |
| [**listAllRegistered**](ApplicationsApi.md#listAllRegistered) | **GET** /api/v4/applications | Get applications |


<a name="createNewApplication"></a>
# **createNewApplication**
> APIEntitiesApplicationWithSecret createNewApplication(applicationsCreateNewApplicationRequest).execute();

Create a new application

This feature was introduced in GitLab 10.5

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GitLab;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicationsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://www.gitlab.com/api";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    GitLab client = new GitLab(configuration);
    String name = "name_example"; // Name of the application.
    String redirectUri = "redirectUri_example"; // Redirect URI of the application.
    String scopes = "scopes_example"; // Scopes of the application. You can specify multiple scopes by separating\\\\                                  each scope using a space
    Boolean confidential = true; // The application is used where the client secret can be kept confidential. Native mobile apps \\\\                         and Single Page Apps are considered non-confidential. Defaults to true if not supplied
    try {
      APIEntitiesApplicationWithSecret result = client
              .applications
              .createNewApplication(name, redirectUri, scopes)
              .confidential(confidential)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getApplicationId());
      System.out.println(result.getApplicationName());
      System.out.println(result.getCallbackUrl());
      System.out.println(result.getConfidential());
      System.out.println(result.getSecret());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationsApi#createNewApplication");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<APIEntitiesApplicationWithSecret> response = client
              .applications
              .createNewApplication(name, redirectUri, scopes)
              .confidential(confidential)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationsApi#createNewApplication");
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
| **applicationsCreateNewApplicationRequest** | [**ApplicationsCreateNewApplicationRequest**](ApplicationsCreateNewApplicationRequest.md)|  | |

### Return type

[**APIEntitiesApplicationWithSecret**](APIEntitiesApplicationWithSecret.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create a new application |  -  |

<a name="deleteSpecificApplication"></a>
# **deleteSpecificApplication**
> deleteSpecificApplication(id).execute();

Delete an application

Delete a specific application

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GitLab;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicationsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://www.gitlab.com/api";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    GitLab client = new GitLab(configuration);
    Integer id = 56; // The ID of the application (not the application_id)
    try {
      client
              .applications
              .deleteSpecificApplication(id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationsApi#deleteSpecificApplication");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .applications
              .deleteSpecificApplication(id)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationsApi#deleteSpecificApplication");
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
| **id** | **Integer**| The ID of the application (not the application_id) | |

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
| **204** | Delete an application |  -  |

<a name="listAllRegistered"></a>
# **listAllRegistered**
> List&lt;APIEntitiesApplication&gt; listAllRegistered().execute();

Get applications

List all registered applications

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GitLab;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicationsApi;
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
      List<APIEntitiesApplication> result = client
              .applications
              .listAllRegistered()
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationsApi#listAllRegistered");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<APIEntitiesApplication>> response = client
              .applications
              .listAllRegistered()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationsApi#listAllRegistered");
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

[**List&lt;APIEntitiesApplication&gt;**](APIEntitiesApplication.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get applications |  -  |

