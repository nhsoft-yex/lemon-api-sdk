package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CheckOrderFindV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CheckOrderFindV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编码", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="起始时间", example="2021-01-20", required=true)
    private String dateFrom;
    @ApiCloudField(value="结束时间", example="2021-01-20", required=true)
    private String dateTo;
    @ApiCloudField(value="查询页码", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小", example="10", required=true)
    private Integer pageSize;
    @ApiCloudField(value="时间类型", example="审核时间", required=true)
    private String dateType;
    @ApiCloudField(value="仓库编码", example="150050001")
    private Integer storehouseNum;
    @ApiCloudField(value="是否返回明细", example="true")
    private Boolean withDetails;
}
