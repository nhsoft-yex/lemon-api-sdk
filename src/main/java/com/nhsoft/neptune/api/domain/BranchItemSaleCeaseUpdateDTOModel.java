package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BranchItemSaleCeaseUpdateDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BranchItemSaleCeaseUpdateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="操作人", example="", required=true)
    private String operator;
    @ApiCloudField(value="门店商品明细", example="", required=true)
    private List<BranchItemSaleCeaseUpdateDetailDTOModel> branchItemDetail;
}
