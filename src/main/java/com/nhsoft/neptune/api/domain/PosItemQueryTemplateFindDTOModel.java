package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosItemQueryTemplateFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosItemQueryTemplateFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="模板类型（查询模板、条码秤模板）", example="查询模板", required=true)
    private List<String> itemFlagTypes;
}
