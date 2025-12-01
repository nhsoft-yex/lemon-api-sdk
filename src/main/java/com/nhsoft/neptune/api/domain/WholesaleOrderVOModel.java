package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WholesaleOrderVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WholesaleOrderVOModel extends ApiCloudObject {

    @ApiCloudField(value="批发销售单号", example="WO2030990000008")
    private String wholesaleOrderFid;
    @ApiCloudField(value="门店编码", example="99")
    private Integer branchNum;
    @ApiCloudField(value="客户编号", example="0015005990000001")
    private String clientFid;
    @ApiCloudField(value="仓库编码", example="203000002")
    private Integer storehouseNum;
    @ApiCloudField(value="配送方式", example="")
    private String wholesaleOrderTransferType;
    @ApiCloudField(value="创建人", example="管理员")
    private String wholesaleOrderCreator;
    @ApiCloudField(value="销售日期", example="2021-01-18")
    private String wholesaleOrderDate;
    @ApiCloudField(value="备注", example="备注信息")
    private String wholesaleOrderMemo;
    @ApiCloudField(value="外部流水号", example="A0001")
    private String wholesaleOrderOutBillNo;
    @ApiCloudField(value="销售员", example="管理员")
    private String wholesaleOrderSeller;
    @ApiCloudField(value="创建时间", example="2021-01-18 00:00:00")
    private String wholesaleOrderCreateTime;
    @ApiCloudField(value="审核人", example="管理员")
    private String wholesaleOrderAuditor;
    @ApiCloudField(value="审核时间", example="2021-01-18 00:00:00")
    private String wholesaleOrderAuditTime;
    @ApiCloudField(value="状态代码")
    private Integer wholesaleOrderStateCode;
    @ApiCloudField(value="状态名称", example="")
    private String wholesaleOrderStateName;
    @ApiCloudField(value="付款方式", example="")
    private String wholesaleOrderPayType;
    @ApiCloudField(value="订单金额（小数点2位）")
    private BigDecimal wholesaleOrderTotalMoney;
    @ApiCloudField(value="关联订单号", example="")
    private String wholesaleBookFids;
    @ApiCloudField(value="扩展属性1", example="扩展属性1")
    private String wholesaleOrderExtend1;
    @ApiCloudField(value="扩展属性2", example="扩展属性2")
    private String wholesaleOrderExtend2;
    @ApiCloudField(value="扩展属性3", example="扩展属性3")
    private String wholesaleOrderExtend3;
    @ApiCloudField(value="结算客户编号", example="004344990000347")
    private String settlementClientFid;
    @ApiCloudField(value="最后修改时间", example="2021-01-20 00:00:00")
    private String wholesaleOrderLastEditTime;
    @ApiCloudField(value="结算标志", example="已结算")
    private String wholesaleOrderSettlementState;
    @ApiCloudField(value="结算时间", example="2024-05-11 10:37:12")
    private String wholesaleOrderSettlementTime;
    @ApiCloudField(value="折扣金额", example="0.0")
    private BigDecimal wholesaleOrderDiscountMoney;
    @ApiCloudField(value="已付金额", example="240.0")
    private BigDecimal wholesaleOrderPaidMoney;
    @ApiCloudField(value="成本金额", example="240.0")
    private BigDecimal wholesaleOrderCostMoney;
    @ApiCloudField(value="拣货日期", example="2024-10-01 00:00:00")
    private String wholesaleOrderPickingTime;
    @ApiCloudField(value="订单明细", example="")
    private List<WholesaleOrderDetailDTOModel> wholesaleOrderDetails;
}
