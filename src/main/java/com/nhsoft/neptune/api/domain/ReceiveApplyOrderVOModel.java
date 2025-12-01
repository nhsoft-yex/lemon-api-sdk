package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ReceiveApplyOrderVO模型
 * 收款冻结单VO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ReceiveApplyOrderVOModel extends ApiCloudObject {

    @ApiCloudField(value="收款冻结单ID", example="RF0000120211026000003")
    private String id;
    @ApiCloudField(value="业务类型", example="商品")
    private String businessType;
    @ApiCloudField(value="单据状态（CREATED，AUDITED，CANCELED,CONFIRMED，VERIFYING，VERIFIED）", example="AUDITED")
    private String state;
    @ApiCloudField(value="业务日期", example="2021-10-25")
    private String date;
    @ApiCloudField(value="截止时间", example="2021-10-30")
    private String deadline;
    @ApiCloudField(value="金额（小数点2位）", example="20.0")
    private BigDecimal amount;
    @ApiCloudField(value="关联单据号", example="YH4344041000419")
    private String refBillNo;
    @ApiCloudField(value="dst_unit")
    private SettlementUnitVOModel dstUnit;
}
