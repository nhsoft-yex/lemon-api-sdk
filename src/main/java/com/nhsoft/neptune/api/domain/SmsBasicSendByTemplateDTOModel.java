package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SmsBasicSendByTemplateDTO模型
 * 短信基础模板
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SmsBasicSendByTemplateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="参数", example="{\"phone\":\"18867860973\",\"date\":\"2022-02-24\"}", required=true)
    private String params;
    @ApiCloudField(value="电话", example="18888323444", required=true)
    private String phone;
    @ApiCloudField(value="模板ID", example="2", required=true)
    private Integer templateId;
}
