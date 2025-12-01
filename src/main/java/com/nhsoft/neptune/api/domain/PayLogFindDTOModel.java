package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PayLogFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PayLogFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="支付流水号", example="564306837")
    private String payId;
    @ApiCloudField(value="渠道业务流水号", example="4200001393202203210905931776")
    private String transactionNo;
    @ApiCloudField(value="渠道名称", example="中国建设银行-广州")
    private String channelName;
    @ApiCloudField(value="起始时间", example="2021-01-21 00:00:00")
    private String dateFrom;
    @ApiCloudField(value="结束时间", example="2021-01-21 00:00:00")
    private String dateTo;
    @ApiCloudField(value="查询分页页码", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小(最大100)", example="100", required=true)
    private Integer pageSize;
    @ApiCloudField(value="query_by_pay")
    private Boolean queryByPay;
    @ApiCloudField(value="realtime")
    private Boolean realtime;
    @ApiCloudField(value="子商户号", example="1")
    private List<Integer> subAppIds;
    @ApiCloudField(value="外部子商户号", example="[202311090001]")
    private List<String> outSubIds;
    @ApiCloudField(value="单据类型(卡存款|换卡|续卡|全渠道会员|POS其他收支|POS消费|码牌支付|交班收入)", example="卡存款")
    private String orderType;
}
