# AvatarApi

All URIs are relative to *https://www.gitlab.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getUrlForUser**](AvatarApi.md#getUrlForUser) | **GET** /api/v4/avatar |  |


<a name="getUrlForUser"></a>
# **getUrlForUser**
> APIEntitiesAvatar getUrlForUser(email).size(size).execute();



Return avatar url for a user

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GitLab;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AvatarApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://www.gitlab.com/api";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    GitLab client = new GitLab(configuration);
    String email = "email_example"; // Public email address of the user
    Integer size = 56; // Single pixel dimension for Gravatar images
    try {
      APIEntitiesAvatar result = client
              .avatar
              .getUrlForUser(email)
              .size(size)
              .execute();
      System.out.println(result);
      System.out.println(result.getAvatarUrl());
    } catch (ApiException e) {
      System.err.println("Exception when calling AvatarApi#getUrlForUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<APIEntitiesAvatar> response = client
              .avatar
              .getUrlForUser(email)
              .size(size)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AvatarApi#getUrlForUser");
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
| **email** | **String**| Public email address of the user | |
| **size** | **Integer**| Single pixel dimension for Gravatar images | [optional] |

### Return type

[**APIEntitiesAvatar**](APIEntitiesAvatar.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Return avatar url for a user |  -  |

