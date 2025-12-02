package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WholesaleInnerOrderDetailDTO模型
 * 售后申请单明细
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WholesaleInnerOrderDetailDTOModel extends ApiCloudObject {

    @ApiCloudField(value="明细编号", example="1")
    private Integer detailNum;
    @ApiCloudField(value="商品编号", example="4344990000318")
    private Integer itemNum;
    @ApiCloudField(value="商品代码", example="1001")
    private String itemCode;
    @ApiCloudField(value="商品名称", example="苹果")
    private String itemName;
    @ApiCloudField(value="商品规格", example="1箱*10公斤")
    private String itemSpec;
    @ApiCloudField(value="申请数量（小数点3位）", example="1.22")
    private BigDecimal itemUseQty;
    @ApiCloudField(value="商品单价（小数点4位）", example="2.0")
    private BigDecimal itemUsePrice;
    @ApiCloudField(value="商品单位", example="公斤")
    private String itemUseUnit;
    @ApiCloudField(value="金额（小数点4位）", example="2.0")
    private BigDecimal itemMoney;
    @ApiCloudField(value="基本单位数量（小数点3位）", example="1.0")
    private BigDecimal itemQty;
    @ApiCloudField(value="基本单位", example="公斤")
    private String itemUnit;
    @ApiCloudField(value="换算率（小数点4位）", example="10.0")
    private BigDecimal itemUseRate;
    @ApiCloudField(value="批复数量（小数点3位）", example="1.22")
    private BigDecimal itemApproveUseQty;
    @ApiCloudField(value="申请备注", example="")
    private String itemMemo;
    @ApiCloudField(value="批复备注", example="")
    private String itemApproveMemo;
    @ApiCloudField(value="批次号", example="10102654")
    private String itemLotNumber;
    @ApiCloudField(value="入货仓库编号", example="200300004")
    private Integer storehouseNum;
    @ApiCloudField(value="生产日期", example="Sun Jan 03 08:00:00 CST 2021")
    private String itemProductDate;
    @ApiCloudField(value="批复赠品基本数量", example="1.0")
    private BigDecimal itemPresentAuditQty;
    @ApiCloudField(value="批复赠品常用数量")
    private BigDecimal itemPresentAuditUseQty;
    @ApiCloudField(value="赠品常用数量")
    private BigDecimal itemPresentUseQty;
    @ApiCloudField(value="赠品基本数量")
    private BigDecimal itemPresentQty;
    @ApiCloudField(value="赠品单位", example="")
    private String itemPresentUnit;
}
