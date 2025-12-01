package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CustomerMarketingSettlementFindDTO模型
 * 客户营销结算查询DTO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CustomerMarketingSettlementFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="时间类型(制单时间|审核时间|结算截止日)", example="制单时间", required=true)
    private String dateType;
    @ApiCloudField(value="开始时间", required=true)
    private String dateFrom;
    @ApiCloudField(value="结束时间", required=true)
    private String dateTo;
    @ApiCloudField(value="结算门店编号", example="[1]")
    private List<Integer> branchNums;
    @ApiCloudField(value="查询页码", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小", example="10", required=true)
    private Integer pageSize;
}
