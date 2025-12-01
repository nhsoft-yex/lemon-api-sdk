package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CheckPlanReadDTO模型
 * 盘点计划读取DTO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CheckPlanReadDTOModel extends ApiCloudObject {

    @ApiCloudField(value="盘点计划单据号（根据盘点计划查询）", example="PJ21139924092000001", required=true)
    private String checkPlanFid;
    @ApiCloudField(value="配送中心门店编号", example="99", required=true)
    private Integer branchNum;
}
