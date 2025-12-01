package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ManageTemplateFindByItemNumDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ManageTemplateFindByItemNumDTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编码", example="209500001", required=true)
    private Integer itemNum;
}
