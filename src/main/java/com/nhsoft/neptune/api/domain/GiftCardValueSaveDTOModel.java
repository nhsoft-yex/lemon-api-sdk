package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * GiftCardValueSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class GiftCardValueSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="面值金额", example="10", required=true)
    private BigDecimal value;
    @ApiCloudField(value="购买金额", example="8", required=true)
    private BigDecimal purchaseMoney;
}
