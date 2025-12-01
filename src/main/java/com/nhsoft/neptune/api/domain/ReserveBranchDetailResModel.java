package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ReserveBranchDetailRes模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ReserveBranchDetailResModel extends ApiCloudObject {

    @ApiCloudField(value="单据号", example="209500991000036")
    private String orderFid;
    @ApiCloudField(value="活动名称", example="2028预定活动")
    private String orderName;
    @ApiCloudField(value="商品", example="996760008")
    private Integer itemNum;
    @ApiCloudField(value="门店", example="1")
    private Integer branchNum;
    @ApiCloudField(value="预订数量", example="1.0")
    private BigDecimal reserveAmount;
    @ApiCloudField(value="预订促销类型0特价1折扣null表示无折扣")
    private Integer discountPriceType;
    @ApiCloudField(value="特价/折扣(0-1)", example="0")
    private BigDecimal discountValue;
    @ApiCloudField(value="预订总数", example="200")
    private BigDecimal totalAmount;
    @ApiCloudField(value="预订价格", example="22.22")
    private BigDecimal reservePrice;
    @ApiCloudField(value="预定金额", example="22.22")
    private BigDecimal reserveMoney;
    @ApiCloudField(value="换算率", example="1")
    private BigDecimal reserveUseRate;
    @ApiCloudField(value="成本价", example="11.11")
    private BigDecimal reserveCost;
    @ApiCloudField(value="是否必订，false不必订，true必订", example="false")
    private Boolean boundFlag;
    @ApiCloudField(value="明细商品备注", example="test")
    private String detailMemo;
    @ApiCloudField(value="预订上限", example="1")
    private BigDecimal upperLimit;
    @ApiCloudField(value="预订下限", example="0")
    private BigDecimal lowerLimit;
    @ApiCloudField(value="订购基数", example="2")
    private BigDecimal baseAmount;
}
