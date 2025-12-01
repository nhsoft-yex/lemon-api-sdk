package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * InvoiceEmailSendDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class InvoiceEmailSendDTOModel extends ApiCloudObject {

    @ApiCloudField(value="收件人邮箱", example="123456@qq.com", required=true)
    private String emailReceiver;
    @ApiCloudField(value="要发送的订单ID(和order_no不能同时为空)", example="1", required=true)
    private Long orderId;
    @ApiCloudField(value="要发送的订单号(和order_id不能同时为空)", example="YH996750000001", required=true)
    private String orderNo;
}
