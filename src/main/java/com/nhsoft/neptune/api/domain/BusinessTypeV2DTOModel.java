package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BusinessTypeV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BusinessTypeV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="营业支付类型", example="营业收入")
    private String businessType;
    @ApiCloudField(value="支付方式汇总", example="")
    private List<PaymentTypeV2DTOModel> paymentTypes;
}
