package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MarketActionFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MarketActionFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="时间类型(制单时间|审核时间|活动时间)", example="制单时间", required=true)
    private String dateType;
    @ApiCloudField(value="开始日期", example="Sat Mar 01 08:00:00 CST 2025", required=true)
    private String dateFrom;
    @ApiCloudField(value="结束日期", example="Tue Mar 04 08:00:00 CST 2025", required=true)
    private String dateTo;
    @ApiCloudField(value="time_from")
    private LocalTimeModel timeFrom;
    @ApiCloudField(value="time_to")
    private LocalTimeModel timeTo;
    @ApiCloudField(value="活动类型(POS-POS消费赠券;DEPOSIT-卡存款赠券;LOTTERY-POS消费赠抽奖次数)", example="POS消费赠券")
    private String actionType;
    @ApiCloudField(value="状态(1-制单;3-制单|审核;7-制单|审核|作废)", example="[1]")
    private List<Integer> stateCodes;
    @ApiCloudField(value="是否过期", example="true")
    private Boolean expired;
    @ApiCloudField(value="是否生效", example="true")
    private Boolean effective;
    @ApiCloudField(value="查询页码 从1开始", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小", example="10", required=true)
    private Integer pageSize;
    @ApiCloudField(value="是否包含新版本(true:新老版本数据都返回；false:仅返回老版本数据)(不传默认为false)", example="true")
    private Boolean withNewVersion;
}
