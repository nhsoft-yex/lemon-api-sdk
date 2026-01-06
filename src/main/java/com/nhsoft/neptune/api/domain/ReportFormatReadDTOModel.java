package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ReportFormatReadDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ReportFormatReadDTOModel extends ApiCloudObject {

    @ApiCloudField(value="报表设计id", example="1")
    private String reportId;
    @ApiCloudField(value="报表文件ossKey", example="report/2023/05/05/1.json")
    private String ossKey;
    @ApiCloudField(value="报表类型", example="WEB要货单报表", required=true)
    private String type;
}
