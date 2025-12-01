package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ReceiveFindV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ReceiveFindV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编码", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="仓库编码", example="150050001")
    private Integer storehouseNum;
    @ApiCloudField(value="供应商编码", example="203000001")
    private Integer supplierNum;
    @ApiCloudField(value="时间类型:审核时间、最后修改时间、制单时间、业务时间", example="审核时间", required=true)
    private String dateType;
    @ApiCloudField(value="开始时间 格式：yyyy-MM-dd", example="2021-01-20", required=true)
    private String dateFrom;
    @ApiCloudField(value="结束时间 格式：yyyy-MM-dd", example="2021-01-20", required=true)
    private String dateTo;
    @ApiCloudField(value="开始时间(HH:mm:ss)", example="13:00:00")
    private String timeFrom;
    @ApiCloudField(value="结束时间(HH:mm:ss)", example="14:00:00")
    private String timeTo;
    @ApiCloudField(value="单据状态代码(1:制单 3:制单|审核)", example="[1,3]")
    private List<Integer> stateCodes;
    @ApiCloudField(value="采购订单号", example="PO2030990000001")
    private String purchaseOrderFid;
    @ApiCloudField(value="查询页码 从1开始", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小", example="10", required=true)
    private Integer pageSize;
}
