package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BasicFeeItemDeleteDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BasicFeeItemDeleteDTOModel extends ApiCloudObject {

    @ApiCloudField(value="费用项目代码列表", example="01", required=true)
    private List<String> feeItemCodes;
}
