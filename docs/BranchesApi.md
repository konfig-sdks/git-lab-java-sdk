# BranchesApi

All URIs are relative to *https://www.gitlab.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**checkIfExists**](BranchesApi.md#checkIfExists) | **HEAD** /api/v4/projects/{id}/repository/branches/{branch} |  |
| [**createBranch**](BranchesApi.md#createBranch) | **POST** /api/v4/projects/{id}/repository/branches |  |
| [**deleteBranch**](BranchesApi.md#deleteBranch) | **DELETE** /api/v4/projects/{id}/repository/branches/{branch} |  |
| [**deleteMerged**](BranchesApi.md#deleteMerged) | **DELETE** /api/v4/projects/{id}/repository/merged_branches |  |
| [**getAll**](BranchesApi.md#getAll) | **GET** /api/v4/projects/{id}/repository/branches |  |
| [**getSingleBranch**](BranchesApi.md#getSingleBranch) | **GET** /api/v4/projects/{id}/repository/branches/{branch} |  |
| [**protectBranch**](BranchesApi.md#protectBranch) | **PUT** /api/v4/projects/{id}/repository/branches/{branch}/protect |  |
| [**unprotectBranch**](BranchesApi.md#unprotectBranch) | **PUT** /api/v4/projects/{id}/repository/branches/{branch}/unprotect |  |


<a name="checkIfExists"></a>
# **checkIfExists**
> checkIfExists(id, branch).execute();



Check if a branch exists

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GitLab;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BranchesApi;
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
    String branch = "branch_example"; // The name of the branch
    try {
      client
              .branches
              .checkIfExists(id, branch)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BranchesApi#checkIfExists");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .branches
              .checkIfExists(id, branch)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BranchesApi#checkIfExists");
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
| **branch** | **String**| The name of the branch | |

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
| **204** | No Content |  -  |
| **404** | Not Found |  -  |

<a name="createBranch"></a>
# **createBranch**
> APIEntitiesBranch createBranch(id, branch, ref).execute();



Create branch

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GitLab;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BranchesApi;
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
    String branch = "branch_example"; // The name of the branch
    String ref = "ref_example"; // Create branch from commit sha or existing branch
    try {
      APIEntitiesBranch result = client
              .branches
              .createBranch(id, branch, ref)
              .execute();
      System.out.println(result);
      System.out.println(result.getName());
      System.out.println(result.getCommit());
      System.out.println(result.getMerged());
      System.out.println(result.getProtected());
      System.out.println(result.getDevelopersCanPush());
      System.out.println(result.getDevelopersCanMerge());
      System.out.println(result.getCanPush());
      System.out.println(result.getDefault());
      System.out.println(result.getWebUrl());
    } catch (ApiException e) {
      System.err.println("Exception when calling BranchesApi#createBranch");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<APIEntitiesBranch> response = client
              .branches
              .createBranch(id, branch, ref)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BranchesApi#createBranch");
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
| **branch** | **String**| The name of the branch | |
| **ref** | **String**| Create branch from commit sha or existing branch | |

### Return type

[**APIEntitiesBranch**](APIEntitiesBranch.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Create branch |  -  |
| **400** | Failed to create branch |  -  |

<a name="deleteBranch"></a>
# **deleteBranch**
> deleteBranch(id, branch).execute();



Delete a branch

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GitLab;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BranchesApi;
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
    String branch = "branch_example"; // The name of the branch
    try {
      client
              .branches
              .deleteBranch(id, branch)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BranchesApi#deleteBranch");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .branches
              .deleteBranch(id, branch)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BranchesApi#deleteBranch");
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
| **branch** | **String**| The name of the branch | |

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
| **204** | Delete a branch |  -  |
| **404** | Branch Not Found |  -  |

<a name="deleteMerged"></a>
# **deleteMerged**
> deleteMerged(id).execute();



Delete all merged branches

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GitLab;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BranchesApi;
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
    try {
      client
              .branches
              .deleteMerged(id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BranchesApi#deleteMerged");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .branches
              .deleteMerged(id)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BranchesApi#deleteMerged");
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
| **202** | 202 Accepted |  -  |
| **404** | 404 Project Not Found |  -  |

<a name="getAll"></a>
# **getAll**
> List&lt;APIEntitiesBranch&gt; getAll(id).page(page).perPage(perPage).search(search).regex(regex).sort(sort).pageToken(pageToken).execute();



Get a project repository branches

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GitLab;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BranchesApi;
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
    Integer page = 1; // Current page number
    Integer perPage = 20; // Number of items per page
    String search = "search_example"; // Return list of branches matching the search criteria
    String regex = "regex_example"; // Return list of branches matching the regex
    String sort = "name_asc"; // Return list of branches sorted by the given field
    String pageToken = "pageToken_example"; // Name of branch to start the pagination from
    try {
      List<APIEntitiesBranch> result = client
              .branches
              .getAll(id)
              .page(page)
              .perPage(perPage)
              .search(search)
              .regex(regex)
              .sort(sort)
              .pageToken(pageToken)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BranchesApi#getAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<APIEntitiesBranch>> response = client
              .branches
              .getAll(id)
              .page(page)
              .perPage(perPage)
              .search(search)
              .regex(regex)
              .sort(sort)
              .pageToken(pageToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BranchesApi#getAll");
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
| **page** | **Integer**| Current page number | [optional] [default to 1] |
| **perPage** | **Integer**| Number of items per page | [optional] [default to 20] |
| **search** | **String**| Return list of branches matching the search criteria | [optional] |
| **regex** | **String**| Return list of branches matching the regex | [optional] |
| **sort** | **String**| Return list of branches sorted by the given field | [optional] [enum: name_asc, updated_asc, updated_desc] |
| **pageToken** | **String**| Name of branch to start the pagination from | [optional] |

### Return type

[**List&lt;APIEntitiesBranch&gt;**](APIEntitiesBranch.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get a project repository branches |  -  |
| **404** | 404 Project Not Found |  -  |

<a name="getSingleBranch"></a>
# **getSingleBranch**
> APIEntitiesBranch getSingleBranch(id, branch).execute();



Get a single repository branch

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GitLab;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BranchesApi;
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
    Integer branch = 56;
    try {
      APIEntitiesBranch result = client
              .branches
              .getSingleBranch(id, branch)
              .execute();
      System.out.println(result);
      System.out.println(result.getName());
      System.out.println(result.getCommit());
      System.out.println(result.getMerged());
      System.out.println(result.getProtected());
      System.out.println(result.getDevelopersCanPush());
      System.out.println(result.getDevelopersCanMerge());
      System.out.println(result.getCanPush());
      System.out.println(result.getDefault());
      System.out.println(result.getWebUrl());
    } catch (ApiException e) {
      System.err.println("Exception when calling BranchesApi#getSingleBranch");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<APIEntitiesBranch> response = client
              .branches
              .getSingleBranch(id, branch)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BranchesApi#getSingleBranch");
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
| **branch** | **Integer**|  | |

### Return type

[**APIEntitiesBranch**](APIEntitiesBranch.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get a single repository branch |  -  |
| **404** | Branch Not Found |  -  |

<a name="protectBranch"></a>
# **protectBranch**
> APIEntitiesBranch protectBranch(id, branch).branchesProtectBranchRequest(branchesProtectBranchRequest).execute();



Protect a single branch

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GitLab;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BranchesApi;
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
    String branch = "branch_example"; // The name of the branch
    Boolean developersCanPush = true; // Flag if developers can push to that branch
    Boolean developersCanMerge = true; // Flag if developers can merge to that branch
    try {
      APIEntitiesBranch result = client
              .branches
              .protectBranch(id, branch)
              .developersCanPush(developersCanPush)
              .developersCanMerge(developersCanMerge)
              .execute();
      System.out.println(result);
      System.out.println(result.getName());
      System.out.println(result.getCommit());
      System.out.println(result.getMerged());
      System.out.println(result.getProtected());
      System.out.println(result.getDevelopersCanPush());
      System.out.println(result.getDevelopersCanMerge());
      System.out.println(result.getCanPush());
      System.out.println(result.getDefault());
      System.out.println(result.getWebUrl());
    } catch (ApiException e) {
      System.err.println("Exception when calling BranchesApi#protectBranch");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<APIEntitiesBranch> response = client
              .branches
              .protectBranch(id, branch)
              .developersCanPush(developersCanPush)
              .developersCanMerge(developersCanMerge)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BranchesApi#protectBranch");
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
| **branch** | **String**| The name of the branch | |
| **branchesProtectBranchRequest** | [**BranchesProtectBranchRequest**](BranchesProtectBranchRequest.md)|  | [optional] |

### Return type

[**APIEntitiesBranch**](APIEntitiesBranch.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Protect a single branch |  -  |
| **404** | 404 Branch Not Found |  -  |

<a name="unprotectBranch"></a>
# **unprotectBranch**
> APIEntitiesBranch unprotectBranch(id, branch).execute();



Unprotect a single branch

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GitLab;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BranchesApi;
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
    String branch = "branch_example"; // The name of the branch
    try {
      APIEntitiesBranch result = client
              .branches
              .unprotectBranch(id, branch)
              .execute();
      System.out.println(result);
      System.out.println(result.getName());
      System.out.println(result.getCommit());
      System.out.println(result.getMerged());
      System.out.println(result.getProtected());
      System.out.println(result.getDevelopersCanPush());
      System.out.println(result.getDevelopersCanMerge());
      System.out.println(result.getCanPush());
      System.out.println(result.getDefault());
      System.out.println(result.getWebUrl());
    } catch (ApiException e) {
      System.err.println("Exception when calling BranchesApi#unprotectBranch");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<APIEntitiesBranch> response = client
              .branches
              .unprotectBranch(id, branch)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BranchesApi#unprotectBranch");
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
| **branch** | **String**| The name of the branch | |

### Return type

[**APIEntitiesBranch**](APIEntitiesBranch.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Unprotect a single branch |  -  |
| **404** | 404 Project Not Found |  -  |

