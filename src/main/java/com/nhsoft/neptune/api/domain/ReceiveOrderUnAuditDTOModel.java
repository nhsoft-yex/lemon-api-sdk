package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ReceiveOrderUnAuditDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ReceiveOrderUnAuditDTOModel extends ApiCloudObject {

    @ApiCloudField(value="收货单号", example="PI2003990000002", required=true)
    private String receiveOrderFid;
    @ApiCloudField(value="操作人", example="管理员", required=true)
    private String receiveOrderOperator;
}
