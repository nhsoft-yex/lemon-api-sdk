package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PolicyApplyBranchUpdateDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PolicyApplyBranchUpdateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="应用门店编码列表(空为所有门店)", example="[1, 2]")
    private List<Integer> branchNums;
    @ApiCloudField(value="是否例外门店", example="false", required=true)
    private Boolean isExceptBranch;
    @ApiCloudField(value="促销单号", example="4344990002112", required=true)
    private String policyNo;
    @ApiCloudField(value="操作人", example="admin")
    private String operator;
}
