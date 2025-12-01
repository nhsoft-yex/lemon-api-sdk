package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosItemKitSaveV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosItemKitSaveV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="组合明细商品明细编号", example="100005")
    private Integer kitItemNum;
    @ApiCloudField(value="数量（小数点3位）", example="10.0")
    private BigDecimal posItemKitAmount;
    @ApiCloudField(value="是否固定重量(固定重量：0 不固定重量：1)", example="1")
    private Integer posItemAmountUnFixed;
}
