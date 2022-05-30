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
 * Name of [cluster of data elements](https://fdx.atlassian.net/wiki/spaces/FDX/pages/872906996/v1.1+Data+Clusters) permissioned
 */
@JsonAdapter(DataCluster.Adapter.class)
public enum DataCluster {
  ACCOUNT_BASIC("ACCOUNT_BASIC"),
  ACCOUNT_DETAILED("ACCOUNT_DETAILED"),
  ACCOUNT_PAYMENTS("ACCOUNT_PAYMENTS"),
  CUSTOMER_CONTACT("CUSTOMER_CONTACT"),
  CUSTOMER_PERSONAL("CUSTOMER_PERSONAL"),
  INVESTMENTS("INVESTMENTS"),
  STATEMENTS("STATEMENTS"),
  TRANSACTIONS("TRANSACTIONS");

  private String value;

  DataCluster(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DataCluster fromValue(String input) {
    for (DataCluster b : DataCluster.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<DataCluster> {
    @Override
    public void write(final JsonWriter jsonWriter, final DataCluster enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public DataCluster read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return DataCluster.fromValue((String)(value));
    }
  }
}
