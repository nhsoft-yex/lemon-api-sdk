package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CardPointV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CardPointV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="查询页码", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小(最大为100)", example="1", required=true)
    private Integer pageSize;
    @ApiCloudField(value="卡编码", example="150200002")
    private Integer cardUserNum;
    @ApiCloudField(value="查询开始时间(yyyy-mm-dd HH:mm:ss)", example="2021-01-21 00:00:00")
    private String dateFrom;
    @ApiCloudField(value="查询结束时间(yyyy-mm-dd HH:mm:ss)", example="2021-01-21 00:00:00")
    private String dateTo;
    @ApiCloudField(value="crm主键", example="2072992036300012")
    private String customerId;
    @ApiCloudField(value="排序类型")
    private String sortField;
    @ApiCloudField(value="排序字段")
    private String sortName;
}
