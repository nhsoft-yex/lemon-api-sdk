package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * AllocationFindV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AllocationFindV2DTOModel extends ApiCloudObject {

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
    @ApiCloudField(value="转入仓库编码", example="203000002")
    private Integer inStorehouseNum;
    @ApiCloudField(value="转出仓库编码", example="203000002")
    private Integer outStorehouseNum;
    @ApiCloudField(value="state_code")
    private Integer stateCode;
}
