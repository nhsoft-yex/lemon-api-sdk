package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SupplierSaveV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SupplierSaveV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="所属门店编码", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="供应商代码", example="SP012", required=true)
    private String supplierCode;
    @ApiCloudField(value="供应商名称", example="江浙水产", required=true)
    private String supplierName;
    @ApiCloudField(value="速记码", example="JZSC", required=true)
    private String supplierPin;
    @ApiCloudField(value="供应商类型", example="默认供应商类别", required=true)
    private String supplierKind;
    @ApiCloudField(value="税务号", example="2342234251232567")
    private String supplierTaxNo;
    @ApiCloudField(value="进项税率", example="0.13")
    private BigDecimal supplierTax;
    @ApiCloudField(value="supplier_bank")
    private String supplierBank;
    @ApiCloudField(value="supplier_bank_account_name")
    private String supplierBankAccountName;
    @ApiCloudField(value="supplier_bank_account")
    private String supplierBankAccount;
    @ApiCloudField(value="联系人", example="王先生")
    private String supplierLinkman;
    @ApiCloudField(value="联系人电话", example="18888888882")
    private String supplierLinktel;
    @ApiCloudField(value="电话号码", example="18388888888")
    private String supplierPhone;
    @ApiCloudField(value="传真", example="2342231452")
    private String supplierFax;
    @ApiCloudField(value="邮编", example="100000")
    private String supplierPostcode;
    @ApiCloudField(value="电子邮箱", example="123456@qq.com")
    private String supplierEmail;
    @ApiCloudField(value="地址", example="南京市建邺区")
    private String supplierAddr;
    @ApiCloudField(value="结算方式(临时指定、指定帐期、指定账期、指定日期、货到付款、款到发货)", example="临时指定", required=true)
    private String supplierSettlementType;
    @ApiCloudField(value="月结日期", example="10")
    private Integer supplierSettleDayOfMonth;
    @ApiCloudField(value="结转周期", example="30")
    private Integer supplierSettlePeriod;
    @ApiCloudField(value="经营方式（购销/联营/代销）", example="购销")
    private String supplierMethod;
    @ApiCloudField(value="结算模式(所属门店结算、业务发生门店结算)", example="所属门店结算", required=true)
    private String supplierSettlementModel;
    @ApiCloudField(value="采购周期", example="30", required=true)
    private Integer supplierPurchasePeriod;
    @ApiCloudField(value="采购周期（天，周，月）", example="天", required=true)
    private String supplierPurchasePeriodUnit;
    @ApiCloudField(value="首次/上次采购时间(yyyy-MM-dd)", example="2021-01-01")
    private String supplierPurchaseDate;
    @ApiCloudField(value="交货期限")
    private Integer supplierPurchaseDeadline;
    @ApiCloudField(value="是否共享（1共享，0不共享）", example="1", required=true)
    private Integer supplierShared;
    @ApiCloudField(value="是否启用（1启用，0不启用）", example="1", required=true)
    private Integer supplierActived;
    @ApiCloudField(value="网址", example="www.baidu.com")
    private String supplierSite;
    @ApiCloudField(value="退货单需确认后才允许审核（1启用，0不启用）", example="1")
    private Integer returnOrderConfirmFlag;
    @ApiCloudField(value="备注", example="测试备注")
    private String supplierMemo;
    @ApiCloudField(value="起订金额", example="2.25")
    private BigDecimal supplierMinOrderMoney;
    @ApiCloudField(value="起订金额校验类型；0禁止，1提醒", example="0")
    private Integer supplierMinMoneyType;
    @ApiCloudField(value="对账基数(月结|半月结|自定义)", example="自定义")
    private String supplierReconBase;
    @ApiCloudField(value="对账天数", example="10")
    private Integer supplierReconDay;
    @ApiCloudField(value="启用对账", example="true")
    private Boolean supplierRecon;
    @ApiCloudField(value="是否启用滚单结算", example="true")
    private Boolean supplierRollingOrder;
    @ApiCloudField(value="运费金额", example="10.0")
    private BigDecimal supplierCarriage;
    @ApiCloudField(value="仅支持添加批次商品", example="true")
    private Boolean supplierOnlyLnItem;
    @ApiCloudField(value="共享范围（指定门店）", example="2072001")
    private List<Integer> supplierSharedBranches;
    @ApiCloudField(value="共享范围（指定区域）", example="1")
    private List<Integer> supplierShareRegions;
    @ApiCloudField(value="商品不推送到资金系统(调出单/调入单)", example="false")
    private Boolean itemNoPushFinance;
    @ApiCloudField(value="银行账号列表", example="")
    private List<SupplierBankAccountUpdateV2DTOModel> supplierAccountDetails;
    @ApiCloudField(value="纳税人类型", example="小规模纳税人")
    private String supplierTaxpayerType;
    @ApiCloudField(value="修改人", example="admin")
    private String appUserName;
    @ApiCloudField(value="扩展属性1", example="value")
    private String supplierExtend1;
    @ApiCloudField(value="扩展属性2", example="value")
    private String supplierExtend2;
    @ApiCloudField(value="扩展属性3", example="value")
    private String supplierExtend3;
    @ApiCloudField(value="扩展属性4", example="value")
    private String supplierExtend4;
    @ApiCloudField(value="扩展属性5", example="value")
    private String supplierExtend5;
    @ApiCloudField(value="扩展属性6", example="value")
    private String supplierExtend6;
    @ApiCloudField(value="扩展属性7", example="value")
    private String supplierExtend7;
    @ApiCloudField(value="扩展属性8", example="value")
    private String supplierExtend8;
    @ApiCloudField(value="扩展属性9", example="value")
    private String supplierExtend9;
    @ApiCloudField(value="扩展属性10", example="value")
    private String supplierExtend10;
}
