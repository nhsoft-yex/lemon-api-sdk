package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PolicyPromotionOrderFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PolicyPromotionOrderFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编码", example="1", required=true)
    private Integer branchNum;
    @ApiCloudField(value="商品编码", example="43440001", required=true)
    private Integer itemNum;
    @ApiCloudField(value="开始时间(yyyy-MM-dd)", example="2021-01-21", required=true)
    private String dateFrom;
    @ApiCloudField(value="开始时间(yyyy-MM-dd)", example="2021-01-21", required=true)
    private String dateTo;
}
