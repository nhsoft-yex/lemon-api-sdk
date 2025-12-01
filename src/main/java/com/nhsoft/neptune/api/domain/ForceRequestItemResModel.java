package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ForceRequestItemRes模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ForceRequestItemResModel extends ApiCloudObject {

    @ApiCloudField(value="应用门店编码", example="1")
    private Integer itemNum;
    @ApiCloudField(value="当天已制单数量", example="22")
    private BigDecimal createQty;
    @ApiCloudField(value="上次要货数量", example="3")
    private BigDecimal lastRequestQty;
    @ApiCloudField(value="当天已审核数量", example="1")
    private BigDecimal auditQty;
    @ApiCloudField(value="要货下限", example="1")
    private BigDecimal requestLowerLimit;
}
