package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BasicBranchMatrixUpdateV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BasicBranchMatrixUpdateV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="禁止门店要货", example="true")
    private Boolean branchMatrixForbidRequest;
    @ApiCloudField(value="要货单审核后", example="true")
    private Boolean branchMatrixRequestAutoChecked;
    @ApiCloudField(value="几分钟未付款自动作废", example="30")
    private Integer branchMatrixRequestMinutes;
    @ApiCloudField(value="采购日截止时间", example="2022-10-08 11:22:22")
    private String branchMatrixPurchaseDealine;
    @ApiCloudField(value="要货汇总必须审核后生成", example="true")
    private Boolean branchMatrixCollectNeedAudit;
    @ApiCloudField(value="扩展字段1", example="")
    private String branchExtend1;
    @ApiCloudField(value="扩展字段2", example="")
    private String branchExtend2;
    @ApiCloudField(value="扩展字段3", example="")
    private String branchExtend3;
    @ApiCloudField(value="扩展字段4", example="")
    private String branchExtend4;
    @ApiCloudField(value="扩展字段5", example="")
    private String branchExtend5;
    @ApiCloudField(value="扩展字段6", example="")
    private String branchExtend6;
    @ApiCloudField(value="扩展字段7", example="")
    private String branchExtend7;
    @ApiCloudField(value="扩展字段8", example="")
    private String branchExtend8;
    @ApiCloudField(value="扩展字段9", example="")
    private String branchExtend9;
    @ApiCloudField(value="扩展字段10", example="")
    private String branchExtend10;
}
