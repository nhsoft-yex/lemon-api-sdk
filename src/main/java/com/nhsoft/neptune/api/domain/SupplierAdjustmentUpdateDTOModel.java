package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SupplierAdjustmentUpdateDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SupplierAdjustmentUpdateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="供应商编号", required=true)
    private Integer supplierNum;
    @ApiCloudField(value="当前门店编号", required=true)
    private Integer branchNum;
    @ApiCloudField(value="应用门店编号", example="", required=true)
    private List<Integer> appliedBranchNums;
    @ApiCloudField(value="生效时间", required=true)
    private String supplierAdjustmentEffectiveDate;
    @ApiCloudField(value="合同编号", example="")
    private String supplierAgreementNo;
    @ApiCloudField(value="调价范围", example="")
    private String supplierAdjustmentLevel;
    @ApiCloudField(value="备注", example="")
    private String supplierAdjustmentMemo;
    @ApiCloudField(value="创建人", example="")
    private String supplierAdjustmentCreator;
    @ApiCloudField(value="失效时间")
    private String supplierAdjustmentInvalidTime;
    @ApiCloudField(value="失效后价格调整")
    private Integer supplierAdjustmentReturnType;
    @ApiCloudField(value="失效人", example="")
    private String supplierAdjustmentInvalidor;
    @ApiCloudField(value="明细", example="", required=true)
    private List<SupplierAdjustmentSaveDetailDTOModel> supplierAdjustmentDetails;
    @ApiCloudField(value="单据编号", example="", required=true)
    private String supplierAdjustmentFid;
}
