package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ItemCategoryDeleteDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ItemCategoryDeleteDTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品类别代码列表", example="011", required=true)
    private List<String> categoryCodes;
}
