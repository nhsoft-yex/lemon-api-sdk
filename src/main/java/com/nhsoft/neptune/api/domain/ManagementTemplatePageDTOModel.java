package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ManagementTemplatePageDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ManagementTemplatePageDTOModel extends ApiCloudObject {

    @ApiCloudField(value="最后更新时间开始", required=true)
    private String lastEditTimeFrom;
    @ApiCloudField(value="最后更新时间结束", required=true)
    private String lastEditTimeTo;
    @ApiCloudField(value="是否查询明细", example="false")
    private Boolean withDetails;
    @ApiCloudField(value="查询页码 从1开始", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小， 最大300", example="100", required=true)
    private Integer pageSize;
}
