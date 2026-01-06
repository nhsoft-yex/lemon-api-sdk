package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * AppPriceJsonTagVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AppPriceJsonTagVOModel extends ApiCloudObject {

    @ApiCloudField(value="report_name")
    private String reportName;
    @ApiCloudField(value="report_json")
    private String reportJson;
    @ApiCloudField(value="item_json")
    private String itemJson;
}
