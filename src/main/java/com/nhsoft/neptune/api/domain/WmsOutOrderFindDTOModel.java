package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WmsOutOrderFindDTO模型
 * WMS出库单查询
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WmsOutOrderFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="配送中心门店编号", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="日期类型(制单日期|审核日期)", example="制单日期", required=true)
    private String dateType;
    @ApiCloudField(value="开始时间", required=true)
    private String dateFrom;
    @ApiCloudField(value="结束时间", required=true)
    private String dateTo;
    @ApiCloudField(value="供应商编码列表", example="[8]")
    private List<Integer> supplierNums;
    @ApiCloudField(value="仓库编码", example="211200001")
    private Integer storehouseNum;
    @ApiCloudField(value="出库类型(供应商退货|客户配货|调整出库)", example="客户配货")
    private String orderType;
    @ApiCloudField(value="单据状态(制单|审核)", example="制单")
    private String stateName;
    @ApiCloudField(value="客户编码列表", example="[8]")
    private List<String> clientNums;
    @ApiCloudField(value="商品编码列表", example="[211300170]")
    private List<Integer> itemNums;
    @ApiCloudField(value="erp关联调出单号", example="[MO2113992404220001]")
    private List<String> outOrderFids;
    @ApiCloudField(value="是否查询出库单明细", example="true")
    private Boolean withDetail;
    @ApiCloudField(value="查询页码", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小", example="10", required=true)
    private Integer pageSize;
    @ApiCloudField(value="出库订单号列表", example="[]")
    private List<String> outWarehouseBookOrderFids;
}
