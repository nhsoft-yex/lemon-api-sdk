package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BasketBorrowOrderVO模型
 * 筐借还单VO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BasketBorrowOrderVOModel extends ApiCloudObject {

    @ApiCloudField(value="筐借还单编号", example="", required=true)
    private String basketBorrowOrderFid;
    @ApiCloudField(value="门店编号", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="出入标记(true-归还，false借出)", example="true", required=true)
    private Boolean inoutFlag;
    @ApiCloudField(value="借还标记(抵押，归还，借出)", example="借出")
    private String inoutSign;
    @ApiCloudField(value="单据类型(客户借筐，欠供应商筐)", example="客户借筐", required=true)
    private String orderType;
    @ApiCloudField(value="客户编码")
    private Integer clientNum;
    @ApiCloudField(value="客户名称", example="")
    private String clientName;
    @ApiCloudField(value="供应商编码")
    private Integer supplierNum;
    @ApiCloudField(value="供应商名称", example="")
    private String supplierName;
    @ApiCloudField(value="业务日期", example="")
    private String orderBizday;
    @ApiCloudField(value="容器用途(周转筐、押金筐)", example="周转筐", required=true)
    private String containerUse;
    @ApiCloudField(value="状态编码")
    private Integer stateCode;
    @ApiCloudField(value="状态名称", example="")
    private String stateName;
    @ApiCloudField(value="容器明细", example="", required=true)
    private List<BasketBorrowOrderDetailVOModel> details;
}
