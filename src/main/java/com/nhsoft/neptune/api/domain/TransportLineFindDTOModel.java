package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * TransportLineFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TransportLineFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编号", example="1", required=true)
    private Integer branchNum;
    @ApiCloudField(value="开始时间", required=true)
    private String dateFrom;
    @ApiCloudField(value="结束时间", required=true)
    private String dateTo;
    @ApiCloudField(value="时间类型(采配日|时间范围)", example="采配日")
    private String dateType;
    @ApiCloudField(value="采配日（yyyyMMdd）", example="20230130")
    private String bizDay;
}
