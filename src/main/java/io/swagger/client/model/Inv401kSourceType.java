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
 * The source of a 401k investment
 */
@JsonAdapter(Inv401kSourceType.Adapter.class)
public enum Inv401kSourceType {
  AFTERTAX("AFTERTAX"),
  MATCH("MATCH"),
  OTHERNONVEST("OTHERNONVEST"),
  OTHERVEST("OTHERVEST"),
  PRETAX("PRETAX"),
  PROFITSHARING("PROFITSHARING"),
  ROLLOVER("ROLLOVER");

  private String value;

  Inv401kSourceType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Inv401kSourceType fromValue(String input) {
    for (Inv401kSourceType b : Inv401kSourceType.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<Inv401kSourceType> {
    @Override
    public void write(final JsonWriter jsonWriter, final Inv401kSourceType enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public Inv401kSourceType read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return Inv401kSourceType.fromValue((String)(value));
    }
  }
}