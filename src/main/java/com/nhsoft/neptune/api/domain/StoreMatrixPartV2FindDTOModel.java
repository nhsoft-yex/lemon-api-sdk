package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * StoreMatrixPartV2FindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class StoreMatrixPartV2FindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编码列表", example="1", required=true)
    private List<Integer> branchNums;
    @ApiCloudField(value="商品编码列表", example="2")
    private List<Integer> itemNums;
    @ApiCloudField(value="查询页码", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小", example="10", required=true)
    private Integer pageSize;
}
