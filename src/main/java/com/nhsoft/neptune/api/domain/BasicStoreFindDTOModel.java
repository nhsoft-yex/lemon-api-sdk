package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BasicStoreFindDTO模型
 * 商城门店查询
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BasicStoreFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="最后编辑时间开始", example="2021-01-26 00:00:00", required=true)
    private String lastEditStartTime;
    @ApiCloudField(value="最后编辑时间结束", example="2021-01-26 00:00:00", required=true)
    private String lastEditEndTime;
    @ApiCloudField(value="查询页码", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小", example="10", required=true)
    private Integer pageSize;
}
