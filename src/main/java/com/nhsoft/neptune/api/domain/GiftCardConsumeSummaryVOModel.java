package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * GiftCardConsumeSummaryVO模型
 * 礼品卡消费汇总VO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class GiftCardConsumeSummaryVOModel extends ApiCloudObject {

    @ApiCloudField(value="用户中心门店id", example="1")
    private Integer userCenterBranchId;
    @ApiCloudField(value="礼品卡类型id", example="1")
    private Integer cardTypeId;
    @ApiCloudField(value="礼品卡类型名称", example="1")
    private String cardTypeName;
    @ApiCloudField(value="消费日期", example="Fri Jan 01 08:00:00 CST 2021")
    private String consumeDay;
    @ApiCloudField(value="消费总金额", example="100.0")
    private BigDecimal consumeSum;
    @ApiCloudField(value="门店编号", example="99")
    private Integer branchNum;
    @ApiCloudField(value="门店名称", example="管理中心")
    private String branchName;
}
