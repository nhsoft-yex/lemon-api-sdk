package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BranchOtherInoutFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BranchOtherInoutFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="结算门店编码或被结算门店编码", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="时间类型", example="审核时间", required=true)
    private String dateType;
    @ApiCloudField(value="开始时间", example="2021-01-01", required=true)
    private String dateFrom;
    @ApiCloudField(value="结束时间", example="2021-01-01", required=true)
    private String dateTo;
    @ApiCloudField(value="开始时间", example="00:00:00")
    private String timeFrom;
    @ApiCloudField(value="结束时间", example="00:00:00")
    private String timeTo;
    @ApiCloudField(value="查询页码", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小", example="10", required=true)
    private Integer pageSize;
    @ApiCloudField(value="排序字段", example="other_inout_date")
    private String sortField;
    @ApiCloudField(value="排序类型", example="desc")
    private String sortName;
}
