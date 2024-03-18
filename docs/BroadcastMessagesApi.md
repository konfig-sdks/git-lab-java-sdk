# BroadcastMessagesApi

All URIs are relative to *https://www.gitlab.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createMessage**](BroadcastMessagesApi.md#createMessage) | **POST** /api/v4/broadcast_messages | Create a broadcast message |
| [**deleteMessage**](BroadcastMessagesApi.md#deleteMessage) | **DELETE** /api/v4/broadcast_messages/{id} | Delete a broadcast message |
| [**getSpecificMessage**](BroadcastMessagesApi.md#getSpecificMessage) | **GET** /api/v4/broadcast_messages/{id} | Get a specific broadcast message |
| [**listAll**](BroadcastMessagesApi.md#listAll) | **GET** /api/v4/broadcast_messages | Get all broadcast messages |
| [**updateMessage**](BroadcastMessagesApi.md#updateMessage) | **PUT** /api/v4/broadcast_messages/{id} | Update a broadcast message |


<a name="createMessage"></a>
# **createMessage**
> APIEntitiesBroadcastMessage createMessage(broadcastmessagesCreateMessageRequest).execute();

Create a broadcast message

This feature was introduced in GitLab 8.12.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GitLab;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BroadcastMessagesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://www.gitlab.com/api";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    GitLab client = new GitLab(configuration);
    String message = "message_example"; // Message to display
    OffsetDateTime startsAt = OffsetDateTime.now(); // Starting time
    OffsetDateTime endsAt = OffsetDateTime.now(); // Ending time
    String color = "color_example"; // Background color
    String font = "font_example"; // Foreground color
    List<Integer> targetAccessLevels = Arrays.asList(); // Target user roles
    String targetPath = "targetPath_example"; // Target path
    String broadcastType = "banner"; // Broadcast type. Defaults to banner
    Boolean dismissable = true; // Is dismissable
    try {
      APIEntitiesBroadcastMessage result = client
              .broadcastMessages
              .createMessage(message)
              .startsAt(startsAt)
              .endsAt(endsAt)
              .color(color)
              .font(font)
              .targetAccessLevels(targetAccessLevels)
              .targetPath(targetPath)
              .broadcastType(broadcastType)
              .dismissable(dismissable)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getMessage());
      System.out.println(result.getStartsAt());
      System.out.println(result.getEndsAt());
      System.out.println(result.getColor());
      System.out.println(result.getFont());
      System.out.println(result.getTargetAccessLevels());
      System.out.println(result.getTargetPath());
      System.out.println(result.getBroadcastType());
      System.out.println(result.getDismissable());
      System.out.println(result.getActive());
    } catch (ApiException e) {
      System.err.println("Exception when calling BroadcastMessagesApi#createMessage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<APIEntitiesBroadcastMessage> response = client
              .broadcastMessages
              .createMessage(message)
              .startsAt(startsAt)
              .endsAt(endsAt)
              .color(color)
              .font(font)
              .targetAccessLevels(targetAccessLevels)
              .targetPath(targetPath)
              .broadcastType(broadcastType)
              .dismissable(dismissable)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BroadcastMessagesApi#createMessage");
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
| **broadcastmessagesCreateMessageRequest** | [**BroadcastmessagesCreateMessageRequest**](BroadcastmessagesCreateMessageRequest.md)|  | |

### Return type

[**APIEntitiesBroadcastMessage**](APIEntitiesBroadcastMessage.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Create a broadcast message |  -  |

<a name="deleteMessage"></a>
# **deleteMessage**
> APIEntitiesBroadcastMessage deleteMessage(id).execute();

Delete a broadcast message

This feature was introduced in GitLab 8.12.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GitLab;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BroadcastMessagesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://www.gitlab.com/api";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    GitLab client = new GitLab(configuration);
    Integer id = 56; // Broadcast message ID
    try {
      APIEntitiesBroadcastMessage result = client
              .broadcastMessages
              .deleteMessage(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getMessage());
      System.out.println(result.getStartsAt());
      System.out.println(result.getEndsAt());
      System.out.println(result.getColor());
      System.out.println(result.getFont());
      System.out.println(result.getTargetAccessLevels());
      System.out.println(result.getTargetPath());
      System.out.println(result.getBroadcastType());
      System.out.println(result.getDismissable());
      System.out.println(result.getActive());
    } catch (ApiException e) {
      System.err.println("Exception when calling BroadcastMessagesApi#deleteMessage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<APIEntitiesBroadcastMessage> response = client
              .broadcastMessages
              .deleteMessage(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BroadcastMessagesApi#deleteMessage");
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
| **id** | **Integer**| Broadcast message ID | |

### Return type

[**APIEntitiesBroadcastMessage**](APIEntitiesBroadcastMessage.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete a broadcast message |  -  |

<a name="getSpecificMessage"></a>
# **getSpecificMessage**
> APIEntitiesBroadcastMessage getSpecificMessage(id).execute();

Get a specific broadcast message

This feature was introduced in GitLab 8.12.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GitLab;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BroadcastMessagesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://www.gitlab.com/api";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    GitLab client = new GitLab(configuration);
    Integer id = 56; // Broadcast message ID
    try {
      APIEntitiesBroadcastMessage result = client
              .broadcastMessages
              .getSpecificMessage(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getMessage());
      System.out.println(result.getStartsAt());
      System.out.println(result.getEndsAt());
      System.out.println(result.getColor());
      System.out.println(result.getFont());
      System.out.println(result.getTargetAccessLevels());
      System.out.println(result.getTargetPath());
      System.out.println(result.getBroadcastType());
      System.out.println(result.getDismissable());
      System.out.println(result.getActive());
    } catch (ApiException e) {
      System.err.println("Exception when calling BroadcastMessagesApi#getSpecificMessage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<APIEntitiesBroadcastMessage> response = client
              .broadcastMessages
              .getSpecificMessage(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BroadcastMessagesApi#getSpecificMessage");
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
| **id** | **Integer**| Broadcast message ID | |

### Return type

[**APIEntitiesBroadcastMessage**](APIEntitiesBroadcastMessage.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get a specific broadcast message |  -  |

<a name="listAll"></a>
# **listAll**
> APIEntitiesBroadcastMessage listAll().page(page).perPage(perPage).execute();

Get all broadcast messages

This feature was introduced in GitLab 8.12.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GitLab;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BroadcastMessagesApi;
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
      APIEntitiesBroadcastMessage result = client
              .broadcastMessages
              .listAll()
              .page(page)
              .perPage(perPage)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getMessage());
      System.out.println(result.getStartsAt());
      System.out.println(result.getEndsAt());
      System.out.println(result.getColor());
      System.out.println(result.getFont());
      System.out.println(result.getTargetAccessLevels());
      System.out.println(result.getTargetPath());
      System.out.println(result.getBroadcastType());
      System.out.println(result.getDismissable());
      System.out.println(result.getActive());
    } catch (ApiException e) {
      System.err.println("Exception when calling BroadcastMessagesApi#listAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<APIEntitiesBroadcastMessage> response = client
              .broadcastMessages
              .listAll()
              .page(page)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BroadcastMessagesApi#listAll");
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

[**APIEntitiesBroadcastMessage**](APIEntitiesBroadcastMessage.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get all broadcast messages |  -  |

<a name="updateMessage"></a>
# **updateMessage**
> APIEntitiesBroadcastMessage updateMessage(id).broadcastmessagesUpdateMessageRequest(broadcastmessagesUpdateMessageRequest).execute();

Update a broadcast message

This feature was introduced in GitLab 8.12.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GitLab;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BroadcastMessagesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://www.gitlab.com/api";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    GitLab client = new GitLab(configuration);
    Integer id = 56; // Broadcast message ID
    String message = "message_example"; // Message to display
    OffsetDateTime startsAt = OffsetDateTime.now(); // Starting time
    OffsetDateTime endsAt = OffsetDateTime.now(); // Ending time
    String color = "color_example"; // Background color
    String font = "font_example"; // Foreground color
    List<Integer> targetAccessLevels = Arrays.asList(); // Target user roles
    String targetPath = "targetPath_example"; // Target path
    String broadcastType = "banner"; // Broadcast Type
    Boolean dismissable = true; // Is dismissable
    try {
      APIEntitiesBroadcastMessage result = client
              .broadcastMessages
              .updateMessage(id)
              .message(message)
              .startsAt(startsAt)
              .endsAt(endsAt)
              .color(color)
              .font(font)
              .targetAccessLevels(targetAccessLevels)
              .targetPath(targetPath)
              .broadcastType(broadcastType)
              .dismissable(dismissable)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getMessage());
      System.out.println(result.getStartsAt());
      System.out.println(result.getEndsAt());
      System.out.println(result.getColor());
      System.out.println(result.getFont());
      System.out.println(result.getTargetAccessLevels());
      System.out.println(result.getTargetPath());
      System.out.println(result.getBroadcastType());
      System.out.println(result.getDismissable());
      System.out.println(result.getActive());
    } catch (ApiException e) {
      System.err.println("Exception when calling BroadcastMessagesApi#updateMessage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<APIEntitiesBroadcastMessage> response = client
              .broadcastMessages
              .updateMessage(id)
              .message(message)
              .startsAt(startsAt)
              .endsAt(endsAt)
              .color(color)
              .font(font)
              .targetAccessLevels(targetAccessLevels)
              .targetPath(targetPath)
              .broadcastType(broadcastType)
              .dismissable(dismissable)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BroadcastMessagesApi#updateMessage");
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
| **id** | **Integer**| Broadcast message ID | |
| **broadcastmessagesUpdateMessageRequest** | [**BroadcastmessagesUpdateMessageRequest**](BroadcastmessagesUpdateMessageRequest.md)|  | [optional] |

### Return type

[**APIEntitiesBroadcastMessage**](APIEntitiesBroadcastMessage.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update a broadcast message |  -  |

