package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MarketActionVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MarketActionVOModel extends ApiCloudObject {

    @ApiCloudField(value="活动编号", example="")
    private String actionId;
    @ApiCloudField(value="名称", example="")
    private String actionName;
    @ApiCloudField(value="创建时间", example="")
    private String actionCreateTime;
    @ApiCloudField(value="创建人", example="")
    private String actionCreator;
    @ApiCloudField(value="审核时间", example="")
    private String actionAuditTime;
    @ApiCloudField(value="审核人", example="")
    private String actionAuditor;
    @ApiCloudField(value="类型", example="")
    private String actionType;
    @ApiCloudField(value="状态名称", example="")
    private String stateName;
    @ApiCloudField(value="状态代码")
    private Integer stateCode;
    @ApiCloudField(value="开始日期", example="")
    private String actionDateFrom;
    @ApiCloudField(value="结束日期", example="")
    private String actionDateTo;
    @ApiCloudField(value="开始时间", example="")
    private String actionTimeFrom;
    @ApiCloudField(value="结束时间", example="")
    private String actionTimeTo;
    @ApiCloudField(value="星期", example="")
    private List<Integer> actionWeek;
    @ApiCloudField(value="抽奖设置-活动ID")
    private Long lotteryActivityId;
    @ApiCloudField(value="抽奖次数")
    private Integer lotteryTimes;
    @ApiCloudField(value="金额上限")
    private BigDecimal amountMax;
    @ApiCloudField(value="金额下限")
    private BigDecimal amountMin;
    @ApiCloudField(value="限制类型", example="")
    private String limitType;
    @ApiCloudField(value="抽奖活动名称", example="")
    private String lotteryActivityName;
    @ApiCloudField(value="action_condition")
    private PosActionParamVOModel actionCondition;
    @ApiCloudField(value="是否新版本", example="false")
    private Boolean newVersion;
    @ApiCloudField(value="明细", example="")
    private List<MarketActionDetailDTOModel> marketActionDetails;
}
