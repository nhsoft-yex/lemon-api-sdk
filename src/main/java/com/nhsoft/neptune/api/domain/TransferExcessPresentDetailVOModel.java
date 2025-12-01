package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * TransferExcessPresentDetailVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TransferExcessPresentDetailVOModel extends ApiCloudObject {

    @ApiCloudField(value="序号")
    private Integer transferExcessPresentDetailNum;
    @ApiCloudField(value="商品编号")
    private Integer itemNum;
    @ApiCloudField(value="商品名称", example="")
    private String itemName;
    @ApiCloudField(value="商品规格", example="")
    private String itemSpec;
    @ApiCloudField(value="订购数量")
    private BigDecimal reserveItemUseQty;
    @ApiCloudField(value="常用单位", example="")
    private String itemUseUnit;
    @ApiCloudField(value="赠品商品编号")
    private Integer presentItemNum;
    @ApiCloudField(value="赠品商品名称", example="")
    private String presentItemName;
    @ApiCloudField(value="赠品常用数量")
    private BigDecimal presentItemUseQty;
    @ApiCloudField(value="赠品常用单位", example="")
    private String presentItemUseUnit;
    @ApiCloudField(value="赠品限量常用数量")
    private BigDecimal giftLimitPresentItemUseQty;
    @ApiCloudField(value="剩余赠品限量常用数量")
    private BigDecimal residueLimitPresentItemUseQty;
    @ApiCloudField(value="批次号", example="")
    private String transferExcessPresentDetailLotNumber;
    @ApiCloudField(value="备注", example="")
    private String transferExcessPresentDetailMemo;
    @ApiCloudField(value="商品条码", example="")
    private String itemBarCode;
}
