# BatchedBackgroundMigrationsApi

All URIs are relative to *https://www.gitlab.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getMigration**](BatchedBackgroundMigrationsApi.md#getMigration) | **GET** /api/v4/admin/batched_background_migrations/{id} |  |
| [**list**](BatchedBackgroundMigrationsApi.md#list) | **GET** /api/v4/admin/batched_background_migrations |  |
| [**pauseMigration**](BatchedBackgroundMigrationsApi.md#pauseMigration) | **PUT** /api/v4/admin/batched_background_migrations/{id}/pause |  |
| [**resumeMigration**](BatchedBackgroundMigrationsApi.md#resumeMigration) | **PUT** /api/v4/admin/batched_background_migrations/{id}/resume |  |


<a name="getMigration"></a>
# **getMigration**
> APIEntitiesBatchedBackgroundMigration getMigration(id).database(database).execute();



Retrieve a batched background migration

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GitLab;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BatchedBackgroundMigrationsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://www.gitlab.com/api";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    GitLab client = new GitLab(configuration);
    Integer id = 56; // The batched background migration id
    String database = "main"; // The name of the database
    try {
      APIEntitiesBatchedBackgroundMigration result = client
              .batchedBackgroundMigrations
              .getMigration(id)
              .database(database)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getJobClassName());
      System.out.println(result.getTableName());
      System.out.println(result.getStatus());
      System.out.println(result.getProgress());
      System.out.println(result.getCreatedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling BatchedBackgroundMigrationsApi#getMigration");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<APIEntitiesBatchedBackgroundMigration> response = client
              .batchedBackgroundMigrations
              .getMigration(id)
              .database(database)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BatchedBackgroundMigrationsApi#getMigration");
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
| **id** | **Integer**| The batched background migration id | |
| **database** | **String**| The name of the database | [optional] [default to main] [enum: main, ci, embedding, main_clusterwide, geo] |

### Return type

[**APIEntitiesBatchedBackgroundMigration**](APIEntitiesBatchedBackgroundMigration.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retrieve a batched background migration |  -  |
| **401** | 401 Unauthorized |  -  |
| **403** | 403 Forbidden |  -  |
| **404** | 404 Not found |  -  |

<a name="list"></a>
# **list**
> List&lt;APIEntitiesBatchedBackgroundMigration&gt; list().database(database).execute();



Get the list of batched background migrations

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GitLab;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BatchedBackgroundMigrationsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://www.gitlab.com/api";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    GitLab client = new GitLab(configuration);
    String database = "main"; // The name of the database, the default `main`
    try {
      List<APIEntitiesBatchedBackgroundMigration> result = client
              .batchedBackgroundMigrations
              .list()
              .database(database)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BatchedBackgroundMigrationsApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<APIEntitiesBatchedBackgroundMigration>> response = client
              .batchedBackgroundMigrations
              .list()
              .database(database)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BatchedBackgroundMigrationsApi#list");
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
| **database** | **String**| The name of the database, the default &#x60;main&#x60; | [optional] [default to main] [enum: main, ci, embedding, main_clusterwide, geo] |

### Return type

[**List&lt;APIEntitiesBatchedBackgroundMigration&gt;**](APIEntitiesBatchedBackgroundMigration.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get the list of batched background migrations |  -  |
| **401** | 401 Unauthorized |  -  |
| **403** | 403 Forbidden |  -  |

<a name="pauseMigration"></a>
# **pauseMigration**
> APIEntitiesBatchedBackgroundMigration pauseMigration(id).batchedbackgroundmigrationsPauseMigrationRequest(batchedbackgroundmigrationsPauseMigrationRequest).execute();



Pause a batched background migration

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GitLab;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BatchedBackgroundMigrationsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://www.gitlab.com/api";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    GitLab client = new GitLab(configuration);
    Integer id = 56; // The batched background migration id
    String database = "main"; // The name of the database
    try {
      APIEntitiesBatchedBackgroundMigration result = client
              .batchedBackgroundMigrations
              .pauseMigration(id)
              .database(database)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getJobClassName());
      System.out.println(result.getTableName());
      System.out.println(result.getStatus());
      System.out.println(result.getProgress());
      System.out.println(result.getCreatedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling BatchedBackgroundMigrationsApi#pauseMigration");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<APIEntitiesBatchedBackgroundMigration> response = client
              .batchedBackgroundMigrations
              .pauseMigration(id)
              .database(database)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BatchedBackgroundMigrationsApi#pauseMigration");
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
| **id** | **Integer**| The batched background migration id | |
| **batchedbackgroundmigrationsPauseMigrationRequest** | [**BatchedbackgroundmigrationsPauseMigrationRequest**](BatchedbackgroundmigrationsPauseMigrationRequest.md)|  | [optional] |

### Return type

[**APIEntitiesBatchedBackgroundMigration**](APIEntitiesBatchedBackgroundMigration.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Pause a batched background migration |  -  |
| **401** | 401 Unauthorized |  -  |
| **403** | 403 Forbidden |  -  |
| **404** | 404 Not found |  -  |
| **422** | You can pause only &#x60;active&#x60; batched background migrations. |  -  |

<a name="resumeMigration"></a>
# **resumeMigration**
> APIEntitiesBatchedBackgroundMigration resumeMigration(id).batchedbackgroundmigrationsResumeMigrationRequest(batchedbackgroundmigrationsResumeMigrationRequest).execute();



Resume a batched background migration

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GitLab;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BatchedBackgroundMigrationsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://www.gitlab.com/api";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    GitLab client = new GitLab(configuration);
    Integer id = 56; // The batched background migration id
    String database = "main"; // The name of the database
    try {
      APIEntitiesBatchedBackgroundMigration result = client
              .batchedBackgroundMigrations
              .resumeMigration(id)
              .database(database)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getJobClassName());
      System.out.println(result.getTableName());
      System.out.println(result.getStatus());
      System.out.println(result.getProgress());
      System.out.println(result.getCreatedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling BatchedBackgroundMigrationsApi#resumeMigration");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<APIEntitiesBatchedBackgroundMigration> response = client
              .batchedBackgroundMigrations
              .resumeMigration(id)
              .database(database)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BatchedBackgroundMigrationsApi#resumeMigration");
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
| **id** | **Integer**| The batched background migration id | |
| **batchedbackgroundmigrationsResumeMigrationRequest** | [**BatchedbackgroundmigrationsResumeMigrationRequest**](BatchedbackgroundmigrationsResumeMigrationRequest.md)|  | [optional] |

### Return type

[**APIEntitiesBatchedBackgroundMigration**](APIEntitiesBatchedBackgroundMigration.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Resume a batched background migration |  -  |
| **401** | 401 Unauthorized |  -  |
| **403** | 403 Forbidden |  -  |
| **404** | 404 Not found |  -  |
| **422** | You can resume only &#x60;paused&#x60; batched background migrations. |  -  |

