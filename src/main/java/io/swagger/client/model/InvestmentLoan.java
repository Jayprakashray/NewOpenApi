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
import io.swagger.client.model.LoanPaymentFrequency;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;
/**
 * Any loan information against an investment account
 */
@Schema(description = "Any loan information against an investment account")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-19T17:32:48.004Z[GMT]")
public class InvestmentLoan {
  @SerializedName("loanId")
  private String loanId = null;

  @SerializedName("loanDescription")
  private String loanDescription = null;

  @SerializedName("initialLoanBalance")
  private BigDecimal initialLoanBalance = null;

  @SerializedName("loanStartDate")
  private LocalDate loanStartDate = null;

  @SerializedName("currentLoanBalance")
  private BigDecimal currentLoanBalance = null;

  @SerializedName("dateAsOf")
  private OffsetDateTime dateAsOf = null;

  @SerializedName("loanRate")
  private BigDecimal loanRate = null;

  @SerializedName("loanPaymentAmount")
  private BigDecimal loanPaymentAmount = null;

  @SerializedName("loanPaymentFrequency")
  private LoanPaymentFrequency loanPaymentFrequency = null;

  @SerializedName("loanPaymentInitial")
  private BigDecimal loanPaymentInitial = null;

  @SerializedName("loanPaymentsRemaining")
  private Integer loanPaymentsRemaining = null;

  @SerializedName("loanMaturityDate")
  private LocalDate loanMaturityDate = null;

  @SerializedName("loanInterestToDate")
  private BigDecimal loanInterestToDate = null;

  @SerializedName("loanTotalProjectedInterest")
  private BigDecimal loanTotalProjectedInterest = null;

  @SerializedName("loanNextPaymentDate")
  private LocalDate loanNextPaymentDate = null;

  public InvestmentLoan loanId(String loanId) {
    this.loanId = loanId;
    return this;
  }

   /**
   * Unique identifier for this loan
   * @return loanId
  **/
  @Schema(description = "Unique identifier for this loan")
  public String getLoanId() {
    return loanId;
  }

  public void setLoanId(String loanId) {
    this.loanId = loanId;
  }

  public InvestmentLoan loanDescription(String loanDescription) {
    this.loanDescription = loanDescription;
    return this;
  }

   /**
   * Description of loan
   * @return loanDescription
  **/
  @Schema(description = "Description of loan")
  public String getLoanDescription() {
    return loanDescription;
  }

  public void setLoanDescription(String loanDescription) {
    this.loanDescription = loanDescription;
  }

  public InvestmentLoan initialLoanBalance(BigDecimal initialLoanBalance) {
    this.initialLoanBalance = initialLoanBalance;
    return this;
  }

   /**
   * Initial loan balance amount
   * @return initialLoanBalance
  **/
  @Schema(description = "Initial loan balance amount")
  public BigDecimal getInitialLoanBalance() {
    return initialLoanBalance;
  }

  public void setInitialLoanBalance(BigDecimal initialLoanBalance) {
    this.initialLoanBalance = initialLoanBalance;
  }

  public InvestmentLoan loanStartDate(LocalDate loanStartDate) {
    this.loanStartDate = loanStartDate;
    return this;
  }

   /**
   * Get loanStartDate
   * @return loanStartDate
  **/
  @Schema(description = "")
  public LocalDate getLoanStartDate() {
    return loanStartDate;
  }

  public void setLoanStartDate(LocalDate loanStartDate) {
    this.loanStartDate = loanStartDate;
  }

  public InvestmentLoan currentLoanBalance(BigDecimal currentLoanBalance) {
    this.currentLoanBalance = currentLoanBalance;
    return this;
  }

   /**
   * Current loan principal balance amount
   * @return currentLoanBalance
  **/
  @Schema(description = "Current loan principal balance amount")
  public BigDecimal getCurrentLoanBalance() {
    return currentLoanBalance;
  }

  public void setCurrentLoanBalance(BigDecimal currentLoanBalance) {
    this.currentLoanBalance = currentLoanBalance;
  }

  public InvestmentLoan dateAsOf(OffsetDateTime dateAsOf) {
    this.dateAsOf = dateAsOf;
    return this;
  }

   /**
   * Get dateAsOf
   * @return dateAsOf
  **/
  @Schema(description = "")
  public OffsetDateTime getDateAsOf() {
    return dateAsOf;
  }

