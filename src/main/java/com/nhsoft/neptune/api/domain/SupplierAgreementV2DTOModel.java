package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SupplierAgreementV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SupplierAgreementV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="供应商编码", example="203000001")
    private Integer supplierNum;
    @ApiCloudField(value="供应商名称", example="供应商")
    private String supplierName;
    @ApiCloudField(value="合同单据号", example="203000001")
    private String agreementNo;
    @ApiCloudField(value="合同编号", example="GH00001")
    private String agreementNumber;
    @ApiCloudField(value="合同名称", example="供货合同")
    private String agreementName;
    @ApiCloudField(value="合同结算模式", example="业务发生门店结算")
    private String settlementModel;
    @ApiCloudField(value="合同结算方式", example="指定帐期")
    private String settlementStyle;
    @ApiCloudField(value="合同类型", example="购销")
    private String agreementType;
    @ApiCloudField(value="结算账期天数", example="30")
    private Integer settlementSettlePeriod;
    @ApiCloudField(value="合同备注", example="备注")
    private String agreementMemo;
    @ApiCloudField(value="合同状态代码", example="1")
    private Integer agreementStateCode;
    @ApiCloudField(value="合同状态名称", example="制单")
    private String agreementStateName;
    @ApiCloudField(value="制单门店编码", example="99")
    private Integer branchNum;
    @ApiCloudField(value="应用门店编码列表", example="1")
    private List<Integer> applyBranchNums;
    @ApiCloudField(value="签署日期", example="1")
    private String agreementSignDate;
    @ApiCloudField(value="合同起始日期", example="2022-01-01 00:00:00")
    private String agreementDateFrom;
    @ApiCloudField(value="合同结束日期", example="2022-02-01 00:00:00")
    private String agreementDateTo;
    @ApiCloudField(value="创建人", example="管理员")
    private String agreementCreator;
    @ApiCloudField(value="创建时间", example="2022-01-01 10:00:00")
    private String agreementCreateTime;
    @ApiCloudField(value="审核人", example="管理员")
    private String agreementAuditor;
    @ApiCloudField(value="审核时间", example="2022-01-01 10:00:00")
    private String agreementAuditTime;
    @ApiCloudField(value="最后修改人", example="管理员")
    private String agreementLastEditor;
    @ApiCloudField(value="最后修改时间", example="2022-01-01 10:00:00")
    private String agreementLastEditTime;
    @ApiCloudField(value="合同商品列表", example="")
    private List<SupplierAgreementPosItemV2DTOModel> agreementPosItems;
    @ApiCloudField(value="合同押金列表", example="")
    private List<SupplierAgreementPledgeV2DTOModel> agreementPledges;
}
