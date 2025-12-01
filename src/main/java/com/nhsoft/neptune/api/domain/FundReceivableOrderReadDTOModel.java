package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * FundReceivableOrderReadDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class FundReceivableOrderReadDTOModel extends ApiCloudObject {

    @ApiCloudField(value="应收单ID", example="PN0000120200616000001", required=true)
    private String id;
}
