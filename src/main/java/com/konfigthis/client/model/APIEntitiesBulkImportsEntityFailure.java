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
import java.time.OffsetDateTime;

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
 * APIEntitiesBulkImportsEntityFailure
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class APIEntitiesBulkImportsEntityFailure {
  public static final String SERIALIZED_NAME_RELATION = "relation";
  @SerializedName(SERIALIZED_NAME_RELATION)
  private String relation;

  public static final String SERIALIZED_NAME_STEP = "step";
  @SerializedName(SERIALIZED_NAME_STEP)
  private String step;

  public static final String SERIALIZED_NAME_EXCEPTION_MESSAGE = "exception_message";
  @SerializedName(SERIALIZED_NAME_EXCEPTION_MESSAGE)
  private String exceptionMessage;

  public static final String SERIALIZED_NAME_EXCEPTION_CLASS = "exception_class";
  @SerializedName(SERIALIZED_NAME_EXCEPTION_CLASS)
  private String exceptionClass;

  public static final String SERIALIZED_NAME_CORRELATION_ID_VALUE = "correlation_id_value";
  @SerializedName(SERIALIZED_NAME_CORRELATION_ID_VALUE)
  private String correlationIdValue;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_PIPELINE_CLASS = "pipeline_class";
  @SerializedName(SERIALIZED_NAME_PIPELINE_CLASS)
  private String pipelineClass;

  public static final String SERIALIZED_NAME_PIPELINE_STEP = "pipeline_step";
  @SerializedName(SERIALIZED_NAME_PIPELINE_STEP)
  private String pipelineStep;

  public APIEntitiesBulkImportsEntityFailure() {
  }

  public APIEntitiesBulkImportsEntityFailure relation(String relation) {
    
    
    
    
    this.relation = relation;
    return this;
  }

   /**
   * Get relation
   * @return relation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "group", value = "")

  public String getRelation() {
    return relation;
  }


  public void setRelation(String relation) {
    
    
    
    this.relation = relation;
  }


  public APIEntitiesBulkImportsEntityFailure step(String step) {
    
    
    
    
    this.step = step;
    return this;
  }

   /**
   * Get step
   * @return step
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "extractor", value = "")

  public String getStep() {
    return step;
  }


  public void setStep(String step) {
    
    
    
    this.step = step;
  }


  public APIEntitiesBulkImportsEntityFailure exceptionMessage(String exceptionMessage) {
    
    
    
    
    this.exceptionMessage = exceptionMessage;
    return this;
  }

   /**
   * Get exceptionMessage
   * @return exceptionMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "error message", value = "")

  public String getExceptionMessage() {
    return exceptionMessage;
  }


  public void setExceptionMessage(String exceptionMessage) {
    
    
    
    this.exceptionMessage = exceptionMessage;
  }


  public APIEntitiesBulkImportsEntityFailure exceptionClass(String exceptionClass) {
    
    
    
    
    this.exceptionClass = exceptionClass;
    return this;
  }

   /**
   * Get exceptionClass
   * @return exceptionClass
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Exception", value = "")

  public String getExceptionClass() {
    return exceptionClass;
  }


  public void setExceptionClass(String exceptionClass) {
    
    
    
    this.exceptionClass = exceptionClass;
  }


  public APIEntitiesBulkImportsEntityFailure correlationIdValue(String correlationIdValue) {
    
    
    
    
    this.correlationIdValue = correlationIdValue;
    return this;
  }

   /**
   * Get correlationIdValue
   * @return correlationIdValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "dfcf583058ed4508e4c7c617bd7f0edd", value = "")

  public String getCorrelationIdValue() {
    return correlationIdValue;
  }


  public void setCorrelationIdValue(String correlationIdValue) {
    
    
    
    this.correlationIdValue = correlationIdValue;
  }


  public APIEntitiesBulkImportsEntityFailure createdAt(OffsetDateTime createdAt) {
    
    
    
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2012-05-28T11:42:42Z", value = "")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    
    
    
    this.createdAt = createdAt;
  }


  public APIEntitiesBulkImportsEntityFailure pipelineClass(String pipelineClass) {
    
    
    
    
    this.pipelineClass = pipelineClass;
    return this;
  }

   /**
   * Get pipelineClass
   * @return pipelineClass
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BulkImports::Groups::Pipelines::GroupPipeline", value = "")

  public String getPipelineClass() {
    return pipelineClass;
  }


  public void setPipelineClass(String pipelineClass) {
    
    
    
    this.pipelineClass = pipelineClass;
  }


  public APIEntitiesBulkImportsEntityFailure pipelineStep(String pipelineStep) {
    
    
    
    
    this.pipelineStep = pipelineStep;
    return this;
  }

   /**
   * Get pipelineStep
   * @return pipelineStep
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "extractor", value = "")

  public String getPipelineStep() {
    return pipelineStep;
  }


  public void setPipelineStep(String pipelineStep) {
    
    
    
    this.pipelineStep = pipelineStep;
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
   * @return the APIEntitiesBulkImportsEntityFailure instance itself
   */
  public APIEntitiesBulkImportsEntityFailure putAdditionalProperty(String key, Object value) {
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
    APIEntitiesBulkImportsEntityFailure apIEntitiesBulkImportsEntityFailure = (APIEntitiesBulkImportsEntityFailure) o;
    return Objects.equals(this.relation, apIEntitiesBulkImportsEntityFailure.relation) &&
        Objects.equals(this.step, apIEntitiesBulkImportsEntityFailure.step) &&
        Objects.equals(this.exceptionMessage, apIEntitiesBulkImportsEntityFailure.exceptionMessage) &&
        Objects.equals(this.exceptionClass, apIEntitiesBulkImportsEntityFailure.exceptionClass) &&
        Objects.equals(this.correlationIdValue, apIEntitiesBulkImportsEntityFailure.correlationIdValue) &&
        Objects.equals(this.createdAt, apIEntitiesBulkImportsEntityFailure.createdAt) &&
        Objects.equals(this.pipelineClass, apIEntitiesBulkImportsEntityFailure.pipelineClass) &&
        Objects.equals(this.pipelineStep, apIEntitiesBulkImportsEntityFailure.pipelineStep)&&
        Objects.equals(this.additionalProperties, apIEntitiesBulkImportsEntityFailure.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(relation, step, exceptionMessage, exceptionClass, correlationIdValue, createdAt, pipelineClass, pipelineStep, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIEntitiesBulkImportsEntityFailure {\n");
    sb.append("    relation: ").append(toIndentedString(relation)).append("\n");
    sb.append("    step: ").append(toIndentedString(step)).append("\n");
    sb.append("    exceptionMessage: ").append(toIndentedString(exceptionMessage)).append("\n");
    sb.append("    exceptionClass: ").append(toIndentedString(exceptionClass)).append("\n");
    sb.append("    correlationIdValue: ").append(toIndentedString(correlationIdValue)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    pipelineClass: ").append(toIndentedString(pipelineClass)).append("\n");
    sb.append("    pipelineStep: ").append(toIndentedString(pipelineStep)).append("\n");
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
    openapiFields.add("relation");
    openapiFields.add("step");
    openapiFields.add("exception_message");
    openapiFields.add("exception_class");
    openapiFields.add("correlation_id_value");
    openapiFields.add("created_at");
    openapiFields.add("pipeline_class");
    openapiFields.add("pipeline_step");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to APIEntitiesBulkImportsEntityFailure
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!APIEntitiesBulkImportsEntityFailure.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in APIEntitiesBulkImportsEntityFailure is not found in the empty JSON string", APIEntitiesBulkImportsEntityFailure.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("relation") != null && !jsonObj.get("relation").isJsonNull()) && !jsonObj.get("relation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `relation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("relation").toString()));
      }
      if ((jsonObj.get("step") != null && !jsonObj.get("step").isJsonNull()) && !jsonObj.get("step").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `step` to be a primitive type in the JSON string but got `%s`", jsonObj.get("step").toString()));
      }
      if ((jsonObj.get("exception_message") != null && !jsonObj.get("exception_message").isJsonNull()) && !jsonObj.get("exception_message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `exception_message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("exception_message").toString()));
      }
      if ((jsonObj.get("exception_class") != null && !jsonObj.get("exception_class").isJsonNull()) && !jsonObj.get("exception_class").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `exception_class` to be a primitive type in the JSON string but got `%s`", jsonObj.get("exception_class").toString()));
      }
      if ((jsonObj.get("correlation_id_value") != null && !jsonObj.get("correlation_id_value").isJsonNull()) && !jsonObj.get("correlation_id_value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `correlation_id_value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("correlation_id_value").toString()));
      }
      if ((jsonObj.get("pipeline_class") != null && !jsonObj.get("pipeline_class").isJsonNull()) && !jsonObj.get("pipeline_class").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pipeline_class` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pipeline_class").toString()));
      }
      if ((jsonObj.get("pipeline_step") != null && !jsonObj.get("pipeline_step").isJsonNull()) && !jsonObj.get("pipeline_step").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pipeline_step` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pipeline_step").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!APIEntitiesBulkImportsEntityFailure.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'APIEntitiesBulkImportsEntityFailure' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<APIEntitiesBulkImportsEntityFailure> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(APIEntitiesBulkImportsEntityFailure.class));

       return (TypeAdapter<T>) new TypeAdapter<APIEntitiesBulkImportsEntityFailure>() {
           @Override
           public void write(JsonWriter out, APIEntitiesBulkImportsEntityFailure value) throws IOException {
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
           public APIEntitiesBulkImportsEntityFailure read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             APIEntitiesBulkImportsEntityFailure instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of APIEntitiesBulkImportsEntityFailure given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of APIEntitiesBulkImportsEntityFailure
  * @throws IOException if the JSON string is invalid with respect to APIEntitiesBulkImportsEntityFailure
  */
  public static APIEntitiesBulkImportsEntityFailure fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, APIEntitiesBulkImportsEntityFailure.class);
  }

 /**
  * Convert an instance of APIEntitiesBulkImportsEntityFailure to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

