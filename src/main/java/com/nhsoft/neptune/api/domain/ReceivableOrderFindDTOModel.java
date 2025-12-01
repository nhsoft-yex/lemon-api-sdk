package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ReceivableOrderFindDTO模型
 * 应收单查询
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ReceivableOrderFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="开始时间", example="2021-01-01")
    private String dateFrom;
    @ApiCloudField(value="结束时间", example="2021-01-01")
    private String dateTo;
    @ApiCloudField(value="目标单位ID", example="R00001000294")
    private String dstUnitId;
    @ApiCloudField(value="源单位ID", example="R00001000014")
    private String srcUnitId;
    @ApiCloudField(value="查询页码", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小", example="10", required=true)
    private Integer pageSize;
    @ApiCloudField(value="状态（CREATED|AUDITED|CANCELED|CONFIRMED|VERIFYING|VERIFIED）", example="AUDITED")
    private String state;
}
