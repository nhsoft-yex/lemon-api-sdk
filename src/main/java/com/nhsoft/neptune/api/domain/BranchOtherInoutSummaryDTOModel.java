package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BranchOtherInoutSummaryDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BranchOtherInoutSummaryDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编码", example="1")
    private Integer branchNum;
    @ApiCloudField(value="支付方式", example="现金")
    private String paymentType;
    @ApiCloudField(value="费用项目", example="红包")
    private String otherInoutKind;
    @ApiCloudField(value="费用总金额（小数点两位）", example="1.0")
    private BigDecimal otherInoutTotalMoney;
}
