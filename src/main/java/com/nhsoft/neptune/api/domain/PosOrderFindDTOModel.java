package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosOrderFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosOrderFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="分店编号", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="营业日(yyyyMMdd)", example="20200119", required=true)
    private String shiftTableBizday;
    @ApiCloudField(value="结账开始时间(HH:MM)", example="12:00")
    private String startTime;
    @ApiCloudField(value="结账结束时间(HH:MM)", example="12:00")
    private String endTime;
    @ApiCloudField(value="查询页码(从1开始)", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小(最大300)", example="300", required=true)
    private Integer pageSize;
}
