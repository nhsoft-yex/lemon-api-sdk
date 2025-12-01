package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ReceiptOrderAuditDTO模型
 * 收款单审核参数
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ReceiptOrderAuditDTOModel extends ApiCloudObject {

    @ApiCloudField(value="业务类型（储值卡|商品|业务费用|费用）", example="业务费用", required=true)
    private String businessType;
    @ApiCloudField(value="收款单描述", example="备注")
    private String description;
    @ApiCloudField(value="目标门店用户中心id", example="1", required=true)
    private Integer dstBranchId;
    @ApiCloudField(value="源门店用户中心id", example="99", required=true)
    private Integer srcBranchId;
    @ApiCloudField(value="实收金额", example="100")
    private BigDecimal totalAmount;
    @ApiCloudField(value="结算方式", example="现金")
    private String settlementType;
    @ApiCloudField(value="业务时间", example="2022-01-01 10:00:00", required=true)
    private String date;
    @ApiCloudField(value="操作人", example="管理员")
    private String operator;
}
