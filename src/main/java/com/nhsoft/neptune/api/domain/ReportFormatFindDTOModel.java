package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ReportFormatFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ReportFormatFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="报表设计id", example="1")
    private String reportId;
    @ApiCloudField(value="报表类型", example="要货单报表", required=true)
    private String type;
}
