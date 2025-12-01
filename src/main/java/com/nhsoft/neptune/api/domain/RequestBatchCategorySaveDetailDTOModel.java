package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * RequestBatchCategorySaveDetailDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RequestBatchCategorySaveDetailDTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品类别代码", example="", required=true)
    private String itemCategoryCode;
    @ApiCloudField(value="最低订购数量")
    private BigDecimal minOrderQty;
}
