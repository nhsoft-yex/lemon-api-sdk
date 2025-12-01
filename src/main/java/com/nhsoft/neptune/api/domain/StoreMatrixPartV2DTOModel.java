package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * StoreMatrixPartV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class StoreMatrixPartV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编码", example="434423634")
    private Integer itemNum;
    @ApiCloudField(value="门店编码", example="99")
    private Integer branchNum;
    @ApiCloudField(value="是否允许经营", example="true")
    private Boolean storeMatrixManage;
    @ApiCloudField(value="是否允许门店要货 0 不开启 1 不允许 2 允许", example="1")
    private Integer storeMatrixSleepFlag;
    @ApiCloudField(value="是否允许门店退货", example="true")
    private Boolean storeMatrixTransferReturn;
    @ApiCloudField(value="采购范围(空字符串|不限|总部购配|门店采购|总订店收)", example="门店采购")
    private String storeMatrixPurchaseScope;
    @ApiCloudField(value="是否允许采购 0 不开启 1 不允许 2 允许", example="2")
    private Integer storeMatrixStockCeaseFlag;
    @ApiCloudField(value="是否允许采购退货", example="true")
    private Boolean storeMatrixPurchaseReturn;
    @ApiCloudField(value="是否允许前台销售 0 不开启 1 不允许 2 允许", example="1")
    private Integer storeMatrixSaleCeaseFlag;
    @ApiCloudField(value="是否允许前台议价 0 不开启  1 不允许 2 允许", example="1")
    private Integer storeMatrixPosChangePriceFlag;
    @ApiCloudField(value="是否负库存允许销售 0 不开启  1 不允许 2 允许", example="1")
    private Integer storeMatrixSaleNoStoreItem;
    @ApiCloudField(value="是否允许门店调价 0 不开启  1 不允许 2 允许", example="1")
    private Integer storeMatrixPriceAdj;
    @ApiCloudField(value="允许前台折扣 0 不开启  1 不允许 2 允许", example="1")
    private Integer storeMatrixPosDiscount;
    @ApiCloudField(value="商品", example="1")
    private List<PosItemLabelDTOModel> itemLabelList;
}
