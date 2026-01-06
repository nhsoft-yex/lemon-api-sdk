package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SettlementAccountFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SettlementAccountFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="组织类型", example="BRANCH", required=true)
    private String groupType;
    @ApiCloudField(value="组织id", example="G00001004722")
    private String groupId;
}
