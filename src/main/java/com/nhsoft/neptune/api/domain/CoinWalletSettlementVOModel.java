package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CoinWalletSettlementVO模型
 * 零钱包结算VO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CoinWalletSettlementVOModel extends ApiCloudObject {

    @ApiCloudField(value="ID")
    private Long id;
    @ApiCloudField(value="结算范围", example="")
    private String settlementScope;
    @ApiCloudField(value="优惠券结算时的券类型ID列表", example="")
    private List<Long> couponTypeIds;
    @ApiCloudField(value="次卡结算时的结算范围", example="")
    private List<String> exchangeCardSettlementScopes;
    @ApiCloudField(value="礼品/次卡结算时的卡类型列表", example="")
    private List<Long> cardTypeIds;
    @ApiCloudField(value="结算门店编号")
    private Integer branchNum;
    @ApiCloudField(value="结算门店名称", example="")
    private String branchName;
    @ApiCloudField(value="结算截止日期")
    private String settlementEndDate;
    @ApiCloudField(value="存入金额")
    private BigDecimal increaseMoney;
    @ApiCloudField(value="扣款金额")
    private BigDecimal decreaseMoney;
    @ApiCloudField(value="金额")
    private BigDecimal money;
    @ApiCloudField(value="结算金额")
    private BigDecimal settlementMoney;
    @ApiCloudField(value="单据状态(制单、审核)", example="审核")
    private String status;
    @ApiCloudField(value="创建人", example="")
    private String createdBy;
    @ApiCloudField(value="创建时间")
    private String createdAt;
    @ApiCloudField(value="更新人", example="")
    private String updatedBy;
    @ApiCloudField(value="更新时间")
    private String updatedAt;
    @ApiCloudField(value="审核人", example="")
    private String auditedBy;
    @ApiCloudField(value="审核时间")
    private String auditedAt;
    @ApiCloudField(value="备注", example="")
    private String memo;
}
