package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MemberCouponReadDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MemberCouponReadDTOModel extends ApiCloudObject {

    @ApiCloudField(value="券条码", required=true)
    private String barcode;
    @ApiCloudField(value="anti_consume_flag")
    private Boolean antiConsumeFlag;
}
