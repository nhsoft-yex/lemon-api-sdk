package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * GiftCardBatchInvalidDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class GiftCardBatchInvalidDTOModel extends ApiCloudObject {

    @ApiCloudField(value="卡ID列表", example="[1,2]", required=true)
    private List<Long> cardIds;
}
