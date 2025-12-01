package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * TransferExcessPresentGiftVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TransferExcessPresentGiftVOModel extends ApiCloudObject {

    @ApiCloudField(value="序号")
    private Integer transferExcessPresentGiftNum;
    @ApiCloudField(value="商品编号")
    private Integer itemNum;
    @ApiCloudField(value="赠品单位", example="")
    private String presentItemUseUnit;
    @ApiCloudField(value="赠送数量")
    private BigDecimal presentItemUseQty;
    @ApiCloudField(value="赠送上限常用数量")
    private BigDecimal giftLimitPresentItemUseQty;
    @ApiCloudField(value="剩余赠品限量常用数量")
    private BigDecimal residueLimitPresentItemUseQty;
    @ApiCloudField(value="备注", example="")
    private String transferExcessPresentGiftMemo;
    @ApiCloudField(value="商品条码", example="")
    private String itemBarCode;
}
