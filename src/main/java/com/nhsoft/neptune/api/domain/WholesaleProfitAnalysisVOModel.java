package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WholesaleProfitAnalysisVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WholesaleProfitAnalysisVOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编号", example="99")
    private Integer branchNum;
    @ApiCloudField(value="门店名称", example="门店一")
    private String branchName;
    @ApiCloudField(value="商品批发金额", example="5.0")
    private BigDecimal itemWholesaleMoney;
    @ApiCloudField(value="商品批发毛利", example="5.0")
    private BigDecimal itemWholesaleProfit;
}
