package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BranchItemKitV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BranchItemKitV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="主商品编码", example="434422642")
    private Integer itemNum;
    @ApiCloudField(value="门店编码", example="99")
    private Integer branchNum;
    @ApiCloudField(value="组合商品明细", example="")
    private List<BranchItemKitDetailV2DTOModel> branchItemKitDetails;
}
