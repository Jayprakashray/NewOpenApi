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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
/**
 * Financial Institution-specific asset allocation
 */
@Schema(description = "Financial Institution-specific asset allocation")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-19T17:32:48.004Z[GMT]")
public class FiPortion {
  @SerializedName("assetClass")
  private String assetClass = null;

  @SerializedName("percent")
  private BigDecimal percent = null;

  public FiPortion assetClass(String assetClass) {
    this.assetClass = assetClass;
    return this;
  }

   /**
   * Financial Institution-specific asset class
   * @return assetClass
  **/
  @Schema(description = "Financial Institution-specific asset class")
  public String getAssetClass() {
    return assetClass;
  }

  public void setAssetClass(String assetClass) {
    this.assetClass = assetClass;
  }

  public FiPortion percent(BigDecimal percent) {
    this.percent = percent;
    return this;
  }

   /**
   * Percentage of asset class that falls under this asset
   * @return percent
  **/
  @Schema(description = "Percentage of asset class that falls under this asset")
  public BigDecimal getPercent() {
    return percent;
  }

  public void setPercent(BigDecimal percent) {
    this.percent = percent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FiPortion fiPortion = (FiPortion) o;
    return Objects.equals(this.assetClass, fiPortion.assetClass) &&
        Objects.equals(this.percent, fiPortion.percent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetClass, percent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FiPortion {\n");
    
    sb.append("    assetClass: ").append(toIndentedString(assetClass)).append("\n");
    sb.append("    percent: ").append(toIndentedString(percent)).append("\n");
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
