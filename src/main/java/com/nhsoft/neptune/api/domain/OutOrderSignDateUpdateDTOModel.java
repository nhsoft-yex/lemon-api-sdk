package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * OutOrderSignDateUpdateDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class OutOrderSignDateUpdateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="调出单号", example="MO4344990004979", required=true)
    private String outOrderFid;
    @ApiCloudField(value="签收日期", example="2024-10-21 10:34:00", required=true)
    private String signDate;
}
