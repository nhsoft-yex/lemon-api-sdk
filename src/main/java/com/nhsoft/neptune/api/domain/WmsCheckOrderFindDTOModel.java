package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WmsCheckOrderFindDTO模型
 * WMS盘点单查询
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WmsCheckOrderFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="配送中心门店编号", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="创建日期|盘点日期", example="创建日期", required=true)
    private String dateType;
    @ApiCloudField(value="开始时间", example="2024-04-01 00:00:00", required=true)
    private String dateFrom;
    @ApiCloudField(value="结束时间", example="2024-04-02 00:00:00", required=true)
    private String dateTo;
    @ApiCloudField(value="商品编码列表", example="[1]")
    private List<Integer> itemNums;
    @ApiCloudField(value="库位编码列表", example="[1]")
    private List<Integer> positionNums;
    @ApiCloudField(value="查询页码", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小", example="10", required=true)
    private Integer pageSize;
}
