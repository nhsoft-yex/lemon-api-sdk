package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WholesaleBookStopDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WholesaleBookStopDTOModel extends ApiCloudObject {

    @ApiCloudField(value="批发订单号", example="WB2030990000004", required=true)
    private String wholesaleBookFid;
    @ApiCloudField(value="操作员", example="admin")
    private String operator;
}
