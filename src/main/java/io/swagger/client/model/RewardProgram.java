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
import io.swagger.client.model.RewardMembership;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Reward program detail
 */
@Schema(description = "Reward program detail")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-19T17:32:48.004Z[GMT]")
public class RewardProgram {
  @SerializedName("programId")
  private String programId = null;

  @SerializedName("programName")
  private String programName = null;

  @SerializedName("programUrl")
  private String programUrl = null;

  @SerializedName("memberships")
  private List<RewardMembership> memberships = null;

  @SerializedName("fiAttributes")
  private List<FiAttribute> fiAttributes = null;

  public RewardProgram programId(String programId) {
    this.programId = programId;
    return this;
  }

   /**
   * Get programId
   * @return programId
  **/
  @Schema(description = "")
  public String getProgramId() {
    return programId;
  }

  public void setProgramId(String programId) {
    this.programId = programId;
  }

  public RewardProgram programName(String programName) {
    this.programName = programName;
    return this;
  }

   /**
   * Name of reward program
   * @return programName
  **/
  @Schema(description = "Name of reward program")
  public String getProgramName() {
    return programName;
  }

  public void setProgramName(String programName) {
    this.programName = programName;
  }

  public RewardProgram programUrl(String programUrl) {
    this.programUrl = programUrl;
    return this;
  }

   /**
   * URL of reward program
   * @return programUrl
  **/
  @Schema(description = "URL of reward program")
  public String getProgramUrl() {
    return programUrl;
  }

  public void setProgramUrl(String programUrl) {
    this.programUrl = programUrl;
  }

  public RewardProgram memberships(List<RewardMembership> memberships) {
    this.memberships = memberships;
    return this;
  }

  public RewardProgram addMembershipsItem(RewardMembership membershipsItem) {
    if (this.memberships == null) {
      this.memberships = new ArrayList<RewardMembership>();
    }
    this.memberships.add(membershipsItem);
    return this;
  }

   /**
   * Array of reward memberships
   * @return memberships
  **/
  @Schema(description = "Array of reward memberships")
  public List<RewardMembership> getMemberships() {
    return memberships;
  }

  public void setMemberships(List<RewardMembership> memberships) {
    this.memberships = memberships;
  }

  public RewardProgram fiAttributes(List<FiAttribute> fiAttributes) {
    this.fiAttributes = fiAttributes;
    return this;
  }

  public RewardProgram addFiAttributesItem(FiAttribute fiAttributesItem) {
    if (this.fiAttributes == null) {
      this.fiAttributes = new ArrayList<FiAttribute>();
    }
    this.fiAttributes.add(fiAttributesItem);
    return this;
  }

   /**
   * Array of FI-specific attributes
   * @return fiAttributes
  **/
  @Schema(description = "Array of FI-specific attributes")
  public List<FiAttribute> getFiAttributes() {
    return fiAttributes;
  }

  public void setFiAttributes(List<FiAttribute> fiAttributes) {
    this.fiAttributes = fiAttributes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RewardProgram rewardProgram = (RewardProgram) o;
    return Objects.equals(this.programId, rewardProgram.programId) &&
        Objects.equals(this.programName, rewardProgram.programName) &&
        Objects.equals(this.programUrl, rewardProgram.programUrl) &&
        Objects.equals(this.memberships, rewardProgram.memberships) &&
        Objects.equals(this.fiAttributes, rewardProgram.fiAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(programId, programName, programUrl, memberships, fiAttributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RewardProgram {\n");
    
    sb.append("    programId: ").append(toIndentedString(programId)).append("\n");
    sb.append("    programName: ").append(toIndentedString(programName)).append("\n");
    sb.append("    programUrl: ").append(toIndentedString(programUrl)).append("\n");
    sb.append("    memberships: ").append(toIndentedString(memberships)).append("\n");
    sb.append("    fiAttributes: ").append(toIndentedString(fiAttributes)).append("\n");
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
