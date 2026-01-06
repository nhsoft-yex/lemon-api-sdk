package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ReceiptOrderVO模型
 * 收款单VO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ReceiptOrderVOModel extends ApiCloudObject {

    @ApiCloudField(value="单据编号", example="RC0000820211102000001")
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
    @ApiCloudField(value="快速生成单据类型")
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
    @ApiCloudField(value="业务日期", example="Tue Nov 02 08:00:00 CST 2021")
    private String date;
    @ApiCloudField(value="创建时间")
    private String createAt;
    @ApiCloudField(value="创建人名称", example="管理员")
    private String createByName;
    @ApiCloudField(value="审核时间")
    private String auditAt;
    @ApiCloudField(value="审核人名称", example="管理员")
    private String auditByName;
    @ApiCloudField(value="支付流水号")
    private String payLogId;
    @ApiCloudField(value="收款冻结单号", example="2072")
    private String receiveApplyId;
    @ApiCloudField(value="外部支付单据号")
    private String receiptOrderId;
    @ApiCloudField(value="应收单号")
    private String receivableOrderId;
    @ApiCloudField(value="描述", example="描述信息")
    private String description;
    @ApiCloudField(value="关联单据号")
    private String refBillNo;
    @ApiCloudField(value="金额锁定", example="true")
    private Boolean amountLock;
    @ApiCloudField(value="要货单号（仅查询接口使用）", example="YH207256102051")
    private String requestOrderNo;
    @ApiCloudField(value="additional_information")
    private AdditionalInformationVOModel additionalInformation;
    @ApiCloudField(value="支付明细")
    private List<ReceiptPayLogVOModel> payLogs;
    @ApiCloudField(value="fund_pay_log")
    private FundPayLogVOModel fundPayLog;
}
