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
import java.util.ArrayList;
import java.util.List;

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
 * BroadcastmessagesUpdateMessageRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class BroadcastmessagesUpdateMessageRequest {
  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_STARTS_AT = "starts_at";
  @SerializedName(SERIALIZED_NAME_STARTS_AT)
  private OffsetDateTime startsAt;

  public static final String SERIALIZED_NAME_ENDS_AT = "ends_at";
  @SerializedName(SERIALIZED_NAME_ENDS_AT)
  private OffsetDateTime endsAt;

  public static final String SERIALIZED_NAME_COLOR = "color";
  @SerializedName(SERIALIZED_NAME_COLOR)
  private String color;

  public static final String SERIALIZED_NAME_FONT = "font";
  @SerializedName(SERIALIZED_NAME_FONT)
  private String font;

  /**
   * Gets or Sets targetAccessLevels
   */
  @JsonAdapter(TargetAccessLevelsEnum.Adapter.class)
 public enum TargetAccessLevelsEnum {
    NUMBER_10(10),
    
    NUMBER_20(20),
    
    NUMBER_30(30),
    
    NUMBER_40(40),
    
    NUMBER_50(50);

    private Integer value;

    TargetAccessLevelsEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TargetAccessLevelsEnum fromValue(Integer value) {
      for (TargetAccessLevelsEnum b : TargetAccessLevelsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TargetAccessLevelsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TargetAccessLevelsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TargetAccessLevelsEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return TargetAccessLevelsEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TARGET_ACCESS_LEVELS = "target_access_levels";
  @SerializedName(SERIALIZED_NAME_TARGET_ACCESS_LEVELS)
  private List<TargetAccessLevelsEnum> targetAccessLevels = null;

  public static final String SERIALIZED_NAME_TARGET_PATH = "target_path";
  @SerializedName(SERIALIZED_NAME_TARGET_PATH)
  private String targetPath;

  /**
   * Broadcast Type
   */
  @JsonAdapter(BroadcastTypeEnum.Adapter.class)
 public enum BroadcastTypeEnum {
    BANNER("banner"),
    
    NOTIFICATION("notification");

    private String value;

    BroadcastTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BroadcastTypeEnum fromValue(String value) {
      for (BroadcastTypeEnum b : BroadcastTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<BroadcastTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BroadcastTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BroadcastTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return BroadcastTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_BROADCAST_TYPE = "broadcast_type";
  @SerializedName(SERIALIZED_NAME_BROADCAST_TYPE)
  private BroadcastTypeEnum broadcastType;

  public static final String SERIALIZED_NAME_DISMISSABLE = "dismissable";
  @SerializedName(SERIALIZED_NAME_DISMISSABLE)
  private Boolean dismissable;

  public BroadcastmessagesUpdateMessageRequest() {
  }

  public BroadcastmessagesUpdateMessageRequest message(String message) {
    
    
    
    
    this.message = message;
    return this;
  }

   /**
   * Message to display
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Message to display")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    
    
    
    this.message = message;
  }


  public BroadcastmessagesUpdateMessageRequest startsAt(OffsetDateTime startsAt) {
    
    
    
    
    this.startsAt = startsAt;
    return this;
  }

   /**
   * Starting time
   * @return startsAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Starting time")

  public OffsetDateTime getStartsAt() {
    return startsAt;
  }


  public void setStartsAt(OffsetDateTime startsAt) {
    
    
    
    this.startsAt = startsAt;
  }


  public BroadcastmessagesUpdateMessageRequest endsAt(OffsetDateTime endsAt) {
    
    
    
    
    this.endsAt = endsAt;
    return this;
  }

   /**
   * Ending time
   * @return endsAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Ending time")

  public OffsetDateTime getEndsAt() {
    return endsAt;
  }


  public void setEndsAt(OffsetDateTime endsAt) {
    
    
    
    this.endsAt = endsAt;
  }


  public BroadcastmessagesUpdateMessageRequest color(String color) {
    
    
    
    
    this.color = color;
    return this;
  }

   /**
   * Background color
   * @return color
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Background color")

  public String getColor() {
    return color;
  }


  public void setColor(String color) {
    
    
    
    this.color = color;
  }


  public BroadcastmessagesUpdateMessageRequest font(String font) {
    
    
    
    
    this.font = font;
    return this;
  }

   /**
   * Foreground color
   * @return font
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Foreground color")

  public String getFont() {
    return font;
  }


  public void setFont(String font) {
    
    
    
    this.font = font;
  }


  public BroadcastmessagesUpdateMessageRequest targetAccessLevels(List<TargetAccessLevelsEnum> targetAccessLevels) {
    
    
    
    
    this.targetAccessLevels = targetAccessLevels;
    return this;
  }

  public BroadcastmessagesUpdateMessageRequest addTargetAccessLevelsItem(TargetAccessLevelsEnum targetAccessLevelsItem) {
    if (this.targetAccessLevels == null) {
      this.targetAccessLevels = new ArrayList<>();
    }
    this.targetAccessLevels.add(targetAccessLevelsItem);
    return this;
  }

   /**
   * Target user roles
   * @return targetAccessLevels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Target user roles")

  public List<TargetAccessLevelsEnum> getTargetAccessLevels() {
    return targetAccessLevels;
  }


  public void setTargetAccessLevels(List<TargetAccessLevelsEnum> targetAccessLevels) {
    
    
    
    this.targetAccessLevels = targetAccessLevels;
  }


  public BroadcastmessagesUpdateMessageRequest targetPath(String targetPath) {
    
    
    
    
    this.targetPath = targetPath;
    return this;
  }

   /**
   * Target path
   * @return targetPath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Target path")

  public String getTargetPath() {
    return targetPath;
  }


  public void setTargetPath(String targetPath) {
    
    
    
    this.targetPath = targetPath;
  }


  public BroadcastmessagesUpdateMessageRequest broadcastType(BroadcastTypeEnum broadcastType) {
    
    
    
    
    this.broadcastType = broadcastType;
    return this;
  }

   /**
   * Broadcast Type
   * @return broadcastType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Broadcast Type")

  public BroadcastTypeEnum getBroadcastType() {
    return broadcastType;
  }


  public void setBroadcastType(BroadcastTypeEnum broadcastType) {
    
    
    
    this.broadcastType = broadcastType;
  }


  public BroadcastmessagesUpdateMessageRequest dismissable(Boolean dismissable) {
    
    
    
    
    this.dismissable = dismissable;
    return this;
  }

   /**
   * Is dismissable
   * @return dismissable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Is dismissable")

  public Boolean getDismissable() {
    return dismissable;
  }


  public void setDismissable(Boolean dismissable) {
    
    
    
    this.dismissable = dismissable;
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
   * @return the BroadcastmessagesUpdateMessageRequest instance itself
   */
  public BroadcastmessagesUpdateMessageRequest putAdditionalProperty(String key, Object value) {
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
    BroadcastmessagesUpdateMessageRequest broadcastmessagesUpdateMessageRequest = (BroadcastmessagesUpdateMessageRequest) o;
    return Objects.equals(this.message, broadcastmessagesUpdateMessageRequest.message) &&
        Objects.equals(this.startsAt, broadcastmessagesUpdateMessageRequest.startsAt) &&
        Objects.equals(this.endsAt, broadcastmessagesUpdateMessageRequest.endsAt) &&
        Objects.equals(this.color, broadcastmessagesUpdateMessageRequest.color) &&
        Objects.equals(this.font, broadcastmessagesUpdateMessageRequest.font) &&
        Objects.equals(this.targetAccessLevels, broadcastmessagesUpdateMessageRequest.targetAccessLevels) &&
        Objects.equals(this.targetPath, broadcastmessagesUpdateMessageRequest.targetPath) &&
        Objects.equals(this.broadcastType, broadcastmessagesUpdateMessageRequest.broadcastType) &&
        Objects.equals(this.dismissable, broadcastmessagesUpdateMessageRequest.dismissable)&&
        Objects.equals(this.additionalProperties, broadcastmessagesUpdateMessageRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, startsAt, endsAt, color, font, targetAccessLevels, targetPath, broadcastType, dismissable, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BroadcastmessagesUpdateMessageRequest {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    startsAt: ").append(toIndentedString(startsAt)).append("\n");
    sb.append("    endsAt: ").append(toIndentedString(endsAt)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    font: ").append(toIndentedString(font)).append("\n");
    sb.append("    targetAccessLevels: ").append(toIndentedString(targetAccessLevels)).append("\n");
    sb.append("    targetPath: ").append(toIndentedString(targetPath)).append("\n");
    sb.append("    broadcastType: ").append(toIndentedString(broadcastType)).append("\n");
    sb.append("    dismissable: ").append(toIndentedString(dismissable)).append("\n");
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
    openapiFields.add("message");
    openapiFields.add("starts_at");
    openapiFields.add("ends_at");
    openapiFields.add("color");
    openapiFields.add("font");
    openapiFields.add("target_access_levels");
    openapiFields.add("target_path");
    openapiFields.add("broadcast_type");
    openapiFields.add("dismissable");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BroadcastmessagesUpdateMessageRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!BroadcastmessagesUpdateMessageRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BroadcastmessagesUpdateMessageRequest is not found in the empty JSON string", BroadcastmessagesUpdateMessageRequest.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      if ((jsonObj.get("color") != null && !jsonObj.get("color").isJsonNull()) && !jsonObj.get("color").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `color` to be a primitive type in the JSON string but got `%s`", jsonObj.get("color").toString()));
      }
      if ((jsonObj.get("font") != null && !jsonObj.get("font").isJsonNull()) && !jsonObj.get("font").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `font` to be a primitive type in the JSON string but got `%s`", jsonObj.get("font").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("target_access_levels") != null && !jsonObj.get("target_access_levels").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_access_levels` to be an array in the JSON string but got `%s`", jsonObj.get("target_access_levels").toString()));
      }
      if ((jsonObj.get("target_path") != null && !jsonObj.get("target_path").isJsonNull()) && !jsonObj.get("target_path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_path").toString()));
      }
      if ((jsonObj.get("broadcast_type") != null && !jsonObj.get("broadcast_type").isJsonNull()) && !jsonObj.get("broadcast_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `broadcast_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("broadcast_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BroadcastmessagesUpdateMessageRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BroadcastmessagesUpdateMessageRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BroadcastmessagesUpdateMessageRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BroadcastmessagesUpdateMessageRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<BroadcastmessagesUpdateMessageRequest>() {
           @Override
           public void write(JsonWriter out, BroadcastmessagesUpdateMessageRequest value) throws IOException {
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
           public BroadcastmessagesUpdateMessageRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             BroadcastmessagesUpdateMessageRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of BroadcastmessagesUpdateMessageRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BroadcastmessagesUpdateMessageRequest
  * @throws IOException if the JSON string is invalid with respect to BroadcastmessagesUpdateMessageRequest
  */
  public static BroadcastmessagesUpdateMessageRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BroadcastmessagesUpdateMessageRequest.class);
  }

 /**
  * Convert an instance of BroadcastmessagesUpdateMessageRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

