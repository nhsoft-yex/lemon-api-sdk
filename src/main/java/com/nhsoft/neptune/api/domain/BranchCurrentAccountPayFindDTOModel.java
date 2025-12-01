package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BranchCurrentAccountPayFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BranchCurrentAccountPayFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="中心门店编码", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="开始时间", example="2021-01-01", required=true)
    private String dateFrom;
    @ApiCloudField(value="结束时间", example="2021-01-01", required=true)
    private String dateTo;
    @ApiCloudField(value="结算门店编码", example="1", required=true)
    private List<Integer> innerBranchNums;
    @ApiCloudField(value="account_type")
    private List<String> accountType;
}
