package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CardPhoneFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CardPhoneFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="用户手机号", example="185XXXXXXXX", required=true)
    private String userPhone;
    @ApiCloudField(value="是否默认卡", example="false")
    private Boolean defaultCard;
    @ApiCloudField(value="是否查询过期卡", example="false")
    private Boolean queryDeadlineCard;
}
