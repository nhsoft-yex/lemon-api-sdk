package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * InnerSaveV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class InnerSaveV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="申请门店编码", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="被申请门店编码", example="1", required=true)
    private Integer outBranchNum;
    @ApiCloudField(value="操作人", example="管理员", required=true)
    private String innerOrderOperator;
    @ApiCloudField(value="备注", example="备注信息")
    private String innerOrderMemo;
    @ApiCloudField(value="单据类型(直调申请、退货申请)", example="直调申请", required=true)
    private String innerOrderType;
    @ApiCloudField(value="原因(代码)", example="001")
    private String innerOrderReason;
    @ApiCloudField(value="出货仓库编码", example="150050001", required=true)
    private Integer storehouseNum;
    @ApiCloudField(value="截至日期(默认今天)", example="2022-01-01 00:00:00")
    private String innerOrderDeadline;
    @ApiCloudField(value="良品、次品标记 (当inner_order_type为退货申请时，该字段生效，不传默认为良品)", example="良品")
    private String innerOrderConditionType;
    @ApiCloudField(value="明细", example="", required=true)
    private List<InnerDetailV2DTOModel> innerOrderDetails;
}
