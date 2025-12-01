package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * InnerUpdateV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class InnerUpdateV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="申请单号", example="NS4344090000063", required=true)
    private String innerOrderFid;
    @ApiCloudField(value="操作人", example="管理员", required=true)
    private String innerOrderOperator;
    @ApiCloudField(value="备注", example="备注信息")
    private String innerOrderMemo;
    @ApiCloudField(value="原因(代码)", example="001")
    private String innerOrderReason;
    @ApiCloudField(value="出货仓库编码", example="203000004", required=true)
    private Integer storehouseNum;
    @ApiCloudField(value="截至日期(默认今天)", example="2022-01-01 00:00:00")
    private String innerOrderDeadline;
    @ApiCloudField(value="良品、次品标记 (当inner_order_type为退货申请时，该字段生效，不传默认为良品)", example="良品")
    private String innerOrderConditionType;
    @ApiCloudField(value="明细", example="", required=true)
    private List<InnerDetailV2DTOModel> innerOrderDetails;
}
