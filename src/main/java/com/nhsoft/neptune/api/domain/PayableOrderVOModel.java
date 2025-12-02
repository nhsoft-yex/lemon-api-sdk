package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PayableOrderVO模型
 * 应付订单VO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PayableOrderVOModel extends ApiCloudObject {

    @ApiCloudField(value="ID", example="PN0000120200616000001")
    private String id;
    @ApiCloudField(value="当前金额", example="10.0")
    private BigDecimal amount;
    @ApiCloudField(value="总金额", example="100.0")
    private BigDecimal totalAmount;
    @ApiCloudField(value="业务类型", example="业务费用")
    private String businessType;
    @ApiCloudField(value="业务日期", example="2022-04-01")
    private String date;
    @ApiCloudField(value="截止时间", example="2022-04-01")
    private String deadline;
    @ApiCloudField(value="发票编号", example="123456789")
    private String invoiceNo;
    @ApiCloudField(value="是否为副单", example="true")
    private Boolean other;
    @ApiCloudField(value="快速单据类型", example="")
    private String quickOrderType;
    @ApiCloudField(value="销售员", example="销售员")
    private String salesman;
    @ApiCloudField(value="状态", example="AUDITED")
    private String state;
    @ApiCloudField(value="源组织ID", example="G00001000288")
    private String srcGroupId;
    @ApiCloudField(value="源单位ID", example="R00001000294")
    private String srcUnitId;
    @ApiCloudField(value="目标组织ID", example="G00001000288")
    private String dstGroupId;
    @ApiCloudField(value="目标单位ID", example="R00001000294")
    private String dstUnitId;
    @ApiCloudField(value="创建时间", example="2022-04-01 08:12:49")
    private String createAt;
    @ApiCloudField(value="创建人", example="管理员")
    private String createByName;
    @ApiCloudField(value="审核时间", example="2022-04-01 08:12:49")
    private String auditAt;
    @ApiCloudField(value="审核人", example="管理员")
    private String auditByName;
    @ApiCloudField(value="备注", example="备注信息")
    private String remark;
    @ApiCloudField(value="关联单据号", example="PI2072010001270")
    private List<String> fids;
    @ApiCloudField(value="应付单明细", example="")
    private List<PayableOrderDetailDTOModel> payableOrderDetails;
}
