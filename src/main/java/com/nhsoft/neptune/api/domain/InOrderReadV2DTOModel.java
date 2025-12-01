package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * InOrderReadV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class InOrderReadV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="调入单号", example="MI4344980000013", required=true)
    private String inOrderFid;
}
