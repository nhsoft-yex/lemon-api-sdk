package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ShiftTableFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ShiftTableFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编码", example="99")
    private Integer branchNum;
    @ApiCloudField(value="开始时间", example="Wed Mar 31 08:00:00 CST 2021")
    private String dateFrom;
    @ApiCloudField(value="结束时间", example="Wed Apr 21 08:00:00 CST 2021")
    private String dateTo;
    @ApiCloudField(value="时间类型:最后修改时间、营业日（默认为营业日,门店编码、开始与结束时间不能为空。如果为最后修改时间，则最后修改时间不能为空）", example="最后修改时间")
    private String dateType;
    @ApiCloudField(value="最后修改时间")
    private String lastEditTime;
    @ApiCloudField(value="用户编码", example="103790002")
    private Integer shiftTableUserNum;
    @ApiCloudField(value="班次编码", example="20003")
    private Integer shiftTableNum;
    @ApiCloudField(value="查询页码 从1开始", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小", example="10", required=true)
    private Integer pageSize;
}
