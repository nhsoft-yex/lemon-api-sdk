package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ReportFormatSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ReportFormatSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="报表设计id")
    private String reportId;
    @ApiCloudField(value="报表类型", example="要货单报表", required=true)
    private String type;
    @ApiCloudField(value="报表设计名称", example="测试报表", required=true)
    private String reportName;
    @ApiCloudField(value="是否默认", example="true")
    private Boolean reportDefault;
    @ApiCloudField(value="备注")
    private String reportMemo;
    @ApiCloudField(value="格式json")
    private String reportJson;
}
