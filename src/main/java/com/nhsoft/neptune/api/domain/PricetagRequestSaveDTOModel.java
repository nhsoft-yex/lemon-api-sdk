package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PricetagRequestSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PricetagRequestSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="被申请分店", example="2", required=true)
    private Integer outBranchNum;
    @ApiCloudField(value="申请分店", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="制单人", example="test", required=true)
    private String pricetagRequestCreator;
    @ApiCloudField(value="备注", example="测试")
    private String pricetagRequestMemo;
    @ApiCloudField(value="价签格式编号", example="7c61a4a4197d4326bb7840f66eb8fbd4")
    private String pricetagRequestReportId;
    @ApiCloudField(value="明细", example="", required=true)
    private List<PricetagRequestSaveDetailDTOModel> pricetagRequestDetails;
}
