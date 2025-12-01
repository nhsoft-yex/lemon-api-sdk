package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * AllocationOrderDetailFindDTO模型
 * 调拨单明细查询
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AllocationOrderDetailFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编码", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="时间类型(制单时间|审核时间|完成时间)", example="制单时间", required=true)
    private String dateType;
    @ApiCloudField(value="移库类型(移库|补货|调整拣货位)", example="移库")
    private String orderType;
    @ApiCloudField(value="状态(审核|完成|作废)", example="审核")
    private String stateName;
    @ApiCloudField(value="开始时间", example="2024-06-06 00:00:00", required=true)
    private String dateFrom;
    @ApiCloudField(value="结束时间", example="2024-06-06 23:59:59", required=true)
    private String dateTo;
    @ApiCloudField(value="查询页码", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小", example="20", required=true)
    private Integer pageSize;
}
