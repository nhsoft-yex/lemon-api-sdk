package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CardBranchGroupVO模型
 * 储值卡门店分组VO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CardBranchGroupVOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编号", example="1", required=true)
    private Integer branchNum;
    @ApiCloudField(value="门店代码", example="1", required=true)
    private String branchCode;
    @ApiCloudField(value="门店名称", example="1", required=true)
    private String branchName;
    @ApiCloudField(value="门店类型", example="1", required=true)
    private String branchType;
    @ApiCloudField(value="门店分组ID", example="1", required=true)
    private String branchGroupId;
    @ApiCloudField(value="门店分组名称", example="1", required=true)
    private String branchGroupName;
}
