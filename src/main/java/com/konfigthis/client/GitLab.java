package com.konfigthis.client;

import com.konfigthis.client.api.AccessRequestsApi;
import com.konfigthis.client.api.AdminApi;
import com.konfigthis.client.api.AlertManagementApi;
import com.konfigthis.client.api.ApplicationApi;
import com.konfigthis.client.api.ApplicationsApi;
import com.konfigthis.client.api.AvatarApi;
import com.konfigthis.client.api.BadgesApi;
import com.konfigthis.client.api.BatchedBackgroundMigrationsApi;
import com.konfigthis.client.api.BranchesApi;
import com.konfigthis.client.api.BroadcastMessagesApi;
import com.konfigthis.client.api.BulkImportsApi;
import com.konfigthis.client.api.CiVariablesApi;
import com.konfigthis.client.api.ClustersApi;
import com.konfigthis.client.api.JobsApi;
import com.konfigthis.client.api.MetadataApi;
import com.konfigthis.client.api.MigrationsApi;
import com.konfigthis.client.api.PlanLimitsApi;

public class GitLab {
    private ApiClient apiClient;
    public final AccessRequestsApi accessRequests;
    public final AdminApi admin;
    public final AlertManagementApi alertManagement;
    public final ApplicationApi application;
    public final ApplicationsApi applications;
    public final AvatarApi avatar;
    public final BadgesApi badges;
    public final BatchedBackgroundMigrationsApi batchedBackgroundMigrations;
    public final BranchesApi branches;
    public final BroadcastMessagesApi broadcastMessages;
    public final BulkImportsApi bulkImports;
    public final CiVariablesApi ciVariables;
    public final ClustersApi clusters;
    public final JobsApi jobs;
    public final MetadataApi metadata;
    public final MigrationsApi migrations;
    public final PlanLimitsApi planLimits;

    public GitLab() {
        this(null);
    }

    public GitLab(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.accessRequests = new AccessRequestsApi(this.apiClient);
        this.admin = new AdminApi(this.apiClient);
        this.alertManagement = new AlertManagementApi(this.apiClient);
        this.application = new ApplicationApi(this.apiClient);
        this.applications = new ApplicationsApi(this.apiClient);
        this.avatar = new AvatarApi(this.apiClient);
        this.badges = new BadgesApi(this.apiClient);
        this.batchedBackgroundMigrations = new BatchedBackgroundMigrationsApi(this.apiClient);
        this.branches = new BranchesApi(this.apiClient);
        this.broadcastMessages = new BroadcastMessagesApi(this.apiClient);
        this.bulkImports = new BulkImportsApi(this.apiClient);
        this.ciVariables = new CiVariablesApi(this.apiClient);
        this.clusters = new ClustersApi(this.apiClient);
        this.jobs = new JobsApi(this.apiClient);
        this.metadata = new MetadataApi(this.apiClient);
        this.migrations = new MigrationsApi(this.apiClient);
        this.planLimits = new PlanLimitsApi(this.apiClient);
    }

}
