package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SupplierAdjustmentFullyVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SupplierAdjustmentFullyVOModel extends ApiCloudObject {

    @ApiCloudField(value="单据号", example="")
    private String supplierAdjustmentFid;
    @ApiCloudField(value="供应商编号")
    private Integer supplierNum;
    @ApiCloudField(value="状态 1制单 3审核")
    private Integer stateCode;
    @ApiCloudField(value="状态名称", example="")
    private String stateName;
    @ApiCloudField(value="创建人", example="")
    private String supplierAdjustmentCreator;
    @ApiCloudField(value="创建时间")
    private String supplierAdjustmentCreateTime;
    @ApiCloudField(value="审核人", example="")
    private String supplierAdjustmentAuditor;
    @ApiCloudField(value="审核时间")
    private String supplierAdjustmentAuditTime;
    @ApiCloudField(value="备注", example="")
    private String supplierAdjustmentMemo;
    @ApiCloudField(value="supplier_adjustment_status")
    private Integer supplierAdjustmentStatus;
    @ApiCloudField(value="门店编号")
    private Integer branchNum;
    @ApiCloudField(value="应用门店列表", example="")
    private List<Integer> appliedBranchNums;
    @ApiCloudField(value="合同编号", example="")
    private String supplierAgreementNo;
    @ApiCloudField(value="调价范围", example="")
    private String supplierAdjustmentLevel;
    @ApiCloudField(value="最后修改时间")
    private String supplierAdjustmentLastEditTime;
    @ApiCloudField(value="最后修改人", example="")
    private String supplierAdjustmentLastEditor;
    @ApiCloudField(value="生效时间")
    private String supplierAdjustmentEffectiveDate;
    @ApiCloudField(value="附件数量")
    private Integer objectCount;
    @ApiCloudField(value="供应商名称", example="")
    private String supplierName;
    @ApiCloudField(value="失效时间")
    private String supplierAdjustmentInvalidTime;
    @ApiCloudField(value="失效后价格调整")
    private Integer supplierAdjustmentReturnType;
    @ApiCloudField(value="失效人", example="")
    private String supplierAdjustmentInvalidor;
    @ApiCloudField(value="明细", example="")
    private List<SupplierAdjustmentDetailVOModel> supplierAdjustmentDetails;
}
