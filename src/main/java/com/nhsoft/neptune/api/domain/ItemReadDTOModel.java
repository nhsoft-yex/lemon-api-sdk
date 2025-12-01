package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ItemReadDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ItemReadDTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编码", example="102200551", required=true)
    private Integer itemNum;
}
