package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * TransferPromotionQuantityFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TransferPromotionQuantityFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="时间类型(制单时间|审核时间|促销时间)", example="审核时间", required=true)
    private String dateType;
    @ApiCloudField(value="开始时间", required=true)
    private String dateFrom;
    @ApiCloudField(value="结束时间", required=true)
    private String dateTo;
    @ApiCloudField(value="制单门店列表", example="【99】", required=true)
    private List<Integer> branchNums;
    @ApiCloudField(value="配送中心列表", example="【99】")
    private List<Integer> transferBranchNums;
    @ApiCloudField(value="促销商品列表", example="[434422642]")
    private List<Integer> itemNums;
    @ApiCloudField(value="状态(1:制单|2:审核|4:作废)", example="1")
    private Integer stateType;
    @ApiCloudField(value="是否过期", example="true")
    private Boolean overdue;
    @ApiCloudField(value="是否查询明细", example="true")
    private Boolean withDetails;
    @ApiCloudField(value="查询页码", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小", example="10", required=true)
    private Integer pageSize;
}
