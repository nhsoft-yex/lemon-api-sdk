package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BasicItemUnitGroupDetailSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BasicItemUnitGroupDetailSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="单位代码", example="01", required=true)
    private String itemUnitCode;
    @ApiCloudField(value="单位名称", example="箱", required=true)
    private String itemUnitName;
    @ApiCloudField(value="单位换算率", example="1", required=true)
    private BigDecimal itemUnitRate;
    @ApiCloudField(value="单位类型（固定换算，浮动换算）", example="固定换算", required=true)
    private String itemUnitType;
    @ApiCloudField(value="是否默认（默认换算率必须为1）", example="true", required=true)
    private Boolean itemUnitDefault;
}
