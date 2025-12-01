package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * AdjustmentOrderSaveV3DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AdjustmentOrderSaveV3DTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编码", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="仓库编码", example="150050001", required=true)
    private Integer storehouseNum;
    @ApiCloudField(value="操作人", example="管理员", required=true)
    private String adjustmentOrderOperator;
    @ApiCloudField(value="调整日期（yyyy-MM-dd）", example="2021-01-20", required=true)
    private String adjustmentOrderDate;
    @ApiCloudField(value="备注", example="备注信息")
    private String adjustmentOrderMemo;
    @ApiCloudField(value="adjustment_order_ref_bill")
    private String adjustmentOrderRefBill;
    @ApiCloudField(value="外部流水号(最大长度32)", example="A00001")
    private String adjustmentOrderOutBillNo;
    @ApiCloudField(value="调整原因", example="手动入库", required=true)
    private String adjustmentOrderCause;
    @ApiCloudField(value="调整方向(出库、入库)", example="入库", required=true)
    private String adjustmentOrderDirection;
    @ApiCloudField(value="明细", example="", required=true)
    private List<AdjustmentOrderSaveDetailV3DTOModel> adjustmentOrderDetails;
}
