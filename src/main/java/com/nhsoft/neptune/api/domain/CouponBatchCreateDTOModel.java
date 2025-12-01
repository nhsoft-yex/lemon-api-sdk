package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CouponBatchCreateDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CouponBatchCreateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="消费券类型名称", example="满减券")
    private String ticketName;
    @ApiCloudField(value="消费券类型代码（ticket_name 和 ticket_code不能同时为空）", example="111")
    private String ticketCode;
    @ApiCloudField(value="发券人", example="管理员", required=true)
    private String operator;
    @ApiCloudField(value="第三方单据编号  用于撤销消费券发放(也可用作发券幂等)", example="52001201931190008", required=true)
    private String outTradeNo;
    @ApiCloudField(value="券明细(最大数量为1000)", example="", required=true)
    private List<CouponBatchCreateDetailDTOModel> couponDetails;
}
