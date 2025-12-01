package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PurchaseAutoRequestSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PurchaseAutoRequestSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编码", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="明细", example="", required=true)
    private List<PurchaseAutoRequestSaveDetailDTOModel> details;
}
