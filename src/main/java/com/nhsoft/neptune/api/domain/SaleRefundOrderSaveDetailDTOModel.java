package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SaleRefundOrderSaveDetailDTO模型
 * 退款订单保存明细
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SaleRefundOrderSaveDetailDTOModel extends ApiCloudObject {

    @ApiCloudField(value="订单商品明细编号", example="1", required=true)
    private Integer orderDetailNum;
    @ApiCloudField(value="退货数量(和金额二选一)", example="1.0")
    private BigDecimal amount;
    @ApiCloudField(value="退货金额(和数量二选一)", example="1")
    private BigDecimal money;
}
