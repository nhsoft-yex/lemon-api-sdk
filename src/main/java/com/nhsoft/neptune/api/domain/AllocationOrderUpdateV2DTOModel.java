package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * AllocationOrderUpdateV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AllocationOrderUpdateV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="转仓单号", example="ZH2030990000002", required=true)
    private String allocationOrderFid;
    @ApiCloudField(value="操作人", example="管理员", required=true)
    private String allocationOrderOperator;
    @ApiCloudField(value="调整日期（yyyy-mm-dd）", example="2021-01-20")
    private String allocationOrderDate;
    @ApiCloudField(value="调入说明", example="说明")
    private String allocationOrderInMemo;
    @ApiCloudField(value="调出说明", example="说明")
    private String allocationOrderOutMemo;
    @ApiCloudField(value="allocation_order_ref_bill")
    private String allocationOrderRefBill;
    @ApiCloudField(value="外部流水号(最大长度32)", example="A00001")
    private String allocationOrderOutBillNo;
    @ApiCloudField(value="明细", example="", required=true)
    private List<AllocationOrderSaveDetailV2DTOModel> allocationOrderDetails;
}
