package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosItemPolicyTemplateUpdateDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosItemPolicyTemplateUpdateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="促销商品模板编号", example="", required=true)
    private String templateNo;
    @ApiCloudField(value="促销商品模板名称", example="", required=true)
    private String templateName;
    @ApiCloudField(value="促销商品模板备注", example="")
    private String templateRemark;
    @ApiCloudField(value="促销商品模板类型（例外商品:EXCEPT_ITEM）", example="EXCEPT_ITEM", required=true)
    private String templateType;
    @ApiCloudField(value="操作人", example="admin")
    private String operator;
    @ApiCloudField(value="明细", example="", required=true)
    private List<PosItemPolicyTemplateDetailSaveDTOModel> details;
}
