package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PayableOrderSaveandauditDTO模型
 * 应付单新增与审核
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PayableOrderSaveandauditDTOModel extends ApiCloudObject {

    @ApiCloudField(value="应付金额", example="100.0", required=true)
    private BigDecimal amount;
    @ApiCloudField(value="业务类型（储值卡|商品|业务费用|费用）", example="商品", required=true)
    private String businessType;
    @ApiCloudField(value="业务时间", example="2022-01-01 10:00:00")
    private String date;
    @ApiCloudField(value="截止时间", example="2022-01-01 10:00:00")
    private String deadline;
    @ApiCloudField(value="目标用户中心门店ID", example="1", required=true)
    private Integer dstBranchId;
    @ApiCloudField(value="往来单位", example="R00008000003", required=true)
    private String dstUnitId;
    @ApiCloudField(value="源用户中心门店", example="1", required=true)
    private Integer srcBranchId;
    @ApiCloudField(value="快速单据类型", example="外部费用单")
    private String quickOrderType;
    @ApiCloudField(value="外部单据号", example="")
    private String refBillNo;
    @ApiCloudField(value="操作人", example="管理员", required=true)
    private String operator;
    @ApiCloudField(value="备注", example="1")
    private String remark;
    @ApiCloudField(value="费用详情", example="", required=true)
    private List<PayableFeeDetailRequestDTOModel> feeDetailRequests;
    @ApiCloudField(value="计划", example="", required=true)
    private List<PayablePlanRequestDTOModel> planRequests;
}
