package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PaymentOrderAuditDTO模型
 * 付款单审核
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PaymentOrderAuditDTOModel extends ApiCloudObject {

    @ApiCloudField(value="业务类型（储值卡|商品|业务费用|费用）", example="GOODS", required=true)
    private String businessType;
    @ApiCloudField(value="描述", example="描述信息")
    private String description;
    @ApiCloudField(value="业务时间", example="2022-01-01 10:00:00", required=true)
    private String date;
    @ApiCloudField(value="目标门店用户中心id", example="1")
    private Integer dstBranchId;
    @ApiCloudField(value="源门店用户中心id", example="1", required=true)
    private Integer srcBranchId;
    @ApiCloudField(value="实收金额", example="100.0", required=true)
    private BigDecimal totalAmount;
    @ApiCloudField(value="结算方式", example="现金", required=true)
    private String settlementType;
    @ApiCloudField(value="操作人", example="管理员", required=true)
    private String operator;
    @ApiCloudField(value="退款收款单支付流水号", example="")
    private String originOrderNo;
    @ApiCloudField(value="目标合作伙伴ID", example="")
    private String dstPartnerId;
}
