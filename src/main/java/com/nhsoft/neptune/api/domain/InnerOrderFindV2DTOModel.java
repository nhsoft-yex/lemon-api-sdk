package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * InnerOrderFindV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class InnerOrderFindV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="申请单号", example="NS4344010000304")
    private String innerOrderFid;
    @ApiCloudField(value="申请门店", example="99")
    private Integer branchNum;
    @ApiCloudField(value="调往门店", example="1")
    private Integer outBranchNum;
    @ApiCloudField(value="状态代码", example="1")
    private Integer innerOrderStateCode;
    @ApiCloudField(value="状态名称", example="制单")
    private String innerOrderStateName;
    @ApiCloudField(value="创建人", example="管理员")
    private String innerOrderCreator;
    @ApiCloudField(value="审核人", example="管理员")
    private String innerOrderAuditor;
    @ApiCloudField(value="创建时间(yyyy-mm-dd HH:mm:ss)", example="2021-01-01 00:00:00")
    private String innerOrderCreateTime;
    @ApiCloudField(value="审核时间(yyyy-mm-dd HH:mm:ss)", example="2021-01-01 00:00:00")
    private String innerOrderAuditTime;
    @ApiCloudField(value="备注", example="备注信息")
    private String innerOrderMemo;
    @ApiCloudField(value="单据类型(直调申请,退货申请)", example="直调申请")
    private String innerOrderType;
    @ApiCloudField(value="批复人", example="管理员")
    private String innerOrderApprovor;
    @ApiCloudField(value="批复时间(yyyy-mm-dd HH:mm:ss)", example="2021-01-01 00:00:00")
    private String innerOrderApproveTime;
    @ApiCloudField(value="截止日期(yyyy-MM-dd HH:MM:SS)", example="2021-01-01 00:00:00")
    private String innerOrderDeadline;
    @ApiCloudField(value="处理人", example="管理员")
    private String innerOrderDealor;
    @ApiCloudField(value="处理日期(yyyy-MM-dd HH:MM:SS)", example="2021-01-01 00:00:00")
    private String innerOrderDealTime;
    @ApiCloudField(value="批复备注", example="备注信息")
    private String innerOrderApproveMemo;
    @ApiCloudField(value="原因代码", example="001")
    private String innerOrderReason;
    @ApiCloudField(value="原因名称", example="不需要了")
    private String innerOrderReasonName;
    @ApiCloudField(value="明细", example="")
    private List<InnerOrderFindDetailV2DTOModel> innerOrderDetails;
    @ApiCloudField(value="发货仓库号")
    private Integer storehouseNum;
    @ApiCloudField(value="调入仓库号")
    private Integer inStorehouseNum;
    @ApiCloudField(value="打包件数")
    private Integer innerOrderPickUseQty;
    @ApiCloudField(value="良品、次品标记", example="良品")
    private String innerOrderConditionType;
    @ApiCloudField(value="总金额")
    private BigDecimal innerOrderMoney;
    @ApiCloudField(value="批复金额")
    private BigDecimal innerOrderReplyMoney;
}
