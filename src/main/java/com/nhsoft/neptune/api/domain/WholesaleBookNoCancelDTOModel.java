package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WholesaleBookNoCancelDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WholesaleBookNoCancelDTOModel extends ApiCloudObject {

    @ApiCloudField(value="批发订单号", example="WB2030990000008", required=true)
    private String wholesaleBookFid;
    @ApiCloudField(value="是否使用", example="true", required=true)
    private Boolean using;
}
