package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BasicBranchUpdateV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BasicBranchUpdateV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编码", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="门店代码", example="20002")
    private String branchCode;
    @ApiCloudField(value="门店启用标记", example="true")
    private Boolean branchActived;
    @ApiCloudField(value="门店邮编", example="100000")
    private String branchPostcode;
    @ApiCloudField(value="门店地址", example="江苏省南京市")
    private String branchAddr;
    @ApiCloudField(value="门店电话", example="18888888882")
    private String branchPhone;
    @ApiCloudField(value="门店传真", example="18888888882")
    private String branchFax;
    @ApiCloudField(value="配送中心标记", example="true")
    private Boolean branchRdc;
    @ApiCloudField(value="闭店（1闭店,0未闭店）", example="1")
    private Integer branchStatus;
    @ApiCloudField(value="branch_matrix")
    private BasicBranchMatrixUpdateV2DTOModel branchMatrix;
    @ApiCloudField(value="是否更新经营商品范围(默认false)", example="false")
    private Boolean managementTemplateUpdateEnable;
    @ApiCloudField(value="经营商品范围编码", example="432000054,432000056")
    private List<Integer> managementTemplateNums;
}
