package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WmsItemFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WmsItemFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编号", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="查询分页", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小", example="10", required=true)
    private Integer pageSize;
}
