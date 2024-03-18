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


import com.konfigthis.client.model.APIEntitiesDictionaryTable;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AdminApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AdminApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public AdminApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call getDictionaryDetailsCall(String databaseName, String tableName, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/v4/admin/databases/{database_name}/dictionary/tables/{table_name}"
            .replace("{" + "database_name" + "}", localVarApiClient.escapeString(databaseName.toString()))
            .replace("{" + "table_name" + "}", localVarApiClient.escapeString(tableName.toString()));

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
    private okhttp3.Call getDictionaryDetailsValidateBeforeCall(String databaseName, String tableName, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'databaseName' is set
        if (databaseName == null) {
            throw new ApiException("Missing the required parameter 'databaseName' when calling getDictionaryDetails(Async)");
        }

        // verify the required parameter 'tableName' is set
        if (tableName == null) {
            throw new ApiException("Missing the required parameter 'tableName' when calling getDictionaryDetails(Async)");
        }

        return getDictionaryDetailsCall(databaseName, tableName, _callback);

    }


    private ApiResponse<APIEntitiesDictionaryTable> getDictionaryDetailsWithHttpInfo(String databaseName, String tableName) throws ApiException {
        okhttp3.Call localVarCall = getDictionaryDetailsValidateBeforeCall(databaseName, tableName, null);
        Type localVarReturnType = new TypeToken<APIEntitiesDictionaryTable>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getDictionaryDetailsAsync(String databaseName, String tableName, final ApiCallback<APIEntitiesDictionaryTable> _callback) throws ApiException {

        okhttp3.Call localVarCall = getDictionaryDetailsValidateBeforeCall(databaseName, tableName, _callback);
        Type localVarReturnType = new TypeToken<APIEntitiesDictionaryTable>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetDictionaryDetailsRequestBuilder {
        private final String databaseName;
        private final String tableName;

        private GetDictionaryDetailsRequestBuilder(String databaseName, String tableName) {
            this.databaseName = databaseName;
            this.tableName = tableName;
        }

        /**
         * Build call for getDictionaryDetails
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Retrieve dictionary details </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> 401 Unauthorized </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> 403 Forbidden </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> 404 Not found </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getDictionaryDetailsCall(databaseName, tableName, _callback);
        }


        /**
         * Execute getDictionaryDetails request
         * @return APIEntitiesDictionaryTable
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Retrieve dictionary details </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> 401 Unauthorized </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> 403 Forbidden </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> 404 Not found </td><td>  -  </td></tr>
         </table>
         */
        public APIEntitiesDictionaryTable execute() throws ApiException {
            ApiResponse<APIEntitiesDictionaryTable> localVarResp = getDictionaryDetailsWithHttpInfo(databaseName, tableName);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getDictionaryDetails request with HTTP info returned
         * @return ApiResponse&lt;APIEntitiesDictionaryTable&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Retrieve dictionary details </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> 401 Unauthorized </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> 403 Forbidden </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> 404 Not found </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<APIEntitiesDictionaryTable> executeWithHttpInfo() throws ApiException {
            return getDictionaryDetailsWithHttpInfo(databaseName, tableName);
        }

        /**
         * Execute getDictionaryDetails request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Retrieve dictionary details </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> 401 Unauthorized </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> 403 Forbidden </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> 404 Not found </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<APIEntitiesDictionaryTable> _callback) throws ApiException {
            return getDictionaryDetailsAsync(databaseName, tableName, _callback);
        }
    }

    /**
     * 
     * Retrieve dictionary details
     * @param databaseName The database name (required)
     * @param tableName The table name (required)
     * @return GetDictionaryDetailsRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Retrieve dictionary details </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> 401 Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> 403 Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> 404 Not found </td><td>  -  </td></tr>
     </table>
     */
    public GetDictionaryDetailsRequestBuilder getDictionaryDetails(String databaseName, String tableName) throws IllegalArgumentException {
        if (databaseName == null) throw new IllegalArgumentException("\"databaseName\" is required but got null");
            

        if (tableName == null) throw new IllegalArgumentException("\"tableName\" is required but got null");
            

        return new GetDictionaryDetailsRequestBuilder(databaseName, tableName);
    }
}
