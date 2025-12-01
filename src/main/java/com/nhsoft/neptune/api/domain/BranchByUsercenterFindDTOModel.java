package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BranchByUsercenterFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BranchByUsercenterFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="用户中心门店编码数组", example="[1,2,3]", required=true)
    private List<Long> branchIds;
}
