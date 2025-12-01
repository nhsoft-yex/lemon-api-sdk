package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CardDepositByOutTradeNoDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CardDepositByOutTradeNoDTOModel extends ApiCloudObject {

    @ApiCloudField(value="存款门店", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="卡编码", example="150200002", required=true)
    private Integer cardUserNum;
    @ApiCloudField(value="外部编号", example="207299203630600004", required=true)
    private String outTradeNo;
}
