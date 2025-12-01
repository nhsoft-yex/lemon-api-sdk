package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * AssembleSplitFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AssembleSplitFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="日期类型(制单时间|审核时间|操作时间)", example="", required=true)
    private String dateType;
    @ApiCloudField(value="开始日期", example="Wed Jan 01 08:00:00 CST 2025", required=true)
    private String dateFrom;
    @ApiCloudField(value="结束日期", example="Wed Jan 01 08:00:00 CST 2025", required=true)
    private String dateTo;
    @ApiCloudField(value="审核状态(1-未审核|3-已审核)", example="1")
    private Integer stateCode;
    @ApiCloudField(value="仓库编号")
    private Integer storehouseNum;
    @ApiCloudField(value="当前登录门店", required=true)
    private Integer branchNum;
    @ApiCloudField(value="查询页码", example="1")
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小", example="10")
    private Integer pageSize;
    @ApiCloudField(value="是否带明细(默认不带明细)", example="true")
    private Boolean withDetail;
}
