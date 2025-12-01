package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * RegionSaveV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RegionSaveV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="区域代码", example="123", required=true)
    private String branchRegionCode;
    @ApiCloudField(value="区域名称", example="河西区", required=true)
    private String branchRegionName;
    @ApiCloudField(value="上级区域编码", example="111")
    private Integer parentRegionNum;
}
