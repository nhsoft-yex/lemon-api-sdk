package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * InnerOrderReasonResponseDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class InnerOrderReasonResponseDTOModel extends ApiCloudObject {

    @ApiCloudField(value="退货原因代码", example="001")
    private String reasonCode;
    @ApiCloudField(value="退货原因名称", example="退货")
    private String reasonName;
}
