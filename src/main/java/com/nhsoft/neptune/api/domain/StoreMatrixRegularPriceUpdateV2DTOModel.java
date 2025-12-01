package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * StoreMatrixRegularPriceUpdateV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class StoreMatrixRegularPriceUpdateV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编码", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="操作人", example="管理员", required=true)
    private String operator;
    @ApiCloudField(value="明细(不能大于500条)", example="", required=true)
    private List<StoreMatrixRegularPriceUpdateV2DetailDTOModel> details;
}
