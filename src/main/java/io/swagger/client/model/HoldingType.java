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
 * The type of an investment holding
 */
@JsonAdapter(HoldingType.Adapter.class)
public enum HoldingType {
  ANNUITY("ANNUITY"),
  BOND("BOND"),
  CD("CD"),
  MUTUALFUND("MUTUALFUND"),
  OPTION("OPTION"),
  OTHER("OTHER"),
  STOCK("STOCK");

  private String value;

  HoldingType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static HoldingType fromValue(String input) {
    for (HoldingType b : HoldingType.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<HoldingType> {
    @Override
    public void write(final JsonWriter jsonWriter, final HoldingType enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public HoldingType read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return HoldingType.fromValue((String)(value));
    }
  }
}
