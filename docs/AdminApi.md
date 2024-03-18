# AdminApi

All URIs are relative to *https://www.gitlab.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getDictionaryDetails**](AdminApi.md#getDictionaryDetails) | **GET** /api/v4/admin/databases/{database_name}/dictionary/tables/{table_name} |  |


<a name="getDictionaryDetails"></a>
# **getDictionaryDetails**
> APIEntitiesDictionaryTable getDictionaryDetails(databaseName, tableName).execute();



Retrieve dictionary details

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GitLab;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AdminApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://www.gitlab.com/api";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    GitLab client = new GitLab(configuration);
    String databaseName = "main"; // The database name
    String tableName = "tableName_example"; // The table name
    try {
      APIEntitiesDictionaryTable result = client
              .admin
              .getDictionaryDetails(databaseName, tableName)
              .execute();
      System.out.println(result);
      System.out.println(result.getTableName());
      System.out.println(result.getFeatureCategories());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#getDictionaryDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<APIEntitiesDictionaryTable> response = client
              .admin
              .getDictionaryDetails(databaseName, tableName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#getDictionaryDetails");
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
| **databaseName** | **String**| The database name | [enum: main, ci] |
| **tableName** | **String**| The table name | |

### Return type

[**APIEntitiesDictionaryTable**](APIEntitiesDictionaryTable.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retrieve dictionary details |  -  |
| **401** | 401 Unauthorized |  -  |
| **403** | 403 Forbidden |  -  |
| **404** | 404 Not found |  -  |

