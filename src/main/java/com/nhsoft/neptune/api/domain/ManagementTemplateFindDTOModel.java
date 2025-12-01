package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ManagementTemplateFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ManagementTemplateFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="创建经营模板的门店编码", example="1")
    private Integer branchNum;
    @ApiCloudField(value="应用门店列表查询(和branch_num二选一，同时存在时branch_num优先级更高)", example="[1]")
    private List<Integer> applyBranchNum;
    @ApiCloudField(value="是否需要明细", example="true")
    private Boolean withDetails;
}
