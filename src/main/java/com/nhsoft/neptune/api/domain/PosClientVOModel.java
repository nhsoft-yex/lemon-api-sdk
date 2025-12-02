package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosClientVO模型
 * POS客户VO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosClientVOModel extends ApiCloudObject {

    @ApiCloudField(value="客户编号", example="0015005990000001")
    private String clientFid;
    @ApiCloudField(value="门店编码", example="99")
    private Integer branchNum;
    @ApiCloudField(value="客户名称", example="批发客户A")
    private String clientName;
    @ApiCloudField(value="客户代码", example="0200002")
    private String clientCode;
    @ApiCloudField(value="速记码", example="PFKH")
    private String clientPinyin;
    @ApiCloudField(value="联系电话", example="18888888881")
    private String clientMobile;
    @ApiCloudField(value="联系人", example="批发客户A")
    private String clientLinkman;
    @ApiCloudField(value="客户电话号码", example="18891229213")
    private String clientPhone;
    @ApiCloudField(value="客户类别", example="华东客户")
    private String clientType;
    @ApiCloudField(value="客户传真", example="23543235")
    private String clientFax;
    @ApiCloudField(value="客户等级", example="甲等")
    private String clientLevelName;
    @ApiCloudField(value="客户邮编", example="100000")
    private String clientZip;
    @ApiCloudField(value="客户生日(yyyy-MM-dd)", example="1990-01-01")
    private String clientBirth;
    @ApiCloudField(value="客户电子邮编", example="1313@example.com")
    private String clientEmail;
    @ApiCloudField(value="客户条码", example="020002")
    private String clientBarcode;
    @ApiCloudField(value="客户工作单位", example="南京市建邺区德基医院")
    private String clientCompany;
    @ApiCloudField(value="网站", example="https://www.example.com/")
    private String clientWebSite;
    @ApiCloudField(value="联系地址", example="南京市建邺区德基医院")
    private String clientAddr;
    @ApiCloudField(value="送货地址", example="南京市建邺区德基医院")
    private String clientShipAddr;
    @ApiCloudField(value="结算方式(临时指定、指定帐期、指定日期、货到付款、款到发货)", example="临时指定")
    private String clientSettlementType;
    @ApiCloudField(value="月结日期", example="15")
    private Integer clientSettleDayOfMonth;
    @ApiCloudField(value="结转周期", example="20")
    private Integer clientSettlePeriod;
    @ApiCloudField(value="结算模式(所属门店结算、业务发生门店结算)", example="所属门店结算")
    private String clientSettlementModel;
    @ApiCloudField(value="是否启用信用额度(1启用)", example="1")
    private Integer clientCreditEnable;
    @ApiCloudField(value="信用额度", example="100.0")
    private BigDecimal clientCreditLimit;
    @ApiCloudField(value="超额后处理方式  2：禁止签单 1 仅提醒,不传表示允许 ", example="1")
    private Integer clientCreditRemindType;
    @ApiCloudField(value="商城下单需保证余额充足(1启用,0不启用)", example="1")
    private Integer wholesaleBookBalanceEnoughEnable;
    @ApiCloudField(value="下单保证账户余额无欠款(1启用,0不启用)", example="1")
    private Integer wholesaleBookBalanceNoArrearsEnable;
    @ApiCloudField(value="零售价折扣值", example="0.9")
    private BigDecimal clientUsualDiscount;
    @ApiCloudField(value="零售价价格级别", example="1")
    private Integer clientPriceLevel;
    @ApiCloudField(value="批发价折扣", example="0.9")
    private BigDecimal clientWholesaleDiscount;
    @ApiCloudField(value="批发价格级别", example="1")
    private Integer clientWholesaleLevel;
    @ApiCloudField(value="是否启用(1启用,0不启用)", example="1")
    private Integer clientActived;
    @ApiCloudField(value="是否共享(1共享,0不共享）", example="1")
    private Integer clientShared;
    @ApiCloudField(value="客户区域名称", example="区域")
    private String clientRegionName;
    @ApiCloudField(value="更新时间(yyyy-MM-dd HH:mm:ss)", example="2021-01-21 00:00:00")
    private String clientLastUpdateTime;
    @ApiCloudField(value="客户备注", example="备注")
    private String clientNoteInfo;
    @ApiCloudField(value="客户父级编号", example="002030990000002")
    private String clientParentFid;
    @ApiCloudField(value="用户中心合作伙伴id")
    private Long userCenterPartnerId;
    @ApiCloudField(value="客户标签列表(仅读取接口返回)", example="")
    private List<PosClientLabelVOModel> clientLabels;
}
