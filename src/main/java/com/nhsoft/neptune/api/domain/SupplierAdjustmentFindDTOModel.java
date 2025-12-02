package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SupplierAdjustmentFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SupplierAdjustmentFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="开始日期", required=true)
    private String dateFrom;
    @ApiCloudField(value="结束日期", required=true)
    private String dateTo;
    @ApiCloudField(value="单据号", example="")
    private String fid;
    @ApiCloudField(value="制单门店编号列表", example="[1]")
    private List<Integer> branchNums;
    @ApiCloudField(value="供应商编号")
    private Integer supplierNum;
    @ApiCloudField(value="商品编号", example="")
    private List<Integer> itemNums;
    @ApiCloudField(value="状态 1 制单 2 审核 4 失效")
    private Integer stateCode;
    @ApiCloudField(value="查询页码", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小", example="100", required=true)
    private Integer pageSize;
}
