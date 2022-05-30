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
import io.swagger.client.model.Inv401kSourceType;
import io.swagger.client.model.OrderDuration;
import io.swagger.client.model.OrderType;
import io.swagger.client.model.SecurityIdType;
import io.swagger.client.model.SubAccountType;
import io.swagger.client.model.UnitType;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
import org.threeten.bp.LocalDate;
/**
 * An open investment transaction order
 */
@Schema(description = "An open investment transaction order")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-19T17:32:48.004Z[GMT]")
public class OpenOrder {
  @SerializedName("orderId")
  private String orderId = null;

  @SerializedName("securityId")
  private String securityId = null;

  @SerializedName("securityIdType")
  private SecurityIdType securityIdType = null;

  @SerializedName("symbol")
  private String symbol = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("units")
  private BigDecimal units = null;

  @SerializedName("orderType")
  private OrderType orderType = null;

  @SerializedName("orderDate")
  private LocalDate orderDate = null;

  @SerializedName("unitPrice")
  private BigDecimal unitPrice = null;

  @SerializedName("unitType")
  private UnitType unitType = null;

  @SerializedName("orderDuration")
  private OrderDuration orderDuration = null;

  @SerializedName("subAccount")
  private SubAccountType subAccount = null;

  @SerializedName("limitPrice")
  private BigDecimal limitPrice = null;

  @SerializedName("stopPrice")
  private BigDecimal stopPrice = null;

  @SerializedName("inv401kSource")
  private Inv401kSourceType inv401kSource = null;

  public OpenOrder orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * Get orderId
   * @return orderId
  **/
  @Schema(description = "")
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public OpenOrder securityId(String securityId) {
    this.securityId = securityId;
    return this;
  }

   /**
   * Unique identifier of security
   * @return securityId
  **/
  @Schema(description = "Unique identifier of security")
  public String getSecurityId() {
    return securityId;
  }

  public void setSecurityId(String securityId) {
    this.securityId = securityId;
  }

  public OpenOrder securityIdType(SecurityIdType securityIdType) {
    this.securityIdType = securityIdType;
    return this;
  }

   /**
   * Get securityIdType
   * @return securityIdType
  **/
  @Schema(description = "")
  public SecurityIdType getSecurityIdType() {
    return securityIdType;
  }

  public void setSecurityIdType(SecurityIdType securityIdType) {
    this.securityIdType = securityIdType;
  }

  public OpenOrder symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

   /**
   * Market symbol
   * @return symbol
  **/
  @Schema(description = "Market symbol")
  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public OpenOrder description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of order
   * @return description
  **/
  @Schema(description = "Description of order")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OpenOrder units(BigDecimal units) {
    this.units = units;
    return this;
  }

   /**
   * Number of units (shares or bonds etc.)
   * @return units
  **/
  @Schema(description = "Number of units (shares or bonds etc.)")
  public BigDecimal getUnits() {
    return units;
  }

  public void setUnits(BigDecimal units) {
    this.units = units;
  }

  public OpenOrder orderType(OrderType orderType) {
    this.orderType = orderType;
    return this;
  }

   /**
   * Get orderType
   * @return orderType
  **/
  @Schema(description = "")
  public OrderType getOrderType() {
    return orderType;
  }

  public void setOrderType(OrderType orderType) {
    this.orderType = orderType;
  }

  public OpenOrder orderDate(LocalDate orderDate) {
    this.orderDate = orderDate;
    return this;
  }

   /**
   * Get orderDate
   * @return orderDate
  **/
  @Schema(description = "")
  public LocalDate getOrderDate() {
    return orderDate;
  }

  public void setOrderDate(LocalDate orderDate) {
    this.orderDate = orderDate;
  }

  public OpenOrder unitPrice(BigDecimal unitPrice) {
    this.unitPrice = unitPrice;
    return this;
  }

   /**
   * Unit price
   * @return unitPrice
  **/
  @Schema(description = "Unit price")
  public BigDecimal getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(BigDecimal unitPrice) {
    this.unitPrice = unitPrice;
  }

  public OpenOrder unitType(UnitType unitType) {
    this.unitType = unitType;
    return this;
  }

   /**
   * Get unitType
   * @return unitType
  **/
  @Schema(description = "")
  public UnitType getUnitType() {
    return unitType;
  }

