package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CheckPlanFindDTO模型
 * 盘点计划查询DTO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CheckPlanFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="配送中心门店编号", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="日期类型(制单日期|审核日期|完成日期)", example="制单日期", required=true)
    private String dateType;
    @ApiCloudField(value="开始时间", example="2024-04-01 00:00:00", required=true)
    private String dateFrom;
    @ApiCloudField(value="结束时间", example="2024-04-02 00:00:00", required=true)
    private String dateTo;
    @ApiCloudField(value="盘点类型(计划盘点|随机盘点)", example="计划盘点")
    private String checkPlanType;
    @ApiCloudField(value="盘点模式(商品盘点|库位盘点)", example="商品盘点")
    private String checkPlanMode;
    @ApiCloudField(value="仓库编码", example="209500001")
    private Integer storehouseNum;
    @ApiCloudField(value="是否盲盘", example="true")
    private Boolean blindCheckEnable;
    @ApiCloudField(value="是否开启库存快照", example="true")
    private Boolean snapshotInventoryEnable;
    @ApiCloudField(value="查询页码", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小", example="10", required=true)
    private Integer pageSize;
}
