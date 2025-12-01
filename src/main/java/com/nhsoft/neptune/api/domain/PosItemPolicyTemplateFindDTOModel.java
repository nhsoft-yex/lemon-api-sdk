package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosItemPolicyTemplateFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosItemPolicyTemplateFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="关键字查询", example="1")
    private String keywords;
    @ApiCloudField(value="查询页码", example="1")
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小", example="200")
    private Integer pageSize;
    @ApiCloudField(value="是否查询明细", example="false")
    private Boolean withDetail;
    @ApiCloudField(value="policy_item_template_nos")
    private List<String> policyItemTemplateNos;
}
