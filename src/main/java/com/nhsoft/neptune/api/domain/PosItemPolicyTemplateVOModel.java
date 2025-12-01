package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosItemPolicyTemplateVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosItemPolicyTemplateVOModel extends ApiCloudObject {

    @ApiCloudField(value="促销商品模板编号", example="")
    private String templateNo;
    @ApiCloudField(value="促销商品模板名称", example="")
    private String templateName;
    @ApiCloudField(value="促销商品模板备注", example="")
    private String templateRemark;
    @ApiCloudField(value="促销商品模板类型（例外商品:EXCEPT_ITEM）", example="EXCEPT_ITEM")
    private String templateType;
    @ApiCloudField(value="创建时间", example="2024-09-04 00:00:00")
    private String templateCreateTime;
    @ApiCloudField(value="创建人", example="admin")
    private String templateCreator;
    @ApiCloudField(value="更新时间", example="2024-09-04 00:00:00")
    private String templateUpdateTime;
    @ApiCloudField(value="更新人", example="admin")
    private String templateUpdater;
    @ApiCloudField(value="促销活动明细", example="")
    private List<PosItemPolicyTemplateDetailVOModel> details;
}
