package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * StoreItemClientFindDTO模型
 * 客户批发价查询参数
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class StoreItemClientFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="客户编码", example="002072990000117", required=true)
    private List<String> clientFids;
    @ApiCloudField(value="商品编码", example="20720401", required=true)
    private List<Integer> itemNums;
    @ApiCloudField(value="门店编码", example="99", required=true)
    private Integer branchNum;
}
