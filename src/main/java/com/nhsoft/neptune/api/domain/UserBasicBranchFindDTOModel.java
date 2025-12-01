package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * UserBasicBranchFindDTO模型
 * 用户中心门店查询
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class UserBasicBranchFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店名称", example="1号店")
    private String name;
    @ApiCloudField(value="代码", example="10A001")
    private String code;
    @ApiCloudField(value="类型（SYSTEM|USER）", example="SYSTEM")
    private String type;
    @ApiCloudField(value="区域ID", example="1")
    private Integer regionId;
    @ApiCloudField(value="用户中心门店id", example="[1,2]")
    private List<Long> branchNums;
    @ApiCloudField(value="门店ID列表")
    private List<Long> branchIds;
}
