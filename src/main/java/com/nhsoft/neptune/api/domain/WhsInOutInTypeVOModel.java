package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WhsInOutInTypeVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WhsInOutInTypeVOModel extends ApiCloudObject {

    @ApiCloudField(value="收入类型编号", example="c6f5fe7c71dd4342a4687effc956ecf8")
    private String id;
    @ApiCloudField(value="收入类型分类编号", example="d2553c6328444cf783cce89874083715")
    private String categoryId;
    @ApiCloudField(value="收入类型名称", example="销售收入")
    private String name;
    @ApiCloudField(value="收入类型代码", example="1")
    private String code;
    @ApiCloudField(value="收入类型是否启用", example="true")
    private String enabled;
    @ApiCloudField(value="收入类型分类名称", example="水电")
    private String categoryName;
}
