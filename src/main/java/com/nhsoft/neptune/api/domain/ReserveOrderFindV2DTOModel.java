package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ReserveOrderFindV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ReserveOrderFindV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="促销单号", example="434400991000011")
    private String orderFid;
    @ApiCloudField(value="制单门店", example="99")
    private Integer branchNum;
    @ApiCloudField(value="活动名称", example="测试1")
    private String orderName;
    @ApiCloudField(value="应用门店列表", example="")
    private List<BranchNameV2DTOModel> branchs;
    @ApiCloudField(value="制单人", example="管理员")
    private String orderCreator;
    @ApiCloudField(value="制单时间", example="2021-01-01 00:00:00")
    private String orderCreateTime;
    @ApiCloudField(value="审核人", example="管理员")
    private String orderAuditor;
    @ApiCloudField(value="审核时间", example="2021-01-01 00:00:00")
    private String orderAuditTime;
    @ApiCloudField(value="状态代码", example="1")
    private Integer orderStateCode;
    @ApiCloudField(value="状态名称", example="制单")
    private String orderStateName;
    @ApiCloudField(value="备注", example="备注信息")
    private String orderMemo;
    @ApiCloudField(value="活动开始日期(yyyy-MM-dd HH:mm)", example="2021-01-01 00:00")
    private String orderDateFrom;
    @ApiCloudField(value="活动结束日期(yyyy-MM-dd HH:mm)", example="2021-01-01 00:00")
    private String orderDateTo;
    @ApiCloudField(value="配送日期(yyyy-MM-dd)", example="2021-01-01")
    private String orderPolicyDate;
    @ApiCloudField(value="采购日期(yyyy-MM-dd)", example="2021-01-01")
    private String orderPurchaseDate;
    @ApiCloudField(value="关联单据号", example="434400991000011")
    private String orderPromotionNo;
    @ApiCloudField(value="明细", example="")
    private List<ReserveOrderFindDetailV2DTOModel> details;
}
