package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WhsOtherInComeSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WhsOtherInComeSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编号", example="1", required=true)
    private Integer branchNum;
    @ApiCloudField(value="业务类型(往来应收|其他收入)", example="往来应收", required=true)
    private String incomeType;
    @ApiCloudField(value="往来类型(客户|供应商|内部组织)", example="客户", required=true)
    private String peeType;
    @ApiCloudField(value="供应商编码", example="1")
    private Integer supplierNum;
    @ApiCloudField(value="客户编号", example="0099685990000009")
    private String posClientFid;
    @ApiCloudField(value="内部组织编号", example="43486393")
    private String peeOrganizationId;
    @ApiCloudField(value="结算组织编号", example="43486272")
    private String organizationId;
    @ApiCloudField(value="业务日期", required=true)
    private String businessDate;
    @ApiCloudField(value="收款到期时间", required=true)
    private String receiveDueTime;
    @ApiCloudField(value="备注", example="根据批发销售单[WO99679990000196]自动生成")
    private String remark;
    @ApiCloudField(value="制单人", example="admin")
    private String creator;
    @ApiCloudField(value="收入明细", example="", required=true)
    private List<WhsOtherInComeDetailDTOModel> itemList;
    @ApiCloudField(value="收款时间", required=true)
    private String receiveTime;
    @ApiCloudField(value="收款人编号", example="1", required=true)
    private Long receiverNum;
    @ApiCloudField(value="收款人名称", example="admin", required=true)
    private String receiverName;
    @ApiCloudField(value="收款备注", example="根据批发销售单[WO99679990000196]自动生成")
    private String receiveMemo;
    @ApiCloudField(value="收款信息列表", example="")
    private List<WhsOtherInComePayInfoDTOModel> payInfoList;
}
