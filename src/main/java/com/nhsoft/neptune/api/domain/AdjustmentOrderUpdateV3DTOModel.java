package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * AdjustmentOrderUpdateV3DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AdjustmentOrderUpdateV3DTOModel extends ApiCloudObject {

    @ApiCloudField(value="库存调整单号", example="OO2113990000009", required=true)
    private String adjustmentOrderFid;
    @ApiCloudField(value="操作人", example="管理员", required=true)
    private String adjustmentOrderOperator;
    @ApiCloudField(value="调整日期（yyyy-MM-dd）", example="2021-01-20")
    private String adjustmentOrderDate;
    @ApiCloudField(value="备注", example="备注信息")
    private String adjustmentOrderMemo;
    @ApiCloudField(value="adjustment_order_ref_bill")
    private String adjustmentOrderRefBill;
    @ApiCloudField(value="外部流水号", example="A00001")
    private String adjustmentOrderOutBillNo;
    @ApiCloudField(value="调整原因", example="手动入库")
    private String adjustmentOrderCause;
    @ApiCloudField(value="明细", example="", required=true)
    private List<AdjustmentOrderSaveDetailV3DTOModel> adjustmentOrderDetails;
}
