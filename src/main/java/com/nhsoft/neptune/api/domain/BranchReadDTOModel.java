package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BranchReadDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BranchReadDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编码（二选一必填）", example="99")
    private Integer branchNum;
    @ApiCloudField(value="用户中心门店ID（二选一必填）", example="1001")
    private Long userCenterId;
}
