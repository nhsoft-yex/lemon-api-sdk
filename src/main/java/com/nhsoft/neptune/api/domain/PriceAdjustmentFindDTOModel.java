package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PriceAdjustmentFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PriceAdjustmentFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="申请门店编码", example="99")
    private Integer branchNum;
    @ApiCloudField(value="应用门店编码", example="1")
    private Integer applyBranchNum;
    @ApiCloudField(value="时间类型(审核时间|制单时间|最后修改时间)", example="审核时间", required=true)
    private String dateType;
    @ApiCloudField(value="开始时间(yyyy-MM-dd)", example="Fri Jan 01 08:00:00 CST 2021", required=true)
    private String dateFrom;
    @ApiCloudField(value="结束时间(yyyy-MM-dd)", example="Fri Jan 01 08:00:00 CST 2021", required=true)
    private String dateTo;
    @ApiCloudField(value="time_from")
    private LocalTimeModel timeFrom;
    @ApiCloudField(value="time_to")
    private LocalTimeModel timeTo;
    @ApiCloudField(value="单据状态(1-制单;3-制单|审核;7-制单|审核|作废)", example="1")
    private Integer stateCode;
    @ApiCloudField(value="查询页码", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小(最大为1000)", example="10", required=true)
    private Integer pageSize;
}
