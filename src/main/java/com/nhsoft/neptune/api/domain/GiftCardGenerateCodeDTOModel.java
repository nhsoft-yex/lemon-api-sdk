package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * GiftCardGenerateCodeDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class GiftCardGenerateCodeDTOModel extends ApiCloudObject {

    @ApiCloudField(value="用户id", example="", required=true)
    private String customerId;
    @ApiCloudField(value="卡ID", required=true)
    private Long cardId;
}
