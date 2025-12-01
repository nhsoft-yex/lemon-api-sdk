package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SystemBookV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SystemBookV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="商户名称", example="")
    private String bookName;
    @ApiCloudField(value="是否启用", example="false")
    private Boolean bookActived;
}
