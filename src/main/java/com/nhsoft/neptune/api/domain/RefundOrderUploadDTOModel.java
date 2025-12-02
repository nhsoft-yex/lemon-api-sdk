package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * RefundOrderUploadDTO模型
 * 退款订单上传DTO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RefundOrderUploadDTOModel extends ApiCloudObject {

    @ApiCloudField(value="平台订单号", example="", required=true)
    private String platformOrderId;
    @ApiCloudField(value="平台退款订单号", example="", required=true)
    private String platformRefundId;
    @ApiCloudField(value="订单商品明细列表(退款)", example="", required=true)
    private List<ShopOrderDetailDTOModel> orderItemList;
    @ApiCloudField(value="退款金额，单位(分)")
    private Integer refundMoney;
    @ApiCloudField(value="退款原因", example="")
    private String refundReason;
}
