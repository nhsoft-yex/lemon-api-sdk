package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BranchAccountInOutFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BranchAccountInOutFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编码列表(不传默认为所有门店)", example="[1]")
    private List<Integer> branchNums;
    @ApiCloudField(value="开始日期", example="Sat Oct 12 08:00:00 CST 2024", required=true)
    private String dateFrom;
    @ApiCloudField(value="结束日期", example="Sat Oct 12 08:00:00 CST 2024", required=true)
    private String dateTo;
}
