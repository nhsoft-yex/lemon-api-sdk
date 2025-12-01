package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WmsInBookFindDTO模型
 * WMS入库单查询DTO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WmsInBookFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="配送中心门店编号", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="日期类型(制单日期|审核日期)", example="审核日期", required=true)
    private String dateType;
    @ApiCloudField(value="开始时间", required=true)
    private String dateFrom;
    @ApiCloudField(value="结束时间", required=true)
    private String dateTo;
    @ApiCloudField(value="供应商编码列表", example="[8]")
    private List<Integer> supplierNums;
    @ApiCloudField(value="外部单号列表", example="[8123123]")
    private List<String> outOrderFids;
    @ApiCloudField(value="单据状态(制单|审核|作废|关闭)", example="审核")
    private String stateName;
    @ApiCloudField(value="单据状态(未处理|全部生成收货任务|部分入库|全部入库|失效|部分生成收货任务)", example="全部入库")
    private String receiveStateName;
    @ApiCloudField(value="商品编码列表", example="[211300170]")
    private List<Integer> itemNums;
    @ApiCloudField(value="是否查询订单明细", example="true")
    private Boolean withDetail;
    @ApiCloudField(value="查询页码", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小", example="10", required=true)
    private Integer pageSize;
}
