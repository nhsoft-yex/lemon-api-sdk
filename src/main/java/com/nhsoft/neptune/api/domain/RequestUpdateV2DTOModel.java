package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * RequestUpdateV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RequestUpdateV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="要货单号", example="YH4344010004756", required=true)
    private String requestOrderFid;
    @ApiCloudField(value="修改人", example="管理员", required=true)
    private String requestOrderEditor;
    @ApiCloudField(value="外部编号(最大长度32)", example="A00001")
    private String requestOrderRefBillNo;
    @ApiCloudField(value="业务员", example="业务员A")
    private String requestOrderProposer;
    @ApiCloudField(value="备注", example="备注信息")
    private String requestOrderMemo;
    @ApiCloudField(value="运费", example="20.0")
    private BigDecimal requestOrderFeeMoney;
    @ApiCloudField(value="配送日期", example="2024-04-03")
    private String requestOrderPurchaseDate;
    @ApiCloudField(value="明细", example="", required=true)
    private List<RequestDetailV2DTOModel> requestOrderDetails;
}
