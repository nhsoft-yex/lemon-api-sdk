package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SettlementUnitGroupVO模型
 * 资金结算组织
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SettlementUnitGroupVOModel extends ApiCloudObject {

    @ApiCloudField(value="组织ID", example="G00001004722")
    private String id;
    @ApiCloudField(value="名称", example="某公司")
    private String name;
    @ApiCloudField(value="类型（BRANCH,SUPPLIER,CLIENT,DISTRIBUTOR）", example="BRANCH")
    private String type;
    @ApiCloudField(value="银行账号", example="银行账号")
    private String bankAccount;
}
