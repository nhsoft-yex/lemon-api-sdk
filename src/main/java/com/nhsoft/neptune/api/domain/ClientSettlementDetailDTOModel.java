package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ClientSettlementDetailDTO模型
 * 客户结算明细
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ClientSettlementDetailDTOModel extends ApiCloudObject {

    @ApiCloudField(value="其他收支单号", example="OP4344990010424")
    private String otherInoutBillNo;
    @ApiCloudField(value="批发销售单号", example="WO4344020000069")
    private String wholesaleOrderFid;
    @ApiCloudField(value="批发退货单号", example="WR2003990000001")
    private String wholesaleReturnOrderFid;
    @ApiCloudField(value="结算金额（小数点2位）", example="100.0", required=true)
    private BigDecimal supplierSettlementDetailMoney;
    @ApiCloudField(value="折扣金额（小数点2位）", example="1.0", required=true)
    private BigDecimal clientSettlementDetailDiscount;
    @ApiCloudField(value="备注", example="备注信息")
    private String clientSettlementDetailMemo;
}
