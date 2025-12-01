package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BranchItemKitDetailV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BranchItemKitDetailV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="明细商品编码", example="434422642")
    private Integer itemKitNum;
    @ApiCloudField(value="明细商品数量（小数点3位）", example="2.0")
    private BigDecimal itemKitAmount;
}
