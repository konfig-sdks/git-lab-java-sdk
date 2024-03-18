# JobsApi

All URIs are relative to *https://www.gitlab.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getSingleById**](JobsApi.md#getSingleById) | **GET** /api/v4/projects/{id}/jobs/{job_id} | Get a single job by ID |
| [**listForProject**](JobsApi.md#listForProject) | **GET** /api/v4/projects/{id}/jobs | List jobs for a project |
| [**runManualJob**](JobsApi.md#runManualJob) | **POST** /api/v4/projects/{id}/jobs/{job_id}/play | Run a manual job |


<a name="getSingleById"></a>
# **getSingleById**
> APIEntitiesJob getSingleById(id, jobId).execute();

Get a single job by ID

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GitLab;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://www.gitlab.com/api";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    GitLab client = new GitLab(configuration);
    Integer id = 56; // The ID of the project
    Integer jobId = 56; // The ID of the job
    try {
      APIEntitiesJob result = client
              .jobs
              .getSingleById(id, jobId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getStatus());
      System.out.println(result.getStage());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getStartedAt());
      System.out.println(result.getFinishedAt());
      System.out.println(result.getCommit());
      System.out.println(result.getArchived());
      System.out.println(result.getAllowFailure());
      System.out.println(result.getErasedAt());
      System.out.println(result.getDuration());
      System.out.println(result.getQueuedDuration());
      System.out.println(result.getRef());
      System.out.println(result.getArtifacts());
      System.out.println(result.getTag());
      System.out.println(result.getWebUrl());
      System.out.println(result.getProject());
      System.out.println(result.getUser());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobsApi#getSingleById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<APIEntitiesJob> response = client
              .jobs
              .getSingleById(id, jobId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobsApi#getSingleById");
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
| **id** | **Integer**| The ID of the project | |
| **jobId** | **Integer**| The ID of the job | |

### Return type

[**APIEntitiesJob**](APIEntitiesJob.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A single job object |  -  |

<a name="listForProject"></a>
# **listForProject**
> List&lt;APIEntitiesJob&gt; listForProject(id).scope(scope).execute();

List jobs for a project

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GitLab;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://www.gitlab.com/api";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    GitLab client = new GitLab(configuration);
    Integer id = 56; // The ID of the project
    List<String> scope = Arrays.asList(); // Return all jobs with the specified statuses
    try {
      List<APIEntitiesJob> result = client
              .jobs
              .listForProject(id)
              .scope(scope)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling JobsApi#listForProject");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<APIEntitiesJob>> response = client
              .jobs
              .listForProject(id)
              .scope(scope)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobsApi#listForProject");
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
| **id** | **Integer**| The ID of the project | |
| **scope** | [**List&lt;String&gt;**](String.md)| Return all jobs with the specified statuses | [optional] |

### Return type

[**List&lt;APIEntitiesJob&gt;**](APIEntitiesJob.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An array of jobs |  -  |

<a name="runManualJob"></a>
# **runManualJob**
> runManualJob(id, jobId).jobVariablesAttributes(jobVariablesAttributes).execute();

Run a manual job

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GitLab;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://www.gitlab.com/api";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    GitLab client = new GitLab(configuration);
    Integer id = 56; // The ID of the project
    Integer jobId = 56; // The ID of the manual job to run
    List<String> jobVariablesAttributes = Arrays.asList(); // An array containing the custom variables available to the job
    try {
      client
              .jobs
              .runManualJob(id, jobId)
              .jobVariablesAttributes(jobVariablesAttributes)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling JobsApi#runManualJob");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .jobs
              .runManualJob(id, jobId)
              .jobVariablesAttributes(jobVariablesAttributes)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling JobsApi#runManualJob");
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
| **id** | **Integer**| The ID of the project | |
| **jobId** | **Integer**| The ID of the manual job to run | |
| **jobVariablesAttributes** | [**List&lt;String&gt;**](String.md)| An array containing the custom variables available to the job | [optional] |

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
| **200** | Job started successfully |  -  |

