package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CardUserTypeConsumeMoneySummaryDTO模型
 * 会员卡类型消费金额汇总DTO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CardUserTypeConsumeMoneySummaryDTOModel extends ApiCloudObject {

    @ApiCloudField(value="储值卡ID", example="150200002")
    private Integer cardUserNum;
    @ApiCloudField(value="门店编码", example="99")
    private Integer branchNum;
    @ApiCloudField(value="类型代码", example="")
    private String cardUserTypeCode;
    @ApiCloudField(value="累计消费")
    private BigDecimal cardBalanceTotalConsume;
}
