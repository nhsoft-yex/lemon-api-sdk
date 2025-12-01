package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CheckTaskVO模型
 * 盘点任务
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CheckTaskVOModel extends ApiCloudObject {

    @ApiCloudField(value="盘点任务单据号", example="PR21139924092000001")
    private String checkTaskFid;
    @ApiCloudField(value="配送中心门店编号", example="99")
    private Integer branchNum;
    @ApiCloudField(value="仓库编码", example="211300001")
    private Integer storehouseNum;
    @ApiCloudField(value="库区编码", example="171")
    private Integer storehouseAreaNum;
    @ApiCloudField(value="库区名称", example="A")
    private String storehouseAreaName;
    @ApiCloudField(value="库位编码", example="8070")
    private Long positionNum;
    @ApiCloudField(value="库位名称", example="jh001")
    private String positionName;
    @ApiCloudField(value="库位类型", example="存储位")
    private String positionType;
    @ApiCloudField(value="盘点类型(计划盘点|随机盘点)", example="计划盘点")
    private String checkPlanType;
    @ApiCloudField(value="盘点模式(商品盘点|库位盘点)", example="商品盘点")
    private String checkPlanMode;
    @ApiCloudField(value="任务创建时间")
    private String createTime;
    @ApiCloudField(value="创建人", example="1")
    private String creator;
    @ApiCloudField(value="货主编码", example="211300198")
    private Integer ownerUserNum;
    @ApiCloudField(value="货主名称", example="程爽")
    private String ownerUserName;
    @ApiCloudField(value="是否盲盘", example="true")
    private Boolean blindCheckEnable;
    @ApiCloudField(value="盘点任务单据状态代码", example="3")
    private Integer stateCode;
    @ApiCloudField(value="盘点任务单据状态", example="制单|审核")
    private String stateName;
    @ApiCloudField(value="盘点任务状态(已分配|盘点中)", example="已分配")
    private String checkState;
}
