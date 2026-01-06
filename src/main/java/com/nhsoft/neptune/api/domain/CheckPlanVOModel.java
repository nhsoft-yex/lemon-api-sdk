package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CheckPlanVO模型
 * 盘点计划
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CheckPlanVOModel extends ApiCloudObject {

    @ApiCloudField(value="盘点任务单据号", example="PJ21139924092000001")
    private String checkPlanFid;
    @ApiCloudField(value="配送中心门店编号", example="99")
    private Integer branchNum;
    @ApiCloudField(value="仓库编码", example="211300001")
    private Integer storehouseNum;
    @ApiCloudField(value="盘点类型", example="计划盘点")
    private String checkPlanType;
    @ApiCloudField(value="盘点模式", example="商品盘点")
    private String checkPlanMode;
    @ApiCloudField(value="是否盲盘", example="true")
    private Boolean blindCheckEnable;
    @ApiCloudField(value="是否开启库存快照", example="true")
    private Boolean snapshotInventoryEnable;
    @ApiCloudField(value="创建人", example="admin")
    private String checkPlanCreator;
    @ApiCloudField(value="创建时间")
    private String checkPlanCreateTime;
    @ApiCloudField(value="审核人", example="admin")
    private String checkPlanAuditor;
    @ApiCloudField(value="审核时间")
    private String checkPlanAuditTime;
    @ApiCloudField(value="盘点日期", example="Mon Apr 01 08:00:00 CST 2024")
    private String checkPlanDate;
    @ApiCloudField(value="单据状态码", example="1")
    private Integer checkPlanStateCode;
    @ApiCloudField(value="单据状态", example="制单")
    private String checkPlanStateName;
    @ApiCloudField(value="盘点任务列表(仅读取接口返回)")
    private List<CheckTaskVOModel> tasks;
    @ApiCloudField(value="任务明细列表(仅读取接口返回)")
    private List<CheckTaskDetailVOModel> taskDetails;
}
