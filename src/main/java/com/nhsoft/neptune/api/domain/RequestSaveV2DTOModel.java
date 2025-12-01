package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * RequestSaveV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RequestSaveV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="调出门店编码", example="99", required=true)
    private Integer outBranchNum;
    @ApiCloudField(value="要货门店编码", example="1", required=true)
    private Integer branchNum;
    @ApiCloudField(value="当前登录门店", example="99")
    private Integer loginBranchNum;
    @ApiCloudField(value="创建人", example="管理员", required=true)
    private String requestOrderOperator;
    @ApiCloudField(value="要货单类型(0：正常单 1：加单 2：预定单)", example="0", required=true)
    private Integer requestOrderType;
    @ApiCloudField(value="外部编号(最大长度32)", example="A0001")
    private String requestOrderRefBillNo;
    @ApiCloudField(value="业务员", example="管理员")
    private String requestOrderProposer;
    @ApiCloudField(value="备注", example="备注信息")
    private String requestOrderMemo;
    @ApiCloudField(value="要货模板id")
    private Long requestBatchId;
    @ApiCloudField(value="配送日期", example="2024-04-03")
    private String requestOrderPurchaseDate;
    @ApiCloudField(value="storehouse_num")
    private Integer storehouseNum;
    @ApiCloudField(value="request_order_split_flag")
    private Boolean requestOrderSplitFlag;
    @ApiCloudField(value="request_order_fund_apply_id")
    private String requestOrderFundApplyId;
    @ApiCloudField(value="明细", example="", required=true)
    private List<RequestDetailV2DTOModel> requestOrderDetails;
}
