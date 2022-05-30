/*
 * FDX V5.0
 * Financial Data Exchange V5.0 Core API
 *
 * OpenAPI spec version: 5.0.0
 * Contact: fdxsupport@financialdataexchange.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.FiAttribute;
import io.swagger.client.model.Party;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Notification of suspected fraud
 */
@Schema(description = "Notification of suspected fraud")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-19T17:32:48.004Z[GMT]")
public class SuspectedFraudIncident {
  @SerializedName("type")
  private String type = null;

  @SerializedName("incidentId")
  private String incidentId = null;

  @SerializedName("reason")
  private String reason = null;

  @SerializedName("fiAttributes")
  private List<FiAttribute> fiAttributes = null;

  @SerializedName("reporter")
  private Party reporter = null;

  public SuspectedFraudIncident type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Extensible string enum identifying the type of suspected fraud. Initially this will always be set to \&quot;ACCOUNT_TAKEOVER\&quot;. Additional values may be defined in the future.
   * @return type
  **/
  @Schema(example = "ACCOUNT_TAKEOVER", description = "Extensible string enum identifying the type of suspected fraud. Initially this will always be set to \"ACCOUNT_TAKEOVER\". Additional values may be defined in the future.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public SuspectedFraudIncident incidentId(String incidentId) {
    this.incidentId = incidentId;
    return this;
  }

   /**
   * Unique identifier for the fraud incident.
   * @return incidentId
  **/
  @Schema(example = "0a318518-ca16-4e66-be76-865a632ea771", description = "Unique identifier for the fraud incident.")
  public String getIncidentId() {
    return incidentId;
  }

  public void setIncidentId(String incidentId) {
    this.incidentId = incidentId;
  }

  public SuspectedFraudIncident reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Free text justification for suspected fraud
   * @return reason
  **/
  @Schema(example = "User submitted identity data did not match account", description = "Free text justification for suspected fraud")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public SuspectedFraudIncident fiAttributes(List<FiAttribute> fiAttributes) {
    this.fiAttributes = fiAttributes;
    return this;
  }

  public SuspectedFraudIncident addFiAttributesItem(FiAttribute fiAttributesItem) {
    if (this.fiAttributes == null) {
      this.fiAttributes = new ArrayList<FiAttribute>();
    }
    this.fiAttributes.add(fiAttributesItem);
    return this;
  }

   /**
   * Array of financial institution-specific attributes. Can be used to provide additional structured context on the suspected fraud for the FI to use in determining a resolution.
   * @return fiAttributes
  **/
  @Schema(description = "Array of financial institution-specific attributes. Can be used to provide additional structured context on the suspected fraud for the FI to use in determining a resolution.")
  public List<FiAttribute> getFiAttributes() {
    return fiAttributes;
  }

  public void setFiAttributes(List<FiAttribute> fiAttributes) {
    this.fiAttributes = fiAttributes;
  }

  public SuspectedFraudIncident reporter(Party reporter) {
    this.reporter = reporter;
    return this;
  }

   /**
   * Get reporter
   * @return reporter
  **/
  @Schema(description = "")
  public Party getReporter() {
    return reporter;
  }

  public void setReporter(Party reporter) {
    this.reporter = reporter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuspectedFraudIncident suspectedFraudIncident = (SuspectedFraudIncident) o;
    return Objects.equals(this.type, suspectedFraudIncident.type) &&
        Objects.equals(this.incidentId, suspectedFraudIncident.incidentId) &&
        Objects.equals(this.reason, suspectedFraudIncident.reason) &&
        Objects.equals(this.fiAttributes, suspectedFraudIncident.fiAttributes) &&
        Objects.equals(this.reporter, suspectedFraudIncident.reporter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, incidentId, reason, fiAttributes, reporter);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuspectedFraudIncident {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    incidentId: ").append(toIndentedString(incidentId)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    fiAttributes: ").append(toIndentedString(fiAttributes)).append("\n");
    sb.append("    reporter: ").append(toIndentedString(reporter)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}