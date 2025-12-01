package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ItemAreaFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ItemAreaFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编码(一次最多500)", example="[20720001]", required=true)
    private List<Integer> itemNums;
    @ApiCloudField(value="单位列表", example="箱", required=true)
    private List<String> units;
}
