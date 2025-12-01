package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PurchaseGiftPromotionDetailSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PurchaseGiftPromotionDetailSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编码", example="2072121")
    private Integer itemNum;
    @ApiCloudField(value="商品计量单位", example="条")
    private String itemUnit;
    @ApiCloudField(value="商品订购数量", example="6.0")
    private BigDecimal useQty;
    @ApiCloudField(value="赠送商品编码", example="207210313")
    private Integer presentItemNum;
    @ApiCloudField(value="赠送数量(商品档案的采购单位)", example="6.0")
    private BigDecimal presentQty;
    @ApiCloudField(value="备注", example="")
    private String memo;
}
