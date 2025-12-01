package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WarehouseOrderFindDTO模型
 * 入库单查询
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WarehouseOrderFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="配送中心门店编号", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="日期类型(制单日期|审核日期|入库日期|修改日期)", example="制单日期", required=true)
    private String dateType;
    @ApiCloudField(value="开始时间", required=true)
    private String dateFrom;
    @ApiCloudField(value="结束时间", required=true)
    private String dateTo;
    @ApiCloudField(value="入库类型(供应商供货|客户退货|调整入库|调拨入库)", example="供应商供货")
    private String orderType;
    @ApiCloudField(value="供应商编码列表", example="[211300170]")
    private List<Integer> supplierNums;
    @ApiCloudField(value="商品编码列表", example="[211300170]")
    private List<Integer> itemNums;
    @ApiCloudField(value="仓库编码", example="209500001")
    private Integer storehouseNum;
    @ApiCloudField(value="查询页码", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小", example="10", required=true)
    private Integer pageSize;
    @ApiCloudField(value="是否查询明细(不传默认不查询明细)", example="false")
    private Boolean withDetail;
}
