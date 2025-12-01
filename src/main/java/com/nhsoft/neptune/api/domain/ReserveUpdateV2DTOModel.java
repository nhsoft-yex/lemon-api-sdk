package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ReserveUpdateV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ReserveUpdateV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="促销单号", example="434400991000011", required=true)
    private String orderFid;
    @ApiCloudField(value="活动名称", example="测试1", required=true)
    private String orderName;
    @ApiCloudField(value="应用门店编码列表", example="[11,12]", required=true)
    private List<Integer> branchNums;
    @ApiCloudField(value="操作人", example="管理员", required=true)
    private String orderOperator;
    @ApiCloudField(value="备注", example="备注信息")
    private String orderMemo;
    @ApiCloudField(value="活动开始日期(yyyy-MM-dd HH:mm)", example="2021-01-01 00:00", required=true)
    private String orderDateFrom;
    @ApiCloudField(value="活动结束日期(yyyy-MM-dd HH:mm)", example="2021-01-01 00:00", required=true)
    private String orderDateTo;
    @ApiCloudField(value="配送日期(yyyy-MM-dd)", example="2021-01-01", required=true)
    private String orderPolicyDate;
    @ApiCloudField(value="采购日期(yyyy-MM-dd)", example="2021-01-01", required=true)
    private String orderPurchaseDate;
    @ApiCloudField(value="关联单据号", example="434400991000011")
    private String orderPromotionNo;
    @ApiCloudField(value="明细", example="", required=true)
    private List<ReserveDetailV2DTOModel> details;
}
