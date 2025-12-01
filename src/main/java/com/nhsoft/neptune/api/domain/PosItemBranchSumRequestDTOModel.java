package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosItemBranchSumRequestDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosItemBranchSumRequestDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店列表（,分割）最多只能查询30条门店信息", example="1,2", required=true)
    private String branchNums;
    @ApiCloudField(value="商品列表（,分割）只能查询100条商品信息", example="434420031,434420032", required=true)
    private String itemNums;
    @ApiCloudField(value="开始时间（yyyy-MM-dd HH:mm:ss）", example="2021-01-01 10:00:00", required=true)
    private String dateFrom;
    @ApiCloudField(value="结束时间（yyyy-MM-dd HH:mm:ss）", example="2021-01-01 10:00:00", required=true)
    private String dateTo;
}