  public void setUnitType(UnitType unitType) {
    this.unitType = unitType;
  }

  public OpenOrder orderDuration(OrderDuration orderDuration) {
    this.orderDuration = orderDuration;
    return this;
  }

   /**
   * Get orderDuration
   * @return orderDuration
  **/
  @Schema(description = "")
  public OrderDuration getOrderDuration() {
    return orderDuration;
  }

  public void setOrderDuration(OrderDuration orderDuration) {
    this.orderDuration = orderDuration;
  }

  public OpenOrder subAccount(SubAccountType subAccount) {
    this.subAccount = subAccount;
    return this;
  }

   /**
   * Get subAccount
   * @return subAccount
  **/
  @Schema(description = "")
  public SubAccountType getSubAccount() {
    return subAccount;
  }

  public void setSubAccount(SubAccountType subAccount) {
    this.subAccount = subAccount;
  }

  public OpenOrder limitPrice(BigDecimal limitPrice) {
    this.limitPrice = limitPrice;
    return this;
  }

   /**
   * Limit price
   * @return limitPrice
  **/
  @Schema(description = "Limit price")
  public BigDecimal getLimitPrice() {
    return limitPrice;
  }

  public void setLimitPrice(BigDecimal limitPrice) {
    this.limitPrice = limitPrice;
  }

  public OpenOrder stopPrice(BigDecimal stopPrice) {
    this.stopPrice = stopPrice;
    return this;
  }

   /**
   * Stop price
   * @return stopPrice
  **/
  @Schema(description = "Stop price")
  public BigDecimal getStopPrice() {
    return stopPrice;
  }

  public void setStopPrice(BigDecimal stopPrice) {
    this.stopPrice = stopPrice;
  }

  public OpenOrder inv401kSource(Inv401kSourceType inv401kSource) {
    this.inv401kSource = inv401kSource;
    return this;
  }

   /**
   * Get inv401kSource
   * @return inv401kSource
  **/
  @Schema(description = "")
  public Inv401kSourceType getInv401kSource() {
    return inv401kSource;
  }

  public void setInv401kSource(Inv401kSourceType inv401kSource) {
    this.inv401kSource = inv401kSource;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenOrder openOrder = (OpenOrder) o;
    return Objects.equals(this.orderId, openOrder.orderId) &&
        Objects.equals(this.securityId, openOrder.securityId) &&
        Objects.equals(this.securityIdType, openOrder.securityIdType) &&
        Objects.equals(this.symbol, openOrder.symbol) &&
        Objects.equals(this.description, openOrder.description) &&
        Objects.equals(this.units, openOrder.units) &&
        Objects.equals(this.orderType, openOrder.orderType) &&
        Objects.equals(this.orderDate, openOrder.orderDate) &&
        Objects.equals(this.unitPrice, openOrder.unitPrice) &&
        Objects.equals(this.unitType, openOrder.unitType) &&
        Objects.equals(this.orderDuration, openOrder.orderDuration) &&
        Objects.equals(this.subAccount, openOrder.subAccount) &&
        Objects.equals(this.limitPrice, openOrder.limitPrice) &&
        Objects.equals(this.stopPrice, openOrder.stopPrice) &&
        Objects.equals(this.inv401kSource, openOrder.inv401kSource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, securityId, securityIdType, symbol, description, units, orderType, orderDate, unitPrice, unitType, orderDuration, subAccount, limitPrice, stopPrice, inv401kSource);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenOrder {\n");
    
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    securityId: ").append(toIndentedString(securityId)).append("\n");
    sb.append("    securityIdType: ").append(toIndentedString(securityIdType)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    units: ").append(toIndentedString(units)).append("\n");
    sb.append("    orderType: ").append(toIndentedString(orderType)).append("\n");
    sb.append("    orderDate: ").append(toIndentedString(orderDate)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
    sb.append("    unitType: ").append(toIndentedString(unitType)).append("\n");
    sb.append("    orderDuration: ").append(toIndentedString(orderDuration)).append("\n");
    sb.append("    subAccount: ").append(toIndentedString(subAccount)).append("\n");
    sb.append("    limitPrice: ").append(toIndentedString(limitPrice)).append("\n");
    sb.append("    stopPrice: ").append(toIndentedString(stopPrice)).append("\n");
    sb.append("    inv401kSource: ").append(toIndentedString(inv401kSource)).append("\n");
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