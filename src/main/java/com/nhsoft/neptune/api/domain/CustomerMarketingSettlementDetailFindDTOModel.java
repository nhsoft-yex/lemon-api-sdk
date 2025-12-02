package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CustomerMarketingSettlementDetailFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CustomerMarketingSettlementDetailFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="结算id", required=true)
    private Long settlementId;
    @ApiCloudField(value="次卡结算的结算类型(购买记录|消费记录|退款记录|退货记录)", example="", required=true)
    private String exchangeCardSettlementScope;
    @ApiCloudField(value="查询页码", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小", example="10", required=true)
    private Integer pageSize;
}
