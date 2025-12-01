package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MemberPointSummaryVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MemberPointSummaryVOModel extends ApiCloudObject {

    @ApiCloudField(value="等级Id", example="1")
    private Long levelId;
    @ApiCloudField(value="等级名称", example="1")
    private String levelName;
    @ApiCloudField(value="积分余额", example="24441")
    private BigDecimal balancePoints;
}
