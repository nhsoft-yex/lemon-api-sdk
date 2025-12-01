package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MarketActionDetailDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MarketActionDetailDTOModel extends ApiCloudObject {

    @ApiCloudField(value="活动编号", example="ACT001")
    private String actionId;
    @ApiCloudField(value="活动明细编号", example="1")
    private Integer marketActionDetailNum;
    @ApiCloudField(value="账套号编号", example="SB001")
    private String systemBookCode;
    @ApiCloudField(value="门店编号", example="1001")
    private Integer branchNum;
    @ApiCloudField(value="数量", example="100")
    private Integer marketActionDetailAmount;
    @ApiCloudField(value="券类型代码", example="1")
    private Long marketActionDetailTypeCode;
    @ApiCloudField(value="券类型名称", example="满减券")
    private String marketActionDetailTypeName;
    @ApiCloudField(value="有效期类型", example="FIXED")
    private String marketActionDetailValidType;
    @ApiCloudField(value="开始日期", example="2025-01-01")
    private String marketActionDetailEffectiveDate;
    @ApiCloudField(value="结束日期", example="2025-12-31")
    private String marketActionDetailDate;
    @ApiCloudField(value="生效天数", example="1")
    private Integer marketActionDetailStart;
    @ApiCloudField(value="有效天数", example="30")
    private Integer marketActionDetailDay;
    @ApiCloudField(value="券可用门店", example="[1001, 1002]")
    private List<Integer> marketActionDetailBranch;
    @ApiCloudField(value="面值", example="10.0")
    private BigDecimal marketActionDetailValue;
    @ApiCloudField(value="仅发券店使用", example="true")
    private Boolean marketActionDetailSelfBranch;
    @ApiCloudField(value="是否随机金额", example="false")
    private Boolean marketActionDetailAutoValue;
    @ApiCloudField(value="随机最小面值", example="5")
    private Integer marketActionDetailValueMin;
    @ApiCloudField(value="随机最大面值", example="20")
    private Integer marketActionDetailValueMax;
    @ApiCloudField(value="阶梯起赠付款金额", example="100.0")
    private BigDecimal marketActionDetailGrade;
    @ApiCloudField(value="阶梯截止付款金额(不含)", example="200.0")
    private BigDecimal marketActionDetailGradeTo;
    @ApiCloudField(value="最大发券数", example="1000")
    private BigDecimal marketActionDetailMaxAmount;
    @ApiCloudField(value="券中心活动明细编号", example="10001")
    private Long couponActionDetailId;
    @ApiCloudField(value="可用渠道", example="[ONLINE, OFFLINE]")
    private List<Object> useChannels;
    @ApiCloudField(value="可用门店（线上）", example="[1001, 1002]")
    private List<Long> branchIds;
    @ApiCloudField(value="例外门店（线上）", example="[1003, 1004]")
    private List<Long> exceptBranchIds;
}
