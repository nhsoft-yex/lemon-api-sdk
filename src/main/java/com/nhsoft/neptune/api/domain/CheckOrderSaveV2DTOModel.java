package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CheckOrderSaveV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CheckOrderSaveV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编码", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="仓库编码", example="150050001", required=true)
    private Integer storehouseNum;
    @ApiCloudField(value="盘点单位(库存单位|配送单位|采购单位|基本单位|批发单位)", example="采购单位", required=true)
    private String checkOrderUnit;
    @ApiCloudField(value="操作人", example="管理员", required=true)
    private String checkOrderOperator;
    @ApiCloudField(value="盘点日期（yyyy-mm-dd）", example="2021-01-20", required=true)
    private String checkOrderDate;
    @ApiCloudField(value="备注", example="备注信息")
    private String checkOrderMemo;
    @ApiCloudField(value="明细", example="", required=true)
    private List<CheckOrderSaveDetailV2DTOModel> checkOrderDetails;
}
