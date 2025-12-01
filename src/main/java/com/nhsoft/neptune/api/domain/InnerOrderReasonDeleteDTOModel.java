package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * InnerOrderReasonDeleteDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class InnerOrderReasonDeleteDTOModel extends ApiCloudObject {

    @ApiCloudField(value="退货原因代码", example="001", required=true)
    private List<String> reasonCodes;
}
