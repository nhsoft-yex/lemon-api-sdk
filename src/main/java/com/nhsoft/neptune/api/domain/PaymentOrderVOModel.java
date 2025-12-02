package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PaymentOrderVO模型
 * 付款单VO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PaymentOrderVOModel extends ApiCloudObject {

    @ApiCloudField(value="ID", example="PC0000820200617000001")
    private String id;
    @ApiCloudField(value="应用id", example="8")
    private String appId;
    @ApiCloudField(value="AMA应用id", example="2072")
    private String amaAppId;
    @ApiCloudField(value="目标账号ID", example="F00008000965")
    private String dstAccountId;
    @ApiCloudField(value="目标单位ID", example="R00008000368")
    private String dstUnitId;
    @ApiCloudField(value="目标组织ID", example="G00008000976")
    private String dstGroupId;
    @ApiCloudField(value="源账号ID", example="F00008000001")
    private String srcAccountId;
    @ApiCloudField(value="源单位ID", example="R00008000368")
    private String srcUnitId;
    @ApiCloudField(value="源组织ID", example="G00008000001")
    private String srcGroupId;
    @ApiCloudField(value="业务类型", example="商品")
    private String businessType;
    @ApiCloudField(value="快速生成单据类型", example="")
    private String quickOrderType;
    @ApiCloudField(value="支付方式", example="现金")
    private String settlementType;
    @ApiCloudField(value="应收金额(小数2位)", example="1.0")
    private BigDecimal totalAmount;
    @ApiCloudField(value="未收款金额(小数2位)", example="1.0")
    private BigDecimal amount;
    @ApiCloudField(value="手续费(小数2位)", example="0.0")
    private BigDecimal fee;
    @ApiCloudField(value="状态", example="AUDITED")
    private String state;
    @ApiCloudField(value="业务日期", example="2021-11-02")
    private String date;
    @ApiCloudField(value="创建时间", example="2021-11-02 08:54:45")
    private String createAt;
    @ApiCloudField(value="创建人名称", example="管理员")
    private String createByName;
    @ApiCloudField(value="审核时间", example="2021-11-02 08:54:45")
    private String auditAt;
    @ApiCloudField(value="审核人名称", example="管理员")
    private String auditByName;
    @ApiCloudField(value="支付流水号", example="")
    private String payLogId;
    @ApiCloudField(value="应付单号", example="PN0000820200617000001")
    private String payableOrderId;
    @ApiCloudField(value="应收单号", example="")
    private String receivableOrderId;
    @ApiCloudField(value="描述", example="描述信息")
    private String description;
    @ApiCloudField(value="金额锁定", example="true")
    private Boolean amountLock;
    @ApiCloudField(value="fund_pay_log")
    private FundPayLogVOModel fundPayLog;
}
