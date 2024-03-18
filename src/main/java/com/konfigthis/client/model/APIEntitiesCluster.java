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


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.APIEntitiesPlatformKubernetes;
import com.konfigthis.client.model.APIEntitiesProjectIdentity;
import com.konfigthis.client.model.APIEntitiesProviderGcp;
import com.konfigthis.client.model.APIEntitiesUserBasic;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * API_Entities_Cluster model
 */
@ApiModel(description = "API_Entities_Cluster model")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class APIEntitiesCluster {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_DOMAIN = "domain";
  @SerializedName(SERIALIZED_NAME_DOMAIN)
  private String domain;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private String enabled;

  public static final String SERIALIZED_NAME_MANAGED = "managed";
  @SerializedName(SERIALIZED_NAME_MANAGED)
  private String managed;

  public static final String SERIALIZED_NAME_PROVIDER_TYPE = "provider_type";
  @SerializedName(SERIALIZED_NAME_PROVIDER_TYPE)
  private String providerType;

  public static final String SERIALIZED_NAME_PLATFORM_TYPE = "platform_type";
  @SerializedName(SERIALIZED_NAME_PLATFORM_TYPE)
  private String platformType;

  public static final String SERIALIZED_NAME_ENVIRONMENT_SCOPE = "environment_scope";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT_SCOPE)
  private String environmentScope;

  public static final String SERIALIZED_NAME_CLUSTER_TYPE = "cluster_type";
  @SerializedName(SERIALIZED_NAME_CLUSTER_TYPE)
  private String clusterType;

  public static final String SERIALIZED_NAME_NAMESPACE_PER_ENVIRONMENT = "namespace_per_environment";
  @SerializedName(SERIALIZED_NAME_NAMESPACE_PER_ENVIRONMENT)
  private String namespacePerEnvironment;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private APIEntitiesUserBasic user;

  public static final String SERIALIZED_NAME_PLATFORM_KUBERNETES = "platform_kubernetes";
  @SerializedName(SERIALIZED_NAME_PLATFORM_KUBERNETES)
  private APIEntitiesPlatformKubernetes platformKubernetes;

  public static final String SERIALIZED_NAME_PROVIDER_GCP = "provider_gcp";
  @SerializedName(SERIALIZED_NAME_PROVIDER_GCP)
  private APIEntitiesProviderGcp providerGcp;

  public static final String SERIALIZED_NAME_MANAGEMENT_PROJECT = "management_project";
  @SerializedName(SERIALIZED_NAME_MANAGEMENT_PROJECT)
  private APIEntitiesProjectIdentity managementProject;

  public APIEntitiesCluster() {
  }

  public APIEntitiesCluster id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public APIEntitiesCluster name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public APIEntitiesCluster createdAt(String createdAt) {
    
    
    
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    
    
    
    this.createdAt = createdAt;
  }


  public APIEntitiesCluster domain(String domain) {
    
    
    
    
    this.domain = domain;
    return this;
  }

   /**
   * Get domain
   * @return domain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDomain() {
    return domain;
  }


  public void setDomain(String domain) {
    
    
    
    this.domain = domain;
  }


  public APIEntitiesCluster enabled(String enabled) {
    
    
    
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEnabled() {
    return enabled;
  }


  public void setEnabled(String enabled) {
    
    
    
    this.enabled = enabled;
  }


  public APIEntitiesCluster managed(String managed) {
    
    
    
    
    this.managed = managed;
    return this;
  }

   /**
   * Get managed
   * @return managed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getManaged() {
    return managed;
  }


  public void setManaged(String managed) {
    
    
    
    this.managed = managed;
  }


  public APIEntitiesCluster providerType(String providerType) {
    
    
    
    
    this.providerType = providerType;
    return this;
  }

   /**
   * Get providerType
   * @return providerType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProviderType() {
    return providerType;
  }


  public void setProviderType(String providerType) {
    
    
    
    this.providerType = providerType;
  }


  public APIEntitiesCluster platformType(String platformType) {
    
    
    
    
    this.platformType = platformType;
    return this;
  }

   /**
   * Get platformType
   * @return platformType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPlatformType() {
    return platformType;
  }


  public void setPlatformType(String platformType) {
    
    
    
    this.platformType = platformType;
  }


  public APIEntitiesCluster environmentScope(String environmentScope) {
    
    
    
    
    this.environmentScope = environmentScope;
    return this;
  }

   /**
   * Get environmentScope
   * @return environmentScope
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEnvironmentScope() {
    return environmentScope;
  }


  public void setEnvironmentScope(String environmentScope) {
    
    
    
    this.environmentScope = environmentScope;
  }


  public APIEntitiesCluster clusterType(String clusterType) {
    
    
    
    
    this.clusterType = clusterType;
    return this;
  }

   /**
   * Get clusterType
   * @return clusterType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getClusterType() {
    return clusterType;
  }


  public void setClusterType(String clusterType) {
    
    
    
    this.clusterType = clusterType;
  }


  public APIEntitiesCluster namespacePerEnvironment(String namespacePerEnvironment) {
    
    
    
    
    this.namespacePerEnvironment = namespacePerEnvironment;
    return this;
  }

   /**
   * Get namespacePerEnvironment
   * @return namespacePerEnvironment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNamespacePerEnvironment() {
    return namespacePerEnvironment;
  }


  public void setNamespacePerEnvironment(String namespacePerEnvironment) {
    
    
    
    this.namespacePerEnvironment = namespacePerEnvironment;
  }


  public APIEntitiesCluster user(APIEntitiesUserBasic user) {
    
    
    
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public APIEntitiesUserBasic getUser() {
    return user;
  }


  public void setUser(APIEntitiesUserBasic user) {
    
    
    
    this.user = user;
  }


  public APIEntitiesCluster platformKubernetes(APIEntitiesPlatformKubernetes platformKubernetes) {
    
    
    
    
    this.platformKubernetes = platformKubernetes;
    return this;
  }

   /**
   * Get platformKubernetes
   * @return platformKubernetes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public APIEntitiesPlatformKubernetes getPlatformKubernetes() {
    return platformKubernetes;
  }


  public void setPlatformKubernetes(APIEntitiesPlatformKubernetes platformKubernetes) {
    
    
    
    this.platformKubernetes = platformKubernetes;
  }


  public APIEntitiesCluster providerGcp(APIEntitiesProviderGcp providerGcp) {
    
    
    
    
    this.providerGcp = providerGcp;
    return this;
  }

   /**
   * Get providerGcp
   * @return providerGcp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public APIEntitiesProviderGcp getProviderGcp() {
    return providerGcp;
  }


  public void setProviderGcp(APIEntitiesProviderGcp providerGcp) {
    
    
    
    this.providerGcp = providerGcp;
  }


  public APIEntitiesCluster managementProject(APIEntitiesProjectIdentity managementProject) {
    
    
    
    
    this.managementProject = managementProject;
    return this;
  }

   /**
   * Get managementProject
   * @return managementProject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public APIEntitiesProjectIdentity getManagementProject() {
    return managementProject;
  }


  public void setManagementProject(APIEntitiesProjectIdentity managementProject) {
    
    
    
    this.managementProject = managementProject;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the APIEntitiesCluster instance itself
   */
  public APIEntitiesCluster putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIEntitiesCluster apIEntitiesCluster = (APIEntitiesCluster) o;
    return Objects.equals(this.id, apIEntitiesCluster.id) &&
        Objects.equals(this.name, apIEntitiesCluster.name) &&
        Objects.equals(this.createdAt, apIEntitiesCluster.createdAt) &&
        Objects.equals(this.domain, apIEntitiesCluster.domain) &&
        Objects.equals(this.enabled, apIEntitiesCluster.enabled) &&
        Objects.equals(this.managed, apIEntitiesCluster.managed) &&
        Objects.equals(this.providerType, apIEntitiesCluster.providerType) &&
        Objects.equals(this.platformType, apIEntitiesCluster.platformType) &&
        Objects.equals(this.environmentScope, apIEntitiesCluster.environmentScope) &&
        Objects.equals(this.clusterType, apIEntitiesCluster.clusterType) &&
        Objects.equals(this.namespacePerEnvironment, apIEntitiesCluster.namespacePerEnvironment) &&
        Objects.equals(this.user, apIEntitiesCluster.user) &&
        Objects.equals(this.platformKubernetes, apIEntitiesCluster.platformKubernetes) &&
        Objects.equals(this.providerGcp, apIEntitiesCluster.providerGcp) &&
        Objects.equals(this.managementProject, apIEntitiesCluster.managementProject)&&
        Objects.equals(this.additionalProperties, apIEntitiesCluster.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, createdAt, domain, enabled, managed, providerType, platformType, environmentScope, clusterType, namespacePerEnvironment, user, platformKubernetes, providerGcp, managementProject, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIEntitiesCluster {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    managed: ").append(toIndentedString(managed)).append("\n");
    sb.append("    providerType: ").append(toIndentedString(providerType)).append("\n");
    sb.append("    platformType: ").append(toIndentedString(platformType)).append("\n");
    sb.append("    environmentScope: ").append(toIndentedString(environmentScope)).append("\n");
    sb.append("    clusterType: ").append(toIndentedString(clusterType)).append("\n");
    sb.append("    namespacePerEnvironment: ").append(toIndentedString(namespacePerEnvironment)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    platformKubernetes: ").append(toIndentedString(platformKubernetes)).append("\n");
    sb.append("    providerGcp: ").append(toIndentedString(providerGcp)).append("\n");
    sb.append("    managementProject: ").append(toIndentedString(managementProject)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("created_at");
    openapiFields.add("domain");
    openapiFields.add("enabled");
    openapiFields.add("managed");
    openapiFields.add("provider_type");
    openapiFields.add("platform_type");
    openapiFields.add("environment_scope");
    openapiFields.add("cluster_type");
    openapiFields.add("namespace_per_environment");
    openapiFields.add("user");
    openapiFields.add("platform_kubernetes");
    openapiFields.add("provider_gcp");
    openapiFields.add("management_project");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to APIEntitiesCluster
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!APIEntitiesCluster.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in APIEntitiesCluster is not found in the empty JSON string", APIEntitiesCluster.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("created_at") != null && !jsonObj.get("created_at").isJsonNull()) && !jsonObj.get("created_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_at").toString()));
      }
      if ((jsonObj.get("domain") != null && !jsonObj.get("domain").isJsonNull()) && !jsonObj.get("domain").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `domain` to be a primitive type in the JSON string but got `%s`", jsonObj.get("domain").toString()));
      }
      if ((jsonObj.get("enabled") != null && !jsonObj.get("enabled").isJsonNull()) && !jsonObj.get("enabled").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enabled` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enabled").toString()));
      }
      if ((jsonObj.get("managed") != null && !jsonObj.get("managed").isJsonNull()) && !jsonObj.get("managed").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `managed` to be a primitive type in the JSON string but got `%s`", jsonObj.get("managed").toString()));
      }
      if ((jsonObj.get("provider_type") != null && !jsonObj.get("provider_type").isJsonNull()) && !jsonObj.get("provider_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `provider_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("provider_type").toString()));
      }
      if ((jsonObj.get("platform_type") != null && !jsonObj.get("platform_type").isJsonNull()) && !jsonObj.get("platform_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `platform_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("platform_type").toString()));
      }
      if ((jsonObj.get("environment_scope") != null && !jsonObj.get("environment_scope").isJsonNull()) && !jsonObj.get("environment_scope").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `environment_scope` to be a primitive type in the JSON string but got `%s`", jsonObj.get("environment_scope").toString()));
      }
      if ((jsonObj.get("cluster_type") != null && !jsonObj.get("cluster_type").isJsonNull()) && !jsonObj.get("cluster_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cluster_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cluster_type").toString()));
      }
      if ((jsonObj.get("namespace_per_environment") != null && !jsonObj.get("namespace_per_environment").isJsonNull()) && !jsonObj.get("namespace_per_environment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `namespace_per_environment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("namespace_per_environment").toString()));
      }
      // validate the optional field `user`
      if (jsonObj.get("user") != null && !jsonObj.get("user").isJsonNull()) {
        APIEntitiesUserBasic.validateJsonObject(jsonObj.getAsJsonObject("user"));
      }
      // validate the optional field `platform_kubernetes`
      if (jsonObj.get("platform_kubernetes") != null && !jsonObj.get("platform_kubernetes").isJsonNull()) {
        APIEntitiesPlatformKubernetes.validateJsonObject(jsonObj.getAsJsonObject("platform_kubernetes"));
      }
      // validate the optional field `provider_gcp`
      if (jsonObj.get("provider_gcp") != null && !jsonObj.get("provider_gcp").isJsonNull()) {
        APIEntitiesProviderGcp.validateJsonObject(jsonObj.getAsJsonObject("provider_gcp"));
      }
      // validate the optional field `management_project`
      if (jsonObj.get("management_project") != null && !jsonObj.get("management_project").isJsonNull()) {
        APIEntitiesProjectIdentity.validateJsonObject(jsonObj.getAsJsonObject("management_project"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!APIEntitiesCluster.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'APIEntitiesCluster' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<APIEntitiesCluster> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(APIEntitiesCluster.class));

       return (TypeAdapter<T>) new TypeAdapter<APIEntitiesCluster>() {
           @Override
           public void write(JsonWriter out, APIEntitiesCluster value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public APIEntitiesCluster read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             APIEntitiesCluster instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of APIEntitiesCluster given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of APIEntitiesCluster
  * @throws IOException if the JSON string is invalid with respect to APIEntitiesCluster
  */
  public static APIEntitiesCluster fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, APIEntitiesCluster.class);
  }

 /**
  * Convert an instance of APIEntitiesCluster to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
