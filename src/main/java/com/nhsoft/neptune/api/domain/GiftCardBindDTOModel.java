package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * GiftCardBindDTO模型
 * 礼品卡绑定DTO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class GiftCardBindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="礼品卡表面卡号", example="31207200000024000001", required=true)
    private String cardPrintedNum;
    @ApiCloudField(value="密码", example="123456", required=true)
    private String cardPassword;
    @ApiCloudField(value="手机号", example="17644219972", required=true)
    private String phone;
}
