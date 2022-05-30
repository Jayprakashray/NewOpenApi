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
 * The type of the order
 */
@JsonAdapter(OrderType.Adapter.class)
public enum OrderType {
  BUY("BUY"),
  SELL("SELL"),
  BUYTOCOVER("BUYTOCOVER"),
  BUYTOOPEN("BUYTOOPEN"),
  SELLTOCOVER("SELLTOCOVER"),
  SELLTOOPEN("SELLTOOPEN"),
  SELLSHORT("SELLSHORT"),
  SELLCLOSE("SELLCLOSE");

  private String value;

  OrderType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OrderType fromValue(String input) {
    for (OrderType b : OrderType.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<OrderType> {
    @Override
    public void write(final JsonWriter jsonWriter, final OrderType enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public OrderType read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return OrderType.fromValue((String)(value));
    }
  }
}
