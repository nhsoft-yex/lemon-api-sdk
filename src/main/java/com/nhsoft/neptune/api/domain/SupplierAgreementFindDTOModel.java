package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SupplierAgreementFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SupplierAgreementFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="时间类型(审核时间、制单时间、最后修改时间、签订时间)", example="制单时间", required=true)
    private String dateType;
    @ApiCloudField(value="开始时间(yyyy-MM-dd)", example="2021-01-01", required=true)
    private String dateFrom;
    @ApiCloudField(value="结束时间(yyyy-MM-dd)", example="2021-01-03", required=true)
    private String dateTo;
    @ApiCloudField(value="查询页码,从1开始", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小,最大100", example="100", required=true)
    private Integer pageSize;
}
