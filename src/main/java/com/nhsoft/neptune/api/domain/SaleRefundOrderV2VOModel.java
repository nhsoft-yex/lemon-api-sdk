package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SaleRefundOrderV2VO模型
 * 退款订单
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SaleRefundOrderV2VOModel extends ApiCloudObject {

    @ApiCloudField(value="单据ID", example="WE1221222000001")
    private String orderId;
    @ApiCloudField(value="退货单据ID", example="RW55230801000060")
    private String refundId;
    @ApiCloudField(value="单据状态", example="PAID")
    private String orderState;
    @ApiCloudField(value="提货门店编码")
    private Integer pickBranchNum;
    @ApiCloudField(value="提货门店ID")
    private Long pickBranchId;
    @ApiCloudField(value="提货门店代码", example="")
    private String pickBranchCode;
    @ApiCloudField(value="提货门店名称", example="")
    private String pickBranchName;
    @ApiCloudField(value="提货门店地址", example="")
    private String pickBranchAddress;
    @ApiCloudField(value="提货地址", example="")
    private String pickAddress;
    @ApiCloudField(value="提货方式", example="")
    private String pickType;
    @ApiCloudField(value="收件人名称", example="")
    private String pickName;
    @ApiCloudField(value="收件人手机", example="")
    private String pickPhone;
    @ApiCloudField(value="会员ID")
    private Long memberId;
    @ApiCloudField(value="会员名称", example="")
    private String memberName;
    @ApiCloudField(value="会员手机号", example="")
    private String memberPhone;
    @ApiCloudField(value="支付方式列表", example="")
    private List<String> payTypes;
    @ApiCloudField(value="订单类型", example="")
    private String orderType;
    @ApiCloudField(value="使用积分")
    private BigDecimal point;
    @ApiCloudField(value="备注", example="18381153")
    private String orderMemo;
    @ApiCloudField(value="运费")
    private BigDecimal deliverFeeMoney;
    @ApiCloudField(value="包装费")
    private BigDecimal packageFeeMoney;
    @ApiCloudField(value="退款金额", example="1.0")
    private BigDecimal refundMoney;
    @ApiCloudField(value="订单明细", example="")
    private List<SaleRefundOrderDetailV2VOModel> orderDetails;
    @ApiCloudField(value="创建时间", example="")
    private String createdAt;
    @ApiCloudField(value="完成时间", example="")
    private String finishedAt;
    @ApiCloudField(value="原因", example="")
    private String reason;
}
