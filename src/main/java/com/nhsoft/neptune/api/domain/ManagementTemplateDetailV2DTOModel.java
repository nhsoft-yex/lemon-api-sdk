package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ManagementTemplateDetailV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ManagementTemplateDetailV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编码", example="")
    private Object itemNum;
    @ApiCloudField(value="经营范围编码", example="")
    private Object managementTemplateNum;
}
