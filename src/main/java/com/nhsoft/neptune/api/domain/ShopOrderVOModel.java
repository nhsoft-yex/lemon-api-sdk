package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ShopOrderVO模型
 * 商城订单
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ShopOrderVOModel extends ApiCloudObject {

    @ApiCloudField(value="单据id", example="18381153")
    private Integer orderId;
    @ApiCloudField(value="订单号", example="ME716304903882525268024940")
    private String orderNumber;
    @ApiCloudField(value="订单类型", example="SHOP")
    private String orderType;
    @ApiCloudField(value="订单金额", example="1.0")
    private BigDecimal money;
    @ApiCloudField(value="支付方式", example="会员卡支付")
    private String payType;
    @ApiCloudField(value="支付金额", example="1.0")
    private BigDecimal payMoney;
    @ApiCloudField(value="支付时间", example="2021-01-07 00:00:00")
    private String payTime;
    @ApiCloudField(value="下单门店ID", example="27894")
    private Integer storeId;
    @ApiCloudField(value="下单门店名称", example="扬帆店")
    private String storeName;
    @ApiCloudField(value="配送方式", example="门店自提")
    private String transportType;
    @ApiCloudField(value="买家姓名", example="姓名")
    private String buyerName;
    @ApiCloudField(value="买家手机号", example="185XXXXXXXX")
    private String buyerPhone;
    @ApiCloudField(value="买家地址", example="浙江省宁波市")
    private String buyerAddr;
    @ApiCloudField(value="买家留言", example="留言信息")
    private String message;
    @ApiCloudField(value="提货时间段/期望送达时间段", example="09-01 15:00-16:00")
    private String expectedDeliveryTime;
    @ApiCloudField(value="单据状态", example="已完成")
    private String orderState;
    @ApiCloudField(value="明细", example="")
    private List<ShopOrderDetailRespDTOModel> orderDetails;
}
