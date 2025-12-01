package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ReserveBranchDetailFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ReserveBranchDetailFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="应用门店", example="1", required=true)
    private Integer applyBranchNum;
    @ApiCloudField(value="开始时间(yyyy-MM-dd)", example="Fri Jan 01 08:00:00 CST 2021", required=true)
    private String dateFrom;
    @ApiCloudField(value="结束时间(yyyy-MM-dd)", example="Fri Jan 01 08:00:00 CST 2021", required=true)
    private String dateTo;
    @ApiCloudField(value="数据类型", example="1", required=true)
    private Integer dataType;
    @ApiCloudField(value="时间类型", example="制单时间", required=true)
    private String dateType;
}
