package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * AllocationOrderSaveV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AllocationOrderSaveV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编码", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="转入仓库编码", example="203000002", required=true)
    private Integer inStorehouseNum;
    @ApiCloudField(value="转出仓库编码", example="203000002", required=true)
    private Integer outStorehouseNum;
    @ApiCloudField(value="操作人", example="管理员", required=true)
    private String allocationOrderOperator;
    @ApiCloudField(value="调整日期（yyyy-mm-dd）", example="2021-01-20", required=true)
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
