package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PointOrderReadDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PointOrderReadDTOModel extends ApiCloudObject {

    @ApiCloudField(value="积分兑换活动编号", example="")
    private String pointOrderFid;
}
