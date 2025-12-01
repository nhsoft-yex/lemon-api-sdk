package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WhsSettlementOrganizationVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WhsSettlementOrganizationVOModel extends ApiCloudObject {

    @ApiCloudField(value="结算组织编号", example="43486272")
    private String id;
    @ApiCloudField(value="结算组织代码", example="99")
    private String code;
    @ApiCloudField(value="结算组织名称", example="管理中心组织")
    private String name;
    @ApiCloudField(value="应用门店编号列表", example="[1,2,3]")
    private List<Integer> applyBranchNums;
    @ApiCloudField(value="可操作人员列表", example="[1,2,3]")
    private List<Integer> appUserNums;
    @ApiCloudField(value="是否启用", example="true")
    private Boolean enabled;
    @ApiCloudField(value="备注", example="无")
    private String memo;
}
