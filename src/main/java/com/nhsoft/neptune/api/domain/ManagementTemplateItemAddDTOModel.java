package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ManagementTemplateItemAddDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ManagementTemplateItemAddDTOModel extends ApiCloudObject {

    @ApiCloudField(value="经营商品范围模板编码", example="1", required=true)
    private Integer managementTemplateNum;
    @ApiCloudField(value="商品编码列表", example="[434403064,434403065]", required=true)
    private List<Integer> itemNums;
}
