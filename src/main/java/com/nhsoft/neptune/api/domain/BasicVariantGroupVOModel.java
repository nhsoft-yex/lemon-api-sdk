package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BasicVariantGroupVO模型
 * 商品分组
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BasicVariantGroupVOModel extends ApiCloudObject {

    @ApiCloudField(value="分组ID")
    private Integer groupId;
    @ApiCloudField(value="分组名称")
    private String groupName;
}
