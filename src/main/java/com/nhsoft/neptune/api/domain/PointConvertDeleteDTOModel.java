package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PointConvertDeleteDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PointConvertDeleteDTOModel extends ApiCloudObject {

    @ApiCloudField(value="物品编号", example="003", required=true)
    private String pointConvertNum;
}
