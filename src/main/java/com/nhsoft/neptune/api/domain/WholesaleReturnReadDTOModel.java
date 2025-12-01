package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WholesaleReturnReadDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WholesaleReturnReadDTOModel extends ApiCloudObject {

    @ApiCloudField(value="批发退货单号", example="WR2072010000002")
    private String wholesaleReturnFid;
    @ApiCloudField(value="批发退货单外部单号", example="WR2072010000002")
    private String wholesaleReturnOutBillNo;
}
