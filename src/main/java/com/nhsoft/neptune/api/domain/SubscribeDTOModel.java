package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SubscribeDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SubscribeDTOModel extends ApiCloudObject {

    @ApiCloudField(value="merchant_id")
    private String merchantId;
    @ApiCloudField(value="message")
    private String message;
    @ApiCloudField(value="state")
    private Boolean state;
}
