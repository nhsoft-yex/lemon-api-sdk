package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CustomerSupplementFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CustomerSupplementFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="会员ID", required=true)
    private Long customerId;
}
