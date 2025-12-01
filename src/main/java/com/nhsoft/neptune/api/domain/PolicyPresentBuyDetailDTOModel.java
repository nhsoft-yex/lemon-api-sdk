package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PolicyPresentBuyDetailDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PolicyPresentBuyDetailDTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编码", example="434420439", required=true)
    private Integer itemNum;
    @ApiCloudField(value="购买数量", example="1", required=true)
    private BigDecimal itemAmount;
    @ApiCloudField(value="明细备注", example="备注信息")
    private String itemMemo;
    @ApiCloudField(value="分级商品系统编码", example="434400015")
    private Integer itemGradeNum;
}
