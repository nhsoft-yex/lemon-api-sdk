package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WhsOtherInComeVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WhsOtherInComeVOModel extends ApiCloudObject {

    @ApiCloudField(value="其他收入单据编号", example="DO996792504170002")
    private String whsOtherIncomeNo;
    @ApiCloudField(value="金额", example="376.0")
    private BigDecimal totalMoney;
    @ApiCloudField(value="已收款金额", example="376.0")
    private BigDecimal paidMoney;
    @ApiCloudField(value="待收款金额", example="0.0")
    private BigDecimal remainMoney;
    @ApiCloudField(value="优惠金额", example="376.0")
    private BigDecimal discountMoney;
    @ApiCloudField(value="到期金额", example="376.0")
    private BigDecimal dueMoney;
    @ApiCloudField(value="业务类型", example="往来应收")
    private String incomeType;
    @ApiCloudField(value="往来类型(客户|供应商|内部组织)", example="客户")
    private String peeType;
    @ApiCloudField(value="供应商编码", example="1")
    private Integer supplierNum;
    @ApiCloudField(value="供应商名称", example="上海新海")
    private String supplierName;
    @ApiCloudField(value="供应商代码", example="00A")
    private String supplierCode;
    @ApiCloudField(value="客户编号", example="0099685990000009")
    private String posClientFid;
    @ApiCloudField(value="内部组织编号", example="43486393")
    private String peeOrganizationId;
    @ApiCloudField(value="结算组织编号", example="43486272")
    private String organizationId;
    @ApiCloudField(value="备注", example="根据批发销售单[WO99679990000196]自动生成")
    private String remark;
    @ApiCloudField(value="收款到期时间")
    private String receiveDueTime;
    @ApiCloudField(value="收款时间")
    private String receiveTime;
    @ApiCloudField(value="收款人名称", example="admin")
    private String receiverName;
    @ApiCloudField(value="收款备注", example="根据批发销售单[WO99679990000196]自动生成")
    private String receiveMemo;
    @ApiCloudField(value="收款人编号", example="1")
    private Long receiverNum;
    @ApiCloudField(value="制单人", example="admin")
    private String creator;
    @ApiCloudField(value="制单时间")
    private String createTime;
    @ApiCloudField(value="审核人", example="admin")
    private String auditor;
    @ApiCloudField(value="审核时间")
    private String auditTime;
    @ApiCloudField(value="打印次数", example="0")
    private Integer printCount;
    @ApiCloudField(value="客户编号", example="0099685990000009")
    private String clientCode;
    @ApiCloudField(value="客户名称", example="上海新海")
    private String clientName;
    @ApiCloudField(value="结算组织名称", example="管理中心组织")
    private String organizationName;
    @ApiCloudField(value="业务日期")
    private String businessDate;
    @ApiCloudField(value="往来单位名称", example="90012|新蜜雪冰城")
    private String pee;
    @ApiCloudField(value="单据状态", example="3")
    private Integer stateCode;
    @ApiCloudField(value="单据状态名称", example="制单|审核")
    private String stateName;
}
