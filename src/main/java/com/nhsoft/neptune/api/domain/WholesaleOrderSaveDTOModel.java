package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WholesaleOrderSaveDTO模型
 * 批发订单保存DTO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WholesaleOrderSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编码", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="客户编号", example="0015005990000001", required=true)
    private String clientFid;
    @ApiCloudField(value="配送方式")
    private String wholesaleOrderTransferType;
    @ApiCloudField(value="仓库编码", example="203000002", required=true)
    private Integer storehouseNum;
    @ApiCloudField(value="操作人", example="管理员", required=true)
    private String wholesaleOrderOperator;
    @ApiCloudField(value="备注", example="备注信息")
    private String wholesaleOrderMemo;
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
    @ApiCloudField(value="订单明细", required=true)
    private List<WholesaleOrderDetailSaveDTOModel> wholesaleOrderDetails;
}
