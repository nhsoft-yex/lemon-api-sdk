package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ReceivableOrderSaveByFeeDTO模型
 * 资金应收单
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ReceivableOrderSaveByFeeDTOModel extends ApiCloudObject {

    @ApiCloudField(value="业务类型（储值卡|商品|业务费用|费用|拓展单据类型1|拓展单据类型2）", example="储值卡", required=true)
    private String businessType;
    @ApiCloudField(value="快速生成单据类型(批发销售单|批发退货单|卡存款单|全渠道会员卡存款单|调出单|调入单|应收费用单|应付费用单)", example="应收费用单")
    private String quickOrderType;
    @ApiCloudField(value="目标用户中心门店ID(和合作伙伴ID二选一)", example="1")
    private String dstBranchId;
    @ApiCloudField(value="目标合作伙伴用户中心ID(和门店ID二选一)", example="1")
    private String dstPartnerId;
    @ApiCloudField(value="源用户中心门店", example="1", required=true)
    private String srcBranchId;
    @ApiCloudField(value="业务日期", example="2022-01-01 00:00:00")
    private String date;
    @ApiCloudField(value="到期日期", example="2022-01-01 00:00:00")
    private String deadline;
    @ApiCloudField(value="外部单据号", example="PI43440000001")
    private String refBillNo;
    @ApiCloudField(value="备注", example="备注")
    private String remark;
    @ApiCloudField(value="操作人", example="管理员")
    private String operator;
    @ApiCloudField(value="操作时间", example="2022-01-01 00:00:00")
    private String operatorTime;
    @ApiCloudField(value="费用项目明细", example="", required=true)
    private List<FeeItemDetailDTOModel> details;
    @ApiCloudField(value="明细", example="", required=true)
    private List<PayablePlanRequestDTOModel> planRequests;
}
