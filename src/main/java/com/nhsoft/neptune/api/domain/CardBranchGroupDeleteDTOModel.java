package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CardBranchGroupDeleteDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CardBranchGroupDeleteDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店分组ID", example="20950000100", required=true)
    private String branchGroupId;
}
