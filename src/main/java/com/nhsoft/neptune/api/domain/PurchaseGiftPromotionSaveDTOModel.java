package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PurchaseGiftPromotionSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PurchaseGiftPromotionSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="制单门店编码", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="应用门店编码(不传为全部)", example="[1,2,3]")
    private List<Integer> applyBranchNums;
    @ApiCloudField(value="应用供应商编码(不传为全部)", example="[1,2,3]")
    private List<Integer> applySupplierNums;
    @ApiCloudField(value="操作人", example="管理员", required=true)
    private String operator;
    @ApiCloudField(value="开始日期（yyyy-mm-dd）", example="2021-01-20", required=true)
    private String dateTo;
    @ApiCloudField(value="结束日期（yyyy-mm-dd）", example="2021-01-20", required=true)
    private String dateFrom;
    @ApiCloudField(value="是否超量累加", example="true")
    private Boolean append;
    @ApiCloudField(value="备注", example="备注信息")
    private String memo;
    @ApiCloudField(value="明细", example="", required=true)
    private List<PurchaseGiftPromotionDetailSaveDTOModel> details;
}
