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
import io.swagger.client.model.PaymentFrequency;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
import org.threeten.bp.LocalDate;
/**
 * The source of pension funds
 */
@Schema(description = "The source of pension funds")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-19T17:32:48.004Z[GMT]")
public class PensionSource {
  @SerializedName("displayName")
  private String displayName = null;

  @SerializedName("amount")
  private BigDecimal amount = null;

  @SerializedName("paymentOption")
  private String paymentOption = null;

  @SerializedName("asOfDate")
  private LocalDate asOfDate = null;

  @SerializedName("frequency")
  private PaymentFrequency frequency = null;

  @SerializedName("startDate")
  private LocalDate startDate = null;

  public PensionSource displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Name of the source
   * @return displayName
  **/
  @Schema(description = "Name of the source")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public PensionSource amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Benefit Amount
   * @return amount
  **/
  @Schema(description = "Benefit Amount")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public PensionSource paymentOption(String paymentOption) {
    this.paymentOption = paymentOption;
    return this;
  }

   /**
   * Form of payment
   * @return paymentOption
  **/
  @Schema(description = "Form of payment")
  public String getPaymentOption() {
    return paymentOption;
  }

  public void setPaymentOption(String paymentOption) {
    this.paymentOption = paymentOption;
  }

  public PensionSource asOfDate(LocalDate asOfDate) {
    this.asOfDate = asOfDate;
    return this;
  }

   /**
   * Get asOfDate
   * @return asOfDate
  **/
  @Schema(description = "")
  public LocalDate getAsOfDate() {
    return asOfDate;
  }

  public void setAsOfDate(LocalDate asOfDate) {
    this.asOfDate = asOfDate;
  }

  public PensionSource frequency(PaymentFrequency frequency) {
    this.frequency = frequency;
    return this;
  }

   /**
   * Get frequency
   * @return frequency
  **/
  @Schema(description = "")
  public PaymentFrequency getFrequency() {
    return frequency;
  }

  public void setFrequency(PaymentFrequency frequency) {
    this.frequency = frequency;
  }

  public PensionSource startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @Schema(description = "")
  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PensionSource pensionSource = (PensionSource) o;
    return Objects.equals(this.displayName, pensionSource.displayName) &&
        Objects.equals(this.amount, pensionSource.amount) &&
        Objects.equals(this.paymentOption, pensionSource.paymentOption) &&
        Objects.equals(this.asOfDate, pensionSource.asOfDate) &&
        Objects.equals(this.frequency, pensionSource.frequency) &&
        Objects.equals(this.startDate, pensionSource.startDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, amount, paymentOption, asOfDate, frequency, startDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PensionSource {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    paymentOption: ").append(toIndentedString(paymentOption)).append("\n");
    sb.append("    asOfDate: ").append(toIndentedString(asOfDate)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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