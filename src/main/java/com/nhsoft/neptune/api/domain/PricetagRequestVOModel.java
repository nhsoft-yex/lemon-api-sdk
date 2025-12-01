package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PricetagRequestVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PricetagRequestVOModel extends ApiCloudObject {

    @ApiCloudField(value="申请单号", example="JQ2072990000031")
    private String pricetagRequestFid;
    @ApiCloudField(value="被申请分店", example="2")
    private Integer outBranchNum;
    @ApiCloudField(value="申请分店", example="99")
    private Integer branchNum;
    @ApiCloudField(value="状态(1制单，3审核，5打印，7作废)", example="1")
    private Integer state;
    @ApiCloudField(value="状态(制单;制单|审核;制单|审核|打印;制单|审核|作废)", example="制单|审核")
    private String stateName;
    @ApiCloudField(value="制单人", example="test")
    private String pricetagRequestCreator;
    @ApiCloudField(value="审核人", example="wqw10086")
    private String pricetagRequestAuditor;
    @ApiCloudField(value="申请时间", example="2023-05-25 15:50:18")
    private String pricetagRequestApplyTime;
    @ApiCloudField(value="备注", example="测试")
    private String pricetagRequestMemo;
    @ApiCloudField(value="打印次数", example="1")
    private Integer pricetagRequestPrintCount;
    @ApiCloudField(value="审核时间", example="2023-05-25 15:50:18")
    private String pricetagRequestAuditTime;
    @ApiCloudField(value="品项", example="3")
    private Integer pricetagRequestSku;
    @ApiCloudField(value="打印数量", example="3533")
    private Integer pricetagRequestAmount;
    @ApiCloudField(value="价签格式编号", example="7c61a4a4197d4326bb7840f66eb8fbd4")
    private String pricetagRequestReportId;
    @ApiCloudField(value="明细", example="")
    private List<PricetagRequestDetailVOModel> pricetagRequestDetails;
}
