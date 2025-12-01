package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosItemDistributionSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosItemDistributionSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="操作人", example="admin", required=true)
    private String operator;
    @ApiCloudField(value="商品属性明细", example="", required=true)
    private List<PosItemDistributionDetailSaveDTOModel> details;
}