  public void setDateAsOf(OffsetDateTime dateAsOf) {
    this.dateAsOf = dateAsOf;
  }

  public InvestmentLoan loanRate(BigDecimal loanRate) {
    this.loanRate = loanRate;
    return this;
  }

   /**
   * Loan annual interest rate for the loan
   * @return loanRate
  **/
  @Schema(description = "Loan annual interest rate for the loan")
  public BigDecimal getLoanRate() {
    return loanRate;
  }

  public void setLoanRate(BigDecimal loanRate) {
    this.loanRate = loanRate;
  }

  public InvestmentLoan loanPaymentAmount(BigDecimal loanPaymentAmount) {
    this.loanPaymentAmount = loanPaymentAmount;
    return this;
  }

   /**
   * Loan payment amount
   * @return loanPaymentAmount
  **/
  @Schema(description = "Loan payment amount")
  public BigDecimal getLoanPaymentAmount() {
    return loanPaymentAmount;
  }

  public void setLoanPaymentAmount(BigDecimal loanPaymentAmount) {
    this.loanPaymentAmount = loanPaymentAmount;
  }

  public InvestmentLoan loanPaymentFrequency(LoanPaymentFrequency loanPaymentFrequency) {
    this.loanPaymentFrequency = loanPaymentFrequency;
    return this;
  }

   /**
   * Get loanPaymentFrequency
   * @return loanPaymentFrequency
  **/
  @Schema(description = "")
  public LoanPaymentFrequency getLoanPaymentFrequency() {
    return loanPaymentFrequency;
  }

  public void setLoanPaymentFrequency(LoanPaymentFrequency loanPaymentFrequency) {
    this.loanPaymentFrequency = loanPaymentFrequency;
  }

  public InvestmentLoan loanPaymentInitial(BigDecimal loanPaymentInitial) {
    this.loanPaymentInitial = loanPaymentInitial;
    return this;
  }

   /**
   * Initial number of loan payments
   * @return loanPaymentInitial
  **/
  @Schema(description = "Initial number of loan payments")
  public BigDecimal getLoanPaymentInitial() {
    return loanPaymentInitial;
  }

  public void setLoanPaymentInitial(BigDecimal loanPaymentInitial) {
    this.loanPaymentInitial = loanPaymentInitial;
  }

  public InvestmentLoan loanPaymentsRemaining(Integer loanPaymentsRemaining) {
    this.loanPaymentsRemaining = loanPaymentsRemaining;
    return this;
  }

   /**
   * Remaining number of loan payments
   * @return loanPaymentsRemaining
  **/
  @Schema(description = "Remaining number of loan payments")
  public Integer getLoanPaymentsRemaining() {
    return loanPaymentsRemaining;
  }

  public void setLoanPaymentsRemaining(Integer loanPaymentsRemaining) {
    this.loanPaymentsRemaining = loanPaymentsRemaining;
  }

  public InvestmentLoan loanMaturityDate(LocalDate loanMaturityDate) {
    this.loanMaturityDate = loanMaturityDate;
    return this;
  }

   /**
   * Get loanMaturityDate
   * @return loanMaturityDate
  **/
  @Schema(description = "")
  public LocalDate getLoanMaturityDate() {
    return loanMaturityDate;
  }

  public void setLoanMaturityDate(LocalDate loanMaturityDate) {
    this.loanMaturityDate = loanMaturityDate;
  }

  public InvestmentLoan loanInterestToDate(BigDecimal loanInterestToDate) {
    this.loanInterestToDate = loanInterestToDate;
    return this;
  }

   /**
   * Total interest paid to date on this loan
   * @return loanInterestToDate
  **/
  @Schema(description = "Total interest paid to date on this loan")
  public BigDecimal getLoanInterestToDate() {
    return loanInterestToDate;
  }

  public void setLoanInterestToDate(BigDecimal loanInterestToDate) {
    this.loanInterestToDate = loanInterestToDate;
  }

  public InvestmentLoan loanTotalProjectedInterest(BigDecimal loanTotalProjectedInterest) {
    this.loanTotalProjectedInterest = loanTotalProjectedInterest;
    return this;
  }

   /**
   * Total projected interest to be paid on this loan
   * @return loanTotalProjectedInterest
  **/
  @Schema(description = "Total projected interest to be paid on this loan")
  public BigDecimal getLoanTotalProjectedInterest() {
    return loanTotalProjectedInterest;
  }

