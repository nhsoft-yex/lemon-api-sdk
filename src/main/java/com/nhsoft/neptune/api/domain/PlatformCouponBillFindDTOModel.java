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

    @ApiCloudField(value="consume_at_begin", required=true)
    private String consumeAtBegin;
    @ApiCloudField(value="consume_at_end", required=true)
    private String consumeAtEnd;
    @ApiCloudField(value="platform_consume_branch_id", example="1852001")
    private String platformConsumeBranchId;
    @ApiCloudField(value="identity_code", example="1852001")
    private String identityCode;
    @ApiCloudField(value="bill_date", example="Thu May 01 08:00:00 CST 2025")
    private String billDate;
    @ApiCloudField(value="coupon_type_ids", example="[9967500001]")
    private List<Long> couponTypeIds;
    @ApiCloudField(value="consume_branch_nums", example="[1,2]")
    private List<Integer> consumeBranchNums;
    @ApiCloudField(value="page_no", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="page_size", example="20", required=true)
    private Integer pageSize;
}
