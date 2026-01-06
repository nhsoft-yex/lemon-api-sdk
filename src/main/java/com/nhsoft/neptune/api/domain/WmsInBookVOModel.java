package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WmsInBookVO模型
 * WMS入库单VO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WmsInBookVOModel extends ApiCloudObject {

    @ApiCloudField(value="入库订单号", example="CD21139924113000001")
    private String inWarehouseBookOrderFid;
    @ApiCloudField(value="关联外部单号")
    private String outOrderFid;
    @ApiCloudField(value="配送中心门店编码", example="99")
    private Integer branchNum;
    @ApiCloudField(value="仓库编码", example="211300001")
    private Integer storehouseNum;
    @ApiCloudField(value="供应商编码", example="211300001")
    private Integer supplierNum;
    @ApiCloudField(value="客户编码", example="5597")
    private String clientNum;
    @ApiCloudField(value="客户名称", example="分店13")
    private String clientName;
    @ApiCloudField(value="金额", example="1.0")
    private BigDecimal inWarehouseBookOrderTotalMoney;
    @ApiCloudField(value="单据状态码", example="1")
    private String inWarehouseBookOrderStateCode;
    @ApiCloudField(value="单据状态", example="制单")
    private String inWarehouseBookOrderStateName;
    @ApiCloudField(value="收货状态", example="未处理")
    private String inWarehouseBookOrderReceiveStateName;
    @ApiCloudField(value="创建时间")
    private String inWarehouseBookOrderCreateTime;
    @ApiCloudField(value="创建人", example="admin")
    private String inWarehouseBookOrderCreator;
    @ApiCloudField(value="审核时间")
    private String inWarehouseBookOrderAuditTime;
    @ApiCloudField(value="审核人", example="admin")
    private String inWarehouseBookOrderAuditor;
    @ApiCloudField(value="最后修改时间")
    private String inWarehouseBookOrderLastEditTime;
    @ApiCloudField(value="配送日期", example="Mon Apr 01 08:00:00 CST 2024")
    private String inWarehouseBookOrderDeliveryDate;
    @ApiCloudField(value="有效日期", example="Mon Apr 01 08:00:00 CST 2024")
    private String inWarehouseBookOrderDeadline;
    @ApiCloudField(value="备注", example="测试")
    private String inWarehouseBookOrderMemo;
    @ApiCloudField(value="入库订单明细")
    private List<WmsInBookDetailVOModel> inWarehouseBookOrderDetails;
}
