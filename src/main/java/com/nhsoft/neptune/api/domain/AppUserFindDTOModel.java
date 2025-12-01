package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * AppUserFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AppUserFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编号", example="[1]")
    private List<Integer> branchNums;
    @ApiCloudField(value="角色名称", example="收银员")
    private String roleName;
    @ApiCloudField(value="关键字查询", example="测试")
    private String keyword;
    @ApiCloudField(value="查询页码 从1开始", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小", example="10", required=true)
    private Integer pageSize;
}
