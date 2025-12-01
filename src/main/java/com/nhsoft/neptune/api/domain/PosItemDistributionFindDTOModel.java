package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosItemDistributionFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosItemDistributionFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编号", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="商品类别", example="01")
    private List<String> categoryCodes;
    @ApiCloudField(value="商品编号", example="01")
    private List<Integer> itemNums;
    @ApiCloudField(value="订购下限大于", example="30")
    private BigDecimal limitFrom;
    @ApiCloudField(value="订购上限小于", example="300")
    private BigDecimal limitTo;
    @ApiCloudField(value="推荐商品", example="true")
    private Boolean recommended;
    @ApiCloudField(value="查询分页页码", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小(最大1000)", example="100", required=true)
    private Integer pageSize;
}
