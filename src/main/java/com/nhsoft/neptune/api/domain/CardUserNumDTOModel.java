package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CardUserNumDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CardUserNumDTOModel extends ApiCloudObject {

    @ApiCloudField(value="查询页码", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小(最大为100)", example="1", required=true)
    private Integer pageSize;
    @ApiCloudField(value="会员卡编码", example="150200002")
    private Integer cardUserNum;
    @ApiCloudField(value="是否查询过期卡", example="false")
    private Boolean queryDeadlineCard;
    @ApiCloudField(value="是否查询回收卡", example="false")
    private Boolean queryRevokeCard;
    @ApiCloudField(value="初始时间")
    private String dateFrom;
    @ApiCloudField(value="结束时间")
    private String dateTo;
    @ApiCloudField(value="门店编码", example="99")
    private Integer branchNum;
    @ApiCloudField(value="0、待结算</br>1、已生成应收单</br>2、已结算", example="0")
    private Integer settlementState;
    @ApiCloudField(value="会员卡类型", example="99")
    private String cardTypeCodes;
    @ApiCloudField(value="支付方式", example="现金")
    private String paymentType;
    @ApiCloudField(value="外部编号", example="207299203630600004")
    private String outTradeNo;
}
