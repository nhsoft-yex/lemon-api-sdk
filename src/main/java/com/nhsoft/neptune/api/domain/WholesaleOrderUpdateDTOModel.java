package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WholesaleOrderUpdateDTO模型
 * 批发销售单更新
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WholesaleOrderUpdateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="批发销售单号", example="WO2030990000008", required=true)
    private String wholesaleOrderFid;
    @ApiCloudField(value="操作人", example="管理员", required=true)
    private String wholesaleOrderOperator;
    @ApiCloudField(value="备注", example="备注信息")
    private String wholesaleOrderMemo;
    @ApiCloudField(value="配送方式", example="")
    private String wholesaleOrderTransferType;
    @ApiCloudField(value="销售日期 格式：yyyy-MM-dd", example="2021-01-18", required=true)
    private String wholesaleOrderDate;
    @ApiCloudField(value="批发订单号")
    private String wholesaleOrderBillNo;
    @ApiCloudField(value="外部流水号(最大长度32)", example="A0001")
    private String wholesaleOrderOutBillNo;
    @ApiCloudField(value="销售员", example="管理员")
    private String wholesaleOrderSeller;
    @ApiCloudField(value="批发订单号", example="WB2030990000005")
    private String wholesaleBookFid;
    @ApiCloudField(value="批发订单号", example="[WB2030990000005]")
    private List<String> wholesaleBookFids;
    @ApiCloudField(value="扩展属性1", example="扩展属性1")
    private String wholesaleOrderExtend1;
    @ApiCloudField(value="扩展属性2", example="扩展属性2")
    private String wholesaleOrderExtend2;
    @ApiCloudField(value="扩展属性3", example="扩展属性3")
    private String wholesaleOrderExtend3;
    @ApiCloudField(value="订单明细", example="", required=true)
    private List<WholesaleOrderDetailUpdateDTOModel> wholesaleOrderDetails;
}
