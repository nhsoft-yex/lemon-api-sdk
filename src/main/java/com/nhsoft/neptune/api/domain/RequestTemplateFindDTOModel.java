package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * RequestTemplateFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RequestTemplateFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编码", example="1")
    private Integer branchNum;
    @ApiCloudField(value="查询明细", example="false")
    private Boolean withDetails;
}
