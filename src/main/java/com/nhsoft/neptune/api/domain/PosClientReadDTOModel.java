package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosClientReadDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosClientReadDTOModel extends ApiCloudObject {

    @ApiCloudField(value="客户主键（合作伙伴ID）二选一", example="99", required=true)
    private String clientFid;
    @ApiCloudField(value="合作伙伴ID（客户主键）二选一", example="11", required=true)
    private Long userCenterPartnerId;
}
