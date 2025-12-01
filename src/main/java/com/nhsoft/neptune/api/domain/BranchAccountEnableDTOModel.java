package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BranchAccountEnableDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BranchAccountEnableDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编码", example="1", required=true)
    private Integer branchNum;
    @ApiCloudField(value="账户余额", example="0.0", required=true)
    private BigDecimal branchMoney;
}
