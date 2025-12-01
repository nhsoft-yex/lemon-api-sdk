package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * FundOrderCheckDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class FundOrderCheckDTOModel extends ApiCloudObject {

    @ApiCloudField(value="单据ID", example="RC0102720250806000005")
    private String id;
}
