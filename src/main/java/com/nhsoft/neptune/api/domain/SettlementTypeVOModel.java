package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SettlementTypeVO模型
 * 结算方式VO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SettlementTypeVOModel extends ApiCloudObject {

    @ApiCloudField(value="结算方式编号", example="S00008000002")
    private String id;
    @ApiCloudField(value="结算方式名称", example="扫呗付款")
    private String name;
    @ApiCloudField(value="类别(CASH（现金）, CHANNEL(渠道), BANK（银行）)", example="CHANNEL")
    private String category;
    @ApiCloudField(value="描述", example="测试")
    private String description;
}
