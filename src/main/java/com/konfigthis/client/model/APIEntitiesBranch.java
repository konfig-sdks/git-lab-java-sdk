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
import com.konfigthis.client.model.APIEntitiesCommit;
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
 * API_Entities_Branch model
 */
@ApiModel(description = "API_Entities_Branch model")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class APIEntitiesBranch {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_COMMIT = "commit";
  @SerializedName(SERIALIZED_NAME_COMMIT)
  private APIEntitiesCommit commit;

  public static final String SERIALIZED_NAME_MERGED = "merged";
  @SerializedName(SERIALIZED_NAME_MERGED)
  private Boolean merged;

  public static final String SERIALIZED_NAME_PROTECTED = "protected";
  @SerializedName(SERIALIZED_NAME_PROTECTED)
  private Boolean _protected;

  public static final String SERIALIZED_NAME_DEVELOPERS_CAN_PUSH = "developers_can_push";
  @SerializedName(SERIALIZED_NAME_DEVELOPERS_CAN_PUSH)
  private Boolean developersCanPush;

  public static final String SERIALIZED_NAME_DEVELOPERS_CAN_MERGE = "developers_can_merge";
  @SerializedName(SERIALIZED_NAME_DEVELOPERS_CAN_MERGE)
  private Boolean developersCanMerge;

  public static final String SERIALIZED_NAME_CAN_PUSH = "can_push";
  @SerializedName(SERIALIZED_NAME_CAN_PUSH)
  private Boolean canPush;

  public static final String SERIALIZED_NAME_DEFAULT = "default";
  @SerializedName(SERIALIZED_NAME_DEFAULT)
  private Boolean _default;

  public static final String SERIALIZED_NAME_WEB_URL = "web_url";
  @SerializedName(SERIALIZED_NAME_WEB_URL)
  private String webUrl;

  public APIEntitiesBranch() {
  }

  public APIEntitiesBranch name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "master", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public APIEntitiesBranch commit(APIEntitiesCommit commit) {
    
    
    
    
    this.commit = commit;
    return this;
  }

   /**
   * Get commit
   * @return commit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public APIEntitiesCommit getCommit() {
    return commit;
  }


  public void setCommit(APIEntitiesCommit commit) {
    
    
    
    this.commit = commit;
  }


  public APIEntitiesBranch merged(Boolean merged) {
    
    
    
    
    this.merged = merged;
    return this;
  }

   /**
   * Get merged
   * @return merged
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getMerged() {
    return merged;
  }


  public void setMerged(Boolean merged) {
    
    
    
    this.merged = merged;
  }


  public APIEntitiesBranch _protected(Boolean _protected) {
    
    
    
    
    this._protected = _protected;
    return this;
  }

   /**
   * Get _protected
   * @return _protected
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getProtected() {
    return _protected;
  }


  public void setProtected(Boolean _protected) {
    
    
    
    this._protected = _protected;
  }


  public APIEntitiesBranch developersCanPush(Boolean developersCanPush) {
    
    
    
    
    this.developersCanPush = developersCanPush;
    return this;
  }

   /**
   * Get developersCanPush
   * @return developersCanPush
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getDevelopersCanPush() {
    return developersCanPush;
  }


  public void setDevelopersCanPush(Boolean developersCanPush) {
    
    
    
    this.developersCanPush = developersCanPush;
  }


  public APIEntitiesBranch developersCanMerge(Boolean developersCanMerge) {
    
    
    
    
    this.developersCanMerge = developersCanMerge;
    return this;
  }

   /**
   * Get developersCanMerge
   * @return developersCanMerge
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getDevelopersCanMerge() {
    return developersCanMerge;
  }


  public void setDevelopersCanMerge(Boolean developersCanMerge) {
    
    
    
    this.developersCanMerge = developersCanMerge;
  }


  public APIEntitiesBranch canPush(Boolean canPush) {
    
    
    
    
    this.canPush = canPush;
    return this;
  }

   /**
   * Get canPush
   * @return canPush
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getCanPush() {
    return canPush;
  }


  public void setCanPush(Boolean canPush) {
    
    
    
    this.canPush = canPush;
  }


  public APIEntitiesBranch _default(Boolean _default) {
    
    
    
    
    this._default = _default;
    return this;
  }

   /**
   * Get _default
   * @return _default
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getDefault() {
    return _default;
  }


  public void setDefault(Boolean _default) {
    
    
    
    this._default = _default;
  }


  public APIEntitiesBranch webUrl(String webUrl) {
    
    
    
    
    this.webUrl = webUrl;
    return this;
  }

   /**
   * Get webUrl
   * @return webUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://gitlab.example.com/Commit921/the-dude/-/tree/master", value = "")

  public String getWebUrl() {
    return webUrl;
  }


  public void setWebUrl(String webUrl) {
    
    
    
    this.webUrl = webUrl;
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
   * @return the APIEntitiesBranch instance itself
   */
  public APIEntitiesBranch putAdditionalProperty(String key, Object value) {
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
    APIEntitiesBranch apIEntitiesBranch = (APIEntitiesBranch) o;
    return Objects.equals(this.name, apIEntitiesBranch.name) &&
        Objects.equals(this.commit, apIEntitiesBranch.commit) &&
        Objects.equals(this.merged, apIEntitiesBranch.merged) &&
        Objects.equals(this._protected, apIEntitiesBranch._protected) &&
        Objects.equals(this.developersCanPush, apIEntitiesBranch.developersCanPush) &&
        Objects.equals(this.developersCanMerge, apIEntitiesBranch.developersCanMerge) &&
        Objects.equals(this.canPush, apIEntitiesBranch.canPush) &&
        Objects.equals(this._default, apIEntitiesBranch._default) &&
        Objects.equals(this.webUrl, apIEntitiesBranch.webUrl)&&
        Objects.equals(this.additionalProperties, apIEntitiesBranch.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, commit, merged, _protected, developersCanPush, developersCanMerge, canPush, _default, webUrl, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIEntitiesBranch {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    commit: ").append(toIndentedString(commit)).append("\n");
    sb.append("    merged: ").append(toIndentedString(merged)).append("\n");
    sb.append("    _protected: ").append(toIndentedString(_protected)).append("\n");
    sb.append("    developersCanPush: ").append(toIndentedString(developersCanPush)).append("\n");
    sb.append("    developersCanMerge: ").append(toIndentedString(developersCanMerge)).append("\n");
    sb.append("    canPush: ").append(toIndentedString(canPush)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    webUrl: ").append(toIndentedString(webUrl)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("commit");
    openapiFields.add("merged");
    openapiFields.add("protected");
    openapiFields.add("developers_can_push");
    openapiFields.add("developers_can_merge");
    openapiFields.add("can_push");
    openapiFields.add("default");
    openapiFields.add("web_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to APIEntitiesBranch
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!APIEntitiesBranch.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in APIEntitiesBranch is not found in the empty JSON string", APIEntitiesBranch.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `commit`
      if (jsonObj.get("commit") != null && !jsonObj.get("commit").isJsonNull()) {
        APIEntitiesCommit.validateJsonObject(jsonObj.getAsJsonObject("commit"));
      }
      if ((jsonObj.get("web_url") != null && !jsonObj.get("web_url").isJsonNull()) && !jsonObj.get("web_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `web_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("web_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!APIEntitiesBranch.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'APIEntitiesBranch' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<APIEntitiesBranch> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(APIEntitiesBranch.class));

       return (TypeAdapter<T>) new TypeAdapter<APIEntitiesBranch>() {
           @Override
           public void write(JsonWriter out, APIEntitiesBranch value) throws IOException {
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
           public APIEntitiesBranch read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             APIEntitiesBranch instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of APIEntitiesBranch given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of APIEntitiesBranch
  * @throws IOException if the JSON string is invalid with respect to APIEntitiesBranch
  */
  public static APIEntitiesBranch fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, APIEntitiesBranch.class);
  }

 /**
  * Convert an instance of APIEntitiesBranch to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

