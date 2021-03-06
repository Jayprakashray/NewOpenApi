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
 * Defines the type of a loan transaction:&lt;br/&gt; * &#x60;ADJUSTMENT&#x60;: Adjustment or correction.&lt;br/&gt; * &#x60;FEE&#x60;: Fee charge. For example, a late payment fee.&lt;br/&gt; * &#x60;INTEREST&#x60;: Interest charge.&lt;br/&gt; * &#x60;PAYMENT&#x60;: Required payment that satisfies the minimum payment (e.g. principal + interest for mortgages).&lt;br/&gt; * &#x60;LUMP_SUM_PAYMENT&#x60;: A single payment of money, as opposed to a series of payments made over time.&lt;br/&gt; * &#x60;SKIP_PAYMENT&#x60;: Payment that satisfies deferral of a required payment.&lt;/br&gt; * &#x60;DOUBLE_UP_PAYMENT&#x60;: Additional payment beyond the required payment to reduce the principal.&lt;/br&gt; * &#x60;PAYOFF&#x60;: Payment that satisfies the terms of the mortgage loan and completely pays off the debt.
 */
@JsonAdapter(LoanTransactionType.Adapter.class)
public enum LoanTransactionType {
  ADJUSTMENT("ADJUSTMENT"),
  FEE("FEE"),
  INTEREST("INTEREST"),
  PAYMENT("PAYMENT"),
  LUMP_SUM_PAYMENT("LUMP_SUM_PAYMENT"),
  SKIP_PAYMENT("SKIP_PAYMENT"),
  DOUBLE_UP_PAYMENT("DOUBLE_UP_PAYMENT"),
  PAYOFF("PAYOFF");

  private String value;

  LoanTransactionType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LoanTransactionType fromValue(String input) {
    for (LoanTransactionType b : LoanTransactionType.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<LoanTransactionType> {
    @Override
    public void write(final JsonWriter jsonWriter, final LoanTransactionType enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public LoanTransactionType read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return LoanTransactionType.fromValue((String)(value));
    }
  }
}
