package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MemberPointSummaryChangeVO模型
 * 会员积分汇总变更VO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MemberPointSummaryChangeVOModel extends ApiCloudObject {

    @ApiCloudField(value="等级Id", example="1", required=true)
    private Long levelId;
    @ApiCloudField(value="等级名称", example="1", required=true)
    private String levelName;
    @ApiCloudField(value="增加积分数", example="13488415", required=true)
    private BigDecimal addBalance;
    @ApiCloudField(value="增加积分笔数", example="72930", required=true)
    private Integer addCount;
    @ApiCloudField(value="减少积分数", example="1727353", required=true)
    private BigDecimal minusBalance;
    @ApiCloudField(value="减少积分笔数", example="24441", required=true)
    private Integer minusCount;
}
