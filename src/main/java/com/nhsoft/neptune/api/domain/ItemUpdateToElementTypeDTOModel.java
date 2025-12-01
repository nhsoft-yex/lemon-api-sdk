package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ItemUpdateToElementTypeDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ItemUpdateToElementTypeDTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编码", example="43440001", required=true)
    private Integer itemNum;
    @ApiCloudField(value="操作人", example="管理员")
    private String operator;
}
