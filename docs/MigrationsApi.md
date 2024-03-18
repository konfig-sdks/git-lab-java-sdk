# MigrationsApi

All URIs are relative to *https://www.gitlab.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**markAsExecuted**](MigrationsApi.md#markAsExecuted) | **POST** /api/v4/admin/migrations/{timestamp}/mark |  |


<a name="markAsExecuted"></a>
# **markAsExecuted**
> markAsExecuted(timestamp).migrationsMarkAsExecutedRequest(migrationsMarkAsExecutedRequest).execute();



Mark the migration as successfully executed

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GitLab;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MigrationsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://www.gitlab.com/api";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    GitLab client = new GitLab(configuration);
    Integer timestamp = 56; // The migration version timestamp
    String database = "main"; // The name of the database
    try {
      client
              .migrations
              .markAsExecuted(timestamp)
              .database(database)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MigrationsApi#markAsExecuted");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .migrations
              .markAsExecuted(timestamp)
              .database(database)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling MigrationsApi#markAsExecuted");
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
| **timestamp** | **Integer**| The migration version timestamp | |
| **migrationsMarkAsExecutedRequest** | [**MigrationsMarkAsExecutedRequest**](MigrationsMarkAsExecutedRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | 201 Created |  -  |
| **401** | 401 Unauthorized |  -  |
| **403** | 403 Forbidden |  -  |
| **404** | 404 Not found |  -  |
| **422** | You can mark only pending migrations |  -  |

