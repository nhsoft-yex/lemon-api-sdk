package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosOtherInoutDateFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosOtherInoutDateFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编码", example="1")
    private List<Integer> branchNums;
    @ApiCloudField(value="起始时间(最后更新时间)", example="2022-01-08 10:00:00", required=true)
    private String dateFrom;
    @ApiCloudField(value="结束时间(最后更新时间)", example="2022-01-09 10:00:00")
    private String dateTo;
    @ApiCloudField(value="查询页码 从1开始", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小（最大1000）", example="10", required=true)
    private Integer pageSize;
}
