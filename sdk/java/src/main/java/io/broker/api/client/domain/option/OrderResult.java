package io.broker.api.client.domain.option;

import java.util.List;

import lombok.Singular;

/**
 * @ProjectName:
 * @Package:
 * @Author: 5ROI Dev  <developer@5roi.com>
 * @CreateDate: 2021-06-11 11:10
 * @Copyright（C）: 2021 5ROI Global Inc. All rights reserved.
 */
public class OrderResult {

    /**
     * Time.
     */
    private Long time; 

    /**
     * Update time.
     */
    private Long updateTime;

    /**
     * Order id.
     */
    private Long orderId; 

    /**
     * Account id.
     */
    private Long accountId;

    /**
     * Client order id.
     */
    private String clientOrderId;

    /**
     * Symbol.
     */
    private String symbol;

    /**
     * price.
     */
    private String price;

    /**
     * Orig qty.
     */
    private String origQty;

    /**
     * Executed qty.
     */
    private String executedQty;

    /**
     * Executed amount.
     */
    private String executedAmount;

    /**
     * Avg price.
     */
    private String avgPrice;

    /**
     * Type.
     */
    private String type;

    /**
     * Side.
     */
    private String side;

    /**
     * Status.
     */
    private String status;


    private String option;
    private String timeInForce;
    private @Singular("fee")
    List<OrderMatchFeeInfo> fees;
}
