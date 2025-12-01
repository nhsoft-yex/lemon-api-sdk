package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PriceAdjustmentSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PriceAdjustmentSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="申请门店编码", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="操作人", example="管理员", required=true)
    private String priceAdjustmentOperator;
    @ApiCloudField(value="备注", example="备注信息")
    private String priceAdjustmentMemo;
    @ApiCloudField(value="调整级别(1表示调整，0表示不调整，从左到右，标准价|售价2|售价3|售价4|最低价｜最高价，如全调输入:111111)", example="111111", required=true)
    private String priceAdjustmentLevel;
    @ApiCloudField(value="应用门店编码列表", example="[1,2]", required=true)
    private List<Integer> branchNums;
    @ApiCloudField(value="生效日期（yyyy-MM-dd）", example="Fri Jan 01 08:00:00 CST 2021", required=true)
    private String priceAdjustmentEffectiveDate;
    @ApiCloudField(value="失效日期（yyyy-MM-dd）", example="Fri Jan 01 08:00:00 CST 2021")
    private String priceAdjustmentInvalidTime;
    @ApiCloudField(value="失效后价格选项(0:调整前价格、1:按当前商品档案价格、2:随商品档案价格)", example="1")
    private Integer priceAdjustmentReturnType;
    @ApiCloudField(value="明细", example="", required=true)
    private List<PriceAdjustmentDetailSaveDTOModel> priceAdjustmentDetails;
}
