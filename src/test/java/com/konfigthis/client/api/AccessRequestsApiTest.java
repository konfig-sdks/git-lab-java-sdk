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

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.APIEntitiesAccessRequester;
import com.konfigthis.client.model.AccessrequestsApproveForUserRequest;
import com.konfigthis.client.model.AccessrequestsApproveForUserRequest1;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AccessRequestsApi
 */
@Disabled
public class AccessRequestsApiTest {

    private static AccessRequestsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new AccessRequestsApi(apiClient);
    }

    /**
     * Approves an access request for the given user.
     *
     * This feature was introduced in GitLab 8.11.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void approveForUserTest() throws ApiException {
        String id = null;
        Integer userId = null;
        Integer accessLevel = null;
        APIEntitiesAccessRequester response = api.approveForUser(id, userId)
                .accessLevel(accessLevel)
                .execute();
        // TODO: test validations
    }

    /**
     * Approves an access request for the given user.
     *
     * This feature was introduced in GitLab 8.11.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void approveForUser_0Test() throws ApiException {
        String id = null;
        Integer userId = null;
        Integer accessLevel = null;
        APIEntitiesAccessRequester response = api.approveForUser_0(id, userId)
                .accessLevel(accessLevel)
                .execute();
        // TODO: test validations
    }

    /**
     * Denies an access request for the given user.
     *
     * This feature was introduced in GitLab 8.11.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void denyAccessToUserTest() throws ApiException {
        String id = null;
        Integer userId = null;
        api.denyAccessToUser(id, userId)
                .execute();
        // TODO: test validations
    }

    /**
     * Denies an access request for the given user.
     *
     * This feature was introduced in GitLab 8.11.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void denyAccessToUser_0Test() throws ApiException {
        String id = null;
        Integer userId = null;
        api.denyAccessToUser_0(id, userId)
                .execute();
        // TODO: test validations
    }

    /**
     * Gets a list of access requests for a group.
     *
     * This feature was introduced in GitLab 8.11.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getListTest() throws ApiException {
        String id = null;
        Integer page = null;
        Integer perPage = null;
        APIEntitiesAccessRequester response = api.getList(id)
                .page(page)
                .perPage(perPage)
                .execute();
        // TODO: test validations
    }

    /**
     * Gets a list of access requests for a project.
     *
     * This feature was introduced in GitLab 8.11.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getList_0Test() throws ApiException {
        String id = null;
        Integer page = null;
        Integer perPage = null;
        APIEntitiesAccessRequester response = api.getList_0(id)
                .page(page)
                .perPage(perPage)
                .execute();
        // TODO: test validations
    }

    /**
     * Requests access for the authenticated user to a group.
     *
     * This feature was introduced in GitLab 8.11.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void requestAccessToGroupTest() throws ApiException {
        String id = null;
        APIEntitiesAccessRequester response = api.requestAccessToGroup(id)
                .execute();
        // TODO: test validations
    }

    /**
     * Requests access for the authenticated user to a project.
     *
     * This feature was introduced in GitLab 8.11.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void requestAccessToProjectTest() throws ApiException {
        String id = null;
        APIEntitiesAccessRequester response = api.requestAccessToProject(id)
                .execute();
        // TODO: test validations
    }

}
