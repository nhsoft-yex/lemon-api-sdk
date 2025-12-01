package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * StoreMatrixLastEditTimeFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class StoreMatrixLastEditTimeFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="上次更新时间", required=true)
    private String lastEditTime;
    @ApiCloudField(value="申请门店编码", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="查询页码", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小(最大为100)", example="10", required=true)
    private Integer pageSize;
}
