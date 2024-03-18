# PlanLimitsApi

All URIs are relative to *https://www.gitlab.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCurrentLimits**](PlanLimitsApi.md#getCurrentLimits) | **GET** /api/v4/application/plan_limits | Get current plan limits |
| [**modifyLimits**](PlanLimitsApi.md#modifyLimits) | **PUT** /api/v4/application/plan_limits | Change plan limits |


<a name="getCurrentLimits"></a>
# **getCurrentLimits**
> APIEntitiesPlanLimit getCurrentLimits().planName(planName).execute();

Get current plan limits

List the current limits of a plan on the GitLab instance.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GitLab;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PlanLimitsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://www.gitlab.com/api";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    GitLab client = new GitLab(configuration);
    String planName = "default"; // Name of the plan to get the limits from. Default: default.
    try {
      APIEntitiesPlanLimit result = client
              .planLimits
              .getCurrentLimits()
              .planName(planName)
              .execute();
      System.out.println(result);
      System.out.println(result.getCiPipelineSize());
      System.out.println(result.getCiActiveJobs());
      System.out.println(result.getCiProjectSubscriptions());
      System.out.println(result.getCiPipelineSchedules());
      System.out.println(result.getCiNeedsSizeLimit());
      System.out.println(result.getCiRegisteredGroupRunners());
      System.out.println(result.getCiRegisteredProjectRunners());
      System.out.println(result.getConanMaxFileSize());
      System.out.println(result.getEnforcementLimit());
      System.out.println(result.getGenericPackagesMaxFileSize());
      System.out.println(result.getHelmMaxFileSize());
      System.out.println(result.getLimitsHistory());
      System.out.println(result.getMavenMaxFileSize());
      System.out.println(result.getNotificationLimit());
      System.out.println(result.getNpmMaxFileSize());
      System.out.println(result.getNugetMaxFileSize());
      System.out.println(result.getPipelineHierarchySize());
      System.out.println(result.getPypiMaxFileSize());
      System.out.println(result.getTerraformModuleMaxFileSize());
      System.out.println(result.getStorageSizeLimit());
    } catch (ApiException e) {
      System.err.println("Exception when calling PlanLimitsApi#getCurrentLimits");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<APIEntitiesPlanLimit> response = client
              .planLimits
              .getCurrentLimits()
              .planName(planName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PlanLimitsApi#getCurrentLimits");
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
| **planName** | **String**| Name of the plan to get the limits from. Default: default. | [optional] [default to default] [enum: default, free, bronze, silver, premium, gold, ultimate, ultimate_trial, premium_trial, opensource] |

### Return type

[**APIEntitiesPlanLimit**](APIEntitiesPlanLimit.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get current plan limits |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a name="modifyLimits"></a>
# **modifyLimits**
> APIEntitiesPlanLimit modifyLimits(planlimitsModifyLimitsRequest).execute();

Change plan limits

Modify the limits of a plan on the GitLab instance.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GitLab;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PlanLimitsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://www.gitlab.com/api";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    GitLab client = new GitLab(configuration);
    String planName = "default"; // Name of the plan to update
    Integer ciPipelineSize = 56; // Maximum number of jobs in a single pipeline
    Integer ciActiveJobs = 56; // Total number of jobs in currently active pipelines
    Integer ciProjectSubscriptions = 56; // Maximum number of pipeline subscriptions to and from a project
    Integer ciPipelineSchedules = 56; // Maximum number of pipeline schedules
    Integer ciNeedsSizeLimit = 56; // Maximum number of DAG dependencies that a job can have
    Integer ciRegisteredGroupRunners = 56; // Maximum number of runners registered per group
    Integer ciRegisteredProjectRunners = 56; // Maximum number of runners registered per project
    Integer conanMaxFileSize = 56; // Maximum Conan package file size in bytes
    Integer enforcementLimit = 56; // Maximum storage size for the root namespace enforcement in MiB
    Integer genericPackagesMaxFileSize = 56; // Maximum generic package file size in bytes
    Integer helmMaxFileSize = 56; // Maximum Helm chart file size in bytes
    Integer mavenMaxFileSize = 56; // Maximum Maven package file size in bytes
    Integer notificationLimit = 56; // Maximum storage size for the root namespace notifications in MiB
    Integer npmMaxFileSize = 56; // Maximum NPM package file size in bytes
    Integer nugetMaxFileSize = 56; // Maximum NuGet package file size in bytes
    Integer pypiMaxFileSize = 56; // Maximum PyPI package file size in bytes
    Integer terraformModuleMaxFileSize = 56; // Maximum Terraform Module package file size in bytes
    Integer storageSizeLimit = 56; // Maximum storage size for the root namespace in MiB
    Integer pipelineHierarchySize = 56; // Maximum number of downstream pipelines in a pipeline's hierarchy tree
    try {
      APIEntitiesPlanLimit result = client
              .planLimits
              .modifyLimits(planName)
              .ciPipelineSize(ciPipelineSize)
              .ciActiveJobs(ciActiveJobs)
              .ciProjectSubscriptions(ciProjectSubscriptions)
              .ciPipelineSchedules(ciPipelineSchedules)
              .ciNeedsSizeLimit(ciNeedsSizeLimit)
              .ciRegisteredGroupRunners(ciRegisteredGroupRunners)
              .ciRegisteredProjectRunners(ciRegisteredProjectRunners)
              .conanMaxFileSize(conanMaxFileSize)
              .enforcementLimit(enforcementLimit)
              .genericPackagesMaxFileSize(genericPackagesMaxFileSize)
              .helmMaxFileSize(helmMaxFileSize)
              .mavenMaxFileSize(mavenMaxFileSize)
              .notificationLimit(notificationLimit)
              .npmMaxFileSize(npmMaxFileSize)
              .nugetMaxFileSize(nugetMaxFileSize)
              .pypiMaxFileSize(pypiMaxFileSize)
              .terraformModuleMaxFileSize(terraformModuleMaxFileSize)
              .storageSizeLimit(storageSizeLimit)
              .pipelineHierarchySize(pipelineHierarchySize)
              .execute();
      System.out.println(result);
      System.out.println(result.getCiPipelineSize());
      System.out.println(result.getCiActiveJobs());
      System.out.println(result.getCiProjectSubscriptions());
      System.out.println(result.getCiPipelineSchedules());
      System.out.println(result.getCiNeedsSizeLimit());
      System.out.println(result.getCiRegisteredGroupRunners());
      System.out.println(result.getCiRegisteredProjectRunners());
      System.out.println(result.getConanMaxFileSize());
      System.out.println(result.getEnforcementLimit());
      System.out.println(result.getGenericPackagesMaxFileSize());
      System.out.println(result.getHelmMaxFileSize());
      System.out.println(result.getLimitsHistory());
      System.out.println(result.getMavenMaxFileSize());
      System.out.println(result.getNotificationLimit());
      System.out.println(result.getNpmMaxFileSize());
      System.out.println(result.getNugetMaxFileSize());
      System.out.println(result.getPipelineHierarchySize());
      System.out.println(result.getPypiMaxFileSize());
      System.out.println(result.getTerraformModuleMaxFileSize());
      System.out.println(result.getStorageSizeLimit());
    } catch (ApiException e) {
      System.err.println("Exception when calling PlanLimitsApi#modifyLimits");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<APIEntitiesPlanLimit> response = client
              .planLimits
              .modifyLimits(planName)
              .ciPipelineSize(ciPipelineSize)
              .ciActiveJobs(ciActiveJobs)
              .ciProjectSubscriptions(ciProjectSubscriptions)
              .ciPipelineSchedules(ciPipelineSchedules)
              .ciNeedsSizeLimit(ciNeedsSizeLimit)
              .ciRegisteredGroupRunners(ciRegisteredGroupRunners)
              .ciRegisteredProjectRunners(ciRegisteredProjectRunners)
              .conanMaxFileSize(conanMaxFileSize)
              .enforcementLimit(enforcementLimit)
              .genericPackagesMaxFileSize(genericPackagesMaxFileSize)
              .helmMaxFileSize(helmMaxFileSize)
              .mavenMaxFileSize(mavenMaxFileSize)
              .notificationLimit(notificationLimit)
              .npmMaxFileSize(npmMaxFileSize)
              .nugetMaxFileSize(nugetMaxFileSize)
              .pypiMaxFileSize(pypiMaxFileSize)
              .terraformModuleMaxFileSize(terraformModuleMaxFileSize)
              .storageSizeLimit(storageSizeLimit)
              .pipelineHierarchySize(pipelineHierarchySize)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PlanLimitsApi#modifyLimits");
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
| **planlimitsModifyLimitsRequest** | [**PlanlimitsModifyLimitsRequest**](PlanlimitsModifyLimitsRequest.md)|  | |

### Return type

[**APIEntitiesPlanLimit**](APIEntitiesPlanLimit.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Change plan limits |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

