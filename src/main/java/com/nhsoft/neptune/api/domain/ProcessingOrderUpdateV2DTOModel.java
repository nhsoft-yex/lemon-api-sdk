package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ProcessingOrderUpdateV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ProcessingOrderUpdateV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="加工单编号", example="JO4344991001670", required=true)
    private String processingOrderFid;
    @ApiCloudField(value="门店编号", example="1", required=true)
    private Integer branchNum;
    @ApiCloudField(value="仓库编号", example="43440001", required=true)
    private Integer storehouseNum;
    @ApiCloudField(value="操作人", example="管理员", required=true)
    private String processingOrderOperator;
    @ApiCloudField(value="加工计划单编号", example="JP4344990001", required=true)
    private String processingPlanOrderFid;
    @ApiCloudField(value="加工商品编号", example="43440001", required=true)
    private Integer processingOrderItemNum;
    @ApiCloudField(value="加工总额", example="12.0", required=true)
    private BigDecimal processingOrderMoney;
    @ApiCloudField(value="加工数量", example="2.0", required=true)
    private BigDecimal processingOrderQty;
    @ApiCloudField(value="加工日期(yyyy-mm-dd)", example="2022-01-01", required=true)
    private String processingOrderDate;
    @ApiCloudField(value="备注", example="")
    private String processingOrderMemo;
    @ApiCloudField(value="加工原料明细", example="", required=true)
    private List<ProcessingOrderSaveDetailV2DTOModel> processingOrderDetails;
}
