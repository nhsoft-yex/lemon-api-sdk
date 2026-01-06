package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ReportFormatVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ReportFormatVOModel extends ApiCloudObject {

    @ApiCloudField(value="报表设计id")
    private String reportId;
    @ApiCloudField(value="报表设计名称")
    private String reportName;
    @ApiCloudField(value="是否默认")
    private Boolean reportDefault;
    @ApiCloudField(value="备注")
    private String reportMemo;
    @ApiCloudField(value="是否新格式")
    private Boolean newReportFlag;
}
