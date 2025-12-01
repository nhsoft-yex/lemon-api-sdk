package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * OrderFidDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class OrderFidDTOModel extends ApiCloudObject {

    @ApiCloudField(value="单据编号", required=true)
    private String orderFid;
}
