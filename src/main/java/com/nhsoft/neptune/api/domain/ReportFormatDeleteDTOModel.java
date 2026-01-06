package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ReportFormatDeleteDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ReportFormatDeleteDTOModel extends ApiCloudObject {

    @ApiCloudField(value="参数名称")
    private String paramName;
    @ApiCloudField(value="报表名称")
    private String reportName;
    @ApiCloudField(value="报表id")
    private String reportId;
    @ApiCloudField(value="门店编号", example="99")
    private Integer branchNum;
}
