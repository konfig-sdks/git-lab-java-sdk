/*
 * GitLab API
 * An OpenAPI definition for the GitLab REST API. Few API resources or endpoints are currently included. The intent is to expand this to match the entire Markdown documentation of the API: <https://docs.gitlab.com/ee/api/>. Contributions are welcome.  When viewing this on gitlab.com, you can test API calls directly from the browser against the `gitlab.com` instance, if you are logged in. The feature uses the current [GitLab session cookie](https://docs.gitlab.com/ee/api/index.html#session-cookie), so each request is made using your account.  Instructions for using this tool can be found in [Interactive API Documentation](https://docs.gitlab.com/ee/api/openapi/openapi_interactive.html) 
 *
 * The version of the OpenAPI document: v4
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiCallback;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.Pair;
import com.konfigthis.client.ProgressRequestBody;
import com.konfigthis.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.konfigthis.client.model.APIEntitiesApplication;
import com.konfigthis.client.model.APIEntitiesApplicationWithSecret;
import com.konfigthis.client.model.ApplicationsCreateNewApplicationRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class ApplicationsApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ApplicationsApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public ApplicationsApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
        if (apiClient.getApiKeyAuth() == null) {
            throw new IllegalArgumentException("\"Private-Token\" is required but no API key was provided. Please set \"Private-Token\" with ApiClient#setApiKeyAuth(String).");
        }
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call createNewApplicationCall(ApplicationsCreateNewApplicationRequest applicationsCreateNewApplicationRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = applicationsCreateNewApplicationRequest;

        // create path and map variables
        String localVarPath = "/api/v4/applications";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createNewApplicationValidateBeforeCall(ApplicationsCreateNewApplicationRequest applicationsCreateNewApplicationRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'applicationsCreateNewApplicationRequest' is set
        if (applicationsCreateNewApplicationRequest == null) {
            throw new ApiException("Missing the required parameter 'applicationsCreateNewApplicationRequest' when calling createNewApplication(Async)");
        }

        return createNewApplicationCall(applicationsCreateNewApplicationRequest, _callback);

    }


    private ApiResponse<APIEntitiesApplicationWithSecret> createNewApplicationWithHttpInfo(ApplicationsCreateNewApplicationRequest applicationsCreateNewApplicationRequest) throws ApiException {
        okhttp3.Call localVarCall = createNewApplicationValidateBeforeCall(applicationsCreateNewApplicationRequest, null);
        Type localVarReturnType = new TypeToken<APIEntitiesApplicationWithSecret>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call createNewApplicationAsync(ApplicationsCreateNewApplicationRequest applicationsCreateNewApplicationRequest, final ApiCallback<APIEntitiesApplicationWithSecret> _callback) throws ApiException {

        okhttp3.Call localVarCall = createNewApplicationValidateBeforeCall(applicationsCreateNewApplicationRequest, _callback);
        Type localVarReturnType = new TypeToken<APIEntitiesApplicationWithSecret>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class CreateNewApplicationRequestBuilder {
        private final String name;
        private final String redirectUri;
        private final String scopes;
        private Boolean confidential;

        private CreateNewApplicationRequestBuilder(String name, String redirectUri, String scopes) {
            this.name = name;
            this.redirectUri = redirectUri;
            this.scopes = scopes;
        }

        /**
         * Set confidential
         * @param confidential The application is used where the client secret can be kept confidential. Native mobile apps \\\\                         and Single Page Apps are considered non-confidential. Defaults to true if not supplied (optional, default to true)
         * @return CreateNewApplicationRequestBuilder
         */
        public CreateNewApplicationRequestBuilder confidential(Boolean confidential) {
            this.confidential = confidential;
            return this;
        }
        
        /**
         * Build call for createNewApplication
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Create a new application </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            ApplicationsCreateNewApplicationRequest applicationsCreateNewApplicationRequest = buildBodyParams();
            return createNewApplicationCall(applicationsCreateNewApplicationRequest, _callback);
        }

        private ApplicationsCreateNewApplicationRequest buildBodyParams() {
            ApplicationsCreateNewApplicationRequest applicationsCreateNewApplicationRequest = new ApplicationsCreateNewApplicationRequest();
            applicationsCreateNewApplicationRequest.name(this.name);
            applicationsCreateNewApplicationRequest.redirectUri(this.redirectUri);
            applicationsCreateNewApplicationRequest.scopes(this.scopes);
            applicationsCreateNewApplicationRequest.confidential(this.confidential);
            return applicationsCreateNewApplicationRequest;
        }

        /**
         * Execute createNewApplication request
         * @return APIEntitiesApplicationWithSecret
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Create a new application </td><td>  -  </td></tr>
         </table>
         */
        public APIEntitiesApplicationWithSecret execute() throws ApiException {
            ApplicationsCreateNewApplicationRequest applicationsCreateNewApplicationRequest = buildBodyParams();
            ApiResponse<APIEntitiesApplicationWithSecret> localVarResp = createNewApplicationWithHttpInfo(applicationsCreateNewApplicationRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute createNewApplication request with HTTP info returned
         * @return ApiResponse&lt;APIEntitiesApplicationWithSecret&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Create a new application </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<APIEntitiesApplicationWithSecret> executeWithHttpInfo() throws ApiException {
            ApplicationsCreateNewApplicationRequest applicationsCreateNewApplicationRequest = buildBodyParams();
            return createNewApplicationWithHttpInfo(applicationsCreateNewApplicationRequest);
        }

        /**
         * Execute createNewApplication request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Create a new application </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<APIEntitiesApplicationWithSecret> _callback) throws ApiException {
            ApplicationsCreateNewApplicationRequest applicationsCreateNewApplicationRequest = buildBodyParams();
            return createNewApplicationAsync(applicationsCreateNewApplicationRequest, _callback);
        }
    }

    /**
     * Create a new application
     * This feature was introduced in GitLab 10.5
     * @param applicationsCreateNewApplicationRequest  (required)
     * @return CreateNewApplicationRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Create a new application </td><td>  -  </td></tr>
     </table>
     */
    public CreateNewApplicationRequestBuilder createNewApplication(String name, String redirectUri, String scopes) throws IllegalArgumentException {
        if (name == null) throw new IllegalArgumentException("\"name\" is required but got null");
            

        if (redirectUri == null) throw new IllegalArgumentException("\"redirectUri\" is required but got null");
            

        if (scopes == null) throw new IllegalArgumentException("\"scopes\" is required but got null");
            

        return new CreateNewApplicationRequestBuilder(name, redirectUri, scopes);
    }
    private okhttp3.Call deleteSpecificApplicationCall(Integer id, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v4/applications/{id}"
            .replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteSpecificApplicationValidateBeforeCall(Integer id, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteSpecificApplication(Async)");
        }

        return deleteSpecificApplicationCall(id, _callback);

    }


    private ApiResponse<Void> deleteSpecificApplicationWithHttpInfo(Integer id) throws ApiException {
        okhttp3.Call localVarCall = deleteSpecificApplicationValidateBeforeCall(id, null);
        return localVarApiClient.execute(localVarCall);
    }

    private okhttp3.Call deleteSpecificApplicationAsync(Integer id, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteSpecificApplicationValidateBeforeCall(id, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public class DeleteSpecificApplicationRequestBuilder {
        private final Integer id;

        private DeleteSpecificApplicationRequestBuilder(Integer id) {
            this.id = id;
        }

        /**
         * Build call for deleteSpecificApplication
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> Delete an application </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return deleteSpecificApplicationCall(id, _callback);
        }


        /**
         * Execute deleteSpecificApplication request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> Delete an application </td><td>  -  </td></tr>
         </table>
         */
        public void execute() throws ApiException {
            deleteSpecificApplicationWithHttpInfo(id);
        }

        /**
         * Execute deleteSpecificApplication request with HTTP info returned
         * @return ApiResponse&lt;Void&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> Delete an application </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
            return deleteSpecificApplicationWithHttpInfo(id);
        }

        /**
         * Execute deleteSpecificApplication request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> Delete an application </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            return deleteSpecificApplicationAsync(id, _callback);
        }
    }

    /**
     * Delete an application
     * Delete a specific application
     * @param id The ID of the application (not the application_id) (required)
     * @return DeleteSpecificApplicationRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Delete an application </td><td>  -  </td></tr>
     </table>
     */
    public DeleteSpecificApplicationRequestBuilder deleteSpecificApplication(Integer id) throws IllegalArgumentException {
        if (id == null) throw new IllegalArgumentException("\"id\" is required but got null");
        return new DeleteSpecificApplicationRequestBuilder(id);
    }
    private okhttp3.Call listAllRegisteredCall(final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v4/applications";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listAllRegisteredValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return listAllRegisteredCall(_callback);

    }


    private ApiResponse<List<APIEntitiesApplication>> listAllRegisteredWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = listAllRegisteredValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<List<APIEntitiesApplication>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listAllRegisteredAsync(final ApiCallback<List<APIEntitiesApplication>> _callback) throws ApiException {

        okhttp3.Call localVarCall = listAllRegisteredValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<List<APIEntitiesApplication>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class ListAllRegisteredRequestBuilder {

        private ListAllRegisteredRequestBuilder() {
        }

        /**
         * Build call for listAllRegistered
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Get applications </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return listAllRegisteredCall(_callback);
        }


        /**
         * Execute listAllRegistered request
         * @return List&lt;APIEntitiesApplication&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Get applications </td><td>  -  </td></tr>
         </table>
         */
        public List<APIEntitiesApplication> execute() throws ApiException {
            ApiResponse<List<APIEntitiesApplication>> localVarResp = listAllRegisteredWithHttpInfo();
            return localVarResp.getResponseBody();
        }

        /**
         * Execute listAllRegistered request with HTTP info returned
         * @return ApiResponse&lt;List&lt;APIEntitiesApplication&gt;&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Get applications </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<List<APIEntitiesApplication>> executeWithHttpInfo() throws ApiException {
            return listAllRegisteredWithHttpInfo();
        }

        /**
         * Execute listAllRegistered request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Get applications </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<List<APIEntitiesApplication>> _callback) throws ApiException {
            return listAllRegisteredAsync(_callback);
        }
    }

    /**
     * Get applications
     * List all registered applications
     * @return ListAllRegisteredRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get applications </td><td>  -  </td></tr>
     </table>
     */
    public ListAllRegisteredRequestBuilder listAllRegistered() throws IllegalArgumentException {
        return new ListAllRegisteredRequestBuilder();
    }
}
