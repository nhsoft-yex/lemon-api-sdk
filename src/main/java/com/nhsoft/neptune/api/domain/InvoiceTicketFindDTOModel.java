package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * InvoiceTicketFindDTO模型
 * 发票查询DTO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class InvoiceTicketFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="appType", example="")
    private String appType;
    @ApiCloudField(value="查询结束时间", example="")
    private String dateEnd;
    @ApiCloudField(value="查询起始时间", example="")
    private String dateStart;
    @ApiCloudField(value="更新时间开始")
    private String updatedStart;
    @ApiCloudField(value="更新时间结束")
    private String updatedEnd;
    @ApiCloudField(value="状态", example="")
    private String status;
    @ApiCloudField(value="单据号", example="")
    private String posOrderNo;
    @ApiCloudField(value="查询页码", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小", example="10", required=true)
    private Integer pageSize;
}
