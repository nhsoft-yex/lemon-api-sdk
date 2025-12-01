package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ReserveFindV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ReserveFindV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="制单门店", example="1", required=true)
    private Integer branchNum;
    @ApiCloudField(value="应用门店", example="1")
    private Integer applyBranchNum;
    @ApiCloudField(value="开始时间(yyyy-MM-dd)", example="2021-01-01", required=true)
    private String dateFrom;
    @ApiCloudField(value="结束时间(yyyy-MM-dd)", example="2021-01-01", required=true)
    private String dateTo;
    @ApiCloudField(value="时间类型（促销时间|审核时间|制单时间|生效日期|采购日）", example="制单时间", required=true)
    private String dateType;
    @ApiCloudField(value="单据状态(1 已审核 2 未审核  3 作废)", example="1")
    private Integer orderState;
    @ApiCloudField(value="查询页码", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小", example="10", required=true)
    private Integer pageSize;
}
