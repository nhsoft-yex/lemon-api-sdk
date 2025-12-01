package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PricetagRequestAuditDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PricetagRequestAuditDTOModel extends ApiCloudObject {

    @ApiCloudField(value="申请单号", example="JQ2072990000031", required=true)
    private String pricetagRequestFid;
    @ApiCloudField(value="被申请分店", example="2", required=true)
    private Integer outBranchNum;
    @ApiCloudField(value="审核人", example="测试", required=true)
    private String pricetagRequestAuditor;
    @ApiCloudField(value="备注", example="测试")
    private String pricetagRequestMemo;
    @ApiCloudField(value="价签格式编号", example="7c61a4a4197d4326bb7840f66eb8fbd4")
    private String pricetagRequestReportId;
    @ApiCloudField(value="pricetag_request_details")
    private List<PricetagRequestSaveDetailDTOModel> pricetagRequestDetails;
    @ApiCloudField(value="branch_num")
    private Integer branchNum;
}
