package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ClientSettlementReadDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ClientSettlementReadDTOModel extends ApiCloudObject {

    @ApiCloudField(value="客户结算单号", example="RP4344990002262", required=true)
    private String clientSettlementNo;
}
