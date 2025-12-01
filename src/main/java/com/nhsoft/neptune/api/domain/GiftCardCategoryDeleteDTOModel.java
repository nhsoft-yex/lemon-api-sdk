package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * GiftCardCategoryDeleteDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class GiftCardCategoryDeleteDTOModel extends ApiCloudObject {

    @ApiCloudField(value="分组id", example="17644219987", required=true)
    private Integer categoryId;
}
