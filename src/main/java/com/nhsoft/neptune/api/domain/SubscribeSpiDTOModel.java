package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SubscribeSpiDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SubscribeSpiDTOModel extends ApiCloudObject {

    @ApiCloudField(value="merchant_id")
    private String merchantId;
    @ApiCloudField(value="app_id")
    private String appId;
    @ApiCloudField(value="spi_name")
    private String spiName;
    @ApiCloudField(value="check_func")
    private String checkFunc;
    @ApiCloudField(value="check_action")
    private String checkAction;
    @ApiCloudField(value="request_url")
    private String requestUrl;
    @ApiCloudField(value="except_result")
    private String exceptResult;
    @ApiCloudField(value="state")
    private Boolean state;
}
