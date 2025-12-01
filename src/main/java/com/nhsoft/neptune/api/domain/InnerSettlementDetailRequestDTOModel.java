package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * InnerSettlementDetailRequestDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class InnerSettlementDetailRequestDTOModel extends ApiCloudObject {

    @ApiCloudField(value="调出单号", example="MO4344990001587")
    private String outOrderFid;
    @ApiCloudField(value="调入单号", example="MI4344990000625")
    private String inOrderFid;
    @ApiCloudField(value="会员卡结算单号", example="MP4344990002144")
    private String cardSettlementNo;
    @ApiCloudField(value="其他收支单号", example="OP4344990010424")
    private String otherInoutBillNo;
    @ApiCloudField(value="收货单号", example="PI4344020000069")
    private String receiveOrderFid;
    @ApiCloudField(value="退货单号", example="RO2003990000001")
    private String returnOrderFid;
    @ApiCloudField(value="结算金额（小数点2位）", example="100.0", required=true)
    private BigDecimal innerSettlementDetailMoney;
    @ApiCloudField(value="折扣金额（小数点2位）", example="0.0", required=true)
    private BigDecimal innerSettlementDetailDiscount;
    @ApiCloudField(value="备注", example="备注信息")
    private String innerSettlementDetailMemo;
}
