package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ItemBranchFindV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ItemBranchFindV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="查询页码", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小", required=true)
    private Integer pageSize;
    @ApiCloudField(value="商品编码", example="")
    private List<Integer> itemNums;
    @ApiCloudField(value="门店编码", example="", required=true)
    private List<Integer> branchNums;
}
