# BadgesApi

All URIs are relative to *https://www.gitlab.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addBadgeToGroup**](BadgesApi.md#addBadgeToGroup) | **POST** /api/v4/groups/{id}/badges | Adds a badge to a group. |
| [**addProjectBadge**](BadgesApi.md#addProjectBadge) | **POST** /api/v4/projects/{id}/badges | Adds a badge to a project. |
| [**getGroupBadge**](BadgesApi.md#getGroupBadge) | **GET** /api/v4/groups/{id}/badges/{badge_id} | Gets a badge of a group. |
| [**getList**](BadgesApi.md#getList) | **GET** /api/v4/groups/{id}/badges | Gets a list of group badges viewable by the authenticated user. |
| [**getProjectBadge**](BadgesApi.md#getProjectBadge) | **GET** /api/v4/projects/{id}/badges/{badge_id} | Gets a badge of a project. |
| [**listViewableByAuthenticatedUser**](BadgesApi.md#listViewableByAuthenticatedUser) | **GET** /api/v4/projects/{id}/badges | Gets a list of project badges viewable by the authenticated user. |
| [**previewBadgeFromGroup**](BadgesApi.md#previewBadgeFromGroup) | **GET** /api/v4/groups/{id}/badges/render | Preview a badge from a group. |
| [**removeFromGroup**](BadgesApi.md#removeFromGroup) | **DELETE** /api/v4/groups/{id}/badges/{badge_id} | Removes a badge from the group. |
| [**removeFromProject**](BadgesApi.md#removeFromProject) | **DELETE** /api/v4/projects/{id}/badges/{badge_id} | Removes a badge from the project. |
| [**renderPreviewFromProject**](BadgesApi.md#renderPreviewFromProject) | **GET** /api/v4/projects/{id}/badges/render | Preview a badge from a project. |
| [**updateGroupBadge**](BadgesApi.md#updateGroupBadge) | **PUT** /api/v4/groups/{id}/badges/{badge_id} | Updates a badge of a group. |
| [**updateProjectBadge**](BadgesApi.md#updateProjectBadge) | **PUT** /api/v4/projects/{id}/badges/{badge_id} | Updates a badge of a project. |


<a name="addBadgeToGroup"></a>
# **addBadgeToGroup**
> APIEntitiesBadge addBadgeToGroup(id, badgesAddBadgeToGroupRequest).execute();

Adds a badge to a group.

This feature was introduced in GitLab 10.6.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GitLab;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BadgesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://www.gitlab.com/api";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    GitLab client = new GitLab(configuration);
    String linkUrl = "linkUrl_example"; // URL of the badge link
    String imageUrl = "imageUrl_example"; // URL of the badge image
    String id = "id_example"; // The ID or URL-encoded path of the group owned by the authenticated user.
    String name = "name_example"; // Name for the badge
    try {
      APIEntitiesBadge result = client
              .badges
              .addBadgeToGroup(linkUrl, imageUrl, id)
              .name(name)
              .execute();
      System.out.println(result);
      System.out.println(result.getName());
      System.out.println(result.getLinkUrl());
      System.out.println(result.getImageUrl());
      System.out.println(result.getRenderedLinkUrl());
      System.out.println(result.getRenderedImageUrl());
      System.out.println(result.getId());
      System.out.println(result.getKind());
    } catch (ApiException e) {
      System.err.println("Exception when calling BadgesApi#addBadgeToGroup");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<APIEntitiesBadge> response = client
              .badges
              .addBadgeToGroup(linkUrl, imageUrl, id)
              .name(name)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BadgesApi#addBadgeToGroup");
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
| **id** | **String**| The ID or URL-encoded path of the group owned by the authenticated user. | |
| **badgesAddBadgeToGroupRequest** | [**BadgesAddBadgeToGroupRequest**](BadgesAddBadgeToGroupRequest.md)|  | |

### Return type

[**APIEntitiesBadge**](APIEntitiesBadge.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Adds a badge to a group. |  -  |

<a name="addProjectBadge"></a>
# **addProjectBadge**
> APIEntitiesBadge addProjectBadge(id, badgesAddProjectBadgeRequest).execute();

Adds a badge to a project.

This feature was introduced in GitLab 10.6.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GitLab;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BadgesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://www.gitlab.com/api";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    GitLab client = new GitLab(configuration);
    String linkUrl = "linkUrl_example"; // URL of the badge link
    String imageUrl = "imageUrl_example"; // URL of the badge image
    String id = "id_example"; // The ID or URL-encoded path of the project owned by the authenticated user.
    String name = "name_example"; // Name for the badge
    try {
      APIEntitiesBadge result = client
              .badges
              .addProjectBadge(linkUrl, imageUrl, id)
              .name(name)
              .execute();
      System.out.println(result);
      System.out.println(result.getName());
      System.out.println(result.getLinkUrl());
      System.out.println(result.getImageUrl());
      System.out.println(result.getRenderedLinkUrl());
      System.out.println(result.getRenderedImageUrl());
      System.out.println(result.getId());
      System.out.println(result.getKind());
    } catch (ApiException e) {
      System.err.println("Exception when calling BadgesApi#addProjectBadge");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<APIEntitiesBadge> response = client
              .badges
              .addProjectBadge(linkUrl, imageUrl, id)
              .name(name)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BadgesApi#addProjectBadge");
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
| **id** | **String**| The ID or URL-encoded path of the project owned by the authenticated user. | |
| **badgesAddProjectBadgeRequest** | [**BadgesAddProjectBadgeRequest**](BadgesAddProjectBadgeRequest.md)|  | |

### Return type

[**APIEntitiesBadge**](APIEntitiesBadge.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Adds a badge to a project. |  -  |

<a name="getGroupBadge"></a>
# **getGroupBadge**
> APIEntitiesBadge getGroupBadge(id, badgeId).execute();

Gets a badge of a group.

This feature was introduced in GitLab 10.6.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GitLab;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BadgesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://www.gitlab.com/api";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    GitLab client = new GitLab(configuration);
    String id = "id_example"; // The ID or URL-encoded path of the group owned by the authenticated user.
    Integer badgeId = 56; // The badge ID
    try {
      APIEntitiesBadge result = client
              .badges
              .getGroupBadge(id, badgeId)
              .execute();
      System.out.println(result);
      System.out.println(result.getName());
      System.out.println(result.getLinkUrl());
      System.out.println(result.getImageUrl());
      System.out.println(result.getRenderedLinkUrl());
      System.out.println(result.getRenderedImageUrl());
      System.out.println(result.getId());
      System.out.println(result.getKind());
    } catch (ApiException e) {
      System.err.println("Exception when calling BadgesApi#getGroupBadge");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<APIEntitiesBadge> response = client
              .badges
              .getGroupBadge(id, badgeId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BadgesApi#getGroupBadge");
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
| **id** | **String**| The ID or URL-encoded path of the group owned by the authenticated user. | |
| **badgeId** | **Integer**| The badge ID | |

### Return type

[**APIEntitiesBadge**](APIEntitiesBadge.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Gets a badge of a group. |  -  |

<a name="getList"></a>
# **getList**
> List&lt;APIEntitiesBadge&gt; getList(id).page(page).perPage(perPage).name(name).execute();

Gets a list of group badges viewable by the authenticated user.

This feature was introduced in GitLab 10.6.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GitLab;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BadgesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://www.gitlab.com/api";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    GitLab client = new GitLab(configuration);
    String id = "id_example"; // The ID or URL-encoded path of the group owned by the authenticated user.
    Integer page = 1; // Current page number
    Integer perPage = 20; // Number of items per page
    String name = "name_example"; // Name for the badge
    try {
      List<APIEntitiesBadge> result = client
              .badges
              .getList(id)
              .page(page)
              .perPage(perPage)
              .name(name)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BadgesApi#getList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<APIEntitiesBadge>> response = client
              .badges
              .getList(id)
              .page(page)
              .perPage(perPage)
              .name(name)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BadgesApi#getList");
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
| **id** | **String**| The ID or URL-encoded path of the group owned by the authenticated user. | |
| **page** | **Integer**| Current page number | [optional] [default to 1] |
| **perPage** | **Integer**| Number of items per page | [optional] [default to 20] |
| **name** | **String**| Name for the badge | [optional] |

### Return type

[**List&lt;APIEntitiesBadge&gt;**](APIEntitiesBadge.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Gets a list of group badges viewable by the authenticated user. |  -  |

<a name="getProjectBadge"></a>
# **getProjectBadge**
> APIEntitiesBadge getProjectBadge(id, badgeId).execute();

Gets a badge of a project.

This feature was introduced in GitLab 10.6.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GitLab;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BadgesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://www.gitlab.com/api";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    GitLab client = new GitLab(configuration);
    String id = "id_example"; // The ID or URL-encoded path of the project owned by the authenticated user.
    Integer badgeId = 56; // The badge ID
    try {
      APIEntitiesBadge result = client
              .badges
              .getProjectBadge(id, badgeId)
              .execute();
      System.out.println(result);
      System.out.println(result.getName());
      System.out.println(result.getLinkUrl());
      System.out.println(result.getImageUrl());
      System.out.println(result.getRenderedLinkUrl());
      System.out.println(result.getRenderedImageUrl());
      System.out.println(result.getId());
      System.out.println(result.getKind());
    } catch (ApiException e) {
      System.err.println("Exception when calling BadgesApi#getProjectBadge");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<APIEntitiesBadge> response = client
              .badges
              .getProjectBadge(id, badgeId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BadgesApi#getProjectBadge");
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
| **id** | **String**| The ID or URL-encoded path of the project owned by the authenticated user. | |
| **badgeId** | **Integer**| The badge ID | |

### Return type

[**APIEntitiesBadge**](APIEntitiesBadge.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Gets a badge of a project. |  -  |

<a name="listViewableByAuthenticatedUser"></a>
# **listViewableByAuthenticatedUser**
> List&lt;APIEntitiesBadge&gt; listViewableByAuthenticatedUser(id).page(page).perPage(perPage).name(name).execute();

Gets a list of project badges viewable by the authenticated user.

This feature was introduced in GitLab 10.6.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GitLab;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BadgesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://www.gitlab.com/api";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    GitLab client = new GitLab(configuration);
    String id = "id_example"; // The ID or URL-encoded path of the project owned by the authenticated user.
    Integer page = 1; // Current page number
    Integer perPage = 20; // Number of items per page
    String name = "name_example"; // Name for the badge
    try {
      List<APIEntitiesBadge> result = client
              .badges
              .listViewableByAuthenticatedUser(id)
              .page(page)
              .perPage(perPage)
              .name(name)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BadgesApi#listViewableByAuthenticatedUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<APIEntitiesBadge>> response = client
              .badges
              .listViewableByAuthenticatedUser(id)
              .page(page)
              .perPage(perPage)
              .name(name)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BadgesApi#listViewableByAuthenticatedUser");
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
| **id** | **String**| The ID or URL-encoded path of the project owned by the authenticated user. | |
| **page** | **Integer**| Current page number | [optional] [default to 1] |
| **perPage** | **Integer**| Number of items per page | [optional] [default to 20] |
| **name** | **String**| Name for the badge | [optional] |

### Return type

[**List&lt;APIEntitiesBadge&gt;**](APIEntitiesBadge.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Gets a list of project badges viewable by the authenticated user. |  -  |

<a name="previewBadgeFromGroup"></a>
# **previewBadgeFromGroup**
> APIEntitiesBasicBadgeDetails previewBadgeFromGroup(id, linkUrl, imageUrl).execute();

Preview a badge from a group.

This feature was introduced in GitLab 10.6.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GitLab;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BadgesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://www.gitlab.com/api";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    GitLab client = new GitLab(configuration);
    String id = "id_example"; // The ID or URL-encoded path of the group owned by the authenticated user.
    String linkUrl = "linkUrl_example"; // URL of the badge link
    String imageUrl = "imageUrl_example"; // URL of the badge image
    try {
      APIEntitiesBasicBadgeDetails result = client
              .badges
              .previewBadgeFromGroup(id, linkUrl, imageUrl)
              .execute();
      System.out.println(result);
      System.out.println(result.getName());
      System.out.println(result.getLinkUrl());
      System.out.println(result.getImageUrl());
      System.out.println(result.getRenderedLinkUrl());
      System.out.println(result.getRenderedImageUrl());
    } catch (ApiException e) {
      System.err.println("Exception when calling BadgesApi#previewBadgeFromGroup");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<APIEntitiesBasicBadgeDetails> response = client
              .badges
              .previewBadgeFromGroup(id, linkUrl, imageUrl)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BadgesApi#previewBadgeFromGroup");
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
| **id** | **String**| The ID or URL-encoded path of the group owned by the authenticated user. | |
| **linkUrl** | **String**| URL of the badge link | |
| **imageUrl** | **String**| URL of the badge image | |

### Return type

[**APIEntitiesBasicBadgeDetails**](APIEntitiesBasicBadgeDetails.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Preview a badge from a group. |  -  |

<a name="removeFromGroup"></a>
# **removeFromGroup**
> removeFromGroup(id, badgeId).execute();

Removes a badge from the group.

This feature was introduced in GitLab 10.6.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GitLab;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BadgesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://www.gitlab.com/api";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    GitLab client = new GitLab(configuration);
    String id = "id_example"; // The ID or URL-encoded path of the group owned by the authenticated user.
    Integer badgeId = 56; // The badge ID
    try {
      client
              .badges
              .removeFromGroup(id, badgeId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BadgesApi#removeFromGroup");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .badges
              .removeFromGroup(id, badgeId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BadgesApi#removeFromGroup");
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
| **id** | **String**| The ID or URL-encoded path of the group owned by the authenticated user. | |
| **badgeId** | **Integer**| The badge ID | |

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
| **204** | Removes a badge from the group. |  -  |

<a name="removeFromProject"></a>
# **removeFromProject**
> removeFromProject(id, badgeId).execute();

Removes a badge from the project.

This feature was introduced in GitLab 10.6.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GitLab;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BadgesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://www.gitlab.com/api";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    GitLab client = new GitLab(configuration);
    String id = "id_example"; // The ID or URL-encoded path of the project owned by the authenticated user.
    Integer badgeId = 56; // The badge ID
    try {
      client
              .badges
              .removeFromProject(id, badgeId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BadgesApi#removeFromProject");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .badges
              .removeFromProject(id, badgeId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BadgesApi#removeFromProject");
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
| **id** | **String**| The ID or URL-encoded path of the project owned by the authenticated user. | |
| **badgeId** | **Integer**| The badge ID | |

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
| **204** | Removes a badge from the project. |  -  |

<a name="renderPreviewFromProject"></a>
# **renderPreviewFromProject**
> APIEntitiesBasicBadgeDetails renderPreviewFromProject(id, linkUrl, imageUrl).execute();

Preview a badge from a project.

This feature was introduced in GitLab 10.6.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GitLab;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BadgesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://www.gitlab.com/api";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    GitLab client = new GitLab(configuration);
    String id = "id_example"; // The ID or URL-encoded path of the project owned by the authenticated user.
    String linkUrl = "linkUrl_example"; // URL of the badge link
    String imageUrl = "imageUrl_example"; // URL of the badge image
    try {
      APIEntitiesBasicBadgeDetails result = client
              .badges
              .renderPreviewFromProject(id, linkUrl, imageUrl)
              .execute();
      System.out.println(result);
      System.out.println(result.getName());
      System.out.println(result.getLinkUrl());
      System.out.println(result.getImageUrl());
      System.out.println(result.getRenderedLinkUrl());
      System.out.println(result.getRenderedImageUrl());
    } catch (ApiException e) {
      System.err.println("Exception when calling BadgesApi#renderPreviewFromProject");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<APIEntitiesBasicBadgeDetails> response = client
              .badges
              .renderPreviewFromProject(id, linkUrl, imageUrl)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BadgesApi#renderPreviewFromProject");
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
| **id** | **String**| The ID or URL-encoded path of the project owned by the authenticated user. | |
| **linkUrl** | **String**| URL of the badge link | |
| **imageUrl** | **String**| URL of the badge image | |

### Return type

[**APIEntitiesBasicBadgeDetails**](APIEntitiesBasicBadgeDetails.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Preview a badge from a project. |  -  |

<a name="updateGroupBadge"></a>
# **updateGroupBadge**
> APIEntitiesBadge updateGroupBadge(id, badgeId).badgesUpdateGroupBadgeRequest(badgesUpdateGroupBadgeRequest).execute();

Updates a badge of a group.

This feature was introduced in GitLab 10.6.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GitLab;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BadgesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://www.gitlab.com/api";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    GitLab client = new GitLab(configuration);
    String id = "id_example"; // The ID or URL-encoded path of the group owned by the authenticated user.
    Integer badgeId = 56;
    String linkUrl = "linkUrl_example"; // URL of the badge link
    String imageUrl = "imageUrl_example"; // URL of the badge image
    String name = "name_example"; // Name for the badge
    try {
      APIEntitiesBadge result = client
              .badges
              .updateGroupBadge(id, badgeId)
              .linkUrl(linkUrl)
              .imageUrl(imageUrl)
              .name(name)
              .execute();
      System.out.println(result);
      System.out.println(result.getName());
      System.out.println(result.getLinkUrl());
      System.out.println(result.getImageUrl());
      System.out.println(result.getRenderedLinkUrl());
      System.out.println(result.getRenderedImageUrl());
      System.out.println(result.getId());
      System.out.println(result.getKind());
    } catch (ApiException e) {
      System.err.println("Exception when calling BadgesApi#updateGroupBadge");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<APIEntitiesBadge> response = client
              .badges
              .updateGroupBadge(id, badgeId)
              .linkUrl(linkUrl)
              .imageUrl(imageUrl)
              .name(name)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BadgesApi#updateGroupBadge");
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
| **id** | **String**| The ID or URL-encoded path of the group owned by the authenticated user. | |
| **badgeId** | **Integer**|  | |
| **badgesUpdateGroupBadgeRequest** | [**BadgesUpdateGroupBadgeRequest**](BadgesUpdateGroupBadgeRequest.md)|  | [optional] |

### Return type

[**APIEntitiesBadge**](APIEntitiesBadge.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Updates a badge of a group. |  -  |

<a name="updateProjectBadge"></a>
# **updateProjectBadge**
> APIEntitiesBadge updateProjectBadge(id, badgeId).badgesUpdateProjectBadgeRequest(badgesUpdateProjectBadgeRequest).execute();

Updates a badge of a project.

This feature was introduced in GitLab 10.6.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GitLab;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BadgesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://www.gitlab.com/api";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    GitLab client = new GitLab(configuration);
    String id = "id_example"; // The ID or URL-encoded path of the project owned by the authenticated user.
    Integer badgeId = 56;
    String linkUrl = "linkUrl_example"; // URL of the badge link
    String imageUrl = "imageUrl_example"; // URL of the badge image
    String name = "name_example"; // Name for the badge
    try {
      APIEntitiesBadge result = client
              .badges
              .updateProjectBadge(id, badgeId)
              .linkUrl(linkUrl)
              .imageUrl(imageUrl)
              .name(name)
              .execute();
      System.out.println(result);
      System.out.println(result.getName());
      System.out.println(result.getLinkUrl());
      System.out.println(result.getImageUrl());
      System.out.println(result.getRenderedLinkUrl());
      System.out.println(result.getRenderedImageUrl());
      System.out.println(result.getId());
      System.out.println(result.getKind());
    } catch (ApiException e) {
      System.err.println("Exception when calling BadgesApi#updateProjectBadge");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<APIEntitiesBadge> response = client
              .badges
              .updateProjectBadge(id, badgeId)
              .linkUrl(linkUrl)
              .imageUrl(imageUrl)
              .name(name)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BadgesApi#updateProjectBadge");
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
| **id** | **String**| The ID or URL-encoded path of the project owned by the authenticated user. | |
| **badgeId** | **Integer**|  | |
| **badgesUpdateProjectBadgeRequest** | [**BadgesUpdateProjectBadgeRequest**](BadgesUpdateProjectBadgeRequest.md)|  | [optional] |

### Return type

[**APIEntitiesBadge**](APIEntitiesBadge.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Updates a badge of a project. |  -  |

