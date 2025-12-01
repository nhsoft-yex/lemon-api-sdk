package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MemberLogFindDTO模型
 * 会员日志查询DTO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MemberLogFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="会员ID", example="207200025932", required=true)
    private String customerId;
    @ApiCloudField(value="查询页码 从1开始", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小（最大200）", example="10", required=true)
    private Integer pageSize;
    @ApiCloudField(value="查询开始时间", example="2022-01-21", required=true)
    private String dateFrom;
    @ApiCloudField(value="查询结束时间", example="2022-01-22", required=true)
    private String dateTo;
    @ApiCloudField(value="操作类型(默认为全部) BINDING|IDENTIT_CHANGE|UPDATE_INFO|DELETE|UNBIND", example="UPDATE_INFO")
    private String logType;
    @ApiCloudField(value="操作人", example="管理员")
    private String operator;
}
