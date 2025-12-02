package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * GiftCardLockDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class GiftCardLockDTOModel extends ApiCloudObject {

    @ApiCloudField(value="礼品卡id", required=true)
    private Long cardId;
    @ApiCloudField(value="操作门店", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="操作人", example="张三", required=true)
    private String operator;
}
