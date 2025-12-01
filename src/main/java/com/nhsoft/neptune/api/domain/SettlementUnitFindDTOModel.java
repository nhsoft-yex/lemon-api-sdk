package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SettlementUnitFindDTO模型
 * 往来单位查询DTO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SettlementUnitFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="类型（BRANCH,SUPPLIER,CLIENT,DISTRIBUTOR）", example="BRANCH")
    private String type;
    @ApiCloudField(value="是否启用（true:启用，false:未启用）", example="true")
    private String unitEnable;
    @ApiCloudField(value="查询页码", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="分页大小", example="100", required=true)
    private Integer pageSize;
}
