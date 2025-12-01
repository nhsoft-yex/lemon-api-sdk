package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SaleOrderFindV2DTO模型
 * 订单查询
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SaleOrderFindV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编码", example="1")
    private List<Integer> branchNums;
    @ApiCloudField(value="提货门店编码", example="[1]")
    private List<Integer> pickBranchNums;
    @ApiCloudField(value="支付开始时间", example="2023-01-01 00:00:00")
    private String payStartTime;
    @ApiCloudField(value="支付结束时间", example="2023-01-01 10:00:00")
    private String payEndTime;
    @ApiCloudField(value="支付时间类型（支付时间|发货时间）不传默认为支付时间", example="支付时间")
    private String dateType;
    @ApiCloudField(value="开始时间(配合date_type使用)", example="2023-01-01 00:00:00")
    private String dateFrom;
    @ApiCloudField(value="结束时间(配合date_type使用)", example="2023-01-01 10:00:00")
    private String dateTo;
    @ApiCloudField(value="订单类型", example="2023-01-01 10:00:00")
    private List<String> orderTypes;
    @ApiCloudField(value="订单状态(WAIT_PAID:待支付|PAID:待核销/待发货|WAIT_DISTRIBUTION:待配货|SHIPPED:已发货|COMPLETE:已送达/已核销|CLOSED:已关闭/已取消)", example="WAIT_PAID")
    private List<String> displayStates;
    @ApiCloudField(value="查询页码", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小(最大100)", example="10", required=true)
    private Integer pageSize;
    @ApiCloudField(value="订退款状态(NONE：未退款|REFUNDING：退款中|PART：部分退款|ALL：已退款)", example="[NONE]")
    private List<String> saleOrderRefundedStates;
}
