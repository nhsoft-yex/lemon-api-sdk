package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ReceivableOrderDeadlineVO模型
 * 收款计划
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ReceivableOrderDeadlineVOModel extends ApiCloudObject {

    @ApiCloudField(value="应收金额", example="10.0")
    private BigDecimal amount;
    @ApiCloudField(value="到期日", example="2022-08-10")
    private String deadline;
    @ApiCloudField(value="序号", example="1")
    private Integer detailNum;
    @ApiCloudField(value="单据编号", example="RC0000820211102000001")
    private String orderId;
    @ApiCloudField(value="应用ID", example="8")
    private Integer appId;
}
