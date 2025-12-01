package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BranchItemKitFindV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BranchItemKitFindV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编码", example="99")
    private Integer branchNum;
    @ApiCloudField(value="商品编码", example="434422642")
    private List<Integer> itemNums;
}
