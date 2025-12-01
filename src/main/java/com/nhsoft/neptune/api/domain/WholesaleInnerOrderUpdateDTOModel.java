package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WholesaleInnerOrderUpdateDTO模型
 * 售后申请单更新
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WholesaleInnerOrderUpdateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="售后申请单号", example="4344990000318", required=true)
    private String innerOrderFid;
    @ApiCloudField(value="截止日期", example="Sat Jan 01 08:00:00 CST 2022", required=true)
    private String innerOrderDeadline;
    @ApiCloudField(value="申请备注")
    private String innerOrderMemo;
    @ApiCloudField(value="操作人", required=true)
    private String innerOrderOperator;
    @ApiCloudField(value="原因", example="质量", required=true)
    private String innerOrderReason;
    @ApiCloudField(value="关联销售单", example="4344990000318")
    private String wholesaleOrderFid;
    @ApiCloudField(value="明细", required=true)
    private List<WholesaleInnerOrderDetailSaveDTOModel> wholesaleInnerOrderDetails;
}
