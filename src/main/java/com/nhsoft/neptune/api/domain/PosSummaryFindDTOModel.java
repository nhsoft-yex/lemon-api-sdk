package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosSummaryFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosSummaryFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编码", example="[1]")
    private List<Integer> branchNums;
    @ApiCloudField(value="商品编码", example="[434400001]")
    private List<Integer> itemNums;
    @ApiCloudField(value="开始时间", example="Fri Jan 01 08:00:00 CST 2021", required=true)
    private String dateFrom;
    @ApiCloudField(value="结束时间", example="Fri Jan 01 08:00:00 CST 2021", required=true)
    private String dateTo;
}
