package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PolicyFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PolicyFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="申请门店编码", example="1")
    private Integer branchNum;
    @ApiCloudField(value="应用门店编码", example="1")
    private Integer applyBranchNum;
    @ApiCloudField(value="时间类型（促销时间|审核时间|制单时间|最后修改时间|结束时间）", example="促销时间", required=true)
    private String dateType;
    @ApiCloudField(value="开始时间(yyyy-MM-dd)", example="Fri Jan 01 08:00:00 CST 2021", required=true)
    private String dateFrom;
    @ApiCloudField(value="结束时间(yyyy-MM-dd)", example="Fri Jan 01 08:00:00 CST 2021", required=true)
    private String dateTo;
    @ApiCloudField(value="单据状态（ 1：已审核 2：未审核 3：作废）", example="1")
    private Integer orderState;
    @ApiCloudField(value="查询页码", example="1")
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小", example="10")
    private Integer pageSize;
    @ApiCloudField(value="是否需要明细", example="true")
    private Boolean withDetail;
}
