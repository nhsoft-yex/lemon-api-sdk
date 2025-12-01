package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BranchAccountVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BranchAccountVOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编码", example="1")
    private Integer branchNum;
    @ApiCloudField(value="门店名称", example="门店一")
    private String branchName;
    @ApiCloudField(value="账户余额", example="0.0")
    private BigDecimal branchMoney;
    @ApiCloudField(value="状态码", example="1")
    private Integer stateCode;
    @ApiCloudField(value="状态名称", example="1")
    private String stateName;
}
