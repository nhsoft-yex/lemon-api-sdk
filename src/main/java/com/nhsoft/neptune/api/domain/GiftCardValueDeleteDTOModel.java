package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * GiftCardValueDeleteDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class GiftCardValueDeleteDTOModel extends ApiCloudObject {

    @ApiCloudField(value="面值id", example="1", required=true)
    private Integer valueId;
}
