package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * GiftCardCreateWithBindVO模型
 * 礼品卡创建并绑定响应参数
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class GiftCardCreateWithBindVOModel extends ApiCloudObject {

    @ApiCloudField(value="卡类型id", required=true)
    private Integer cardTypeId;
    @ApiCloudField(value="礼品卡id", required=true)
    private Long cardId;
    @ApiCloudField(value="到期日")
    private String expireTime;
    @ApiCloudField(value="背景图片", required=true)
    private String cardFaceBackground;
    @ApiCloudField(value="卡面编码", required=true)
    private String cardPrintedNum;
    @ApiCloudField(value="状态", required=true)
    private Integer stateCode;
    @ApiCloudField(value="卡余额", required=true)
    private BigDecimal balance;
    @ApiCloudField(value="用户手机号")
    private String phone;
    @ApiCloudField(value="卡密码")
    private String cardPassword;
}
