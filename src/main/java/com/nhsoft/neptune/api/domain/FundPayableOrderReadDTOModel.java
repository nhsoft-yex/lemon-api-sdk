package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * FundPayableOrderReadDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class FundPayableOrderReadDTOModel extends ApiCloudObject {

    @ApiCloudField(value="应付单ID", example="PN0101720250606000001", required=true)
    private String id;
}
