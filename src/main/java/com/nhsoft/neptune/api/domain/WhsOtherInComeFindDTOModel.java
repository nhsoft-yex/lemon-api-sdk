package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WhsOtherInComeFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WhsOtherInComeFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="查询页码", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小", example="10", required=true)
    private Integer pageSize;
    @ApiCloudField(value="时间类型(制单时间|审核时间|业务日期)", example="制单时间", required=true)
    private String dateType;
    @ApiCloudField(value="开始时间", required=true)
    private String dateFrom;
    @ApiCloudField(value="结束时间", required=true)
    private String dateTo;
    @ApiCloudField(value="结算组织编号", example="40213755")
    private String organizationId;
    @ApiCloudField(value="内部组织编号列表", example="[40213755,40213755]")
    private List<String> peeOrganizationIds;
    @ApiCloudField(value="客户编号", example="0099685990000009")
    private String posClientFid;
    @ApiCloudField(value="供应商编号列表", example="[0099685990000009]")
    private List<String> supplierNum;
    @ApiCloudField(value="业务类型(往来应收|其他收入)", example="往来应收")
    private String incomeType;
    @ApiCloudField(value="单据状态(1:制单;3：审核)", example="1")
    private Integer stateCode;
    @ApiCloudField(value="单据编号", example="2023010000000001")
    private String whsOtherIncomeNo;
    @ApiCloudField(value="收入类型列表", example="[房租]")
    private List<String> itemList;
}
