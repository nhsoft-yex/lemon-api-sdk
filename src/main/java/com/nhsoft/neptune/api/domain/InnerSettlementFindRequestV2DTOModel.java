package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * InnerSettlementFindRequestV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class InnerSettlementFindRequestV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编码（时间类型为最后修改时间允许为空）", example="1")
    private Integer branchNum;
    @ApiCloudField(value="时间类型(制单时间|审核时间|付款日期|最后修改时间)", example="审核时间", required=true)
    private String dateType;
    @ApiCloudField(value="开始时间（yyyy-MM-dd）", example="1990-01-01", required=true)
    private String dateFrom;
    @ApiCloudField(value="结束时间（yyyy-MM-dd）", example="1990-01-01", required=true)
    private String dateTo;
    @ApiCloudField(value="查询页码", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小", example="10", required=true)
    private Integer pageSize;
    @ApiCloudField(value="开始时间(HH:mm:ss)", example="13:00:00")
    private String timeFrom;
    @ApiCloudField(value="结束时间(HH:mm:ss)", example="14:00:00")
    private String timeTo;
}
