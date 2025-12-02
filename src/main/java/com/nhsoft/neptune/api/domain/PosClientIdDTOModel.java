package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosClientIdDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosClientIdDTOModel extends ApiCloudObject {

    @ApiCloudField(value="客户主键（合作伙伴ID）二选一", example="99", required=true)
    private String clientFid;
}
