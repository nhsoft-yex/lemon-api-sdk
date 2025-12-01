package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PointOrderFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PointOrderFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="时间类型(制单时间|审核时间|活动时间)", example="制单时间", required=true)
    private String dateType;
    @ApiCloudField(value="开始日期", example="Sat Mar 01 08:00:00 CST 2025", required=true)
    private String dateFrom;
    @ApiCloudField(value="结束日期", example="Tue Mar 04 08:00:00 CST 2025", required=true)
    private String dateTo;
    @ApiCloudField(value="积分兑换活动编号", example="")
    private String pointOrderFid;
    @ApiCloudField(value="状态码(1-制单；3-审核；7-作废)", example="1")
    private Integer stateCode;
    @ApiCloudField(value="制单门店编号", example="")
    private List<Integer> branchNums;
    @ApiCloudField(value="是否过期", example="false")
    private Boolean expired;
    @ApiCloudField(value="商品编码", example="")
    private List<Integer> itemNums;
    @ApiCloudField(value="是否查询明细", example="true")
    private Boolean withDetail;
    @ApiCloudField(value="查询页码 从1开始", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小", example="10", required=true)
    private Integer pageSize;
}
