package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WholesaleInnerOrderReadDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WholesaleInnerOrderReadDTOModel extends ApiCloudObject {

    @ApiCloudField(value="单据编号", example="4344990000318", required=true)
    private String innerOrderFid;
}
