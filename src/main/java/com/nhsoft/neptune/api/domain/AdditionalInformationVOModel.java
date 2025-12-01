package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * AdditionalInformationVO模型
 * 收款单附加信息
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AdditionalInformationVOModel extends ApiCloudObject {

    @ApiCloudField(value="收款冻结单号", example="RF0102620250710000001")
    private String applyOrderId;
    @ApiCloudField(value="关联单据号", example="WB99675990000905")
    private String orderNo;
}
