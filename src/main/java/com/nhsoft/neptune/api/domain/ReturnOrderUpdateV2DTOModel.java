package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ReturnOrderUpdateV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ReturnOrderUpdateV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="退货单号", example="RO2072010000002", required=true)
    private String returnOrderFid;
    @ApiCloudField(value="操作人", example="管理员", required=true)
    private String returnOrderOperator;
    @ApiCloudField(value="备注", example="备注信息")
    private String returnOrderMemo;
    @ApiCloudField(value="return_order_bill_no")
    private String returnOrderBillNo;
    @ApiCloudField(value="外部流水号(长度小于50)", example="A00001")
    private String returnOrderOutBillNo;
    @ApiCloudField(value="业务员", example="业务员名称")
    private String returnOrderEmployee;
    @ApiCloudField(value="退货日期（yyyy-MM-dd）", example="2021-01-20")
    private String returnOrderDate;
    @ApiCloudField(value="收货单号", example="PI2003990000002")
    private String receiveOrderFid;
    @ApiCloudField(value="退货明细", example="", required=true)
    private List<ReturnOrderSaveDetailV2DTOModel> returnOrderDetails;
}
