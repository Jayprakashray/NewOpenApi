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
 * The frequency of payments on a loan
 */
@JsonAdapter(LoanPaymentFrequency.Adapter.class)
public enum LoanPaymentFrequency {
  ANNUALLY("ANNUALLY"),
  BIMONTHLY("BIMONTHLY"),
  BIWEEKLY("BIWEEKLY"),
  FOURWEEKS("FOURWEEKS"),
  MONTHLY("MONTHLY"),
  OTHER("OTHER"),
  QUARTERLY("QUARTERLY"),
  SEMIANNUALLY("SEMIANNUALLY"),
  TWICEMONTHLY("TWICEMONTHLY"),
  WEEKLY("WEEKLY");

  private String value;

  LoanPaymentFrequency(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LoanPaymentFrequency fromValue(String input) {
    for (LoanPaymentFrequency b : LoanPaymentFrequency.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<LoanPaymentFrequency> {
    @Override
    public void write(final JsonWriter jsonWriter, final LoanPaymentFrequency enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public LoanPaymentFrequency read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return LoanPaymentFrequency.fromValue((String)(value));
    }
  }
}
