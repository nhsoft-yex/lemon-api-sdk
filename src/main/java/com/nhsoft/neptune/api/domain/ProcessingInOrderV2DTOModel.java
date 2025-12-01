package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ProcessingInOrderV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ProcessingInOrderV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="入库单编号", example="JI2072990001007")
    private String processingInOrderFid;
    @ApiCloudField(value="门店编码", example="99")
    private Integer branchNum;
    @ApiCloudField(value="仓库编码", example="207200027")
    private Integer storehouseNum;
    @ApiCloudField(value="仓库名称", example="测试仓库")
    private String storehouseName;
    @ApiCloudField(value="操作人", example="管理员")
    private String processingInOrderOperator;
    @ApiCloudField(value="备注", example="备注")
    private String processingInOrderMemo;
    @ApiCloudField(value="单据状态创建人", example="hhy12")
    private String processingInOrderCreator;
    @ApiCloudField(value="入库日期", example="2022-04-20 00:00:00")
    private String processingInOrderDate;
    @ApiCloudField(value="入库状态编码", example="3")
    private Integer processingInOrderStateCode;
    @ApiCloudField(value="入库状态名称", example="制单|审核")
    private String processingInOrderStateName;
    @ApiCloudField(value="入库审核人", example="hhy12")
    private String processingInOrderAuditor;
    @ApiCloudField(value="入库创建时间", example="2022-04-20 16:07:16")
    private String processingInOrderCreateTime;
    @ApiCloudField(value="入库审核时间", example="2022-04-20 16:16:16")
    private String processingInOrderAuditTime;
    @ApiCloudField(value="加工计划单编号", example="JP2072990001009")
    private String processingPlanOrderFid;
    @ApiCloudField(value="最后修改时间", example="2022-04-20 16:16:16")
    private String processingInOrderLastEditTime;
    @ApiCloudField(value="入库商品明细", example="")
    private List<ProcessingInOrderDetailV2DTOModel> processingInOrderDetails;
}
