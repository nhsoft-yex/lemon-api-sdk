package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BranchItemSaleCeaseUpdateDetailDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BranchItemSaleCeaseUpdateDetailDTOModel extends ApiCloudObject {

    @ApiCloudField(value="branch_num", required=true)
    private Integer branchNum;
    @ApiCloudField(value="item_num", required=true)
    private Integer itemNum;
    @ApiCloudField(value="item_grade_num")
    private Integer itemGradeNum;
    @ApiCloudField(value="branch_item_sale_cease_flag")
    private Boolean branchItemSaleCeaseFlag;
}
