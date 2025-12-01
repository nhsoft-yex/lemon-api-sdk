package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * RequestOrderVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RequestOrderVOModel extends ApiCloudObject {

    @ApiCloudField(value="要货单号", example="YH4344010004311")
    private String requestOrderFid;
    @ApiCloudField(value="要货门店编码", example="1")
    private Integer branchNum;
    @ApiCloudField(value="调出门店编码", example="99")
    private Integer outBranchNum;
    @ApiCloudField(value="创建人", example="管理员")
    private String requestOrderCreator;
    @ApiCloudField(value="要货单类型(0:正常单 1:加单 2:预定单)", example="1")
    private Integer requestOrderType;
    @ApiCloudField(value="要货部门", example="水果部")
    private String requestOrderDepartment;
    @ApiCloudField(value="备注", example="备注信息")
    private String requestOrderMemo;
    @ApiCloudField(value="外部流水号", example="1")
    private String requestOrderRefBillNo;
    @ApiCloudField(value="业务员", example="业务员名称")
    private String requestOrderProposer;
    @ApiCloudField(value="创建时间", example="2021-01-01 00:00:00")
    private String requestOrderCreateTime;
    @ApiCloudField(value="审核人", example="管理员")
    private String requestOrderAuditor;
    @ApiCloudField(value="审核时间", example="2021-01-01 00:00:00")
    private String requestOrderAuditTime;
    @ApiCloudField(value="作废时间", example="2021-01-01 00:00:00")
    private String requestOrderCancelTime;
    @ApiCloudField(value="有效日期", example="2021-01-01")
    private String requestOrderDeadline;
    @ApiCloudField(value="状态代码", example="3")
    private Integer requestOrderStateCode;
    @ApiCloudField(value="状态名称", example="制单｜审核")
    private String requestOrderStateName;
    @ApiCloudField(value="要货金额（小数点2位）", example="10.0")
    private BigDecimal requestOrderTotalMoney;
    @ApiCloudField(value="要货日期", example="2021-02-20")
    private String requestOrderApplyDate;
    @ApiCloudField(value="采配日期", example="2021-02-20")
    private String requestOrderPurchaseDate;
    @ApiCloudField(value="wms配送日期", example="2021-02-20")
    private String requestOrderSendDate;
    @ApiCloudField(value="付款日期", example="2021-02-20")
    private String requestOrderPayDate;
    @ApiCloudField(value="总部配送调出状态(待处理|已发货|部分发货)", example="待处理")
    private String requestOrderTransferState;
    @ApiCloudField(value="运费", example="20.0")
    private BigDecimal requestOrderFeeMoney;
    @ApiCloudField(value="是否由门店预订单生成", example="false")
    private Boolean requestOrderReserve;
    @ApiCloudField(value="最后修改时间", example="2021-01-20 00:00:00")
    private String requestOrderLastEditTime;
    @ApiCloudField(value="明细", example="")
    private List<RequestOrderDetailVOModel> requestOrderDetails;
    @ApiCloudField(value="结算状态(null,0,1-未付款,2-已付款)", example="2")
    private Integer requestOrderSettlementState;
    @ApiCloudField(value="配送方式(0:商家配送;1:门店自提)", example="0")
    private Integer requestOrderSendType;
    @ApiCloudField(value="要货周期id")
    private Long requestBatchId;
    @ApiCloudField(value="是否生成调出单(find接口需要配合query_transfer_out使用)", example="false")
    private Boolean transferOut;
}
