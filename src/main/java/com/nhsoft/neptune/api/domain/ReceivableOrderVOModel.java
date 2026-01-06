package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ReceivableOrderVO模型
 * 应收单VO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ReceivableOrderVOModel extends ApiCloudObject {

    @ApiCloudField(value="ID", example="PN0000120200616000001")
    private String id;
    @ApiCloudField(value="应用id", example="8")
    private String appId;
    @ApiCloudField(value="未收款金额", example="10.0")
    private BigDecimal amount;
    @ApiCloudField(value="应收金额", example="100.0")
    private BigDecimal totalAmount;
    @ApiCloudField(value="业务类型")
    private String businessType;
    @ApiCloudField(value="业务日期", example="2022-04-01 08:12:49")
    private String date;
    @ApiCloudField(value="截止时间", example="2022-04-01 08:12:49")
    private String deadline;
    @ApiCloudField(value="发票编号", example="2022-04-01 08:12:49")
    private String invoiceNo;
    @ApiCloudField(value="是否为副单", example="true")
    private Boolean other;
    @ApiCloudField(value="快速单据类型")
    private String quickOrderType;
    @ApiCloudField(value="销售员", example="销售员")
    private String salesman;
    @ApiCloudField(value="状态", example="销售员")
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
    @ApiCloudField(value="应收单明细")
    private List<ReceivableOrderDetailVOModel> receivableOrderDetails;
    @ApiCloudField(value="收款计划")
    private List<ReceivableOrderDeadlineVOModel> receivableOrderDeadlines;
    @ApiCloudField(value="关联单据号", example="[A2072012531611890001]")
    private List<String> refBillNos;
}
