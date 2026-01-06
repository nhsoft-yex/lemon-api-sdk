package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PointConvertSaveDTO模型
 * 积分兑换物品保存DTO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PointConvertSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="物品编号", example="003", required=true)
    private String pointConvertNum;
    @ApiCloudField(value="物品名称", example="测试商品", required=true)
    private String pointConvertName;
    @ApiCloudField(value="积分要求", example="1", required=true)
    private BigDecimal pointConvertValue;
    @ApiCloudField(value="关联商品编号", example="2072001")
    private Integer pointConverItemNum;
    @ApiCloudField(value="应用门店列表（该字段不填，则应用于所有门店）")
    private List<Integer> appliedBranchNums;
}
