package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WmsReturnOrderFindDTO模型
 * WMS销退订单查询
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WmsReturnOrderFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="配送中心门店编号", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="日期类型(制单日期|审核日期|入库日期|修改日期)", example="制单日期", required=true)
    private String dateType;
    @ApiCloudField(value="开始时间", required=true)
    private String dateFrom;
    @ApiCloudField(value="结束时间", required=true)
    private String dateTo;
    @ApiCloudField(value="入库状态(未处理|已生成任务|部分入库|全部入库)", example="未处理")
    private String stateName;
    @ApiCloudField(value="单据状态(制单|待批复|作废|批复通过|批复不通过)", example="制单")
    private String outStateName;
    @ApiCloudField(value="客户编码列表", example="[211300170]")
    private List<String> clientNums;
    @ApiCloudField(value="商品编码列表", example="[211300170]")
    private List<Integer> itemNums;
    @ApiCloudField(value="查询页码", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小", example="10", required=true)
    private Integer pageSize;
    @ApiCloudField(value="是否查询明细(不传默认不查询明细)", example="false")
    private Boolean withDetail;
}
