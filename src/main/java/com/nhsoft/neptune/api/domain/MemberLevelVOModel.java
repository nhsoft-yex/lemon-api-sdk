package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MemberLevelVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MemberLevelVOModel extends ApiCloudObject {

    @ApiCloudField(value="会员等级编号", example="207200000037")
    private String levelId;
    @ApiCloudField(value="会员等级名称", example="一级会员")
    private String levelName;
    @ApiCloudField(value="等级", example="1")
    private Integer rank;
    @ApiCloudField(value="是否需要购买", example="true")
    private Boolean needPay;
    @ApiCloudField(value="状态(ENABLED|DISABLED)", example="ENABLED")
    private String state;
}