  public void setLoanTotalProjectedInterest(BigDecimal loanTotalProjectedInterest) {
    this.loanTotalProjectedInterest = loanTotalProjectedInterest;
  }

  public InvestmentLoan loanNextPaymentDate(LocalDate loanNextPaymentDate) {
    this.loanNextPaymentDate = loanNextPaymentDate;
    return this;
  }

   /**
   * Get loanNextPaymentDate
   * @return loanNextPaymentDate
  **/
  @Schema(description = "")
  public LocalDate getLoanNextPaymentDate() {
    return loanNextPaymentDate;
  }

  public void setLoanNextPaymentDate(LocalDate loanNextPaymentDate) {
    this.loanNextPaymentDate = loanNextPaymentDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvestmentLoan investmentLoan = (InvestmentLoan) o;
    return Objects.equals(this.loanId, investmentLoan.loanId) &&
        Objects.equals(this.loanDescription, investmentLoan.loanDescription) &&
        Objects.equals(this.initialLoanBalance, investmentLoan.initialLoanBalance) &&
        Objects.equals(this.loanStartDate, investmentLoan.loanStartDate) &&
        Objects.equals(this.currentLoanBalance, investmentLoan.currentLoanBalance) &&
        Objects.equals(this.dateAsOf, investmentLoan.dateAsOf) &&
        Objects.equals(this.loanRate, investmentLoan.loanRate) &&
        Objects.equals(this.loanPaymentAmount, investmentLoan.loanPaymentAmount) &&
        Objects.equals(this.loanPaymentFrequency, investmentLoan.loanPaymentFrequency) &&
        Objects.equals(this.loanPaymentInitial, investmentLoan.loanPaymentInitial) &&
        Objects.equals(this.loanPaymentsRemaining, investmentLoan.loanPaymentsRemaining) &&
        Objects.equals(this.loanMaturityDate, investmentLoan.loanMaturityDate) &&
        Objects.equals(this.loanInterestToDate, investmentLoan.loanInterestToDate) &&
        Objects.equals(this.loanTotalProjectedInterest, investmentLoan.loanTotalProjectedInterest) &&
        Objects.equals(this.loanNextPaymentDate, investmentLoan.loanNextPaymentDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loanId, loanDescription, initialLoanBalance, loanStartDate, currentLoanBalance, dateAsOf, loanRate, loanPaymentAmount, loanPaymentFrequency, loanPaymentInitial, loanPaymentsRemaining, loanMaturityDate, loanInterestToDate, loanTotalProjectedInterest, loanNextPaymentDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvestmentLoan {\n");
    
    sb.append("    loanId: ").append(toIndentedString(loanId)).append("\n");
    sb.append("    loanDescription: ").append(toIndentedString(loanDescription)).append("\n");
    sb.append("    initialLoanBalance: ").append(toIndentedString(initialLoanBalance)).append("\n");
    sb.append("    loanStartDate: ").append(toIndentedString(loanStartDate)).append("\n");
    sb.append("    currentLoanBalance: ").append(toIndentedString(currentLoanBalance)).append("\n");
    sb.append("    dateAsOf: ").append(toIndentedString(dateAsOf)).append("\n");
    sb.append("    loanRate: ").append(toIndentedString(loanRate)).append("\n");
    sb.append("    loanPaymentAmount: ").append(toIndentedString(loanPaymentAmount)).append("\n");
    sb.append("    loanPaymentFrequency: ").append(toIndentedString(loanPaymentFrequency)).append("\n");
    sb.append("    loanPaymentInitial: ").append(toIndentedString(loanPaymentInitial)).append("\n");
    sb.append("    loanPaymentsRemaining: ").append(toIndentedString(loanPaymentsRemaining)).append("\n");
    sb.append("    loanMaturityDate: ").append(toIndentedString(loanMaturityDate)).append("\n");
    sb.append("    loanInterestToDate: ").append(toIndentedString(loanInterestToDate)).append("\n");
    sb.append("    loanTotalProjectedInterest: ").append(toIndentedString(loanTotalProjectedInterest)).append("\n");
    sb.append("    loanNextPaymentDate: ").append(toIndentedString(loanNextPaymentDate)).append("\n");
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