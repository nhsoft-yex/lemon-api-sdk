package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WmsOutBookFindDTO模型
 * WMS出库单查询
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WmsOutBookFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="配送中心门店编号", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="日期类型(制单日期|审核日期|期望出库日期)", example="制单日期", required=true)
    private String dateType;
    @ApiCloudField(value="开始时间", required=true)
    private String dateFrom;
    @ApiCloudField(value="结束时间", required=true)
    private String dateTo;
    @ApiCloudField(value="关联要货单号", example="YH2113132404220001")
    private String requestOrderFid;
    @ApiCloudField(value="客户编码列表", example="[8]")
    private List<String> clientNums;
    @ApiCloudField(value="单据状态(制单|审核|作废)", example="制单")
    private String stateName;
    @ApiCloudField(value="出库状态(未出库|部分出库|全部出库)", example="未出库")
    private String outState;
    @ApiCloudField(value="商品编码列表", example="[211300170]")
    private List<Integer> itemNums;
    @ApiCloudField(value="是否生成波次", example="true")
    private Boolean hasWavePlan;
    @ApiCloudField(value="是否查询订单明细", example="true")
    private Boolean withDetail;
    @ApiCloudField(value="查询页码", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小", example="10", required=true)
    private Integer pageSize;
}
