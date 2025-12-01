package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SupplierAgreementPledgeV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SupplierAgreementPledgeV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="押金模式", example="固定押金")
    private String agreementPledgeType;
    @ApiCloudField(value="押金金额/比例", example="1000")
    private BigDecimal agreementPledgeMoney;
    @ApiCloudField(value="押金承担类型", example="整天")
    private String branchType;
}
