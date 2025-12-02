package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PlatformCouponBillFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PlatformCouponBillFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="核销时间开始", required=true)
    private String consumeAtBegin;
    @ApiCloudField(value="核销时间结束", required=true)
    private String consumeAtEnd;
    @ApiCloudField(value="平台核销门店Id(如抖音门店编号)", example="")
    private String platformConsumeBranchId;
    @ApiCloudField(value="券编号", example="")
    private String identityCode;
    @ApiCloudField(value="账单日期YYYY-MM-DD", example="Thu May 01 08:00:00 CST 2025")
    private String billDate;
    @ApiCloudField(value="券类型列表", example="")
    private List<Long> couponTypeIds;
    @ApiCloudField(value="线下核销门店列表", example="")
    private List<Integer> consumeBranchNums;
    @ApiCloudField(value="查询页码", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小", example="20", required=true)
    private Integer pageSize;
}
