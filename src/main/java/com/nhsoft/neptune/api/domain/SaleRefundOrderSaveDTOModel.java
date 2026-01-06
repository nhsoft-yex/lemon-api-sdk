package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SaleRefundOrderSaveDTO模型
 * 退款订单保存
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SaleRefundOrderSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="微商城订单Id", example="aaa", required=true)
    private String orderId;
    @ApiCloudField(value="是否手动退款", example="true", required=true)
    private Boolean manual;
    @ApiCloudField(value="订单类型", example="2023-01-01 10:00:00", required=true)
    private String reason;
    @ApiCloudField(value="退款订单的商品详情", required=true)
    private List<SaleRefundOrderSaveDetailDTOModel> refundOrderDetailSaves;
}
