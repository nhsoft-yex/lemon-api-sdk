package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * GiftCardReadDTO模型
 * 礼品卡读取请求参数
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class GiftCardReadDTOModel extends ApiCloudObject {

    @ApiCloudField(value="礼品卡表面卡号", example="31207200000024000001")
    private String cardPrintedNum;
    @ApiCloudField(value="付款码", example="31207200000024000001")
    private String code;
}
