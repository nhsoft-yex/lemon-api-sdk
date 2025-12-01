package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosClientSaveDTO模型
 * 客户保存参数
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosClientSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="客户父级编号", example="002030990000002")
    private String clientParentFid;
    @ApiCloudField(value="门店编码", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="客户名称", example="批发客户1", required=true)
    private String clientName;
    @ApiCloudField(value="客户代码", example="0200002", required=true)
    private String clientCode;
    @ApiCloudField(value="速记码", example="PFKH")
    private String clientPinyin;
    @ApiCloudField(value="联系电话", example="18888888881", required=true)
    private String clientMobile;
    @ApiCloudField(value="联系人", example="批发客户1")
    private String clientLinkman;
    @ApiCloudField(value="客户电话号码", example="18888888881")
    private String clientPhone;
    @ApiCloudField(value="客户类别", example="华东客户", required=true)
    private String clientType;
    @ApiCloudField(value="客户传真", example="26737123")
    private String clientFax;
    @ApiCloudField(value="客户区域名称", example="区域")
    private String clientRegionName;
    @ApiCloudField(value="客户等级", example="甲等")
    private String clientLevelName;
    @ApiCloudField(value="客户邮编", example="100000")
    private String clientZip;
    @ApiCloudField(value="客户生日(yyyy-MM-dd)", example="1970-01-01", required=true)
    private String clientBirth;
    @ApiCloudField(value="客户电子邮编", example="12313@qq.com")
    private String clientEmail;
    @ApiCloudField(value="客户条码", example="0200001")
    private String clientBarcode;
    @ApiCloudField(value="客户工作单位", example="南京市建邺区明基医院")
    private String clientCompany;
    @ApiCloudField(value="网站", example="https://www.example.com/")
    private String clientWebSite;
    @ApiCloudField(value="联系地址", example="南京市建邺区明基医院")
    private String clientAddr;
    @ApiCloudField(value="送货地址", example="南京市建邺区明基医院")
    private String clientShipAddr;
    @ApiCloudField(value="结算方式(临时指定、指定帐期、指定日期、货到付款、款到发货)", example="临时指定", required=true)
    private String clientSettlementType;
    @ApiCloudField(value="月结日期", example="11", required=true)
    private Integer clientSettleDayOfMonth;
    @ApiCloudField(value="结转周期", example="30", required=true)
    private Integer clientSettlePeriod;
    @ApiCloudField(value="结算模式(所属门店结算、业务发生门店结算)", example="所属门店结算", required=true)
    private String clientSettlementModel;
    @ApiCloudField(value="是否启用信用额度(1启用,0不启用)", example="1", required=true)
    private Integer clientCreditEnable;
    @ApiCloudField(value="信用额度", example="10000.0", required=true)
    private BigDecimal clientCreditLimit;
    @ApiCloudField(value="超额后处理方式  2：禁止签单 1 仅提醒,不传表示允许 ", example="1")
    private Integer clientCreditRemindType;
    @ApiCloudField(value="商城下单需保证余额充足(1启用,0不启用)", required=true)
    private Integer wholesaleBookBalanceEnoughEnable;
    @ApiCloudField(value="下单保证账户余额无欠款(1启用,0不启用)", example="1")
    private Integer wholesaleBookBalanceNoArrearsEnable;
    @ApiCloudField(value="零售价折扣值", example="0.9", required=true)
    private BigDecimal clientUsualDiscount;
    @ApiCloudField(value="零售价价格级别", example="1", required=true)
    private Integer clientPriceLevel;
    @ApiCloudField(value="批发价折扣", example="0.9", required=true)
    private BigDecimal clientWholesaleDiscount;
    @ApiCloudField(value="批发价格级别", example="1", required=true)
    private Integer clientWholesaleLevel;
    @ApiCloudField(value="是否启用(1启用,0不启用)", example="1", required=true)
    private Integer clientActived;
    @ApiCloudField(value="是否共享(1共享,0不共享）", example="1", required=true)
    private Integer clientShared;
}
