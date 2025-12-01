package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BranchItemRecordDetailUpdateDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BranchItemRecordDetailUpdateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品系统编码", example="43440200001", required=true)
    private Integer itemNum;
    @ApiCloudField(value="生产日期", example="20250327", required=true)
    private String branchItemRecoredProductingDate;
    @ApiCloudField(value="单价", example="0.5")
    private BigDecimal branchItemRecoredUsePrice;
}
