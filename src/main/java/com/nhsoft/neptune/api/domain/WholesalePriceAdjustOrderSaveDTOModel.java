package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WholesalePriceAdjustOrderSaveDTO模型
 * 批发价格调整订单保存DTO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WholesalePriceAdjustOrderSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="应用门店编号列表", example="1", required=true)
    private List<Integer> applyBranchNums;
    @ApiCloudField(value="生效日期(yyyy-MM-dd)", example="2022-01-01", required=true)
    private String priceAdjustmentEffectiveDate;
    @ApiCloudField(value="失效日期(yyyy-MM-dd)", example="2022-01-30")
    private String priceAdjustmentInvalidDate;
    @ApiCloudField(value="失效后价格（按调整前价格|按当前商品档案价格|随商品档案价格变动）", example="按调整前价格", required=true)
    private String priceAdjustmentReturnType;
    @ApiCloudField(value="备注")
    private String priceAdjustmentMemo;
    @ApiCloudField(value="操作人", example="管理员", required=true)
    private String priceAdjustmentOperator;
    @ApiCloudField(value="调整类型", example="客户", required=true)
    private String priceAdjustmentScopeType;
    @ApiCloudField(value="应用客户(调整类型为客户时必传)", example="1")
    private List<String> appliedClientFids;
    @ApiCloudField(value="应用客户等级编码(调整类型为客户等级时必传)", example="1")
    private List<Integer> appliedClientGradeNums;
    @ApiCloudField(value="明细", required=true)
    private List<WholesalePriceAdjustOrderDetailSaveDTOModel> details;
}
