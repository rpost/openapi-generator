/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.client.model.BigCatAllOf;
import org.openapitools.client.model.Cat;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.dataformat.xml.annotation.*;
import javax.xml.bind.annotation.*;

/**
 * BigCat
 */
@JsonPropertyOrder({
  BigCat.JSON_PROPERTY_KIND
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(
  value = "className", // ignore manually set className, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the className to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "className", visible = true)

@XmlRootElement(name = "BigCat")
@XmlAccessorType(XmlAccessType.FIELD)
@JacksonXmlRootElement(localName = "BigCat")
public class BigCat extends Cat {
  /**
   * Gets or Sets kind
   */
  @XmlType(name="KindEnum")
  @XmlEnum(String.class)
  public enum KindEnum {
    @XmlEnumValue("lions")
    LIONS("lions"),
    
    @XmlEnumValue("tigers")
    TIGERS("tigers"),
    
    @XmlEnumValue("leopards")
    LEOPARDS("leopards"),
    
    @XmlEnumValue("jaguars")
    JAGUARS("jaguars");

    private String value;

    KindEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static KindEnum fromValue(String value) {
      for (KindEnum b : KindEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_KIND = "kind";
  @XmlElement(name = "kind")
  private KindEnum kind;

  public BigCat() { 
  }

  public BigCat kind(KindEnum kind) {
    
    this.kind = kind;
    return this;
  }

   /**
   * Get kind
   * @return kind
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_KIND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "kind")

  public KindEnum getKind() {
    return kind;
  }


  @JsonProperty(JSON_PROPERTY_KIND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "kind")
  public void setKind(KindEnum kind) {
    this.kind = kind;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BigCat bigCat = (BigCat) o;
    return Objects.equals(this.kind, bigCat.kind) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kind, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BigCat {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
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

}

