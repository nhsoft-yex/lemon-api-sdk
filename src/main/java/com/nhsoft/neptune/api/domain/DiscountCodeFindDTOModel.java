package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * DiscountCodeFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DiscountCodeFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="关键字", example="")
    private String keywords;
    @ApiCloudField(value="状态", example="false")
    private Boolean status;
    @ApiCloudField(value="应用门店范围", example="")
    private List<Integer> appliedBranchNums;
    @ApiCloudField(value="查询页码", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小", example="200", required=true)
    private Integer pageSize;
}
