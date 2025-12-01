package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PayableFeeDetailRequestDTO模型
 * 应付单明细
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PayableFeeDetailRequestDTOModel extends ApiCloudObject {

    @ApiCloudField(value="应付金额", example="20.0")
    private BigDecimal amount;
    @ApiCloudField(value="折扣金额", example="1.0")
    private BigDecimal discountAmount;
    @ApiCloudField(value="折扣率", example="0")
    private BigDecimal discountRate;
    @ApiCloudField(value="价税合计", example="1", required=true)
    private BigDecimal initialAmount;
    @ApiCloudField(value="费用科目名称", example="储值卡结算", required=true)
    private String itemName;
    @ApiCloudField(value="物料编号", example="C00008002857", required=true)
    private String itemNum;
    @ApiCloudField(value="备注", example="备注")
    private String remark;
    @ApiCloudField(value="税额", example="10.0")
    private BigDecimal taxAmount;
    @ApiCloudField(value="税率", example="0.1")
    private BigDecimal taxRate;
}
