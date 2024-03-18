# AccessRequestsApi

All URIs are relative to *https://www.gitlab.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**approveForUser**](AccessRequestsApi.md#approveForUser) | **PUT** /api/v4/groups/{id}/access_requests/{user_id}/approve | Approves an access request for the given user. |
| [**approveForUser_0**](AccessRequestsApi.md#approveForUser_0) | **PUT** /api/v4/projects/{id}/access_requests/{user_id}/approve | Approves an access request for the given user. |
| [**denyAccessToUser**](AccessRequestsApi.md#denyAccessToUser) | **DELETE** /api/v4/groups/{id}/access_requests/{user_id} | Denies an access request for the given user. |
| [**denyAccessToUser_0**](AccessRequestsApi.md#denyAccessToUser_0) | **DELETE** /api/v4/projects/{id}/access_requests/{user_id} | Denies an access request for the given user. |
| [**getList**](AccessRequestsApi.md#getList) | **GET** /api/v4/groups/{id}/access_requests | Gets a list of access requests for a group. |
| [**getList_0**](AccessRequestsApi.md#getList_0) | **GET** /api/v4/projects/{id}/access_requests | Gets a list of access requests for a project. |
| [**requestAccessToGroup**](AccessRequestsApi.md#requestAccessToGroup) | **POST** /api/v4/groups/{id}/access_requests | Requests access for the authenticated user to a group. |
| [**requestAccessToProject**](AccessRequestsApi.md#requestAccessToProject) | **POST** /api/v4/projects/{id}/access_requests | Requests access for the authenticated user to a project. |


<a name="approveForUser"></a>
# **approveForUser**
> APIEntitiesAccessRequester approveForUser(id, userId).accessrequestsApproveForUserRequest(accessrequestsApproveForUserRequest).execute();

Approves an access request for the given user.

This feature was introduced in GitLab 8.11.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GitLab;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccessRequestsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://www.gitlab.com/api";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    GitLab client = new GitLab(configuration);
    String id = "id_example"; // The ID or URL-encoded path of the group owned by the authenticated user
    Integer userId = 56; // The user ID of the access requester
    Integer accessLevel = 30; // A valid access level (defaults: `30`, the Developer role)
    try {
      APIEntitiesAccessRequester result = client
              .accessRequests
              .approveForUser(id, userId)
              .accessLevel(accessLevel)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getUsername());
      System.out.println(result.getName());
      System.out.println(result.getState());
      System.out.println(result.getAvatarUrl());
      System.out.println(result.getAvatarPath());
      System.out.println(result.getCustomAttributes());
      System.out.println(result.getWebUrl());
      System.out.println(result.getEmail());
      System.out.println(result.getRequestedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessRequestsApi#approveForUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<APIEntitiesAccessRequester> response = client
              .accessRequests
              .approveForUser(id, userId)
              .accessLevel(accessLevel)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessRequestsApi#approveForUser");
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
| **id** | **String**| The ID or URL-encoded path of the group owned by the authenticated user | |
| **userId** | **Integer**| The user ID of the access requester | |
| **accessrequestsApproveForUserRequest** | [**AccessrequestsApproveForUserRequest**](AccessrequestsApproveForUserRequest.md)|  | [optional] |

### Return type

[**APIEntitiesAccessRequester**](APIEntitiesAccessRequester.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, successfull_response

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="approveForUser_0"></a>
# **approveForUser_0**
> APIEntitiesAccessRequester approveForUser_0(id, userId).accessrequestsApproveForUserRequest1(accessrequestsApproveForUserRequest1).execute();

Approves an access request for the given user.

This feature was introduced in GitLab 8.11.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GitLab;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccessRequestsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://www.gitlab.com/api";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    GitLab client = new GitLab(configuration);
    String id = "id_example"; // The ID or URL-encoded path of the project owned by the authenticated user
    Integer userId = 56; // The user ID of the access requester
    Integer accessLevel = 30; // A valid access level (defaults: `30`, the Developer role)
    try {
      APIEntitiesAccessRequester result = client
              .accessRequests
              .approveForUser_0(id, userId)
              .accessLevel(accessLevel)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getUsername());
      System.out.println(result.getName());
      System.out.println(result.getState());
      System.out.println(result.getAvatarUrl());
      System.out.println(result.getAvatarPath());
      System.out.println(result.getCustomAttributes());
      System.out.println(result.getWebUrl());
      System.out.println(result.getEmail());
      System.out.println(result.getRequestedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessRequestsApi#approveForUser_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<APIEntitiesAccessRequester> response = client
              .accessRequests
              .approveForUser_0(id, userId)
              .accessLevel(accessLevel)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessRequestsApi#approveForUser_0");
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
| **id** | **String**| The ID or URL-encoded path of the project owned by the authenticated user | |
| **userId** | **Integer**| The user ID of the access requester | |
| **accessrequestsApproveForUserRequest1** | [**AccessrequestsApproveForUserRequest1**](AccessrequestsApproveForUserRequest1.md)|  | [optional] |

### Return type

[**APIEntitiesAccessRequester**](APIEntitiesAccessRequester.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, successfull_response

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="denyAccessToUser"></a>
# **denyAccessToUser**
> denyAccessToUser(id, userId).execute();

Denies an access request for the given user.

This feature was introduced in GitLab 8.11.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GitLab;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccessRequestsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://www.gitlab.com/api";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    GitLab client = new GitLab(configuration);
    String id = "id_example"; // The ID or URL-encoded path of the group owned by the authenticated user
    Integer userId = 56; // The user ID of the access requester
    try {
      client
              .accessRequests
              .denyAccessToUser(id, userId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessRequestsApi#denyAccessToUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .accessRequests
              .denyAccessToUser(id, userId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessRequestsApi#denyAccessToUser");
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
| **id** | **String**| The ID or URL-encoded path of the group owned by the authenticated user | |
| **userId** | **Integer**| The user ID of the access requester | |

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
| **204** | Denies an access request for the given user. |  -  |

<a name="denyAccessToUser_0"></a>
# **denyAccessToUser_0**
> denyAccessToUser_0(id, userId).execute();

Denies an access request for the given user.

This feature was introduced in GitLab 8.11.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GitLab;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccessRequestsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://www.gitlab.com/api";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    GitLab client = new GitLab(configuration);
    String id = "id_example"; // The ID or URL-encoded path of the project owned by the authenticated user
    Integer userId = 56; // The user ID of the access requester
    try {
      client
              .accessRequests
              .denyAccessToUser_0(id, userId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessRequestsApi#denyAccessToUser_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .accessRequests
              .denyAccessToUser_0(id, userId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessRequestsApi#denyAccessToUser_0");
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
| **id** | **String**| The ID or URL-encoded path of the project owned by the authenticated user | |
| **userId** | **Integer**| The user ID of the access requester | |

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
| **204** | Denies an access request for the given user. |  -  |

<a name="getList"></a>
# **getList**
> APIEntitiesAccessRequester getList(id).page(page).perPage(perPage).execute();

Gets a list of access requests for a group.

This feature was introduced in GitLab 8.11.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GitLab;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccessRequestsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://www.gitlab.com/api";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    GitLab client = new GitLab(configuration);
    String id = "id_example"; // The ID or URL-encoded path of the group owned by the authenticated user
    Integer page = 1; // Current page number
    Integer perPage = 20; // Number of items per page
    try {
      APIEntitiesAccessRequester result = client
              .accessRequests
              .getList(id)
              .page(page)
              .perPage(perPage)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getUsername());
      System.out.println(result.getName());
      System.out.println(result.getState());
      System.out.println(result.getAvatarUrl());
      System.out.println(result.getAvatarPath());
      System.out.println(result.getCustomAttributes());
      System.out.println(result.getWebUrl());
      System.out.println(result.getEmail());
      System.out.println(result.getRequestedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessRequestsApi#getList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<APIEntitiesAccessRequester> response = client
              .accessRequests
              .getList(id)
              .page(page)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessRequestsApi#getList");
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
| **id** | **String**| The ID or URL-encoded path of the group owned by the authenticated user | |
| **page** | **Integer**| Current page number | [optional] [default to 1] |
| **perPage** | **Integer**| Number of items per page | [optional] [default to 20] |

### Return type

[**APIEntitiesAccessRequester**](APIEntitiesAccessRequester.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Gets a list of access requests for a group. |  -  |

<a name="getList_0"></a>
# **getList_0**
> APIEntitiesAccessRequester getList_0(id).page(page).perPage(perPage).execute();

Gets a list of access requests for a project.

This feature was introduced in GitLab 8.11.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GitLab;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccessRequestsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://www.gitlab.com/api";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    GitLab client = new GitLab(configuration);
    String id = "id_example"; // The ID or URL-encoded path of the project owned by the authenticated user
    Integer page = 1; // Current page number
    Integer perPage = 20; // Number of items per page
    try {
      APIEntitiesAccessRequester result = client
              .accessRequests
              .getList_0(id)
              .page(page)
              .perPage(perPage)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getUsername());
      System.out.println(result.getName());
      System.out.println(result.getState());
      System.out.println(result.getAvatarUrl());
      System.out.println(result.getAvatarPath());
      System.out.println(result.getCustomAttributes());
      System.out.println(result.getWebUrl());
      System.out.println(result.getEmail());
      System.out.println(result.getRequestedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessRequestsApi#getList_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<APIEntitiesAccessRequester> response = client
              .accessRequests
              .getList_0(id)
              .page(page)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessRequestsApi#getList_0");
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
| **id** | **String**| The ID or URL-encoded path of the project owned by the authenticated user | |
| **page** | **Integer**| Current page number | [optional] [default to 1] |
| **perPage** | **Integer**| Number of items per page | [optional] [default to 20] |

### Return type

[**APIEntitiesAccessRequester**](APIEntitiesAccessRequester.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Gets a list of access requests for a project. |  -  |

<a name="requestAccessToGroup"></a>
# **requestAccessToGroup**
> APIEntitiesAccessRequester requestAccessToGroup(id).execute();

Requests access for the authenticated user to a group.

This feature was introduced in GitLab 8.11.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GitLab;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccessRequestsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://www.gitlab.com/api";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    GitLab client = new GitLab(configuration);
    String id = "id_example"; // The ID or URL-encoded path of the group owned by the authenticated user
    try {
      APIEntitiesAccessRequester result = client
              .accessRequests
              .requestAccessToGroup(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getUsername());
      System.out.println(result.getName());
      System.out.println(result.getState());
      System.out.println(result.getAvatarUrl());
      System.out.println(result.getAvatarPath());
      System.out.println(result.getCustomAttributes());
      System.out.println(result.getWebUrl());
      System.out.println(result.getEmail());
      System.out.println(result.getRequestedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessRequestsApi#requestAccessToGroup");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<APIEntitiesAccessRequester> response = client
              .accessRequests
              .requestAccessToGroup(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessRequestsApi#requestAccessToGroup");
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
| **id** | **String**| The ID or URL-encoded path of the group owned by the authenticated user | |

### Return type

[**APIEntitiesAccessRequester**](APIEntitiesAccessRequester.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, successfull_response

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="requestAccessToProject"></a>
# **requestAccessToProject**
> APIEntitiesAccessRequester requestAccessToProject(id).execute();

Requests access for the authenticated user to a project.

This feature was introduced in GitLab 8.11.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GitLab;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccessRequestsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://www.gitlab.com/api";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    GitLab client = new GitLab(configuration);
    String id = "id_example"; // The ID or URL-encoded path of the project owned by the authenticated user
    try {
      APIEntitiesAccessRequester result = client
              .accessRequests
              .requestAccessToProject(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getUsername());
      System.out.println(result.getName());
      System.out.println(result.getState());
      System.out.println(result.getAvatarUrl());
      System.out.println(result.getAvatarPath());
      System.out.println(result.getCustomAttributes());
      System.out.println(result.getWebUrl());
      System.out.println(result.getEmail());
      System.out.println(result.getRequestedAt());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessRequestsApi#requestAccessToProject");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<APIEntitiesAccessRequester> response = client
              .accessRequests
              .requestAccessToProject(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessRequestsApi#requestAccessToProject");
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
| **id** | **String**| The ID or URL-encoded path of the project owned by the authenticated user | |

### Return type

[**APIEntitiesAccessRequester**](APIEntitiesAccessRequester.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, successfull_response

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

