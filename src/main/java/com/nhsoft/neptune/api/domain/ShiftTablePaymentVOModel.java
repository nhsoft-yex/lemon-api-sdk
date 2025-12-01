package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ShiftTablePaymentVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ShiftTablePaymentVOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编码", example="1")
    private Integer branchNum;
    @ApiCloudField(value="班次号", example="4311")
    private String shiftTableNum;
    @ApiCloudField(value="营业日", example="20230313")
    private String shiftTableBizday;
    @ApiCloudField(value="明细", example="")
    private List<ShiftTablePaymentDetailVOModel> details;
}
