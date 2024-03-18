# CiVariablesApi

All URIs are relative to *https://www.gitlab.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewInstanceVariable**](CiVariablesApi.md#createNewInstanceVariable) | **POST** /api/v4/admin/ci/variables |  |
| [**deleteInstanceVariable**](CiVariablesApi.md#deleteInstanceVariable) | **DELETE** /api/v4/admin/ci/variables/{key} |  |
| [**getSpecificInstanceVariable**](CiVariablesApi.md#getSpecificInstanceVariable) | **GET** /api/v4/admin/ci/variables/{key} |  |
| [**listInstanceVariables**](CiVariablesApi.md#listInstanceVariables) | **GET** /api/v4/admin/ci/variables |  |
| [**updateInstanceVariable**](CiVariablesApi.md#updateInstanceVariable) | **PUT** /api/v4/admin/ci/variables/{key} |  |


<a name="createNewInstanceVariable"></a>
# **createNewInstanceVariable**
> APIEntitiesCiVariable createNewInstanceVariable(civariablesCreateNewInstanceVariableRequest).execute();



Create a new instance-level variable

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GitLab;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CiVariablesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://www.gitlab.com/api";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    GitLab client = new GitLab(configuration);
    String key = "key_example"; // The key of the variable. Max 255 characters
    String value = "value_example"; // The value of a variable
    Boolean _protected = true; // Whether the variable is protected
    Boolean masked = true; // Whether the variable is masked
    Boolean raw = true; // Whether the variable will be expanded
    String variableType = "env_var"; // The type of a variable. Available types are: env_var (default) and file
    try {
      APIEntitiesCiVariable result = client
              .ciVariables
              .createNewInstanceVariable(key, value)
              ._protected(_protected)
              .masked(masked)
              .raw(raw)
              .variableType(variableType)
              .execute();
      System.out.println(result);
      System.out.println(result.getVariableType());
      System.out.println(result.getKey());
      System.out.println(result.getValue());
      System.out.println(result.getProtected());
      System.out.println(result.getMasked());
      System.out.println(result.getRaw());
      System.out.println(result.getEnvironmentScope());
    } catch (ApiException e) {
      System.err.println("Exception when calling CiVariablesApi#createNewInstanceVariable");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<APIEntitiesCiVariable> response = client
              .ciVariables
              .createNewInstanceVariable(key, value)
              ._protected(_protected)
              .masked(masked)
              .raw(raw)
              .variableType(variableType)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CiVariablesApi#createNewInstanceVariable");
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
| **civariablesCreateNewInstanceVariableRequest** | [**CivariablesCreateNewInstanceVariableRequest**](CivariablesCreateNewInstanceVariableRequest.md)|  | |

### Return type

[**APIEntitiesCiVariable**](APIEntitiesCiVariable.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Create a new instance-level variable |  -  |
| **400** | 400 Bad Request |  -  |

<a name="deleteInstanceVariable"></a>
# **deleteInstanceVariable**
> APIEntitiesCiVariable deleteInstanceVariable(key).execute();



Delete an existing instance-level variable

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GitLab;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CiVariablesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://www.gitlab.com/api";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    GitLab client = new GitLab(configuration);
    String key = "key_example"; // The key of a variable
    try {
      APIEntitiesCiVariable result = client
              .ciVariables
              .deleteInstanceVariable(key)
              .execute();
      System.out.println(result);
      System.out.println(result.getVariableType());
      System.out.println(result.getKey());
      System.out.println(result.getValue());
      System.out.println(result.getProtected());
      System.out.println(result.getMasked());
      System.out.println(result.getRaw());
      System.out.println(result.getEnvironmentScope());
    } catch (ApiException e) {
      System.err.println("Exception when calling CiVariablesApi#deleteInstanceVariable");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<APIEntitiesCiVariable> response = client
              .ciVariables
              .deleteInstanceVariable(key)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CiVariablesApi#deleteInstanceVariable");
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
| **key** | **String**| The key of a variable | |

### Return type

[**APIEntitiesCiVariable**](APIEntitiesCiVariable.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Delete an existing instance-level variable |  -  |
| **404** | Instance Variable Not Found |  -  |

<a name="getSpecificInstanceVariable"></a>
# **getSpecificInstanceVariable**
> APIEntitiesCiVariable getSpecificInstanceVariable(key).execute();



Get the details of a specific instance-level variable

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GitLab;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CiVariablesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://www.gitlab.com/api";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    GitLab client = new GitLab(configuration);
    String key = "key_example"; // The key of a variable
    try {
      APIEntitiesCiVariable result = client
              .ciVariables
              .getSpecificInstanceVariable(key)
              .execute();
      System.out.println(result);
      System.out.println(result.getVariableType());
      System.out.println(result.getKey());
      System.out.println(result.getValue());
      System.out.println(result.getProtected());
      System.out.println(result.getMasked());
      System.out.println(result.getRaw());
      System.out.println(result.getEnvironmentScope());
    } catch (ApiException e) {
      System.err.println("Exception when calling CiVariablesApi#getSpecificInstanceVariable");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<APIEntitiesCiVariable> response = client
              .ciVariables
              .getSpecificInstanceVariable(key)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CiVariablesApi#getSpecificInstanceVariable");
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
| **key** | **String**| The key of a variable | |

### Return type

[**APIEntitiesCiVariable**](APIEntitiesCiVariable.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get the details of a specific instance-level variable |  -  |
| **404** | Instance Variable Not Found |  -  |

<a name="listInstanceVariables"></a>
# **listInstanceVariables**
> APIEntitiesCiVariable listInstanceVariables().page(page).perPage(perPage).execute();



List all instance-level variables

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GitLab;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CiVariablesApi;
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
    try {
      APIEntitiesCiVariable result = client
              .ciVariables
              .listInstanceVariables()
              .page(page)
              .perPage(perPage)
              .execute();
      System.out.println(result);
      System.out.println(result.getVariableType());
      System.out.println(result.getKey());
      System.out.println(result.getValue());
      System.out.println(result.getProtected());
      System.out.println(result.getMasked());
      System.out.println(result.getRaw());
      System.out.println(result.getEnvironmentScope());
    } catch (ApiException e) {
      System.err.println("Exception when calling CiVariablesApi#listInstanceVariables");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<APIEntitiesCiVariable> response = client
              .ciVariables
              .listInstanceVariables()
              .page(page)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CiVariablesApi#listInstanceVariables");
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

### Return type

[**APIEntitiesCiVariable**](APIEntitiesCiVariable.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List all instance-level variables |  -  |

<a name="updateInstanceVariable"></a>
# **updateInstanceVariable**
> APIEntitiesCiVariable updateInstanceVariable(key).civariablesUpdateInstanceVariableRequest(civariablesUpdateInstanceVariableRequest).execute();



Update an instance-level variable

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GitLab;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CiVariablesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://www.gitlab.com/api";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    GitLab client = new GitLab(configuration);
    String key = "key_example"; // The key of a variable
    String value = "value_example"; // The value of a variable
    Boolean _protected = true; // Whether the variable is protected
    Boolean masked = true; // Whether the variable is masked
    Boolean raw = true; // Whether the variable will be expanded
    String variableType = "env_var"; // The type of a variable. Available types are: env_var (default) and file
    try {
      APIEntitiesCiVariable result = client
              .ciVariables
              .updateInstanceVariable(key)
              .value(value)
              ._protected(_protected)
              .masked(masked)
              .raw(raw)
              .variableType(variableType)
              .execute();
      System.out.println(result);
      System.out.println(result.getVariableType());
      System.out.println(result.getKey());
      System.out.println(result.getValue());
      System.out.println(result.getProtected());
      System.out.println(result.getMasked());
      System.out.println(result.getRaw());
      System.out.println(result.getEnvironmentScope());
    } catch (ApiException e) {
      System.err.println("Exception when calling CiVariablesApi#updateInstanceVariable");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<APIEntitiesCiVariable> response = client
              .ciVariables
              .updateInstanceVariable(key)
              .value(value)
              ._protected(_protected)
              .masked(masked)
              .raw(raw)
              .variableType(variableType)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CiVariablesApi#updateInstanceVariable");
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
| **key** | **String**| The key of a variable | |
| **civariablesUpdateInstanceVariableRequest** | [**CivariablesUpdateInstanceVariableRequest**](CivariablesUpdateInstanceVariableRequest.md)|  | [optional] |

### Return type

[**APIEntitiesCiVariable**](APIEntitiesCiVariable.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update an instance-level variable |  -  |
| **404** | Instance Variable Not Found |  -  |

