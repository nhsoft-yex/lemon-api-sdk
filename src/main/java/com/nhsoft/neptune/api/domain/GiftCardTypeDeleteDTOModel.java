package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * GiftCardTypeDeleteDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class GiftCardTypeDeleteDTOModel extends ApiCloudObject {

    @ApiCloudField(value="类型id", example="1", required=true)
    private Integer typeId;
}
