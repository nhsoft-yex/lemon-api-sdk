package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ItemSpecLocationFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ItemSpecLocationFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="用户中心门店id列表", example="[105657]")
    private List<Long> branchIds;
    @ApiCloudField(value="查询页码", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小（最大为200）", example="10", required=true)
    private Integer pageSize;
}
