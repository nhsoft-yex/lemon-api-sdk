package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosItemLogSeparateV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosItemLogSeparateV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="出入库明细ID", example="207200002000000001")
    private String posItemSeparateFid;
    @ApiCloudField(value="门店编码", example="2")
    private Integer branchNum;
    @ApiCloudField(value="分割品商品编码", example="207204314")
    private Integer separateItemNum;
    @ApiCloudField(value="分割品商品名称", example="白条")
    private String separateItemName;
    @ApiCloudField(value="仓库编码", example="207200002")
    private Integer storehouseNum;
    @ApiCloudField(value="单据类型", example="调出单")
    private String orderType;
    @ApiCloudField(value="单据编号", example="MO2072020001016")
    private String orderFid;
    @ApiCloudField(value="分割品商品基本数量", example="22.0")
    private BigDecimal separateItemQty;
    @ApiCloudField(value="分割品商品常用数量", example="1.0")
    private BigDecimal separateItemUseQty;
    @ApiCloudField(value="分割品商品单位", example="斤")
    private String separateItemUnit;
    @ApiCloudField(value="分割品商品常用单位", example="公斤")
    private String separateItemUseUnit;
    @ApiCloudField(value="商品编码", example="207210329")
    private Integer itemNum;
    @ApiCloudField(value="商品名称", example="多退少补")
    private String itemName;
    @ApiCloudField(value="业务日期(yyyy-mm-dd)", example="2023-01-05")
    private String orderDate;
}
