package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PurchaseStorematrixSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PurchaseStorematrixSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编码", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="操作人", example="管理员", required=true)
    private String operator;
    @ApiCloudField(value="明细", example="", required=true)
    private List<PurchaseStorematrixSaveDetailDTOModel> details;
}
