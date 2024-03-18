# ApplicationApi

All URIs are relative to *https://www.gitlab.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCurrentAppearance**](ApplicationApi.md#getCurrentAppearance) | **GET** /api/v4/application/appearance |  |
| [**modifyAppearance**](ApplicationApi.md#modifyAppearance) | **PUT** /api/v4/application/appearance |  |


<a name="getCurrentAppearance"></a>
# **getCurrentAppearance**
> APIEntitiesAppearance getCurrentAppearance().execute();



Get the current appearance

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GitLab;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://www.gitlab.com/api";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    GitLab client = new GitLab(configuration);
    try {
      APIEntitiesAppearance result = client
              .application
              .getCurrentAppearance()
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getDescription());
      System.out.println(result.getPwaName());
      System.out.println(result.getPwaShortName());
      System.out.println(result.getPwaDescription());
      System.out.println(result.getLogo());
      System.out.println(result.getPwaIcon());
      System.out.println(result.getHeaderLogo());
      System.out.println(result.getFavicon());
      System.out.println(result.getNewProjectGuidelines());
      System.out.println(result.getProfileImageGuidelines());
      System.out.println(result.getHeaderMessage());
      System.out.println(result.getFooterMessage());
      System.out.println(result.getMessageBackgroundColor());
      System.out.println(result.getMessageFontColor());
      System.out.println(result.getEmailHeaderAndFooterEnabled());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#getCurrentAppearance");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<APIEntitiesAppearance> response = client
              .application
              .getCurrentAppearance()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#getCurrentAppearance");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**APIEntitiesAppearance**](APIEntitiesAppearance.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get the current appearance |  -  |

<a name="modifyAppearance"></a>
# **modifyAppearance**
> APIEntitiesAppearance modifyAppearance().title(title).description(description).pwaName(pwaName).pwaShortName(pwaShortName).pwaDescription(pwaDescription).logo(logo).pwaIcon(pwaIcon).headerLogo(headerLogo).favicon(favicon).newProjectGuidelines(newProjectGuidelines).profileImageGuidelines(profileImageGuidelines).headerMessage(headerMessage).footerMessage(footerMessage).messageBackgroundColor(messageBackgroundColor).messageFontColor(messageFontColor).emailHeaderAndFooterEnabled(emailHeaderAndFooterEnabled).applicationModifyAppearanceRequest(applicationModifyAppearanceRequest).execute();



Modify appearance

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GitLab;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApplicationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://www.gitlab.com/api";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    GitLab client = new GitLab(configuration);
    String title = "title_example"; // Instance title on the sign in / sign up page
    String description = "description_example"; // Markdown text shown on the sign in / sign up page
    String pwaName = "pwaName_example"; // Name of the Progressive Web App
    String pwaShortName = "pwaShortName_example"; // Optional, short name for Progressive Web App
    String pwaDescription = "pwaDescription_example"; // An explanation of what the Progressive Web App does
    File logo = new File("/path/to/file"); // Instance image used on the sign in / sign up page
    File pwaIcon = new File("/path/to/file"); // Icon used for Progressive Web App
    File headerLogo = new File("/path/to/file"); // Instance image used for the main navigation bar
    File favicon = new File("/path/to/file"); // Instance favicon in .ico/.png format
    String newProjectGuidelines = "newProjectGuidelines_example"; // Markdown text shown on the new project page
    String profileImageGuidelines = "profileImageGuidelines_example"; // Markdown text shown on the profile page below Public Avatar
    String headerMessage = "headerMessage_example"; // Message within the system header bar
    String footerMessage = "footerMessage_example"; // Message within the system footer bar
    String messageBackgroundColor = "messageBackgroundColor_example"; // Background color for the system header / footer bar
    String messageFontColor = "messageFontColor_example"; // Font color for the system header / footer bar
    Boolean emailHeaderAndFooterEnabled = true; // Add header and footer to all outgoing emails if enabled
    try {
      APIEntitiesAppearance result = client
              .application
              .modifyAppearance()
              .title(title)
              .description(description)
              .pwaName(pwaName)
              .pwaShortName(pwaShortName)
              .pwaDescription(pwaDescription)
              .logo(logo)
              .pwaIcon(pwaIcon)
              .headerLogo(headerLogo)
              .favicon(favicon)
              .newProjectGuidelines(newProjectGuidelines)
              .profileImageGuidelines(profileImageGuidelines)
              .headerMessage(headerMessage)
              .footerMessage(footerMessage)
              .messageBackgroundColor(messageBackgroundColor)
              .messageFontColor(messageFontColor)
              .emailHeaderAndFooterEnabled(emailHeaderAndFooterEnabled)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getDescription());
      System.out.println(result.getPwaName());
      System.out.println(result.getPwaShortName());
      System.out.println(result.getPwaDescription());
      System.out.println(result.getLogo());
      System.out.println(result.getPwaIcon());
      System.out.println(result.getHeaderLogo());
      System.out.println(result.getFavicon());
      System.out.println(result.getNewProjectGuidelines());
      System.out.println(result.getProfileImageGuidelines());
      System.out.println(result.getHeaderMessage());
      System.out.println(result.getFooterMessage());
      System.out.println(result.getMessageBackgroundColor());
      System.out.println(result.getMessageFontColor());
      System.out.println(result.getEmailHeaderAndFooterEnabled());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#modifyAppearance");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<APIEntitiesAppearance> response = client
              .application
              .modifyAppearance()
              .title(title)
              .description(description)
              .pwaName(pwaName)
              .pwaShortName(pwaShortName)
              .pwaDescription(pwaDescription)
              .logo(logo)
              .pwaIcon(pwaIcon)
              .headerLogo(headerLogo)
              .favicon(favicon)
              .newProjectGuidelines(newProjectGuidelines)
              .profileImageGuidelines(profileImageGuidelines)
              .headerMessage(headerMessage)
              .footerMessage(footerMessage)
              .messageBackgroundColor(messageBackgroundColor)
              .messageFontColor(messageFontColor)
              .emailHeaderAndFooterEnabled(emailHeaderAndFooterEnabled)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationApi#modifyAppearance");
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
| **title** | **String**| Instance title on the sign in / sign up page | [optional] |
| **description** | **String**| Markdown text shown on the sign in / sign up page | [optional] |
| **pwaName** | **String**| Name of the Progressive Web App | [optional] |
| **pwaShortName** | **String**| Optional, short name for Progressive Web App | [optional] |
| **pwaDescription** | **String**| An explanation of what the Progressive Web App does | [optional] |
| **logo** | **File**| Instance image used on the sign in / sign up page | [optional] |
| **pwaIcon** | **File**| Icon used for Progressive Web App | [optional] |
| **headerLogo** | **File**| Instance image used for the main navigation bar | [optional] |
| **favicon** | **File**| Instance favicon in .ico/.png format | [optional] |
| **newProjectGuidelines** | **String**| Markdown text shown on the new project page | [optional] |
| **profileImageGuidelines** | **String**| Markdown text shown on the profile page below Public Avatar | [optional] |
| **headerMessage** | **String**| Message within the system header bar | [optional] |
| **footerMessage** | **String**| Message within the system footer bar | [optional] |
| **messageBackgroundColor** | **String**| Background color for the system header / footer bar | [optional] |
| **messageFontColor** | **String**| Font color for the system header / footer bar | [optional] |
| **emailHeaderAndFooterEnabled** | **Boolean**| Add header and footer to all outgoing emails if enabled | [optional] |
| **applicationModifyAppearanceRequest** | [**ApplicationModifyAppearanceRequest**](ApplicationModifyAppearanceRequest.md)|  | [optional] |

### Return type

[**APIEntitiesAppearance**](APIEntitiesAppearance.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Modify appearance |  -  |

