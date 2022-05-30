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
import io.swagger.v3.oas.annotations.media.Schema;
import com.google.gson.annotations.SerializedName;
import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Types of relationships between accounts and holders. Suggested values
 */
@JsonAdapter(AccountHolderRelationship.Adapter.class)
public enum AccountHolderRelationship {
  AUTHORIZED_USER("AUTHORIZED_USER"),
  BUSINESS("BUSINESS"),
  FOR_BENEFIT_OF("FOR_BENEFIT_OF"),
  FOR_BENEFIT_OF_PRIMARY("FOR_BENEFIT_OF_PRIMARY"),
  FOR_BENEFIT_OF_PRIMARY_JOINT_RESTRICTED("FOR_BENEFIT_OF_PRIMARY_JOINT_RESTRICTED"),
  FOR_BENEFIT_OF_SECONDARY("FOR_BENEFIT_OF_SECONDARY"),
  FOR_BENEFIT_OF_SECONDARY_JOINT_RESTRICTED("FOR_BENEFIT_OF_SECONDARY_JOINT_RESTRICTED"),
  FOR_BENEFIT_OF_SOLE_OWNER_RESTRICTED("FOR_BENEFIT_OF_SOLE_OWNER_RESTRICTED"),
  POWER_OF_ATTORNEY("POWER_OF_ATTORNEY"),
  PRIMARY_JOINT_TENANTS("PRIMARY_JOINT_TENANTS"),
  PRIMARY("PRIMARY"),
  PRIMARY_BORROWER("PRIMARY_BORROWER"),
  PRIMARY_JOINT("PRIMARY_JOINT"),
  SECONDARY("SECONDARY"),
  SECONDARY_JOINT_TENANTS("SECONDARY_JOINT_TENANTS"),
  SECONDARY_BORROWER("SECONDARY_BORROWER"),
  SECONDARY_JOINT("SECONDARY_JOINT"),
  SOLE_OWNER("SOLE_OWNER"),
  TRUSTEE("TRUSTEE"),
  UNIFORM_TRANSFER_TO_MINOR("UNIFORM_TRANSFER_TO_MINOR");

  private String value;

  AccountHolderRelationship(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AccountHolderRelationship fromValue(String input) {
    for (AccountHolderRelationship b : AccountHolderRelationship.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AccountHolderRelationship> {
    @Override
    public void write(final JsonWriter jsonWriter, final AccountHolderRelationship enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public AccountHolderRelationship read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return AccountHolderRelationship.fromValue((String)(value));
    }
  }
}