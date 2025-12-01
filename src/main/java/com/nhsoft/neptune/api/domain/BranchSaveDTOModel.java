package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BranchSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BranchSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编码", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="区域编码", example="1")
    private Integer branchRegionNum;
    @ApiCloudField(value="门店代码", example="20002", required=true)
    private String branchCode;
    @ApiCloudField(value="门店名称", example="华彩天地", required=true)
    private String branchName;
    @ApiCloudField(value="门店启用标记", example="true", required=true)
    private Boolean branchActived;
    @ApiCloudField(value="门店邮编", example="100000")
    private String branchPostcode;
    @ApiCloudField(value="门店地址", example="江苏省南京市")
    private String branchAddr;
    @ApiCloudField(value="门店电话", example="18888888882")
    private String branchPhone;
    @ApiCloudField(value="配送中心标记", example="true", required=true)
    private Boolean branchRdc;
    @ApiCloudField(value="门店类型", example="连锁门店", required=true)
    private String branchType;
    @ApiCloudField(value="是否启用门店售价", example="true", required=true)
    private Boolean branchMatrixPriceActived;
    @ApiCloudField(value="门店模块", example="基本档案,前台销售,采购管理", required=true)
    private String branchModule;
    @ApiCloudField(value="门店联系人", example="李经理")
    private String branchLinkMan;
    @ApiCloudField(value="门店过期时间", example="2022-01-01", required=true)
    private String branchExpiration;
    @ApiCloudField(value="支持IC卡", example="true", required=true)
    private Boolean branchSupportIc;
    @ApiCloudField(value="支持ID卡", example="false", required=true)
    private Boolean branchSupportId;
    @ApiCloudField(value="门店证书产品类型", example="新希望果蔬专卖(ID卡)_分店一", required=true)
    private String branchProduct;
    @ApiCloudField(value="启用门店管理组合明细", example="true", required=true)
    private Boolean branchKitEnabled;
    @ApiCloudField(value="门店经营范围编号", example="1")
    private Integer managementTemplateNum;
    @ApiCloudField(value="状态", example="1", required=true)
    private Integer branchStatus;
    @ApiCloudField(value="用户中心门店ID")
    private Long userCenterId;
    @ApiCloudField(value="经度", example="118.391955")
    private BigDecimal branchMatrixLongitude;
    @ApiCloudField(value="纬度", example="35.15474")
    private BigDecimal branchMatrixLatitude;
}
