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
 * Suggested values for Payment Network Type.&lt;br/&gt; &lt;br/&gt; | Value | Description |&lt;br/&gt; |-----|-----|&lt;br/&gt; | US_ACH | Automated Clearing House |&lt;br/&gt; | US_FEDWIRE | Fedwire Funds Service |&lt;br/&gt; | US_CHIPS | Clearinghouse Interbank Payments System |&lt;br/&gt; | CA_ACSS | Automated Clearing House Settlement System |&lt;br/&gt; | CA_LVTS | Large-Value Transfer System |
 */
@JsonAdapter(PaymentNetworkType.Adapter.class)
public enum PaymentNetworkType {
  US_ACH("US_ACH"),
  US_FEDWIRE("US_FEDWIRE"),
  US_CHIPS("US_CHIPS"),
  CA_ACSS("CA_ACSS"),
  CA_LVTS("CA_LVTS");

  private String value;

  PaymentNetworkType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PaymentNetworkType fromValue(String input) {
    for (PaymentNetworkType b : PaymentNetworkType.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<PaymentNetworkType> {
    @Override
    public void write(final JsonWriter jsonWriter, final PaymentNetworkType enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public PaymentNetworkType read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return PaymentNetworkType.fromValue((String)(value));
    }
  }
}