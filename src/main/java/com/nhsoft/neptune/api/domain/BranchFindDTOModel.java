package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BranchFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BranchFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="是否放开是否闭店与启用状态门店", example="true")
    private Boolean isopen;
    @ApiCloudField(value="门店创建起始时间", example="2022-01-08 10:00:00")
    private String timeFrom;
    @ApiCloudField(value="门店创建结束时间", example="2022-01-09 10:00:00")
    private String timeTo;
    @ApiCloudField(value="门店标签", example="A类标签")
    private String branchLabel;
    @ApiCloudField(value="user_center_ids")
    private String userCenterIds;
    @ApiCloudField(value="branch_nums")
    private String branchNums;
}
