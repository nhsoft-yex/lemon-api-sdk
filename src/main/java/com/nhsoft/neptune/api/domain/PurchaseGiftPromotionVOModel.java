package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PurchaseGiftPromotionVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PurchaseGiftPromotionVOModel extends ApiCloudObject {

    @ApiCloudField(value="采购赠品促销单号", example="2072990000018")
    private String purchaseGiftPromotionNo;
    @ApiCloudField(value="制单门店编码", example="99")
    private Integer branchNum;
    @ApiCloudField(value="开始日期", example="2023-05-23")
    private String dateFrom;
    @ApiCloudField(value="结束日期", example="2023-05-30")
    private String dateTo;
    @ApiCloudField(value="状态编码（查询字段,保存不传）", example="1")
    private Integer orderState;
    @ApiCloudField(value="状态名称（查询字段,保存不传）", example="制单")
    private String orderStateName;
    @ApiCloudField(value="是否超量累加", example="true")
    private Boolean append;
    @ApiCloudField(value="创建时间", example="2023-05-23 00:00:00")
    private String createTime;
    @ApiCloudField(value="创建人", example="管理员")
    private String creator;
    @ApiCloudField(value="审核时间", example="2023-05-23 00:00:00")
    private String auditTime;
    @ApiCloudField(value="审核人", example="管理员")
    private String auditor;
    @ApiCloudField(value="备注", example="备注信息")
    private String memo;
    @ApiCloudField(value="作废时间", example="2023-05-23 00:00:00")
    private String cancelTime;
    @ApiCloudField(value="作废人", example="作废人")
    private String cancelOperator;
    @ApiCloudField(value="部门", example="采购部门")
    private String department;
    @ApiCloudField(value="最后修改时间", example="2023-05-23 00:00:00")
    private String lastEditTime;
    @ApiCloudField(value="最后修改人", example="管理员")
    private String lastEditor;
    @ApiCloudField(value="明细", example="")
    private List<PurchaseGiftPromotionDetailVOModel> details;
}
