package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ShiftTablePaymentDetailVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ShiftTablePaymentDetailVOModel extends ApiCloudObject {

    @ApiCloudField(value="班次收银编号", example="1")
    private Integer shiftTablePaymentNum;
    @ApiCloudField(value="收银类型", example="20230313")
    private String shiftTablePaymentType;
    @ApiCloudField(value="收银金额", example="50.0")
    private BigDecimal shiftTablePaymentMoney;
    @ApiCloudField(value="收银账户银行名称", example="中国银行")
    private String shiftTablePaymentBankName;
    @ApiCloudField(value="收银时间", example="2023-03-13 00:00:00")
    private String shiftTablePaymentTime;
    @ApiCloudField(value="收银单据号", example="")
    private String shiftTablePaymentBankBillNo;
}
