package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * UserBasicBranchGroupDeleteDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class UserBasicBranchGroupDeleteDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店分组ID列表", example="[1,2,3]", required=true)
    private List<Integer> ids;
}
