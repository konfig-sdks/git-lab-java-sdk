# BulkImportsApi

All URIs are relative to *https://www.gitlab.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getEntityDetails**](BulkImportsApi.md#getEntityDetails) | **GET** /api/v4/bulk_imports/{import_id}/entities/{entity_id} | Get GitLab Migration entity details |
| [**getMigrationDetails**](BulkImportsApi.md#getMigrationDetails) | **GET** /api/v4/bulk_imports/{import_id} | Get GitLab Migration details |
| [**listEntities**](BulkImportsApi.md#listEntities) | **GET** /api/v4/bulk_imports/{import_id}/entities | List GitLab Migration entities |
| [**listEntities_0**](BulkImportsApi.md#listEntities_0) | **GET** /api/v4/bulk_imports/entities | List all GitLab Migrations&#39; entities |
| [**listMigrations**](BulkImportsApi.md#listMigrations) | **GET** /api/v4/bulk_imports | List all GitLab Migrations |
| [**startNewMigration**](BulkImportsApi.md#startNewMigration) | **POST** /api/v4/bulk_imports | Start a new GitLab Migration |


<a name="getEntityDetails"></a>
# **getEntityDetails**
> APIEntitiesBulkImports getEntityDetails(importId, entityId).execute();

Get GitLab Migration entity details

This feature was introduced in GitLab 14.1.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GitLab;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BulkImportsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://www.gitlab.com/api";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    GitLab client = new GitLab(configuration);
    Integer importId = 56; // The ID of user's GitLab Migration
    Integer entityId = 56; // The ID of GitLab Migration entity
    try {
      APIEntitiesBulkImports result = client
              .bulkImports
              .getEntityDetails(importId, entityId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getBulkImportId());
      System.out.println(result.getStatus());
      System.out.println(result.getEntityType());
      System.out.println(result.getSourceFullPath());
      System.out.println(result.getDestinationFullPath());
      System.out.println(result.getDestinationName());
      System.out.println(result.getDestinationSlug());
      System.out.println(result.getDestinationNamespace());
      System.out.println(result.getParentId());
      System.out.println(result.getNamespaceId());
      System.out.println(result.getProjectId());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getFailures());
      System.out.println(result.getMigrateProjects());
    } catch (ApiException e) {
      System.err.println("Exception when calling BulkImportsApi#getEntityDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<APIEntitiesBulkImports> response = client
              .bulkImports
              .getEntityDetails(importId, entityId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BulkImportsApi#getEntityDetails");
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
| **importId** | **Integer**| The ID of user&#39;s GitLab Migration | |
| **entityId** | **Integer**| The ID of GitLab Migration entity | |

### Return type

[**APIEntitiesBulkImports**](APIEntitiesBulkImports.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get GitLab Migration entity details |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not found |  -  |
| **503** | Service unavailable |  -  |

<a name="getMigrationDetails"></a>
# **getMigrationDetails**
> APIEntitiesBulkImport getMigrationDetails(importId).execute();

Get GitLab Migration details

This feature was introduced in GitLab 14.1.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GitLab;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BulkImportsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://www.gitlab.com/api";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    GitLab client = new GitLab(configuration);
    Integer importId = 56; // The ID of user's GitLab Migration
    try {
      APIEntitiesBulkImport result = client
              .bulkImports
              .getMigrationDetails(importId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getStatus());
      System.out.println(result.getSourceType());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling BulkImportsApi#getMigrationDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<APIEntitiesBulkImport> response = client
              .bulkImports
              .getMigrationDetails(importId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BulkImportsApi#getMigrationDetails");
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
| **importId** | **Integer**| The ID of user&#39;s GitLab Migration | |

### Return type

[**APIEntitiesBulkImport**](APIEntitiesBulkImport.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get GitLab Migration details |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not found |  -  |
| **503** | Service unavailable |  -  |

<a name="listEntities"></a>
# **listEntities**
> List&lt;APIEntitiesBulkImports&gt; listEntities(importId).status(status).page(page).perPage(perPage).execute();

List GitLab Migration entities

This feature was introduced in GitLab 14.1.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GitLab;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BulkImportsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://www.gitlab.com/api";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    GitLab client = new GitLab(configuration);
    Integer importId = 56; // The ID of user's GitLab Migration
    String status = "created"; // Return import entities with specified status
    Integer page = 1; // Current page number
    Integer perPage = 20; // Number of items per page
    try {
      List<APIEntitiesBulkImports> result = client
              .bulkImports
              .listEntities(importId)
              .status(status)
              .page(page)
              .perPage(perPage)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BulkImportsApi#listEntities");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<APIEntitiesBulkImports>> response = client
              .bulkImports
              .listEntities(importId)
              .status(status)
              .page(page)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BulkImportsApi#listEntities");
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
| **importId** | **Integer**| The ID of user&#39;s GitLab Migration | |
| **status** | **String**| Return import entities with specified status | [optional] [enum: created, started, finished, timeout, failed] |
| **page** | **Integer**| Current page number | [optional] [default to 1] |
| **perPage** | **Integer**| Number of items per page | [optional] [default to 20] |

### Return type

[**List&lt;APIEntitiesBulkImports&gt;**](APIEntitiesBulkImports.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List GitLab Migration entities |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not found |  -  |
| **503** | Service unavailable |  -  |

<a name="listEntities_0"></a>
# **listEntities_0**
> List&lt;APIEntitiesBulkImports&gt; listEntities_0().page(page).perPage(perPage).sort(sort).status(status).execute();

List all GitLab Migrations&#39; entities

This feature was introduced in GitLab 14.1.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GitLab;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BulkImportsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://www.gitlab.com/api";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    GitLab client = new GitLab(configuration);
    Integer page = 1; // Current page number
    Integer perPage = 20; // Number of items per page
    String sort = "asc"; // Return GitLab Migrations sorted in created by `asc` or `desc` order.
    String status = "created"; // Return all GitLab Migrations' entities with specified status
    try {
      List<APIEntitiesBulkImports> result = client
              .bulkImports
              .listEntities_0()
              .page(page)
              .perPage(perPage)
              .sort(sort)
              .status(status)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BulkImportsApi#listEntities_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<APIEntitiesBulkImports>> response = client
              .bulkImports
              .listEntities_0()
              .page(page)
              .perPage(perPage)
              .sort(sort)
              .status(status)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BulkImportsApi#listEntities_0");
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
| **page** | **Integer**| Current page number | [optional] [default to 1] |
| **perPage** | **Integer**| Number of items per page | [optional] [default to 20] |
| **sort** | **String**| Return GitLab Migrations sorted in created by &#x60;asc&#x60; or &#x60;desc&#x60; order. | [optional] [default to desc] [enum: asc, desc] |
| **status** | **String**| Return all GitLab Migrations&#39; entities with specified status | [optional] [enum: created, started, finished, timeout, failed] |

### Return type

[**List&lt;APIEntitiesBulkImports&gt;**](APIEntitiesBulkImports.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List all GitLab Migrations&#39; entities |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not found |  -  |
| **503** | Service unavailable |  -  |

<a name="listMigrations"></a>
# **listMigrations**
> List&lt;APIEntitiesBulkImport&gt; listMigrations().page(page).perPage(perPage).sort(sort).status(status).execute();

List all GitLab Migrations

This feature was introduced in GitLab 14.1.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GitLab;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BulkImportsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://www.gitlab.com/api";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    GitLab client = new GitLab(configuration);
    Integer page = 1; // Current page number
    Integer perPage = 20; // Number of items per page
    String sort = "asc"; // Return GitLab Migrations sorted in created by `asc` or `desc` order.
    String status = "created"; // Return GitLab Migrations with specified status
    try {
      List<APIEntitiesBulkImport> result = client
              .bulkImports
              .listMigrations()
              .page(page)
              .perPage(perPage)
              .sort(sort)
              .status(status)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BulkImportsApi#listMigrations");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<APIEntitiesBulkImport>> response = client
              .bulkImports
              .listMigrations()
              .page(page)
              .perPage(perPage)
              .sort(sort)
              .status(status)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BulkImportsApi#listMigrations");
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
| **page** | **Integer**| Current page number | [optional] [default to 1] |
| **perPage** | **Integer**| Number of items per page | [optional] [default to 20] |
| **sort** | **String**| Return GitLab Migrations sorted in created by &#x60;asc&#x60; or &#x60;desc&#x60; order. | [optional] [default to desc] [enum: asc, desc] |
| **status** | **String**| Return GitLab Migrations with specified status | [optional] [enum: created, started, finished, timeout, failed] |

### Return type

[**List&lt;APIEntitiesBulkImport&gt;**](APIEntitiesBulkImport.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List all GitLab Migrations |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not found |  -  |
| **503** | Service unavailable |  -  |

<a name="startNewMigration"></a>
# **startNewMigration**
> APIEntitiesBulkImport startNewMigration(configurationUrl, configurationAccessToken, entitiesSourceType, entitiesSourceFullPath, entitiesDestinationNamespace, bulkimportsStartNewMigrationRequest).entitiesDestinationSlug(entitiesDestinationSlug).entitiesDestinationName(entitiesDestinationName).entitiesMigrateProjects(entitiesMigrateProjects).execute();

Start a new GitLab Migration

This feature was introduced in GitLab 14.2.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GitLab;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BulkImportsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://www.gitlab.com/api";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    GitLab client = new GitLab(configuration);
    String configurationUrl = "configurationUrl_example"; // Source GitLab instance URL
    String configurationAccessToken = "configurationAccessToken_example"; // Access token to the source GitLab instance
    List<String> entitiesSourceType = Arrays.asList(); // Source entity type
    List<String> entitiesSourceFullPath = Arrays.asList(); // Relative path of the source entity to import
    List<String> entitiesDestinationNamespace = Arrays.asList(); // Destination namespace for the entity
    List<String> entitiesDestinationSlug = Arrays.asList(); // Destination slug for the entity
    List<String> entitiesDestinationName = Arrays.asList(); // Deprecated: Use :destination_slug instead. Destination slug for the entity
    List<Boolean> entitiesMigrateProjects = Arrays.asList(); // Indicates group migration should include nested projects
    try {
      APIEntitiesBulkImport result = client
              .bulkImports
              .startNewMigration(configurationUrl, configurationAccessToken, entitiesSourceType, entitiesSourceFullPath, entitiesDestinationNamespace)
              .entitiesDestinationSlug(entitiesDestinationSlug)
              .entitiesDestinationName(entitiesDestinationName)
              .entitiesMigrateProjects(entitiesMigrateProjects)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getStatus());
      System.out.println(result.getSourceType());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling BulkImportsApi#startNewMigration");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<APIEntitiesBulkImport> response = client
              .bulkImports
              .startNewMigration(configurationUrl, configurationAccessToken, entitiesSourceType, entitiesSourceFullPath, entitiesDestinationNamespace)
              .entitiesDestinationSlug(entitiesDestinationSlug)
              .entitiesDestinationName(entitiesDestinationName)
              .entitiesMigrateProjects(entitiesMigrateProjects)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BulkImportsApi#startNewMigration");
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
| **configurationUrl** | **String**| Source GitLab instance URL | |
| **configurationAccessToken** | **String**| Access token to the source GitLab instance | |
| **entitiesSourceType** | [**List&lt;String&gt;**](String.md)| Source entity type | [enum: group_entity, project_entity] |
| **entitiesSourceFullPath** | [**List&lt;String&gt;**](String.md)| Relative path of the source entity to import | |
| **entitiesDestinationNamespace** | [**List&lt;String&gt;**](String.md)| Destination namespace for the entity | |
| **bulkimportsStartNewMigrationRequest** | [**BulkimportsStartNewMigrationRequest**](BulkimportsStartNewMigrationRequest.md)|  | |
| **entitiesDestinationSlug** | [**List&lt;String&gt;**](String.md)| Destination slug for the entity | [optional] |
| **entitiesDestinationName** | [**List&lt;String&gt;**](String.md)| Deprecated: Use :destination_slug instead. Destination slug for the entity | [optional] |
| **entitiesMigrateProjects** | [**List&lt;Boolean&gt;**](Boolean.md)| Indicates group migration should include nested projects | [optional] |

### Return type

[**APIEntitiesBulkImport**](APIEntitiesBulkImport.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Start a new GitLab Migration |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not found |  -  |
| **422** | Unprocessable entity |  -  |
| **503** | Service unavailable |  -  |

