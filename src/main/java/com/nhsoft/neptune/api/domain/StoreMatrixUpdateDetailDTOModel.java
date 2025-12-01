package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * StoreMatrixUpdateDetailDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class StoreMatrixUpdateDetailDTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编码", example="1", required=true)
    private Integer itemNum;
    @ApiCloudField(value="门店配送价（小数点4位）", example="1.0", required=true)
    private BigDecimal itemTransferPrice;
    @ApiCloudField(value="是否允许经营", example="true")
    private Boolean storeMatrixManage;
}
