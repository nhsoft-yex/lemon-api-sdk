package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ElepriceadjV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ElepriceadjV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="调价申请单号", example="4344990001418")
    private String elementPriceAdjustmentFid;
    @ApiCloudField(value="申请门店编码", example="99")
    private Integer branchNum;
    @ApiCloudField(value="状态代码", example="1")
    private Integer elementPriceAdjustmentStateCode;
    @ApiCloudField(value="状态名称", example="制单")
    private String elementPriceAdjustmentStateName;
    @ApiCloudField(value="制单人", example="管理员")
    private String elementPriceAdjustmentCreator;
    @ApiCloudField(value="审核人", example="管理员")
    private String elementPriceAdjustmentAuditor;
    @ApiCloudField(value="调整级别(1表示调整，0表示不调整，从左到右，标准价|售价2|售价3|售价4，如全调输入:1111)", example="1")
    private String elementPriceAdjustmentLevel;
    @ApiCloudField(value="制单时间（yyyy-MM-dd HH:mm:ss）", example="2021-01-01 00:00:00")
    private String elementPriceAdjustmentCreateTime;
    @ApiCloudField(value="审核时间（yyyy-MM-dd HH:mm:ss）", example="2021-01-01 00:00:00")
    private String elementPriceAdjustmentAuditTime;
    @ApiCloudField(value="备注", example="备注信息")
    private String elementPriceAdjustmentMemo;
    @ApiCloudField(value="应用门店列表", example="")
    private List<BranchNameV2DTOModel> branchs;
    @ApiCloudField(value="明细", example="")
    private List<ElepriceadjDetailV2DTOModel> elementPriceAdjustmentDetails;
}
