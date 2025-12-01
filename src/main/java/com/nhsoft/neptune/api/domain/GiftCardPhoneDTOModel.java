package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * GiftCardPhoneDTO模型
 * 礼品卡手机号
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class GiftCardPhoneDTOModel extends ApiCloudObject {

    @ApiCloudField(value="手机号", example="17644219975")
    private String phone;
    @ApiCloudField(value="储值卡表面卡号", example="12345678", required=true)
    private String cardPrintedNum;
}
