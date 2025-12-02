package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * GiftCardVO模型
 * 礼品卡VO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class GiftCardVOModel extends ApiCloudObject {

    @ApiCloudField(value="到期日", example="Sat Aug 31 08:00:00 CST 2024")
    private String expireTime;
    @ApiCloudField(value="卡面背景", example="")
    private String cardFaceBackground;
    @ApiCloudField(value="表面卡号", example="209500000048000010")
    private String cardPrintedNum;
    @ApiCloudField(value="卡Id", example="1")
    private Long cardId;
    @ApiCloudField(value="卡状态代码（1：启用；2：转增中；3：已使用；4：已失效；5：已过期）", example="1")
    private Integer stateCode;
    @ApiCloudField(value="总余额", example="50.0")
    private BigDecimal balance;
    @ApiCloudField(value="手机号", example="17644219987")
    private String phone;
    @ApiCloudField(value="卡密码", example="123456")
    private String cardPassword;
    @ApiCloudField(value="卡面值", example="50.0")
    private BigDecimal value;
    @ApiCloudField(value="卡锁定", example="false")
    private Boolean cardLocked;
}
