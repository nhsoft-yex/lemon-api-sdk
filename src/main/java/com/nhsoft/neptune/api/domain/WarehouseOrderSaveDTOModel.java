package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WarehouseOrderSaveDTO模型
 * 入库单保存DTO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WarehouseOrderSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="配送中心门店编码", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="单据来源", example="WEB", required=true)
    private String warehouseOrderSource;
    @ApiCloudField(value="创建人", example="admin", required=true)
    private String warehouseOrderCreator;
    @ApiCloudField(value="入库类型(供应商供货|客户退货|调拨入库|调整入库)", example="供应商供货", required=true)
    private String warehouseOrderType;
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
    @ApiCloudField(value="details", example="明细", required=true)
    private List<WarehouseOrderSaveDetailDTOModel> details;
    @ApiCloudField(value="入库时间", example="Tue Apr 02 08:00:00 CST 2024", required=true)
    private String warehouseOrderDate;
    @ApiCloudField(value="外部单据号", example="av82000001", required=true)
    private String outOrderFid;
}
