package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WarehouseOrderVO模型
 * 入库单
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WarehouseOrderVOModel extends ApiCloudObject {

    @ApiCloudField(value="入库单号", example="RK21139924098000006")
    private String warehouseOrderFid;
    @ApiCloudField(value="配送中心门店编码", example="99")
    private Integer branchNum;
    @ApiCloudField(value="单据来源", example="WEB")
    private String warehouseOrderSource;
    @ApiCloudField(value="创建时间")
    private String warehouseOrderCreateTime;
    @ApiCloudField(value="创建人", example="admin")
    private String warehouseOrderCreator;
    @ApiCloudField(value="审核时间")
    private String warehouseOrderAuditTime;
    @ApiCloudField(value="审核人", example="admin")
    private String warehouseOrderAuditor;
    @ApiCloudField(value="入库类型", example="供应商供货")
    private String warehouseOrderType;
    @ApiCloudField(value="单据状态码", example="1")
    private Integer warehouseOrderStateCode;
    @ApiCloudField(value="单据状态", example="制单")
    private String warehouseOrderStateName;
    @ApiCloudField(value="仓库编码", example="209500001")
    private Integer storehouseNum;
    @ApiCloudField(value="供应商编码", example="209500001")
    private Integer supplierNum;
    @ApiCloudField(value="供应商代码", example="17")
    private Integer supplierCode;
    @ApiCloudField(value="供应商名称", example="业务门店供应商")
    private String supplierName;
    @ApiCloudField(value="客户编码", example="5597")
    private String clientNum;
    @ApiCloudField(value="客户代码", example="1")
    private String clientCode;
    @ApiCloudField(value="客户名称", example="分店一")
    private String clientName;
    @ApiCloudField(value="单据金额", example="0.0")
    private BigDecimal warehouseOrderTotalMoney;
    @ApiCloudField(value="最后更新时间")
    private String warehouseOrderLastEditTime;
    @ApiCloudField(value="入库订单编号列表", example="[RD21139924098000013]")
    private List<String> warehouseBookFids;
    @ApiCloudField(value="明细")
    private List<WarehouseOrderDetailVOModel> details;
    @ApiCloudField(value="入库时间", example="Tue Apr 02 08:00:00 CST 2024")
    private String warehouseOrderDate;
}
