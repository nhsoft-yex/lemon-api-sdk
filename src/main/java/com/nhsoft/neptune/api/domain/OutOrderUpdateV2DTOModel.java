package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * OutOrderUpdateV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class OutOrderUpdateV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="调出单号", example="MO4344990004979", required=true)
    private String outOrderFid;
    @ApiCloudField(value="操作人", example="管理员", required=true)
    private String outOrderOperator;
    @ApiCloudField(value="部门", example="部门名称")
    private String outOrderDepartment;
    @ApiCloudField(value="调出日期(yyyy-MM-dd)", example="2021-01-01")
    private String outOrderDate;
    @ApiCloudField(value="付款日期(yyyy-MM-dd)", example="2021-01-01")
    private String outOrderPaymentDate;
    @ApiCloudField(value="备注", example="备注信息")
    private String outOrderMemo;
    @ApiCloudField(value="外部订单号(最大长度32)", example="A0001")
    private String outOrderOutBillNo;
    @ApiCloudField(value="业务员", example="管理员")
    private String outOrderProposer;
    @ApiCloudField(value="内部申请单号", example="NS2072010000005")
    private String outOrderInnerBill;
    @ApiCloudField(value="out_order_box_codes")
    private String outOrderBoxCodes;
    @ApiCloudField(value="out_order_receive_state")
    private String outOrderReceiveState;
    @ApiCloudField(value="明细", example="", required=true)
    private List<OutOrderSaveDetailV2DTOModel> outOrderDetails;
}
