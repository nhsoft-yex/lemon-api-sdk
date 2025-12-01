package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ReportBranchDayDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ReportBranchDayDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编码", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="营业日 格式：yyyyMMdd", example="20210101", required=true)
    private String shiftTableBizday;
}
