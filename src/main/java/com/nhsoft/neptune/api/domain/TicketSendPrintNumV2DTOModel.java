package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * TicketSendPrintNumV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TicketSendPrintNumV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="消费券券号", example="98001201931170003", required=true)
    private String ticketSendDetailPrintNum;
    @ApiCloudField(value="不过滤消费券状态", example="false")
    private Boolean getAll;
}
