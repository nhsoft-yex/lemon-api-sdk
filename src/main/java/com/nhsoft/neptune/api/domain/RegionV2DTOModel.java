package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * RegionV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RegionV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="区域编码", example="11")
    private Integer branchRegionNum;
    @ApiCloudField(value="区域代码", example="123")
    private String branchRegionCode;
    @ApiCloudField(value="区域名称", example="河西区")
    private String branchRegionName;
    @ApiCloudField(value="上级区域编码", example="1")
    private Integer parentRegionNum;
}
