package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ProcessingPlanOrderV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ProcessingPlanOrderV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="计划单编号", example="JP4344991001539")
    private String processingPlanOrderFid;
    @ApiCloudField(value="门店编码", example="99")
    private Integer branchNum;
    @ApiCloudField(value="加工代号", example="20220822")
    private String processingPlanOrderCode;
    @ApiCloudField(value="操作人", example="业务员")
    private String processingPlanOrderOperator;
    @ApiCloudField(value="计划单状态编码", example="1")
    private Integer processingPlanOrderStateCode;
    @ApiCloudField(value="计划单状态名称", example="制单")
    private String processingPlanOrderStateName;
    @ApiCloudField(value="备注", example="")
    private String processingPlanOrderMemo;
    @ApiCloudField(value="计划单创建人", example="业务员")
    private String processingPlanOrderCreator;
    @ApiCloudField(value="计划单审核人", example="业务员")
    private String processingPlanOrderAuditor;
    @ApiCloudField(value="计划单截止时间", example="2022-08-22 16:12:06")
    private String processingPlanOrderDeadline;
    @ApiCloudField(value="计划单创建时间", example="2022-08-22 16:12:06")
    private String processingPlanOrderCreateTime;
    @ApiCloudField(value="计划单审核时间", example="2022-08-22 16:12:06")
    private String processingPlanOrdeAuditTime;
    @ApiCloudField(value="计划单明细", example="")
    private List<ProcessingPlanOrderDetailV2DTOModel> processingPlanOrderDetails;
}
