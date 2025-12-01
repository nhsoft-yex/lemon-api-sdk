package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PriceadjV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PriceadjV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="调价申请单号", example="4344990001419")
    private String priceAdjustmentFid;
    @ApiCloudField(value="申请门店编码", example="99")
    private Integer branchNum;
    @ApiCloudField(value="状态代码", example="1")
    private Integer priceAdjustmentStateCode;
    @ApiCloudField(value="状态名称", example="制单")
    private String priceAdjustmentStateName;
    @ApiCloudField(value="制单人", example="管理员")
    private String priceAdjustmentCreator;
    @ApiCloudField(value="审核人", example="管理员")
    private String priceAdjustmentAuditor;
    @ApiCloudField(value="调整级别(1表示调整，0表示不调整，从左到右，标准价|售价2|售价3|售价4|最低价｜最高价，如全调输入:111111)", example="111111")
    private String priceAdjustmentLevel;
    @ApiCloudField(value="制单时间（yyyy-MM-dd HH:mm:ss）", example="2021-01-01 00:00:00")
    private String priceAdjustmentCreateTime;
    @ApiCloudField(value="审核时间（yyyy-MM-dd HH:mm:ss）", example="2021-01-01 00:00:00")
    private String priceAdjustmentAuditTime;
    @ApiCloudField(value="修改时间（yyyy-MM-dd HH:mm:ss）", example="2021-01-01 00:00:00")
    private String priceAdjustmentLastEditTime;
    @ApiCloudField(value="修改人", example="管理员")
    private String priceAdjustmentLastEditor;
    @ApiCloudField(value="生效日期（yyyy-MM-dd）", example="2021-01-01")
    private String priceAdjustmentEffectiveDate;
    @ApiCloudField(value="失效日期（yyyy-MM-dd）", example="2021-01-01")
    private String priceAdjustmentInvalidTime;
    @ApiCloudField(value="失效后价格选项(0:调整前价格、1:按当前商品档案价格、2:随商品档案价格)", example="1")
    private Integer priceAdjustmentReturnType;
    @ApiCloudField(value="备注", example="备注信息")
    private String priceAdjustmentMemo;
    @ApiCloudField(value="应用门店列表", example="")
    private List<BranchNameV2DTOModel> branchs;
    @ApiCloudField(value="明细", example="")
    private List<PriceadjDetailV2DTOModel> priceAdjustmentDetails;
}
