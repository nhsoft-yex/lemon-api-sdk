package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ManagementTemplateReadDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ManagementTemplateReadDTOModel extends ApiCloudObject {

    @ApiCloudField(value="经营商品范围模板编码", example="1", required=true)
    private Integer managementTemplateNum;
}
