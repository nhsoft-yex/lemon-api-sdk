package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WholesaleInnerOrderSaveDTO模型
 * 售后申请单保存
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WholesaleInnerOrderSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编码", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="客户号", example="0015005990000001")
    private String clientFid;
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
