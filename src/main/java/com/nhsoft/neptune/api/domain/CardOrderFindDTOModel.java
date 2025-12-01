package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CardOrderFindDTO模型
 * 会员卡订单查询DTO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CardOrderFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编号", example="1")
    private List<Integer> branchNums;
    @ApiCloudField(value="日期类型(制单时间|审核时间)", example="制单时间", required=true)
    private String dateType;
    @ApiCloudField(value="开始时间", example="2022-09-03", required=true)
    private String dateFrom;
    @ApiCloudField(value="结束时间", example="2022-09-04", required=true)
    private String dateTo;
    @ApiCloudField(value="付款方式", example="现金")
    private String cardOrderPaymentType;
    @ApiCloudField(value="单据状态(制单|审核)", example="制单")
    private String state;
    @ApiCloudField(value="审核人", example="system")
    private String cardOrderAuditor;
    @ApiCloudField(value="团购类型", example="团购制卡")
    private String cardOrderType;
    @ApiCloudField(value="查询页码 从1开始", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小（最大100）", example="100", required=true)
    private Integer pageSize;
}
