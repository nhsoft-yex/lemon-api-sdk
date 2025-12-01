package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CardClientPointFindDTO模型
 * 会员客户端积分查询DTO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CardClientPointFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="操作门店编码", example="1", required=true)
    private Integer branchNum;
    @ApiCloudField(value="起始时间", example="2021-01-21", required=true)
    private String dateFrom;
    @ApiCloudField(value="结束时间", example="2021-01-21", required=true)
    private String dateTo;
    @ApiCloudField(value="查询页码", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小", example="100", required=true)
    private Integer pageSize;
}
