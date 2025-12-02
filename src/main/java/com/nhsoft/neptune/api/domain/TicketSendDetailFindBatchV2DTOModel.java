package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * TicketSendDetailFindBatchV2DTO模型
 * 优惠券发放明细批量查询V2DTO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TicketSendDetailFindBatchV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="时间类型(发券日期,消费日期,有效日期,生效日期)", example="发券日期", required=true)
    private String dateType;
    @ApiCloudField(value="开始时间(yyyy-MM-dd)", example="2021-01-21", required=true)
    private String dateFrom;
    @ApiCloudField(value="结束时间(yyyy-MM-dd)", example="2021-01-21", required=true)
    private String dateTo;
    @ApiCloudField(value="活动ID", example="MA2072990000012")
    private String actionId;
    @ApiCloudField(value="排序字段", example="ticket_send_detail_valid_date")
    private String sortField;
    @ApiCloudField(value="排序类型(ASC,DESC)", example="")
    private String sortName;
    @ApiCloudField(value="查询页码", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小(最大为1000)", example="10", required=true)
    private Integer pageSize;
}
