package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SaleOrderUploadDTO模型
 * 第三方销售单上传
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SaleOrderUploadDTOModel extends ApiCloudObject {

    @ApiCloudField(value="平台订单号", example="A0000002", required=true)
    private String platformOrderId;
    @ApiCloudField(value="ERP门店ID（进销存线下门店编号）", example="99", required=true)
    private Integer erpStoreId;
    @ApiCloudField(value="订单商品明细列表", example="", required=true)
    private List<ShopOrderDetailDTOModel> orderItemList;
    @ApiCloudField(value="配送类型(0:未知；1：快递；2：到店自提；3：门店配送)", example="2", required=true)
    private Integer shippingType;
    @ApiCloudField(value="买家备注", example="")
    private String buyerMessage;
    @ApiCloudField(value="总金额，单位(分)", example="100", required=true)
    private Integer totalMoney;
    @ApiCloudField(value="折扣金额，单位(分)")
    private Integer discountMoney;
    @ApiCloudField(value="运费，单位(分)")
    private Integer postFeeMoney;
    @ApiCloudField(value="包装费，单位(分)")
    private Integer packageFeeMoney;
    @ApiCloudField(value="实付金额，单位(分)", example="100", required=true)
    private Integer paymentMoney;
    @ApiCloudField(value="平台门店ID", example="000001", required=true)
    private String platformShopId;
    @ApiCloudField(value="门店名", example="", required=true)
    private String storeName;
    @ApiCloudField(value="门店地址", example="", required=true)
    private String storeAddress;
    @ApiCloudField(value="商家收入，单位(分)", example="1000", required=true)
    private Integer income;
    @ApiCloudField(value="收货人姓名", example="", required=true)
    private String receiverName;
    @ApiCloudField(value="收货人地址", example="")
    private String receiverAddress;
    @ApiCloudField(value="收货人手机号", example="", required=true)
    private String receiverPhone;
    @ApiCloudField(value="收货地址纬度")
    private BigDecimal latitude;
    @ApiCloudField(value="收货地址经度")
    private BigDecimal longitude;
    @ApiCloudField(value="下单时间")
    private String createTime;
    @ApiCloudField(value="支付时间")
    private String payTime;
    @ApiCloudField(value="配送时间")
    private String consignTime;
    @ApiCloudField(value="预计到达时间")
    private String estimateArriveTime;
    @ApiCloudField(value="打包费，单位(分)")
    private Integer packagingFeeMoney;
}
