package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CardUserTypeRevokeMoneySummaryDTO模型
 * 会员卡类型回收金额汇总DTO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CardUserTypeRevokeMoneySummaryDTOModel extends ApiCloudObject {

    @ApiCloudField(value="储值卡ID", example="150200002")
    private Integer cardUserNum;
    @ApiCloudField(value="门店编码", example="99")
    private Integer branchNum;
    @ApiCloudField(value="类型代码")
    private String cardUserTypeCode;
    @ApiCloudField(value="累计存款")
    private BigDecimal cardBalanceTotalRevoke;
}
