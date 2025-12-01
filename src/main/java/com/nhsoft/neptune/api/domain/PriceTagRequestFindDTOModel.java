package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PriceTagRequestFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PriceTagRequestFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="申请分店", example="1")
    private List<Integer> branchNums;
    @ApiCloudField(value="开始时间", required=true)
    private String dateFrom;
    @ApiCloudField(value="结束时间", required=true)
    private String dateTo;
    @ApiCloudField(value="时间类型(申请时间、审核时间)", example="审核时间", required=true)
    private String dateType;
    @ApiCloudField(value="查询分页页码", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小(最大1000)", example="100", required=true)
    private Integer pageSize;
}
