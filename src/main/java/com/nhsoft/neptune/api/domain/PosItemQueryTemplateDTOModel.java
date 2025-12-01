package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosItemQueryTemplateDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosItemQueryTemplateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="模板编码")
    private Integer itemFlagNum;
    @ApiCloudField(value="模板名称", example="true")
    private String itemFlagName;
    @ApiCloudField(value="模板类型", example="true")
    private String itemFlagType;
    @ApiCloudField(value="商品编码列表", example="true")
    private List<Integer> itemNums;
}
