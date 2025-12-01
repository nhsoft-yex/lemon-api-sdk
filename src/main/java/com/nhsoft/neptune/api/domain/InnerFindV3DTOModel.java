package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * InnerFindV3DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class InnerFindV3DTOModel extends ApiCloudObject {

    @ApiCloudField(value="被申请门店编码（时间类型为最后修改时间允许为空）", example="99")
    private Integer outBranchNum;
    @ApiCloudField(value="申请门店编码", example="1")
    private Integer branchNum;
    @ApiCloudField(value="开始时间(yyyy-MM-dd)", example="2021-01-01", required=true)
    private String dateFrom;
    @ApiCloudField(value="结束时间(yyyy-MM-dd)(与dateFrom时间间隔不能超过5天)", example="2021-01-01", required=true)
    private String dateTo;
    @ApiCloudField(value="开始时间(HH:mm:ss)", example="13:00:00")
    private String timeFrom;
    @ApiCloudField(value="结束时间(HH:mm:ss)", example="14:00:00")
    private String timeTo;
    @ApiCloudField(value="时间类型（制单时间|审核时间|批复时间|处理时间|最后修改时间）", example="制单时间", required=true)
    private String dateType;
    @ApiCloudField(value="按单据号模糊匹配", example="NS4344010000304")
    private String orderFid;
    @ApiCloudField(value="单据类型(直调申请,退货申请)", example="直调申请")
    private String orderType;
    @ApiCloudField(value="单据状态(0 所有单据 1 制单 2 审核  3 批复 4 处理 5拒绝)", example="0")
    private Integer orderState;
    @ApiCloudField(value="查询页码", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小", example="10", required=true)
    private Integer pageSize;
}
