package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CustomerPayRecordSupplementaryVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CustomerPayRecordSupplementaryVOModel extends ApiCloudObject {

    @ApiCloudField(value="付费会员计id")
    private Long purchaseRecordId;
    @ApiCloudField(value="对应附属卡列表", example="")
    private List<CustomerPayRecordVOModel> supplementaryRecords;
}
