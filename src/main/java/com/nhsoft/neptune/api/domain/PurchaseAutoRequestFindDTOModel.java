package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PurchaseAutoRequestFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PurchaseAutoRequestFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编码", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="商品编码数组,限制100条", example="434400001")
    private List<Integer> itemNums;
}
