package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SaleOrderV2VO模型
 * 订单查询
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SaleOrderV2VOModel extends ApiCloudObject {

    @ApiCloudField(value="单据ID", example="WE1221222000001")
    private String orderId;
    @ApiCloudField(value="单据状态", example="PAID")
    private String orderState;
    @ApiCloudField(value="订退款状态(NONE：未退款|REFUNDING：退款中|PART：部分退款|ALL：已退款)", example="NONE")
    private String refundedState;
    @ApiCloudField(value="下单门店ID")
    private Long branchId;
    @ApiCloudField(value="下单门店编码")
    private Integer branchNum;
    @ApiCloudField(value="下单门店代码", example="")
    private String branchCode;
    @ApiCloudField(value="下单门店名称", example="")
    private String branchName;
    @ApiCloudField(value="提货门店ID")
    private Long pickBranchId;
    @ApiCloudField(value="提货门店编码")
    private Integer pickBranchNum;
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
    @ApiCloudField(value="会员昵称", example="")
    private String memberName;
    @ApiCloudField(value="会员姓名", example="")
    private String memberName2;
    @ApiCloudField(value="会员手机号", example="")
    private String memberPhone;
    @ApiCloudField(value="支付方式列表", example="")
    private List<String> payTypes;
    @ApiCloudField(value="订单类型", example="")
    private String orderType;
    @ApiCloudField(value="使用积分")
    private BigDecimal point;
    @ApiCloudField(value="订单备注", example="18381153")
    private String orderMemo;
    @ApiCloudField(value="订单金额", example="1.0")
    private BigDecimal orderTotalMoney;
    @ApiCloudField(value="包装费")
    private BigDecimal packageFeeMoney;
    @ApiCloudField(value="运费")
    private BigDecimal deliverFeeMoney;
    @ApiCloudField(value="折扣金额")
    private BigDecimal orderDiscountMoney;
    @ApiCloudField(value="订单应收金额", example="1.0")
    private BigDecimal orderPaymentMoney;
    @ApiCloudField(value="买家实付金额")
    private BigDecimal buyerPayMoney;
    @ApiCloudField(value="商家实收金额")
    private BigDecimal receiptMoney;
    @ApiCloudField(value="退款金额")
    private BigDecimal refundMoney;
    @ApiCloudField(value="订单明细", example="")
    private List<SaleOrderDetailV2VOModel> orderDetails;
    @ApiCloudField(value="创建时间", example="")
    private String createdAt;
    @ApiCloudField(value="关闭时间", example="")
    private String closedAt;
    @ApiCloudField(value="付款时间", example="")
    private String paidAt;
    @ApiCloudField(value="提货开始时间", example="")
    private String pickStart;
    @ApiCloudField(value="提货结束时间", example="")
    private String pickEnd;
    @ApiCloudField(value="完成时间", example="")
    private String finishedAt;
}
