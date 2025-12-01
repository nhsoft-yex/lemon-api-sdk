package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * TaxCodeFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TaxCodeFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="是否忽略已删除税收编码", example="true")
    private Boolean ignoreDeleted;
    @ApiCloudField(value="搜索关键字(编码、分类)", example="0528")
    private String keyword;
    @ApiCloudField(value="最后更新时间")
    private String lastEditedTime;
    @ApiCloudField(value="查询页码 从1开始", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小， 最大200", example="100", required=true)
    private Integer pageSize;
}
