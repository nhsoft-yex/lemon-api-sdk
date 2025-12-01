package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * RequestTemplateReadDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RequestTemplateReadDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店要货模板编号", example="434401000085", required=true)
    private Long templateNum;
}
