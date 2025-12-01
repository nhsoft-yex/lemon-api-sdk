package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WmsOutOrderUpdateDTO模型
 * WMS出库单更新
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WmsOutOrderUpdateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="单据类型(供应商退货|客户配货|调整出库|转仓出库|库存调整)", example="客户配货", required=true)
    private String outWarehouseOrderOrderType;
    @ApiCloudField(value="关联erp调出单号", example="MO2113992404220001")
    private String outOrderFid;
    @ApiCloudField(value="操作人", example="admin", required=true)
    private String operator;
    @ApiCloudField(value="波次单号", example="BC21139924113000005")
    private String wavePlanFid;
    @ApiCloudField(value="发车任务单号", example="21139924113000001")
    private String carTaskFid;
    @ApiCloudField(value="配送中心门店编码", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="分拣员编码", example="996580238")
    private Integer pickUserNum;
    @ApiCloudField(value="仓库编码", example="211300001", required=true)
    private Integer storehouseNum;
    @ApiCloudField(value="转入仓库编码", example="211300001")
    private Integer inStorehouseNum;
    @ApiCloudField(value="客户编码", example="5597")
    private String clientNum;
    @ApiCloudField(value="供应商编码", example="996580001")
    private Integer supplierNum;
    @ApiCloudField(value="入库订单", example="RK996589925162000001")
    private String warehouseOrderFid;
    @ApiCloudField(value="创建人", example="admin", required=true)
    private String outWarehouseOrderCreator;
    @ApiCloudField(value="客户名称", example="分店13")
    private String clientName;
    @ApiCloudField(value="金额", example="1.0")
    private BigDecimal outWarehouseOrderTotalMoney;
    @ApiCloudField(value="关联出库订单号", example="[CD21139924113000004]")
    private List<String> outWarehouseBookFids;
    @ApiCloudField(value="备注", example="aaaa")
    private String memo;
    @ApiCloudField(value="调整原因", example="出库")
    private String adjustReason;
    @ApiCloudField(value="出库订单明细", required=true)
    private List<WmsOutOrderSaveDetailDTOModel> outWarehouseOrderDetails;
    @ApiCloudField(value="出库单号", example="CK21139924113000001", required=true)
    private String outWarehouseOrderFid;
}
