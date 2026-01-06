package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SimplePosClientTypeVO模型
 * 客户类型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SimplePosClientTypeVOModel extends ApiCloudObject {

    @ApiCloudField(value="客户类别代码", example="011")
    private String clientTypeCode;
    @ApiCloudField(value="客户类别名称", example="华东客户")
    private String clientTypeName;
}
