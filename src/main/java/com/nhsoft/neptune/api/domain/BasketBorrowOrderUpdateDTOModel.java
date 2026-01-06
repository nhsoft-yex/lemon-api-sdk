package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BasketBorrowOrderUpdateDTO模型
 * 筐借还单更新DTO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BasketBorrowOrderUpdateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="筐借还单号", example="BB20959924247000001", required=true)
    private String basketBorrowOrderFid;
    @ApiCloudField(value="出入标记(true-归还，false借出)", example="true", required=true)
    private Boolean inoutFlag;
    @ApiCloudField(value="单据类型(客户借筐，欠供应商筐)", example="客户借筐", required=true)
    private String orderType;
    @ApiCloudField(value="客户编码(客户借筐必填)")
    private Integer clientNum;
    @ApiCloudField(value="供应商编码(欠供应商框必填)")
    private Integer supplierNum;
    @ApiCloudField(value="容器用途(周转筐、押金筐)", example="周转筐", required=true)
    private String containerUse;
    @ApiCloudField(value="操作人", example="管理员", required=true)
    private String operator;
    @ApiCloudField(value="容器明细", required=true)
    private List<BasketBorrowOrderSaveDetailDTOModel> details;
}
