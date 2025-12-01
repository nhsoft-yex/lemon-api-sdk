package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ConsumePointFindDTO模型
 * 消费积分查询DTO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ConsumePointFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="营业日", example="20210601")
    private String shiftTableBizday;
    @ApiCloudField(value="发卡门店编码", example="1")
    private Integer branchNum;
    @ApiCloudField(value="操作门店编码", example="1")
    private Integer operateBranchNum;
    @ApiCloudField(value="查询页码 从1开始", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小（最大1000）", example="10", required=true)
    private Integer pageSize;
    @ApiCloudField(value="时间类型(上传时间、操作时间)", example="上传时间")
    private String dateType;
    @ApiCloudField(value="起始时间", example="2022-01-08 10:00:00")
    private String dateFrom;
    @ApiCloudField(value="结束时间", example="2022-01-09 10:00:00")
    private String dateTo;
}
