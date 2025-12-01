package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * RequestOrderDetailVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RequestOrderDetailVOModel extends ApiCloudObject {

    @ApiCloudField(value="要货明细编号")
    private Integer detailNum;
    @ApiCloudField(value="商品编码", example="434400016")
    private Integer itemNum;
    @ApiCloudField(value="商品名称", example="苹果")
    private String itemName;
    @ApiCloudField(value="商品规格", example="1箱*10公斤")
    private String itemSpec;
    @ApiCloudField(value="商品代码", example="10001")
    private String itemCode;
    @ApiCloudField(value="基本单位", example="公斤")
    private String itemUnit;
    @ApiCloudField(value="基本单位数量（小数点3位）", example="1.0")
    private BigDecimal itemQty;
    @ApiCloudField(value="要货数量（小数点3位）", example="1.0")
    private BigDecimal itemUseQty;
    @ApiCloudField(value="要货单价（小数点4位）", example="1.0")
    private BigDecimal itemUsePrice;
    @ApiCloudField(value="要货单位", example="公斤")
    private String itemUseUnit;
    @ApiCloudField(value="赠品单位", example="公斤")
    private String itemPresentUnit;
    @ApiCloudField(value="赠品数量（小数点3位）", example="1.0")
    private BigDecimal itemPresentQty;
    @ApiCloudField(value="常用单位换算率（小数点3位）", example="1.0")
    private BigDecimal itemUseRate;
    @ApiCloudField(value="调出基本数量（小数点3位）", example="1.0")
    private BigDecimal itemOutAmount;
    @ApiCloudField(value="调出金额（小数点2位）", example="5.0")
    private BigDecimal itemOutMoney;
    @ApiCloudField(value="备注", example="备注内容")
    private String itemMemo;
    @ApiCloudField(value="是否必定货", example="true")
    private Boolean itemBoundGood;
    @ApiCloudField(value="要货价", example="1.0")
    private BigDecimal itemDetailCost;
    @ApiCloudField(value="金额", example="1.0")
    private BigDecimal itemSubtotal;
    @ApiCloudField(value="原要货数量", example="1.0")
    private BigDecimal itemStdQty;
    @ApiCloudField(value="参加超量促销的数量", example="1.0")
    private BigDecimal itemPolicyQty;
}
