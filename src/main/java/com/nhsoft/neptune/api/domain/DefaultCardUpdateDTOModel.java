package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * DefaultCardUpdateDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DefaultCardUpdateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="储值卡编码", example="2055", required=true)
    private Integer cardUserNum;
    @ApiCloudField(value="会员ID", example="209500001", required=true)
    private Long customerId;
}
