package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WholesaleInnerOrderFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WholesaleInnerOrderFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编码", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="时间类型(制单时间,审核时间,处理时间)", example="审核时间", required=true)
    private String dateType;
    @ApiCloudField(value="开始日期(yyyy-MM-dd)", example="Fri Jan 01 08:00:00 CST 2021", required=true)
    private String dateFrom;
    @ApiCloudField(value="结束日期(yyyy-MM-dd)", example="Sun Jan 03 08:00:00 CST 2021", required=true)
    private String dateTo;
    @ApiCloudField(value="单据状态(制单,待批复,批复通过,批复不通过)", example="制单")
    private String stateName;
    @ApiCloudField(value="客户编号", example="[0015005990000001]")
    private List<String> clientFids;
    @ApiCloudField(value="单据编号", example="NT2072990001259")
    private String orderFid;
    @ApiCloudField(value="原因", example="")
    private String innerOrderReason;
    @ApiCloudField(value="商品档案编号", example="")
    private List<Integer> itemNums;
    @ApiCloudField(value="是否携带明细", example="true")
    private Boolean withDetail;
    @ApiCloudField(value="查询页码", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小", example="100", required=true)
    private Integer pageSize;
}
