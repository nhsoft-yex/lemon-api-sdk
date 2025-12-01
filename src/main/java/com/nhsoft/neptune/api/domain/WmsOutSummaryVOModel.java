package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WmsOutSummaryVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WmsOutSummaryVOModel extends ApiCloudObject {

    @ApiCloudField(value="审核时间", example="2025-04-01 00:00:00")
    private String auditTime;
    @ApiCloudField(value="审核人", example="admin")
    private String auditor;
    @ApiCloudField(value="基本数量", example="10.0")
    private BigDecimal baseQty;
    @ApiCloudField(value="过期时间", example="2025-04-01 00:00:00")
    private String expirationDate;
    @ApiCloudField(value="临期占比", example="100")
    private BigDecimal guaranteeRate;
    @ApiCloudField(value="商品条码", example="30001")
    private String itemBarcode;
    @ApiCloudField(value="商品代码", example="30001")
    private String itemCode;
    @ApiCloudField(value="商品名称", example="ch的标准02")
    private String itemName;
    @ApiCloudField(value="商品系统编码", example="15")
    private Integer itemNum;
    @ApiCloudField(value="商品规格", example="2件/公斤")
    private String itemSpec;
    @ApiCloudField(value="批次号", example="20250401")
    private String lotNum;
    @ApiCloudField(value="出库类型", example="供应商退货")
    private String orderType;
    @ApiCloudField(value="ERP单号", example="MO99658990002313")
    private String outOrderFid;
    @ApiCloudField(value="出库订单号", example="CD996589925072000020")
    private String outWarehouseBookOrderFid;
    @ApiCloudField(value="出库单号", example="CK996589925079000001")
    private String outWarehouseOrderFid;
    @ApiCloudField(value="库位名称", example="zfb集货位")
    private String positionName;
    @ApiCloudField(value="生产日期", example="2025-04-01")
    private String productionDate;
    @ApiCloudField(value="原因", example="出库")
    private String reason;
    @ApiCloudField(value="仓库编码", example="996580001")
    private Integer storehouseNum;
    @ApiCloudField(value="供应商编号", example="996580001")
    private Integer supplierNum;
    @ApiCloudField(value="数量", example="21")
    private Integer total;
    @ApiCloudField(value="保质期", example="20")
    private Integer validDate;
    @ApiCloudField(value="客户编码", example="44784")
    private Integer wmsClientNum;
}
