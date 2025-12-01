package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosOrderSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosOrderSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="order_no")
    private String orderNo;
    @ApiCloudField(value="门店编码", example="1", required=true)
    private Integer branchNum;
    @ApiCloudField(value="班次号", example="22001", required=true)
    private Integer shiftTableNum;
    @ApiCloudField(value="营业日", example="20210601", required=true)
    private String shiftTableBizday;
    @ApiCloudField(value="开单时间", example="2021-01-19 10:00:00", required=true)
    private String orderDate;
    @ApiCloudField(value="销售员", example="管理员", required=true)
    private String orderSoldBy;
    @ApiCloudField(value="单据来源", example="社群团购")
    private String orderSource;
    @ApiCloudField(value="销售渠道(1:线下订单;2:线上-私域;3:线上-公域) 不传默认1", example="1")
    private Integer orderSaleChannel;
    @ApiCloudField(value="单据总额（小数点2位）", example="10.0", required=true)
    private BigDecimal orderTotalMoney;
    @ApiCloudField(value="折扣金额（小数点2位）", example="1.0", required=true)
    private BigDecimal orderDiscountMoney;
    @ApiCloudField(value="单据积分值（小数点2位）", example="1.0", required=true)
    private BigDecimal orderPoint;
    @ApiCloudField(value="应收金额（小数点2位）", example="10.0", required=true)
    private BigDecimal orderPaymentMoney;
    @ApiCloudField(value="经理折扣（小数点2位）", example="1.0", required=true)
    private BigDecimal orderMgrDiscountMoney;
    @ApiCloudField(value="四舍五入金额（小数点2位）", example="0.5", required=true)
    private BigDecimal orderRound;
    @ApiCloudField(value="收银员", example="管理员", required=true)
    private String orderOperator;
    @ApiCloudField(value="结账时间", example="2021-01-19 00:00:00", required=true)
    private String orderOperatorTime;
    @ApiCloudField(value="仓库编码", example="20720101")
    private Integer storehouseNum;
    @ApiCloudField(value="设备MAC地址", example="A0-C5-89-51-68-23", required=true)
    private String orderMachine;
    @ApiCloudField(value="关联单号", example="4200000063201802057497542368")
    private String orderRefBillno;
    @ApiCloudField(value="外部关联单号", example="A9918034145711UC")
    private String orderExternalNo;
    @ApiCloudField(value="备注", example="备注信息")
    private String orderMemo;
    @ApiCloudField(value="运费金额（运费需要加入单据金额、应收金额、收款金额、付款金额）", example="10.0")
    private BigDecimal orderPostFee;
    @ApiCloudField(value="单据明细", example="", required=true)
    private List<PosOrderDetailSaveDTOModel> details;
    @ApiCloudField(value="支付明细", example="", required=true)
    private List<PosOrderPaymentSaveDTOModel> payments;
}
