package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WmsCheckOrderVO模型
 * WMS盘点单VO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WmsCheckOrderVOModel extends ApiCloudObject {

    @ApiCloudField(value="营业日", example="20230304")
    private String bizday;
    @ApiCloudField(value="盘点单单据号", example="PD20729923063000001")
    private String checkOrderFid;
    @ApiCloudField(value="盘点计划单据号", example="PJ20729923063000001")
    private String checkPlanFid;
    @ApiCloudField(value="创建时间")
    private String checkOrderCreateTime;
    @ApiCloudField(value="创建人", example="nhsoft.yh")
    private String checkOrderCreator;
    @ApiCloudField(value="门店编号", example="99")
    private Integer branchNum;
    @ApiCloudField(value="状态编码", example="3")
    private Integer checkOrderStateCode;
    @ApiCloudField(value="仓库编码", example="207200001")
    private Integer storehouseNum;
    @ApiCloudField(value="更新时间")
    private String checkOrderUpdateTime;
    @ApiCloudField(value="审核人", example="nhsoft.yh")
    private String checkOrderAuditor;
    @ApiCloudField(value="审核时间")
    private String checkOrderAuditTime;
    @ApiCloudField(value="更新人", example="nhsoft.yh")
    private String checkOrderUpdator;
    @ApiCloudField(value="明细", example="99")
    private List<WmsCheckOrderDetailVOModel> checkOrderDetails;
}
