package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosOtherInoutFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosOtherInoutFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编码", example="1", required=true)
    private Integer branchNum;
    @ApiCloudField(value="起始时间", example="2021-01-20", required=true)
    private String dateFrom;
    @ApiCloudField(value="结束时间", example="2021-01-20", required=true)
    private String dateTo;
}
