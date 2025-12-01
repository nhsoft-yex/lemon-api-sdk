package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CardLossReqDTO模型
 * 储值卡挂失请求参数
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CardLossReqDTOModel extends ApiCloudObject {

    @ApiCloudField(value="储值卡编码", example="150200002", required=true)
    private Integer cardUserNum;
    @ApiCloudField(value="操作人", example="管理员", required=true)
    private String cardLossOperator;
    @ApiCloudField(value="门店编码", example="1", required=true)
    private Integer branchNum;
    @ApiCloudField(value="备注", example="无")
    private String cardLossMemo;
}
