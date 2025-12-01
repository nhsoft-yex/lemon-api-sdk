package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * InvoiceChannelReadDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class InvoiceChannelReadDTOModel extends ApiCloudObject {

    @ApiCloudField(value="应用类型(AMA|BARB|MER|MARS)", example="AMA", required=true)
    private String appType;
}
