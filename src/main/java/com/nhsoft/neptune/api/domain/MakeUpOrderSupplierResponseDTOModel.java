package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MakeUpOrderSupplierResponseDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MakeUpOrderSupplierResponseDTOModel extends ApiCloudObject {

    @ApiCloudField(value="单据号", example="9999101002727")
    private String makeUpOrderFid;
    @ApiCloudField(value="门店编码", example="99")
    private Integer branchNum;
    @ApiCloudField(value="供应商编码", example="999910002")
    private Integer supplierNum;
    @ApiCloudField(value="仓库编码", example="999910002")
    private Integer storehouseNum;
    @ApiCloudField(value="扣补类型", example="按照库存数量扣补")
    private String makeUpType;
    @ApiCloudField(value="扣补金额", example="200.0")
    private BigDecimal makeUpMoney;
    @ApiCloudField(value="已结算金额", example="0.0")
    private BigDecimal settlementMoney;
    @ApiCloudField(value="状态代码", example="1")
    private Integer makeUpStateCode;
    @ApiCloudField(value="状态名称", example="制单")
    private String makeUpStateName;
    @ApiCloudField(value="备注", example="")
    private String makeUpOrderMemo;
    @ApiCloudField(value="明细", example="")
    private List<MakeUpOrderSupplierDetailResponseDTOModel> makeUpOrderDetails;
}
