package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CardClientPointFindV2DTO模型
 * 会员积分查询V2DTO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CardClientPointFindV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="操作门店编码", example="1", required=true)
    private Integer branchNum;
    @ApiCloudField(value="起始时间", example="Thu Jan 21 08:00:00 CST 2021", required=true)
    private String dateFrom;
    @ApiCloudField(value="结束时间", example="Thu Jan 21 08:00:00 CST 2021", required=true)
    private String dateTo;
    @ApiCloudField(value="查询页码", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小(最大为1000)", example="10", required=true)
    private Integer pageSize;
}
