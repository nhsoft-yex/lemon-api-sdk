package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WholesaleReturnAuditDTO模型
 * 批发退货审核DTO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WholesaleReturnAuditDTOModel extends ApiCloudObject {

    @ApiCloudField(value="批发退货单号", example="WR2072010000002", required=true)
    private String wholesaleReturnFid;
    @ApiCloudField(value="操作人", example="管理员", required=true)
    private String wholesaleReturnOperator;
    @ApiCloudField(value="备注", example="备注信息")
    private String wholesaleReturnMemo;
    @ApiCloudField(value="退货日期 格式：yyyy-MM-dd", example="2021-01-18", required=true)
    private String wholesaleReturnDate;
    @ApiCloudField(value="批发退货单号")
    private String wholesaleReturnBillNo;
    @ApiCloudField(value="外部流水号", example="A0001")
    private String wholesaleReturnOutBillNo;
    @ApiCloudField(value="批发销售单号", example="WO2030990000008")
    private String wholesaleOrderFid;
    @ApiCloudField(value="销售员", example="管理员")
    private String wholesaleReturnSeller;
    @ApiCloudField(value="订单明细", example="", required=true)
    private List<WholesaleReturnDetailUpdateDTOModel> wholesaleReturnDetails;
}
