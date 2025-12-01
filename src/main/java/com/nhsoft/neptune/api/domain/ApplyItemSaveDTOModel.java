package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ApplyItemSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ApplyItemSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="申请门店编码", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="申请供应商编码", example="1")
    private Integer supplierNum;
    @ApiCloudField(value="申请人", example="管理员", required=true)
    private String applyPositemOperator;
    @ApiCloudField(value="item", required=true)
    private PosItemSaveV2DTOModel item;
}
