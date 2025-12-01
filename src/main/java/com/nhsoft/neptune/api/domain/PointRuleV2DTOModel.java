package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PointRuleV2DTO模型
 * 积分规则
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PointRuleV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="rule_id")
    private Long ruleId;
    @ApiCloudField(value="rule_name")
    private String ruleName;
    @ApiCloudField(value="rule_creator")
    private String ruleCreator;
    @ApiCloudField(value="rule_create_time")
    private String ruleCreateTime;
    @ApiCloudField(value="rule_type")
    private String ruleType;
    @ApiCloudField(value="rule_money")
    private BigDecimal ruleMoney;
    @ApiCloudField(value="rule_value")
    private Integer ruleValue;
    @ApiCloudField(value="enable_birthday_point")
    private Boolean enableBirthdayPoint;
    @ApiCloudField(value="birthday_point_value")
    private BigDecimal birthdayPointValue;
    @ApiCloudField(value="discount_item_no_point")
    private Boolean discountItemNoPoint;
    @ApiCloudField(value="point_category_params")
    private List<PointCategoryParamV2DTOModel> pointCategoryParams;
}
