package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * AssembleSplitReadDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AssembleSplitReadDTOModel extends ApiCloudObject {

    @ApiCloudField(value="组合拆分单号", example="", required=true)
    private String assembleSplitFid;
}
