package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BranchV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BranchV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="账套号", example="1122")
    private String systemBookCode;
    @ApiCloudField(value="门店编码", example="99")
    private Integer branchNum;
    @ApiCloudField(value="分店区域编码", example="1")
    private Integer branchRegionNum;
    @ApiCloudField(value="门店代码", example="20002")
    private String branchCode;
    @ApiCloudField(value="门店名称", example="华彩天地")
    private String branchName;
    @ApiCloudField(value="是否启用", example="true")
    private Boolean branchActived;
    @ApiCloudField(value="邮编", example="100000")
    private String branchPostcode;
    @ApiCloudField(value="门店地址", example="江苏省南京市")
    private String branchAddr;
    @ApiCloudField(value="联系电话", example="18888888882")
    private String branchPhone;
    @ApiCloudField(value="是否配送中心", example="true")
    private Boolean branchRdc;
    @ApiCloudField(value="门店类型", example="连锁门店")
    private String branchType;
    @ApiCloudField(value="备注", example="备注信息")
    private String branchMemo;
    @ApiCloudField(value="是否启用门店价格", example="true")
    private Boolean branchMatrixPriceActived;
    @ApiCloudField(value="信用额度", example="10000.0")
    private BigDecimal branchCreditLimit;
    @ApiCloudField(value="联系人", example="联系人名称")
    private String branchLinkMan;
    @ApiCloudField(value="卡内余额最高限额", example="10000.0")
    private BigDecimal branchCardBalanceLimit;
    @ApiCloudField(value="邮箱", example="123123@163.com")
    private String branchEmail;
    @ApiCloudField(value="证书到期时间", example="2020-08-23 00:00:00")
    private String branchExpiration;
    @ApiCloudField(value="经营范围模板编码", example="1")
    private Integer managementTemplateNum;
    @ApiCloudField(value="经营范围模板编码列表", example="1")
    private List<Integer> managementTemplateNums;
    @ApiCloudField(value="是否支持IC卡", example="true")
    private Boolean branchSupportIc;
    @ApiCloudField(value="是否支持ID卡", example="true")
    private Boolean branchSupportId;
    @ApiCloudField(value="证书名称", example="新希望果蔬专卖(ID卡)_分店一")
    private String branchProduct;
    @ApiCloudField(value="是否启用门店管理组合明细", example="true")
    private Boolean branchKitEnabled;
    @ApiCloudField(value="要货模板编码", example="1")
    private Long requestTemplateNum;
    @ApiCloudField(value="经度", example="118.391955")
    private BigDecimal branchMatrixLongitude;
    @ApiCloudField(value="纬度", example="35.15474")
    private BigDecimal branchMatrixLatitude;
    @ApiCloudField(value="营业结束时间", example="2024-01-01 00:00:00")
    private String branchCloseTime;
    @ApiCloudField(value="闭店字段（1表示闭店）", example="1")
    private Integer branchStatus;
    @ApiCloudField(value="是否开启门店会员卡账户余额", example="true")
    private Boolean branchAccountValid;
    @ApiCloudField(value="是否是新店", example="true")
    private Boolean newBranch;
    @ApiCloudField(value="新店截止日期", example="2021-01-27")
    private String newBranchDeadline;
    @ApiCloudField(value="branch_matrix")
    private BranchMatrixV2DTOModel branchMatrix;
    @ApiCloudField(value="门店标签信息", example="")
    private List<BranchLabelV2DTOModel> branchLabels;
    @ApiCloudField(value="门店创建时间", example="")
    private String branchCreateTime;
    @ApiCloudField(value="用户中心门店ID")
    private Long userCenterId;
    @ApiCloudField(value="门店员工人数", example="69")
    private Integer branchEmployeeCount;
    @ApiCloudField(value="门店面积", example="287.5")
    private BigDecimal branchArea;
    @ApiCloudField(value="门店租金", example="12222.0")
    private BigDecimal branchRent;
    @ApiCloudField(value="外部门店名称", example="")
    private String outBranchName;
}
