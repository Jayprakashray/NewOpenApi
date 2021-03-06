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

package io.swagger.client.api;

import io.swagger.client.model.RewardCategories;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for RewardProgramCategoriesApi
 */
@Ignore
public class RewardProgramCategoriesApiTest {

    private final RewardProgramCategoriesApi api = new RewardProgramCategoriesApi();

    /**
     * Get reward categories
     *
     * Get reward categories
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getRewardProgramCategoriesTest() throws Exception {
        String authorization = null;
        String rewardProgramId = null;
        String offset = null;
        Integer limit = null;
        RewardCategories response = api.getRewardProgramCategories(authorization, rewardProgramId, offset, limit);

        // TODO: test validations
    }
}
