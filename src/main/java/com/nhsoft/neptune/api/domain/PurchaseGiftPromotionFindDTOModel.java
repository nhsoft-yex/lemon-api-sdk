package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PurchaseGiftPromotionFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PurchaseGiftPromotionFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="制单门店", example="1", required=true)
    private Integer branchNum;
    @ApiCloudField(value="应用门店编码(空时为所有门店)", example="1,2,3")
    private List<Integer> applyBranchNums;
    @ApiCloudField(value="应用供应商编码(空时为所有供应商)", example="1,2,3")
    private List<Integer> appliedSupplierNums;
    @ApiCloudField(value="时间类型（促销时间|审核时间|制单时间）", example="促销时间", required=true)
    private String dateType;
    @ApiCloudField(value="开始时间(yyyy-MM-dd)", example="2021-01-01", required=true)
    private String dateFrom;
    @ApiCloudField(value="结束时间(yyyy-MM-dd)", example="2021-01-01", required=true)
    private String dateTo;
    @ApiCloudField(value="单据状态（ 1：制单 3：制单|审核 7：制单|审核|作废）", example="[1,3,7]")
    private List<Integer> stateCodes;
    @ApiCloudField(value="查询页码，按促销时间查询时返回全部数据", example="1")
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小，按促销时间查询时返回全部数据", example="10")
    private Integer pageSize;
}
