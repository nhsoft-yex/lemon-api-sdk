package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SaleReturnOrderFindV2DTO模型
 * 退货订单查询
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SaleReturnOrderFindV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编码", example="1")
    private List<Integer> branchNums;
    @ApiCloudField(value="支付开始时间", example="2023-01-01 00:00:00", required=true)
    private String refundStartTime;
    @ApiCloudField(value="支付结束时间", example="2023-01-01 10:00:00", required=true)
    private String refundEndTime;
    @ApiCloudField(value="订单类型", example="2023-01-01 10:00:00")
    private List<String> orderTypes;
    @ApiCloudField(value="查询页码", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小(最大100)", example="10", required=true)
    private Integer pageSize;
}
