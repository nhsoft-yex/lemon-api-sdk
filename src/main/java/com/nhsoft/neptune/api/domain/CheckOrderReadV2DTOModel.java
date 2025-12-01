package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CheckOrderReadV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CheckOrderReadV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="盘点单号", example="CR2072010000002", required=true)
    private String checkOrderFid;
}
