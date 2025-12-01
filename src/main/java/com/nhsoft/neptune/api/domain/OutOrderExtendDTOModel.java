package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * OutOrderExtendDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class OutOrderExtendDTOModel extends ApiCloudObject {

    @ApiCloudField(value="调出单号", example="MO4344990004979", required=true)
    private String outOrderFid;
    @ApiCloudField(value="调出单扩展字段", example="扩展字段1", required=true)
    private String outOrderExtend1;
}
