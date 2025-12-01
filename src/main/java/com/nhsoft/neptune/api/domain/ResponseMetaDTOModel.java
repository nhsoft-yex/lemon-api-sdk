package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ResponseMetaDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ResponseMetaDTOModel extends ApiCloudObject {

    @ApiCloudField(value="total")
    private Integer total;
    @ApiCloudField(value="total_page")
    private Integer totalPage;
    @ApiCloudField(value="page")
    private Integer page;
    @ApiCloudField(value="page_size")
    private Integer pageSize;
}
