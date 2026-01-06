package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * GiftCardCreateWithBindDTO模型
 * 礼品卡创建并绑定参数
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class GiftCardCreateWithBindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="卡类型id", required=true)
    private Integer cardTypeId;
    @ApiCloudField(value="背景图片", required=true)
    private String cardFaceBackground;
    @ApiCloudField(value="用户id", required=true)
    private String customerId;
    @ApiCloudField(value="面值", required=true)
    private BigDecimal value;
    @ApiCloudField(value="购买金额", required=true)
    private BigDecimal purchaseMoney;
    @ApiCloudField(value="礼品卡卡号", required=true)
    private String cardPrintedNum;
    @ApiCloudField(value="到期日")
    private String expireTime;
    @ApiCloudField(value="绑卡密码", example="123456")
    private String cardPassword;
}
