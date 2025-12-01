package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ApplyItemDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ApplyItemDTOModel extends ApiCloudObject {

    @ApiCloudField(value="申请流水", example="4344990000226")
    private String applyPositemFid;
    @ApiCloudField(value="申请门店编码", example="99")
    private Integer branchNum;
    @ApiCloudField(value="申请供应商编码", example="1")
    private Integer supplierNum;
    @ApiCloudField(value="申请人", example="管理员")
    private String applyPositemCreator;
    @ApiCloudField(value="申请时间（yyyy-MM-dd hh:mm:ss）", example="2021-01-01 00:00:00")
    private String applyPositemCreateTime;
    @ApiCloudField(value="审核人", example="管理员")
    private String applyPositemAuditor;
    @ApiCloudField(value="审核时间（yyyy-MM-dd hh:mm:ss）", example="2021-01-01 00")
    private String applyPositemAuditTime;
    @ApiCloudField(value="申请状态编码", example="1")
    private Integer applyPositemStateCode;
    @ApiCloudField(value="申请状态名称", example="制单")
    private String applyPositemStateName;
    @ApiCloudField(value="item")
    private PosItemUpdateV2DTOModel item;
}
