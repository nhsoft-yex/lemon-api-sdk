package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WmsReturnOrderVO模型
 * WMS销退订单
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WmsReturnOrderVOModel extends ApiCloudObject {

    @ApiCloudField(value="wms销退订单编号", example="XTDD21139924067000001")
    private String returnOrderFid;
    @ApiCloudField(value="配送中心门店编号", example="99")
    private Integer branchNum;
    @ApiCloudField(value="wms客户编号", example="99")
    private Integer clientNum;
    @ApiCloudField(value="wms客户类型(1-门店;2-批发)", example="1")
    private Integer clientType;
    @ApiCloudField(value="wms客户名称", example="分店1")
    private String clientName;
    @ApiCloudField(value="创建时间")
    private String returnOrderCreateTime;
    @ApiCloudField(value="制单人", example="admin")
    private String returnOrderCreator;
    @ApiCloudField(value="入库状态代码(1-未处理；2-已生成任务；3-部分入库；4-全部入库)", example="1")
    private Integer returnOrderStateCode;
    @ApiCloudField(value="入库状态", example="未处理")
    private String returnOrderStateName;
    @ApiCloudField(value="审核人", example="admin")
    private String returnOrderAuditor;
    @ApiCloudField(value="审核时间")
    private String returnOrderAuditTime;
    @ApiCloudField(value="关联单号", example="NT2113992403020001")
    private String outOrderFid;
    @ApiCloudField(value="品种数", example="1")
    private Integer itemTypeNum;
    @ApiCloudField(value="单据状态代码", example="1")
    private Integer returnOrderOutStateCode;
    @ApiCloudField(value="单据状态", example="制单")
    private String returnOrderOutStateName;
    @ApiCloudField(value="退货订单明细")
    private List<WmsReturnOrderDetailVOModel> details;
}
