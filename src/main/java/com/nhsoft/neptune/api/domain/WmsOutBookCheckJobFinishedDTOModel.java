package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WmsOutBookCheckJobFinishedDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WmsOutBookCheckJobFinishedDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编号", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="要货单单号", example="[YH2072000001]", required=true)
    private List<String> requestOrderFids;
}
