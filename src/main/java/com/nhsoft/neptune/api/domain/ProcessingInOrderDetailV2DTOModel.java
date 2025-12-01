package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ProcessingInOrderDetailV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ProcessingInOrderDetailV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编码", example="207212576")
    private Integer itemNum;
    @ApiCloudField(value="商品名称", example="麦当劳咖啡")
    private String itemName;
    @ApiCloudField(value="基本数量", example="20000.0")
    private BigDecimal itemQty;
    @ApiCloudField(value="数量、辅助数量", example="10000.0")
    private BigDecimal itemAssistQty;
    @ApiCloudField(value="商品换算率", example="2.0")
    private BigDecimal itemRate;
    @ApiCloudField(value="商品单价", example="2557.8535")
    private BigDecimal itemPrice;
    @ApiCloudField(value="商品总额", example="51156705.75")
    private BigDecimal itemMoney;
    @ApiCloudField(value="商品基本单位", example="斤")
    private String itemUnit;
    @ApiCloudField(value="商品辅助单位", example="个")
    private String itemAssistUnit;
    @ApiCloudField(value="备注", example="备注")
    private String itemMemo;
    @ApiCloudField(value="商品常用单位", example="个")
    private String itemUseUnit;
    @ApiCloudField(value="商品常用数量", example="10000.0")
    private BigDecimal itemUseQty;
    @ApiCloudField(value="商品码", example="00206")
    private String itemCode;
    @ApiCloudField(value="商品规格", example="500ml")
    private String itemSpec;
    @ApiCloudField(value="加工单编号", example="JO2072990001006")
    private String processingOrderFid;
    @ApiCloudField(value="加工生产日期", example="2022-04-20 00:00:00")
    private String itemProducingDate;
    @ApiCloudField(value="批次号", example="20220420")
    private String itemLotNumber;
}
