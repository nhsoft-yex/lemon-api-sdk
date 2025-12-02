package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ShopOrderDetailDTO模型
 * 订单商品明细列表
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ShopOrderDetailDTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品名称", example="", required=true)
    private String productName;
    @ApiCloudField(value="商品ID", example="", required=true)
    private String productId;
    @ApiCloudField(value="规格ID", example="", required=true)
    private String specId;
    @ApiCloudField(value="ERP商品ID", example="", required=true)
    private String erpProductId;
    @ApiCloudField(value="规格名称", example="", required=true)
    private String specName;
    @ApiCloudField(value="单价(单位分)", example="100", required=true)
    private Integer price;
    @ApiCloudField(value="规格编码", example="UPC123456789", required=true)
    private String upc;
    @ApiCloudField(value="基本销售单位数量，单位(KG)", example="1", required=true)
    private BigDecimal baseUnitNum;
    @ApiCloudField(value="商品属性", example="黑色", required=true)
    private String skuFeatures;
    @ApiCloudField(value="商品金额，单位(分)", example="1000", required=true)
    private Integer totalMoney;
    @ApiCloudField(value="优惠金额，单位(分))")
    private Integer discountMoney;
    @ApiCloudField(value="实付，单位(分)", example="1000", required=true)
    private Integer paymentMoney;
    @ApiCloudField(value="商品数量", example="10", required=true)
    private Integer amount;
    @ApiCloudField(value="图片列表，可为空", example="")
    private String imageUrl;
    @ApiCloudField(value="主图，可为空", example="")
    private String thumbUrl;
}
