package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * RequestOnroadFindV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RequestOnroadFindV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="要货门店编码", example="1", required=true)
    private Integer branchNum;
    @ApiCloudField(value="发货门店编码", example="99", required=true)
    private Integer outBranchNum;
    @ApiCloudField(value="商品编码列表", example="43440001", required=true)
    private List<Integer> itemNums;
    @ApiCloudField(value="起始时间(yyyy-MM-dd)", example="2021-01-01", required=true)
    private String dateFrom;
    @ApiCloudField(value="起始时间(yyyy-MM-dd)", example="2021-01-07", required=true)
    private String dateTo;
}
