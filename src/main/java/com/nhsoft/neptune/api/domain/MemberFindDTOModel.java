package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MemberFindDTO模型
 * 会员查询DTO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MemberFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="查询页码 从1开始", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小（最大200）", example="10", required=true)
    private Integer pageSize;
    @ApiCloudField(value="成为会员查询开始时间", example="2022-01-21 10:00:00", required=true)
    private String memberTimeFrom;
    @ApiCloudField(value="成为会员查询结束时间", example="2022-01-21 12:00:00", required=true)
    private String memberTimeTo;
    @ApiCloudField(value="最后更新时间开始时间(最后更新时间分片为7天)")
    private String updateAtFrom;
    @ApiCloudField(value="最后更新时间结束时间(最后更新时间分片为7天)")
    private String updateAtTo;
    @ApiCloudField(value="是否查询总数量(false：则返回的总数量无效；true：返回总数量；该字段不传默认为true)", example="true")
    private Boolean queryCount;
    @ApiCloudField(value="是否查询余额(默认为false)", example="true")
    private Boolean queryBalance;
}
