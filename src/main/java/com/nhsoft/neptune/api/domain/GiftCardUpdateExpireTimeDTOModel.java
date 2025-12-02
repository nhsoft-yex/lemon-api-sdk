package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * GiftCardUpdateExpireTimeDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class GiftCardUpdateExpireTimeDTOModel extends ApiCloudObject {

    @ApiCloudField(value="到期时间")
    private String expireTime;
    @ApiCloudField(value="礼品卡id", example="1", required=true)
    private Long cardId;
    @ApiCloudField(value="操作人", example="admin", required=true)
    private String operator;
}
