package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * OtherInoutRefBillReadDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class OtherInoutRefBillReadDTOModel extends ApiCloudObject {

    @ApiCloudField(value="费用单号", example="OP2072010000016", required=true)
    private String otherInoutRefBill;
}
