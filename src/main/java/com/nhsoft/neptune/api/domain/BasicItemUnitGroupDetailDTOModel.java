package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BasicItemUnitGroupDetailDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BasicItemUnitGroupDetailDTOModel extends ApiCloudObject {

    @ApiCloudField(value="单位代码", example="01")
    private String itemUnitCode;
    @ApiCloudField(value="单位名称", example="箱")
    private String itemUnitName;
    @ApiCloudField(value="单位换算率", example="1")
    private BigDecimal itemUnitRate;
    @ApiCloudField(value="单位类型", example="固定换算率")
    private String itemUnitType;
    @ApiCloudField(value="是否默认", example="true")
    private Object itemUnitDefault;
}
