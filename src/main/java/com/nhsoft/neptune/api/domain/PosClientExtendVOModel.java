package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosClientExtendVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosClientExtendVOModel extends ApiCloudObject {

    @ApiCloudField(value="客户编号", example="0099675010000001")
    private String clientFid;
    @ApiCloudField(value="扩展属性id", example="9967500000011")
    private String propertyId;
    @ApiCloudField(value="扩展属性名称", example="扩展属性10")
    private String propertyName;
    @ApiCloudField(value="扩展属性值", example="a")
    private String propertyValue;
}
