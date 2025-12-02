package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WholesaleInnerOrderVO模型
 * 售后申请单
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WholesaleInnerOrderVOModel extends ApiCloudObject {

    @ApiCloudField(value="单据号", example="4344990000318")
    private String innerOrderFid;
    @ApiCloudField(value="门店号", example="99")
    private Integer branchNum;
    @ApiCloudField(value="客户号", example="0015005990000001")
    private String clientFid;
    @ApiCloudField(value="状态代码", example="1")
    private Integer stateCode;
    @ApiCloudField(value="状态名称", example="制单")
    private String stateName;
    @ApiCloudField(value="创建人", example="管理员")
    private String innerOrderCreator;
    @ApiCloudField(value="审核人", example="管理员")
    private String innerOrderAuditor;
    @ApiCloudField(value="创建时间")
    private String innerOrderCreateTime;
    @ApiCloudField(value="审核时间")
    private String innerOrderAuditTime;
    @ApiCloudField(value="截止日期", example="Sat Jan 01 08:00:00 CST 2022")
    private String innerOrderDeadline;
    @ApiCloudField(value="申请备注", example="")
    private String innerOrderMemo;
    @ApiCloudField(value="申请单类型", example="退货申请")
    private String innerOrderType;
    @ApiCloudField(value="批复人", example="管理员")
    private String innerOrderApprover;
    @ApiCloudField(value="批复时间")
    private String innerOrderApproveTime;
    @ApiCloudField(value="批复备注", example="")
    private String innerOrderApproveMemo;
    @ApiCloudField(value="最近修改时间")
    private String innerOrderLastEditTime;
    @ApiCloudField(value="最近修改人", example="管理员")
    private String innerOrderLastEditor;
    @ApiCloudField(value="退货原因", example="质量")
    private String innerOrderReason;
    @ApiCloudField(value="关联销售单", example="4344990000318")
    private String wholesaleOrderFid;
    @ApiCloudField(value="关联退货单", example="4344990000318")
    private String wholesaleReturnFid;
    @ApiCloudField(value="明细", example="")
    private List<WholesaleInnerOrderDetailDTOModel> innerOrderDetails;
}
