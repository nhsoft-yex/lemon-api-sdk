package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PointConvertDTO模型
 * 积分兑换物品DTO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PointConvertDTOModel extends ApiCloudObject {

    @ApiCloudField(value="物品编号", example="003")
    private String pointConvertNum;
    @ApiCloudField(value="物品名称", example="测试商品")
    private String pointConvertName;
    @ApiCloudField(value="积分要求", example="1")
    private BigDecimal pointConvertValue;
    @ApiCloudField(value="关联商品编号", example="2072001")
    private Integer pointConverItemNum;
    @ApiCloudField(value="关联商品名称", example="测试商品")
    private String pointConvertItemName;
    @ApiCloudField(value="应用门店列表")
    private List<BranchSimpleDTOModel> appliedBranchs;
    @ApiCloudField(value="应用于所有门店(该字段为true时，applied_branchs为空集合)")
    private Boolean applyAllBranch;
}
