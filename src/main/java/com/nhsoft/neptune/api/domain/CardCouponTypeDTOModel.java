package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CardCouponTypeDTO模型
 * 券类型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CardCouponTypeDTOModel extends ApiCloudObject {

    @ApiCloudField(value="消费券类型", example="MONEY")
    private String category;
    @ApiCloudField(value="消费券折扣", example="0.8")
    private BigDecimal discount;
    @ApiCloudField(value="消费券类型编号", example="1")
    private Integer id;
    @ApiCloudField(value="消费券类型名称", example="折扣券")
    private String name;
    @ApiCloudField(value="消费券面值", example="10.0")
    private BigDecimal value;
}
