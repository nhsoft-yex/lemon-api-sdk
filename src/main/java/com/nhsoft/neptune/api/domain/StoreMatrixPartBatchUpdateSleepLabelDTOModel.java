package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * StoreMatrixPartBatchUpdateSleepLabelDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class StoreMatrixPartBatchUpdateSleepLabelDTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品列表", example="434423634", required=true)
    private List<Integer> itemNums;
    @ApiCloudField(value="门店列表", example="99", required=true)
    private List<Integer> branchNums;
    @ApiCloudField(value="是否允许门店要货 0 不开启 1 不允许 2 允许", example="1")
    private Integer storeMatrixSleepFlag;
    @ApiCloudField(value="商品标签名称列表", example="品牌")
    private List<String> itemLabelNames;
}
