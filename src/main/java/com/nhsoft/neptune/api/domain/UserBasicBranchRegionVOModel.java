package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * UserBasicBranchRegionVO模型
 * 用户中心门店区域
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class UserBasicBranchRegionVOModel extends ApiCloudObject {

    @ApiCloudField(value="门店区域ID", example="257")
    private Integer id;
    @ApiCloudField(value="门店区域名称", example="西湖区")
    private String name;
    @ApiCloudField(value="门店区域代码", example="021")
    private String code;
    @ApiCloudField(value="门店区域父ID", example="256")
    private Integer parentId;
}
