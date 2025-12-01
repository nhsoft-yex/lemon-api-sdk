package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CardDepositDateTypeFindDTO模型
 * 储值卡按日期类型查询
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CardDepositDateTypeFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="营业日", example="20210601")
    private String shiftTableBizday;
    @ApiCloudField(value="操作门店编码", example="1")
    private Integer branchNum;
    @ApiCloudField(value="开始时间")
    private String dateFrom;
    @ApiCloudField(value="结束时间")
    private String dateTo;
    @ApiCloudField(value="时间类型(上传时间、操作时间)", example="上传时间")
    private String dateType;
    @ApiCloudField(value="查询分页页码", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小(最大1000)", example="100", required=true)
    private Integer pageSize;
}
