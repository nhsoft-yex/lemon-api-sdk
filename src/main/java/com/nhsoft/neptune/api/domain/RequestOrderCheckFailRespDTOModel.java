package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * RequestOrderCheckFailRespDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RequestOrderCheckFailRespDTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品列表", example="")
    private List<RequestOrderCheckFailDetailRespDTOModel> requestAuditResultDetails;
    @ApiCloudField(value="具体信息", example="")
    private String msg;
    @ApiCloudField(value="0: 禁止要货 1:不在要货时间范围内 2:要货数量不合法 3:忽略上一次要货 4:余额不足 5:跳转充值")
    private Integer msgType;
    @ApiCloudField(value="批量审核时门店发生变更的要货单数据", example="")
    private List<RequestOrderVOModel> branchChangeRequestOrders;
}
