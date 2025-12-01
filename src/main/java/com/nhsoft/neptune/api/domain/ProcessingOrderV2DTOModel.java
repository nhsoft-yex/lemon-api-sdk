package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ProcessingOrderV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ProcessingOrderV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="加工单编号", example="JO2072990001006")
    private String processingOrderFid;
    @ApiCloudField(value="门店编码", example="99")
    private Integer branchNum;
    @ApiCloudField(value="仓库编码", example="207200027")
    private Integer storehouseNum;
    @ApiCloudField(value="仓库名称", example="测试仓库")
    private String storehouseName;
    @ApiCloudField(value="操作人", example="鹿鹿鹿")
    private String processingOrderOperator;
    @ApiCloudField(value="加工计划单编号", example="JP2072990001009")
    private String processingPlanOrderFid;
    @ApiCloudField(value="加工商品编码", example="207212576")
    private Integer processingOrderItemNum;
    @ApiCloudField(value="加工商品名称", example="麦当劳咖啡")
    private String processingOrderItemName;
    @ApiCloudField(value="加工总额", example="51156705.75")
    private BigDecimal processingOrderMoney;
    @ApiCloudField(value="加工数量", example="20000.0")
    private BigDecimal processingOrderQty;
    @ApiCloudField(value="备注", example="备注")
    private String processingOrderMemo;
    @ApiCloudField(value="单据状态创建人", example="hhy12")
    private String processingOrderCreator;
    @ApiCloudField(value="加工日期", example="2022-04-20 00:00:00")
    private String processingOrderDate;
    @ApiCloudField(value="加工状态编码", example="1")
    private Integer processingOrderStateCode;
    @ApiCloudField(value="加工状态名称", example="制单")
    private String processingOrderStateName;
    @ApiCloudField(value="加工审核人", example="hhy12")
    private String processingOrderAuditor;
    @ApiCloudField(value="加工创建时间", example="2022-04-20 15:41:45")
    private String processingOrderCreateTime;
    @ApiCloudField(value="加工审核时间", example="2022-04-20 15:41:45")
    private String processingOrderAuditTime;
    @ApiCloudField(value="是否已被入库", example="false")
    private Boolean processingOrderUse;
    @ApiCloudField(value="计划单计划量")
    private BigDecimal processingPlanOrderDetailQty;
    @ApiCloudField(value="加工原料明细", example="")
    private List<ProcessingOrderDetailV2DTOModel> processingOrderDetails;
}
