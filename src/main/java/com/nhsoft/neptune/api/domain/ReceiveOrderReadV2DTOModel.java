package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ReceiveOrderReadV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ReceiveOrderReadV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="收货单号", example="PI2003990000002", required=true)
    private String receiveOrderFid;
}
