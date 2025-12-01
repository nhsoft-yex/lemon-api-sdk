package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WholesaleReturnVO模型
 * 批发退货
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WholesaleReturnVOModel extends ApiCloudObject {

    @ApiCloudField(value="批发退货单号", example="WR2072010000002")
    private String wholesaleReturnFid;
    @ApiCloudField(value="门店编码", example="99")
    private Integer branchNum;
    @ApiCloudField(value="仓库编码", example="203000002")
    private Integer storehouseNum;
    @ApiCloudField(value="客户编号", example="0015005990000001")
    private String clientFid;
    @ApiCloudField(value="创建人", example="管理员")
    private String wholesaleReturnCreator;
    @ApiCloudField(value="退货日期", example="2021-01-18")
    private String wholesaleReturnDate;
    @ApiCloudField(value="备注", example="备注信息")
    private String wholesaleReturnMemo;
    @ApiCloudField(value="外部流水号", example="A0001")
    private String wholesaleReturnOutBillNo;
    @ApiCloudField(value="销售员", example="管理员")
    private String wholesaleReturnSeller;
    @ApiCloudField(value="创建时间")
    private String wholesaleReturnCreateTime;
    @ApiCloudField(value="审核人", example="管理员")
    private String wholesaleReturnAuditor;
    @ApiCloudField(value="审核时间")
    private String wholesaleReturnAuditTime;
    @ApiCloudField(value="状态代码", example="1")
    private Integer wholesaleReturnStateCode;
    @ApiCloudField(value="状态名称", example="制单")
    private String wholesaleReturnStateName;
    @ApiCloudField(value="订单金额（小数点2位）", example="5.0")
    private BigDecimal wholesaleReturnTotalMoney;
    @ApiCloudField(value="批发销售单号", example="WO2030990000008")
    private String wholesaleOrderFid;
    @ApiCloudField(value="结算标志", example="已结算")
    private String wholesaleReturnSettlementState;
    @ApiCloudField(value="结算时间")
    private String wholesaleReturnSettlementTime;
    @ApiCloudField(value="折扣金额", example="0.0")
    private BigDecimal wholesaleReturnDiscountMoney;
    @ApiCloudField(value="已付金额", example="240.0")
    private BigDecimal wholesaleReturnPaidMoney;
    @ApiCloudField(value="订单明细")
    private List<WholesaleReturnDetailDTOModel> wholesaleReturnDetails;
}
