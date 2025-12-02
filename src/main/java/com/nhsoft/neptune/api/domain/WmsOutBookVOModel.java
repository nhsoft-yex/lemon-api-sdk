package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WmsOutBookVO模型
 * WMS出库订单
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WmsOutBookVOModel extends ApiCloudObject {

    @ApiCloudField(value="出库订单号", example="CD21139924113000001")
    private String outWarehouseBookOrderFid;
    @ApiCloudField(value="关联要货单号", example="YH2113132404220001")
    private String requestOrderFid;
    @ApiCloudField(value="关联外部单号", example="")
    private String outOrderFid;
    @ApiCloudField(value="配送中心门店编码", example="99")
    private Integer branchNum;
    @ApiCloudField(value="仓库编码", example="211300001")
    private Integer storehouseNum;
    @ApiCloudField(value="客户编码", example="5597")
    private String clientNum;
    @ApiCloudField(value="客户名称", example="分店13")
    private String clientName;
    @ApiCloudField(value="是否生成波次", example="false")
    private Boolean hasWavePlan;
    @ApiCloudField(value="金额", example="1.0")
    private BigDecimal outWarehouseBookOrderTotalMoney;
    @ApiCloudField(value="单据状态码", example="1")
    private String outWarehouseBookOrderStateCode;
    @ApiCloudField(value="单据状态", example="制单")
    private String outWarehouseBookOrderStateName;
    @ApiCloudField(value="出库状态", example="未出库")
    private String outWarehouseBookOrderOutState;
    @ApiCloudField(value="创建时间")
    private String outWarehouseBookOrderCreateTime;
    @ApiCloudField(value="创建人", example="admin")
    private String outWarehouseBookOrderCreator;
    @ApiCloudField(value="审核时间")
    private String outWarehouseBookOrderAuditTime;
    @ApiCloudField(value="审核人", example="admin")
    private String outWarehouseBookOrderAuditor;
    @ApiCloudField(value="最后修改时间")
    private String outWarehouseBookOrderLastEditTime;
    @ApiCloudField(value="期望出库日期", example="Mon Apr 01 08:00:00 CST 2024")
    private String outWarehouseBookOrderExpectOutDate;
    @ApiCloudField(value="配送日期", example="Mon Apr 01 08:00:00 CST 2024")
    private String outWarehouseBookOrderDeliveryDate;
    @ApiCloudField(value="有效日期", example="Mon Apr 01 08:00:00 CST 2024")
    private String outWarehouseBookOrderDeadline;
    @ApiCloudField(value="备注", example="测试")
    private String outWarehouseBookOrderMemo;
    @ApiCloudField(value="关联出库单号", example="[CK21139924085000001]")
    private List<String> outWarehouseFids;
    @ApiCloudField(value="快递单号", example="433957556526508")
    private String expressFid;
    @ApiCloudField(value="出库订单明细", example="")
    private List<WmsOutBookDetailVOModel> outWarehouseBookOrderDetails;
}
