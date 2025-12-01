package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * InnerApproveAndExecuteDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class InnerApproveAndExecuteDTOModel extends ApiCloudObject {

    @ApiCloudField(value="申请单号", example="NS4344090000063", required=true)
    private String innerOrderFid;
    @ApiCloudField(value="操作人", example="管理员", required=true)
    private String innerOrderOperator;
    @ApiCloudField(value="批复备注", example="备注信息")
    private String innerOrderApproveMemo;
    @ApiCloudField(value="明细", example="", required=true)
    private List<InnerApproveDetailV2DTOModel> innerOrderDetails;
    @ApiCloudField(value="调入仓库编码", example="434400001", required=true)
    private Integer inStorehouseNum;
}
