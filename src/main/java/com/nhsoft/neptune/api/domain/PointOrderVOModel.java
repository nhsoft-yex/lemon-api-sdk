package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PointOrderVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PointOrderVOModel extends ApiCloudObject {

    @ApiCloudField(value="积分兑换活动编号", example="99675990000068")
    private String pointOrderFid;
    @ApiCloudField(value="名称", example="开放平台测试活动2")
    private String pointOrderName;
    @ApiCloudField(value="开始日期", example="2025-01-01")
    private String pointOrderStart;
    @ApiCloudField(value="结束日期", example="2025-01-01")
    private String pointOrderEnd;
    @ApiCloudField(value="应用门店(空集合视为所有门店)", example="[1]")
    private List<Integer> pointOrderAppliedBranch;
    @ApiCloudField(value="创建人", example="admin")
    private String pointOrderCreator;
    @ApiCloudField(value="创建时间", example="2025-01-01 00:00:00")
    private String pointOrderCreateTime;
    @ApiCloudField(value="审核人", example="admin")
    private String pointOrderAuditor;
    @ApiCloudField(value="审核时间", example="2025-01-01 00:00:00")
    private String pointOrderAuditTime;
    @ApiCloudField(value="作废人", example="")
    private String pointOrderCancelOperator;
    @ApiCloudField(value="作废时间", example="2025-01-01 00:00:00")
    private String pointOrderCancelTime;
    @ApiCloudField(value="备注", example="")
    private String pointOrderMemo;
    @ApiCloudField(value="周配置", example="[1]")
    private List<Integer> pointOrderWeek;
    @ApiCloudField(value="状态", example="制单|审核")
    private String stateName;
    @ApiCloudField(value="状态码", example="3")
    private Integer stateCode;
    @ApiCloudField(value="商品明细", example="")
    private List<PointOrderDetailVOModel> pointOrderDetails;
}
