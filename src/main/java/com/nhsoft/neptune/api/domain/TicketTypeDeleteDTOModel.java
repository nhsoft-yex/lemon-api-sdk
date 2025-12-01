package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * TicketTypeDeleteDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TicketTypeDeleteDTOModel extends ApiCloudObject {

    @ApiCloudField(value="消费券类型代码", example="0001", required=true)
    private String ticketCode;
}
