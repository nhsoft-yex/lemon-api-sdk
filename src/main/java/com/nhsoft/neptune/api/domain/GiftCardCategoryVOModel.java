package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * GiftCardCategoryVO模型
 * 礼品卡分组VO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class GiftCardCategoryVOModel extends ApiCloudObject {

    @ApiCloudField(value="分组id", example="17644219987", required=true)
    private Integer categoryId;
    @ApiCloudField(value="分组名称", example="17644219987", required=true)
    private String categoryName;
    @ApiCloudField(value="是否启用", example="true", required=true)
    private Boolean enable;
}
