package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ShiftTablePaymentFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ShiftTablePaymentFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编码(最多100家门店)", example="1", required=true)
    private List<Integer> branchNums;
    @ApiCloudField(value="营业日(最多5天)", example="20230313", required=true)
    private List<String> shiftTableBizdays;
    @ApiCloudField(value="班次号", example="4366", required=true)
    private List<Integer> shiftTableNums;
}
