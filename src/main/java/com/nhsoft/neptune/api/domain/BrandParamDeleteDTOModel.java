package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BrandParamDeleteDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BrandParamDeleteDTOModel extends ApiCloudObject {

    @ApiCloudField(value="品牌代码列表", example="001", required=true)
    private List<String> brandCodes;
}
