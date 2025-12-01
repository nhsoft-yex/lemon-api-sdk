package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosItemLogFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosItemLogFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店", example="1", required=true)
    private Integer branchNum;
    @ApiCloudField(value="开始日期", example="2021-11-01", required=true)
    private String dateFrom;
    @ApiCloudField(value="结束日期", example="2021-11-30", required=true)
    private String dateTo;
    @ApiCloudField(value="开始时间", example="00:00:00")
    private String timeFrom;
    @ApiCloudField(value="结束时间", example="23:59:59")
    private String timeTo;
    @ApiCloudField(value="商品编码列表(用,间隔)", example="434400001")
    private List<Integer> itemNums;
    @ApiCloudField(value="仓库编码列表(用,间隔)", example="434400001")
    private List<Integer> storehouseNums;
    @ApiCloudField(value="摘要(用,间隔)", example="调入单,调出单,收货单,退货单,二次成品申请,二次成品单,盘点单,调整单,生产入库单,加工单,转仓单,前台销售,批发销售,批发退货,制单拆分,制单组合,成本调整单,积分兑换,前台销售反结账,费用分摊单,成本结转调整,结转单,内部申请单")
    private List<String> logSummarys;
    @ApiCloudField(value="查询页码 从1开始", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小， 最大2000", example="200", required=true)
    private Integer pageSize;
    @ApiCloudField(value="日期类型（审核时间|操作日期）,默认为审核时间", example="审核时间")
    private String dateType;
    @ApiCloudField(value="排序字段", example="出入库时间，操作时间，商品")
    private String sortField;
    @ApiCloudField(value="排序方法", example="asc：正序， desc：倒叙")
    private String sortType;
}
