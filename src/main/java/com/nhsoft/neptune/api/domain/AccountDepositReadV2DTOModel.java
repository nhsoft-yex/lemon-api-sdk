package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * AccountDepositReadV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AccountDepositReadV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="单据号", example="150200002", required=true)
    private String accountDepositFid;
}
