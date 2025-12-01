package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PolicyItemTemplateFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PolicyItemTemplateFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="促销商品模板编号", example="[207200000037]", required=true)
    private List<String> policyItemTemplateNos;
}
