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
import io.swagger.client.model.NameAddress;
import io.swagger.client.model.TelephoneNumberPlusExtension;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Contact phone number with name and address
 */
@Schema(description = "Contact phone number with name and address")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-19T17:32:48.004Z[GMT]")
public class NameAddressPhone extends NameAddress {
  @SerializedName("phone")
  private TelephoneNumberPlusExtension phone = null;

  public NameAddressPhone phone(TelephoneNumberPlusExtension phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @Schema(description = "")
  public TelephoneNumberPlusExtension getPhone() {
    return phone;
  }

  public void setPhone(TelephoneNumberPlusExtension phone) {
    this.phone = phone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NameAddressPhone nameAddressPhone = (NameAddressPhone) o;
    return Objects.equals(this.phone, nameAddressPhone.phone) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phone, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NameAddressPhone {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
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
