package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CardCouponCustomerFindDTO模型
 * 券查询
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CardCouponCustomerFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="会员主键（与会员手机号二选一）", example="150200002")
    private Long customerId;
    @ApiCloudField(value="会员手机号（与会员主键二选一）", example="18058533300")
    private String phone;
    @ApiCloudField(value="0有效 1已使用 2已过期 4未生效", example="1")
    private Integer state;
    @ApiCloudField(value="查询起始日期（全渠道会员）", example="Fri Jan 01 08:00:00 CST 2021")
    private String dateFrom;
    @ApiCloudField(value="查询结束日期（全渠道会员）", example="Fri Jan 01 08:00:00 CST 2021")
    private String dateTo;
    @ApiCloudField(value="查询页码(全渠道会员查询时此项为必填)", example="0", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小(最大分页1000，全渠道会员查询时此项为必填)", example="100", required=true)
    private Integer pageSize;
}
