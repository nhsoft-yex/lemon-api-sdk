package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ClientRegionVO模型
 * 区域列表
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ClientRegionVOModel extends ApiCloudObject {

    @ApiCloudField(value="区域编号")
    private Long regionNum;
    @ApiCloudField(value="区域名称", example="")
    private String regionName;
}
