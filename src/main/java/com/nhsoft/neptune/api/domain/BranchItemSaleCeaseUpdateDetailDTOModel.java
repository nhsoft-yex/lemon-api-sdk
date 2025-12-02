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

    @ApiCloudField(value="门店编号", required=true)
    private Integer branchNum;
    @ApiCloudField(value="商品编号", required=true)
    private Integer itemNum;
    @ApiCloudField(value="商品分级编号")
    private Integer itemGradeNum;
    @ApiCloudField(value="停售标记", example="false")
    private Boolean branchItemSaleCeaseFlag;
}
