package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * InvoiceTicketBlueDetailSaveDTO模型
 * 商品明细
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class InvoiceTicketBlueDetailSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="赠品标记")
    private Boolean freeGiftFlag;
    @ApiCloudField(value="免税标记")
    private Boolean freeTaxFlag;
    @ApiCloudField(value="商品名称")
    private String goodsName;
    @ApiCloudField(value="商品代码")
    private String itemCode;
    @ApiCloudField(value="销项税率")
    private BigDecimal itemOutTax;
    @ApiCloudField(value="税收分类名称")
    private String itemTaxCategory;
    @ApiCloudField(value="税收分类编码")
    private String itemTaxCode;
    @ApiCloudField(value="税收开票显示单位")
    private String itemTaxUnitName;
    @ApiCloudField(value="商品数量")
    private BigDecimal num;
    @ApiCloudField(value="单价")
    private BigDecimal price;
    @ApiCloudField(value="总金额")
    private BigDecimal totalMoney;
    @ApiCloudField(value="单位")
    private String unit;
    @ApiCloudField(value="单价含税标志:0:不含税,1:含税")
    private String withTaxFlag;
    @ApiCloudField(value="零税率标识")
    private String zeroRateFlag;
}
