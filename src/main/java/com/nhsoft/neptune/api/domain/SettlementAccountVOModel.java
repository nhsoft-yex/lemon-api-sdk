package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SettlementAccountVO模型
 * 资金账户VO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SettlementAccountVOModel extends ApiCloudObject {

    @ApiCloudField(value="资金账户ID", example="F00001001447")
    private String id;
    @ApiCloudField(value="组织ID", example="G00001004722")
    private String groupId;
    @ApiCloudField(value="名称", example="组织名称")
    private String name;
    @ApiCloudField(value="group")
    private SettlementUnitGroupVOModel group;
    @ApiCloudField(value="业务类型列表")
    private List<String> businessTypes;
    @ApiCloudField(value="是否启用")
    private Boolean enable;
    @ApiCloudField(value="是否删除")
    private Boolean deleted;
}
