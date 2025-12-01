package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosClientTypeSaveDTO模型
 * POS客户类型保存参数
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosClientTypeSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="客户类别代码", example="010", required=true)
    private String clientTypeCode;
    @ApiCloudField(value="客户类别名称", example="华东客户", required=true)
    private String clientTypeName;
    @ApiCloudField(value="上级客户类别代码", example="01")
    private String clientTypeParentCode;
}
