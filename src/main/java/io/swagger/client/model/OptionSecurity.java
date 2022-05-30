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
import io.swagger.client.model.OptionType;
import io.swagger.client.model.Secured;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
import org.threeten.bp.LocalDate;
/**
 * An option
 */
@Schema(description = "An option")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-19T17:32:48.004Z[GMT]")
public class OptionSecurity {
  @SerializedName("secured")
  private Secured secured = null;

  @SerializedName("optionType")
  private OptionType optionType = null;

  @SerializedName("strikePrice")
  private BigDecimal strikePrice = null;

  @SerializedName("expireDate")
  private LocalDate expireDate = null;

  @SerializedName("sharesPerContract")
  private BigDecimal sharesPerContract = null;

  public OptionSecurity secured(Secured secured) {
    this.secured = secured;
    return this;
  }

   /**
   * Get secured
   * @return secured
  **/
  @Schema(description = "")
  public Secured getSecured() {
    return secured;
  }

  public void setSecured(Secured secured) {
    this.secured = secured;
  }

  public OptionSecurity optionType(OptionType optionType) {
    this.optionType = optionType;
    return this;
  }

   /**
   * Get optionType
   * @return optionType
  **/
  @Schema(description = "")
  public OptionType getOptionType() {
    return optionType;
  }

  public void setOptionType(OptionType optionType) {
    this.optionType = optionType;
  }

  public OptionSecurity strikePrice(BigDecimal strikePrice) {
    this.strikePrice = strikePrice;
    return this;
  }

   /**
   * Strike price / Unit price
   * @return strikePrice
  **/
  @Schema(description = "Strike price / Unit price")
  public BigDecimal getStrikePrice() {
    return strikePrice;
  }

  public void setStrikePrice(BigDecimal strikePrice) {
    this.strikePrice = strikePrice;
  }

  public OptionSecurity expireDate(LocalDate expireDate) {
    this.expireDate = expireDate;
    return this;
  }

   /**
   * Get expireDate
   * @return expireDate
  **/
  @Schema(description = "")
  public LocalDate getExpireDate() {
    return expireDate;
  }

  public void setExpireDate(LocalDate expireDate) {
    this.expireDate = expireDate;
  }

  public OptionSecurity sharesPerContract(BigDecimal sharesPerContract) {
    this.sharesPerContract = sharesPerContract;
    return this;
  }

   /**
   * Shares per contract
   * @return sharesPerContract
  **/
  @Schema(description = "Shares per contract")
  public BigDecimal getSharesPerContract() {
    return sharesPerContract;
  }

  public void setSharesPerContract(BigDecimal sharesPerContract) {
    this.sharesPerContract = sharesPerContract;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptionSecurity optionSecurity = (OptionSecurity) o;
    return Objects.equals(this.secured, optionSecurity.secured) &&
        Objects.equals(this.optionType, optionSecurity.optionType) &&
        Objects.equals(this.strikePrice, optionSecurity.strikePrice) &&
        Objects.equals(this.expireDate, optionSecurity.expireDate) &&
        Objects.equals(this.sharesPerContract, optionSecurity.sharesPerContract);
  }

  @Override
  public int hashCode() {
    return Objects.hash(secured, optionType, strikePrice, expireDate, sharesPerContract);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptionSecurity {\n");
    
    sb.append("    secured: ").append(toIndentedString(secured)).append("\n");
    sb.append("    optionType: ").append(toIndentedString(optionType)).append("\n");
    sb.append("    strikePrice: ").append(toIndentedString(strikePrice)).append("\n");
    sb.append("    expireDate: ").append(toIndentedString(expireDate)).append("\n");
    sb.append("    sharesPerContract: ").append(toIndentedString(sharesPerContract)).append("\n");
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
