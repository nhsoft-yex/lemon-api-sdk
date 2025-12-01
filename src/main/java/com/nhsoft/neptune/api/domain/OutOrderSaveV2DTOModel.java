package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * OutOrderSaveV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class OutOrderSaveV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="调入门店编码", example="99", required=true)
    private Integer inBranchNum;
    @ApiCloudField(value="调出门店编码", example="1", required=true)
    private Integer outBranchNum;
    @ApiCloudField(value="创建人", example="管理员", required=true)
    private String outOrderCreator;
    @ApiCloudField(value="部门", example="部门名称")
    private String outOrderDepartment;
    @ApiCloudField(value="调出日期(yyyy-MM-dd)", example="2021-01-01", required=true)
    private String outOrderDate;
    @ApiCloudField(value="备注", example="备注信息")
    private String outOrderMemo;
    @ApiCloudField(value="外部订单号(最大长度32)", example="A0001")
    private String outOrderOutBillNo;
    @ApiCloudField(value="业务员", example="管理员", required=true)
    private String outOrderProposer;
    @ApiCloudField(value="调出仓库编码", example="203000002", required=true)
    private Integer storehouseNum;
    @ApiCloudField(value="内部申请单号", example="NS2072010000005")
    private String outOrderInnerBill;
    @ApiCloudField(value="要货单号列表", example="[YH4344010004748,YH4356010001341]")
    private List<String> requestOrderFids;
    @ApiCloudField(value="out_order_box_codes")
    private String outOrderBoxCodes;
    @ApiCloudField(value="明细", example="", required=true)
    private List<OutOrderSaveDetailV2DTOModel> outOrderDetails;
}
