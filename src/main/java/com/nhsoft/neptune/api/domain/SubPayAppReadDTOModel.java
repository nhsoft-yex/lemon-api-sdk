package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SubPayAppReadDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SubPayAppReadDTOModel extends ApiCloudObject {

    @ApiCloudField(value="外部子商户号(都传时优先)", example="2072001")
    private String outSubId;
    @ApiCloudField(value="子商户号", example="1501")
    private String subAppId;
}
