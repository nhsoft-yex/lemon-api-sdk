package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ElepriceadjUpdateV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ElepriceadjUpdateV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="调价申请单号", example="4344990001419", required=true)
    private String elementPriceAdjustmentFid;
    @ApiCloudField(value="申请门店编码", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="操作人", example="管理员", required=true)
    private String elementPriceAdjustmentOperator;
    @ApiCloudField(value="备注", example="备注信息")
    private String elementPriceAdjustmentMemo;
    @ApiCloudField(value="调整级别(1表示调整，0表示不调整，从左到右，标准价|售价2|售价3|售价4，如全调输入:1111)", example="1111", required=true)
    private String elementPriceAdjustmentLevel;
    @ApiCloudField(value="应用门店编码列表", example="[1,2]", required=true)
    private List<Integer> branchNums;
    @ApiCloudField(value="明细", example="", required=true)
    private List<ElepriceadjDetailSaveV2DTOModel> elementPriceAdjustmentDetails;
}
