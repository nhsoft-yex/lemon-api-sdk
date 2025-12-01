package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * UserBasicBranchGroupFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class UserBasicBranchGroupFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="名称", example="区域1")
    private String name;
    @ApiCloudField(value="门店分组ID", example="1")
    private String id;
}
