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
 * The posting type of a transaction
 */
@JsonAdapter(DebitCreditMemo.Adapter.class)
public enum DebitCreditMemo {
  CREDIT("CREDIT"),
  DEBIT("DEBIT"),
  MEMO("MEMO");

  private String value;

  DebitCreditMemo(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DebitCreditMemo fromValue(String input) {
    for (DebitCreditMemo b : DebitCreditMemo.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<DebitCreditMemo> {
    @Override
    public void write(final JsonWriter jsonWriter, final DebitCreditMemo enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public DebitCreditMemo read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return DebitCreditMemo.fromValue((String)(value));
    }
  }
}
