package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * TransferPriceAdjustOrderFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TransferPriceAdjustOrderFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="开始时间(yyyy-MM-dd)", example="2021-01-01", required=true)
    private String dateFrom;
    @ApiCloudField(value="结束时间(yyyy-MM-dd)", example="2021-01-03", required=true)
    private String dateTo;
    @ApiCloudField(value="单据号", example="4344990000318")
    private String priceAdjustmentFid;
    @ApiCloudField(value="应用门店编号列表", example="1")
    private List<Integer> applyBranchNums;
    @ApiCloudField(value="商品编号列表", example="4344000001")
    private List<Integer> itemNums;
    @ApiCloudField(value="状态(制单|审核|生效|作废)", example="审核")
    private String stateName;
    @ApiCloudField(value="是否查询明细", example="true")
    private Boolean withDetails;
    @ApiCloudField(value="查询页码 从1开始", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小， 最大100", example="100", required=true)
    private Integer pageSize;
}
