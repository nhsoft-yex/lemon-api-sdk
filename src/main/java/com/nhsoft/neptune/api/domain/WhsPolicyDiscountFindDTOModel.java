package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WhsPolicyDiscountFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WhsPolicyDiscountFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="时间类型(促销时间|制单时间|审核时间)", example="促销时间", required=true)
    private String dateType;
    @ApiCloudField(value="开始时间", example="2023-01-01 00:00:00", required=true)
    private String dateFrom;
    @ApiCloudField(value="结束时间", example="2023-01-01 00:00:00", required=true)
    private String dateTo;
    @ApiCloudField(value="单据状态(1:制单;3:制单|审核;7:制单|审核|作废;11:过期)", example="[1]")
    private List<Integer> stateCodes;
    @ApiCloudField(value="商品编号", example="[1,2,3]")
    private List<Integer> itemNums;
    @ApiCloudField(value="应用门店编号列表", example="[1,2,3]")
    private List<Integer> appliedBranchNums;
    @ApiCloudField(value="客户编号列表", example="[1,2,3]")
    private List<String> appliedClientFids;
    @ApiCloudField(value="单据名称", example="促销单")
    private String wholesalePolicyDiscountName;
    @ApiCloudField(value="查询页码", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小(最大分页为200)", example="200", required=true)
    private Integer pageSize;
}
