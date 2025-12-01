package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * UserBasicUserFindDTO模型
 * 用户查询
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class UserBasicUserFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="公司用户代码")
    private Integer companyUserCode;
    @ApiCloudField(value="用户编号", example="1")
    private Integer userId;
    @ApiCloudField(value="公司用户名称", example="员工")
    private String name;
    @ApiCloudField(value="门店ID", example="1")
    private Integer branchId;
    @ApiCloudField(value="是否启用", example="true")
    private Boolean enable;
    @ApiCloudField(value="手机号码", example="18667885599")
    private String phone;
    @ApiCloudField(value="查询页码", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小", example="10", required=true)
    private Integer pageSize;
}
