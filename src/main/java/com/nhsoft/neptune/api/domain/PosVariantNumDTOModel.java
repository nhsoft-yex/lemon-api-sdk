package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosVariantNumDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosVariantNumDTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品系统编码")
    private Integer itemNum;
    @ApiCloudField(value="分级编码")
    private Integer itemGradeNum;
}
