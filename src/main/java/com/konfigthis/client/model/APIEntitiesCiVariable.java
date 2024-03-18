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
 * API_Entities_Ci_Variable model
 */
@ApiModel(description = "API_Entities_Ci_Variable model")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class APIEntitiesCiVariable {
  public static final String SERIALIZED_NAME_VARIABLE_TYPE = "variable_type";
  @SerializedName(SERIALIZED_NAME_VARIABLE_TYPE)
  private String variableType;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_PROTECTED = "protected";
  @SerializedName(SERIALIZED_NAME_PROTECTED)
  private Boolean _protected;

  public static final String SERIALIZED_NAME_MASKED = "masked";
  @SerializedName(SERIALIZED_NAME_MASKED)
  private Boolean masked;

  public static final String SERIALIZED_NAME_RAW = "raw";
  @SerializedName(SERIALIZED_NAME_RAW)
  private Boolean raw;

  public static final String SERIALIZED_NAME_ENVIRONMENT_SCOPE = "environment_scope";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT_SCOPE)
  private String environmentScope;

  public APIEntitiesCiVariable() {
  }

  public APIEntitiesCiVariable variableType(String variableType) {
    
    
    
    
    this.variableType = variableType;
    return this;
  }

   /**
   * Get variableType
   * @return variableType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "env_var", value = "")

  public String getVariableType() {
    return variableType;
  }


  public void setVariableType(String variableType) {
    
    
    
    this.variableType = variableType;
  }


  public APIEntitiesCiVariable key(String key) {
    
    
    
    
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "TEST_VARIABLE_1", value = "")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    
    
    
    this.key = key;
  }


  public APIEntitiesCiVariable value(String value) {
    
    
    
    
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "TEST_1", value = "")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    
    
    
    this.value = value;
  }


  public APIEntitiesCiVariable _protected(Boolean _protected) {
    
    
    
    
    this._protected = _protected;
    return this;
  }

   /**
   * Get _protected
   * @return _protected
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getProtected() {
    return _protected;
  }


  public void setProtected(Boolean _protected) {
    
    
    
    this._protected = _protected;
  }


  public APIEntitiesCiVariable masked(Boolean masked) {
    
    
    
    
    this.masked = masked;
    return this;
  }

   /**
   * Get masked
   * @return masked
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getMasked() {
    return masked;
  }


  public void setMasked(Boolean masked) {
    
    
    
    this.masked = masked;
  }


  public APIEntitiesCiVariable raw(Boolean raw) {
    
    
    
    
    this.raw = raw;
    return this;
  }

   /**
   * Get raw
   * @return raw
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getRaw() {
    return raw;
  }


  public void setRaw(Boolean raw) {
    
    
    
    this.raw = raw;
  }


  public APIEntitiesCiVariable environmentScope(String environmentScope) {
    
    
    
    
    this.environmentScope = environmentScope;
    return this;
  }

   /**
   * Get environmentScope
   * @return environmentScope
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "*", value = "")

  public String getEnvironmentScope() {
    return environmentScope;
  }


  public void setEnvironmentScope(String environmentScope) {
    
    
    
    this.environmentScope = environmentScope;
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
   * @return the APIEntitiesCiVariable instance itself
   */
  public APIEntitiesCiVariable putAdditionalProperty(String key, Object value) {
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
    APIEntitiesCiVariable apIEntitiesCiVariable = (APIEntitiesCiVariable) o;
    return Objects.equals(this.variableType, apIEntitiesCiVariable.variableType) &&
        Objects.equals(this.key, apIEntitiesCiVariable.key) &&
        Objects.equals(this.value, apIEntitiesCiVariable.value) &&
        Objects.equals(this._protected, apIEntitiesCiVariable._protected) &&
        Objects.equals(this.masked, apIEntitiesCiVariable.masked) &&
        Objects.equals(this.raw, apIEntitiesCiVariable.raw) &&
        Objects.equals(this.environmentScope, apIEntitiesCiVariable.environmentScope)&&
        Objects.equals(this.additionalProperties, apIEntitiesCiVariable.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(variableType, key, value, _protected, masked, raw, environmentScope, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIEntitiesCiVariable {\n");
    sb.append("    variableType: ").append(toIndentedString(variableType)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    _protected: ").append(toIndentedString(_protected)).append("\n");
    sb.append("    masked: ").append(toIndentedString(masked)).append("\n");
    sb.append("    raw: ").append(toIndentedString(raw)).append("\n");
    sb.append("    environmentScope: ").append(toIndentedString(environmentScope)).append("\n");
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
    openapiFields.add("variable_type");
    openapiFields.add("key");
    openapiFields.add("value");
    openapiFields.add("protected");
    openapiFields.add("masked");
    openapiFields.add("raw");
    openapiFields.add("environment_scope");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to APIEntitiesCiVariable
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!APIEntitiesCiVariable.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in APIEntitiesCiVariable is not found in the empty JSON string", APIEntitiesCiVariable.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("variable_type") != null && !jsonObj.get("variable_type").isJsonNull()) && !jsonObj.get("variable_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `variable_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("variable_type").toString()));
      }
      if ((jsonObj.get("key") != null && !jsonObj.get("key").isJsonNull()) && !jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
      if ((jsonObj.get("value") != null && !jsonObj.get("value").isJsonNull()) && !jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
      if ((jsonObj.get("environment_scope") != null && !jsonObj.get("environment_scope").isJsonNull()) && !jsonObj.get("environment_scope").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `environment_scope` to be a primitive type in the JSON string but got `%s`", jsonObj.get("environment_scope").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!APIEntitiesCiVariable.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'APIEntitiesCiVariable' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<APIEntitiesCiVariable> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(APIEntitiesCiVariable.class));

       return (TypeAdapter<T>) new TypeAdapter<APIEntitiesCiVariable>() {
           @Override
           public void write(JsonWriter out, APIEntitiesCiVariable value) throws IOException {
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
           public APIEntitiesCiVariable read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             APIEntitiesCiVariable instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of APIEntitiesCiVariable given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of APIEntitiesCiVariable
  * @throws IOException if the JSON string is invalid with respect to APIEntitiesCiVariable
  */
  public static APIEntitiesCiVariable fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, APIEntitiesCiVariable.class);
  }

 /**
  * Convert an instance of APIEntitiesCiVariable to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
