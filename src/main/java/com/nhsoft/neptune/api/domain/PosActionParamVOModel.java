package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosActionParamVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosActionParamVOModel extends ApiCloudObject {

    @ApiCloudField(value="订单超额累加", example="false")
    private Boolean actionIncrease;
    @ApiCloudField(value="活动门店", example="")
    private List<Integer> branchs;
    @ApiCloudField(value="支付方式", example="")
    private List<String> paymentTypes;
    @ApiCloudField(value="商品范围类型", example="")
    private String actionType;
    @ApiCloudField(value="单次最多赠券份数")
    private Integer mostCount;
    @ApiCloudField(value="指定商品编号", example="")
    private List<Integer> itemNums;
    @ApiCloudField(value="指定类别代码", example="")
    private List<String> itemTypes;
    @ApiCloudField(value="例外商品编号", example="")
    private List<Integer> otherItemNums;
    @ApiCloudField(value="例外日期", example="")
    private List<Integer> exceptDate;
    @ApiCloudField(value="储值卡类型", example="")
    private List<String> cardUserTypes;
    @ApiCloudField(value="会员等级", example="")
    private List<Long> vipLevelOfflines;
    @ApiCloudField(value="首次存款赠券", example="false")
    private Boolean firstAction;
    @ApiCloudField(value="仅限参与一次", example="false")
    private Boolean onlyJoinInOnce;
    @ApiCloudField(value="单店份数上限")
    private Integer actionBranchLimit;
    @ApiCloudField(value="活动赠券份数")
    private Integer actionTotalLimit;
    @ApiCloudField(value="使用了消费券的订单不赠券", example="false")
    private Boolean useTicketNoSendTicket;
    @ApiCloudField(value="起赠金额")
    private BigDecimal actionMoney;
    @ApiCloudField(value="整单退货后返回次数", example="false")
    private Boolean fullOrderReturnCount;
    @ApiCloudField(value="是否开启单会员参与总数", example="false")
    private Boolean enableSingleMemberTotalCount;
    @ApiCloudField(value="单会员参与总数")
    private Integer singleMemberTotalCount;
    @ApiCloudField(value="是否开启单会员每日参与总数", example="false")
    private Boolean enableSingleMemberEverydayTotalCount;
    @ApiCloudField(value="单会员每日参与总数")
    private Integer singleMemberEverydayTotalCount;
}
