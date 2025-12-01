package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SupplierSettlementDetailResponseDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SupplierSettlementDetailResponseDTOModel extends ApiCloudObject {

    @ApiCloudField(value="供应商结算单号", example="CP4344990002262")
    private String settlementNo;
    @ApiCloudField(value="明细编号", example="1")
    private Integer settlementDetailNum;
    @ApiCloudField(value="结算金额（小数点2位）", example="100.0")
    private BigDecimal settlementDetailMoney;
    @ApiCloudField(value="折扣金额（小数点2位）", example="5.0")
    private BigDecimal settlementDetailDiscount;
    @ApiCloudField(value="结算备注", example="备注")
    private String settlementDetailMemo;
    @ApiCloudField(value="receive_order")
    private ReceiveOrderFindV2DTOModel receiveOrder;
    @ApiCloudField(value="return_order")
    private ReturnOrderV2DTOModel returnOrder;
    @ApiCloudField(value="other_inout")
    private SupplierOtherInoutDTOModel otherInout;
    @ApiCloudField(value="make_up_order")
    private MakeUpOrderDTOModel makeUpOrder;
}
