package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MemberGrowthFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MemberGrowthFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="查询页码 从1开始", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小（最大200）", example="10", required=true)
    private Integer pageSize;
    @ApiCloudField(value="会员ID", example="207200025932", required=true)
    private String customerId;
}
