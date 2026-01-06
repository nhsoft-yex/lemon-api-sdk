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

    @ApiCloudField(value="operator", required=true)
    private String operator;
    @ApiCloudField(value="branch_item_detail", required=true)
    private List<BranchItemSaleCeaseUpdateDetailDTOModel> branchItemDetail;
}
