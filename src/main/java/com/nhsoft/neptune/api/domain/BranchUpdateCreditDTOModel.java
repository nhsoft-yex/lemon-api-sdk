package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BranchUpdateCreditDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BranchUpdateCreditDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编码", example="99")
    private Integer branchNum;
    @ApiCloudField(value="信用额度", example="100.0")
    private BigDecimal branchCreditLimit;
}
