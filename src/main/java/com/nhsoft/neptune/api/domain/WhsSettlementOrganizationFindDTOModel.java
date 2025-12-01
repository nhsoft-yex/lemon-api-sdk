package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WhsSettlementOrganizationFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WhsSettlementOrganizationFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="关键字查询", example="43486272")
    private String keyword;
}
