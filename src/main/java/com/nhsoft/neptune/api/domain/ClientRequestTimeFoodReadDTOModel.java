package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ClientRequestTimeFoodReadDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ClientRequestTimeFoodReadDTOModel extends ApiCloudObject {

    @ApiCloudField(value="模板id", example="403", required=true)
    private Long clientRequestTimeFoodId;
}
