package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CardOrderAuditDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CardOrderAuditDTOModel extends ApiCloudObject {

    @ApiCloudField(value="card_order_fid", example="BC2072010000002", required=true)
    private String cardOrderFid;
    @ApiCloudField(value="card_order_auditor", example="system", required=true)
    private String cardOrderAuditor;
}
