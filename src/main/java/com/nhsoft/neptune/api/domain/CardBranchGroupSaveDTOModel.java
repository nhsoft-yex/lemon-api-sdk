package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CardBranchGroupSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CardBranchGroupSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编号", example="1", required=true)
    private Integer branchNum;
    @ApiCloudField(value="门店分组名称", example="1", required=true)
    private String branchGroupName;
}
