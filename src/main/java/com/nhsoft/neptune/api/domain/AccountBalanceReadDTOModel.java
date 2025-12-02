package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * AccountBalanceReadDTO模型
 * 账户余额读取
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AccountBalanceReadDTOModel extends ApiCloudObject {

    @ApiCloudField(value="业务类别", example="商品")
    private List<String> businessTypes;
    @ApiCloudField(value="目标门店用户中心id", example="93754", required=true)
    private String dstBranchId;
    @ApiCloudField(value="源门店用户中心id", example="93766", required=true)
    private String srcBranchId;
}
