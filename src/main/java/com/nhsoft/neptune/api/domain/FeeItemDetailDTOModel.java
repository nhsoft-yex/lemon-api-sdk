package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * FeeItemDetailDTO模型
 * 应收单/应付单费用项目
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class FeeItemDetailDTOModel extends ApiCloudObject {

    @ApiCloudField(value="金额", required=true)
    private BigDecimal amount;
    @ApiCloudField(value="费用项目名称", required=true)
    private String feeItemName;
}
