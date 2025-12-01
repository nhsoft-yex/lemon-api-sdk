package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WholesaleOrderUpdateExtendDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WholesaleOrderUpdateExtendDTOModel extends ApiCloudObject {

    @ApiCloudField(value="批发销售单号", example="WO2030990000008", required=true)
    private String wholesaleOrderFid;
    @ApiCloudField(value="扩展属性1", example="扩展属性1")
    private String wholesaleOrderExtend1;
    @ApiCloudField(value="扩展属性2", example="扩展属性2")
    private String wholesaleOrderExtend2;
    @ApiCloudField(value="扩展属性3", example="扩展属性3")
    private String wholesaleOrderExtend3;
}
