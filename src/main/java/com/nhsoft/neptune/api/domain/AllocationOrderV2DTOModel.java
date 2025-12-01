package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * AllocationOrderV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AllocationOrderV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="转仓单号", example="ZH2030990000002")
    private String allocationOrderFid;
    @ApiCloudField(value="门店编码", example="99")
    private Integer branchNum;
    @ApiCloudField(value="转入仓库编码", example="203000002")
    private Integer inStorehouseNum;
    @ApiCloudField(value="转出仓库编码", example="203000002")
    private Integer outStorehouseNum;
    @ApiCloudField(value="创建人", example="管理员")
    private String allocationOrderCreator;
    @ApiCloudField(value="转仓日期（yyyy-mm-dd）", example="2021-01-20")
    private String allocationOrderDate;
    @ApiCloudField(value="调入说明", example="说明")
    private String allocationOrderInMemo;
    @ApiCloudField(value="调出说明", example="说明")
    private String allocationOrderOutMemo;
    @ApiCloudField(value="外部流水号", example="A00001")
    private String allocationOrderOutBillNo;
    @ApiCloudField(value="业务员", example="业务员名称")
    private String allocationOrderOperator;
    @ApiCloudField(value="创建时间（yyyy-MM-dd HH:mm:ss）", example="2021-01-20 00:00:00")
    private String allocationOrderCreateTime;
    @ApiCloudField(value="审核人", example="管理员")
    private String allocationOrderAuditor;
    @ApiCloudField(value="审核时间（yyyy-MM-dd HH:mm:ss）", example="2021-01-20 00:00:00")
    private String allocationOrderAuditTime;
    @ApiCloudField(value="状态编码", example="1")
    private Integer allocationOrderStateCode;
    @ApiCloudField(value="状态名称", example="制单")
    private String allocationOrderStateName;
    @ApiCloudField(value="转仓金额", example="1.0")
    private BigDecimal allocationOrderMoney;
    @ApiCloudField(value="最后修改时间（yyyy-MM-dd HH:mm:ss）", example="2021-01-20 00:00:00")
    private String allocationOrderLastEditTime;
    @ApiCloudField(value="转仓明细", example="")
    private List<AllocationOrderDetailV2DTOModel> allocationOrderDetails;
}
