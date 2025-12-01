package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WmsOutOrderDetailVO模型
 * WMS出库单明细
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WmsOutOrderDetailVOModel extends ApiCloudObject {

    @ApiCloudField(value="明细编号", example="1")
    private Integer detailNum;
    @ApiCloudField(value="库位编码", example="8070")
    private Long positionNum;
    @ApiCloudField(value="库位名称", example="jh001")
    private String positionName;
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
    @ApiCloudField(value="基本单价（小数点4位）", example="1.0")
    private BigDecimal itemPrice;
    @ApiCloudField(value="出库数量（小数点3位）", example="1.0")
    private BigDecimal itemUseQty;
    @ApiCloudField(value="出库单价（小数点4位）", example="1.0")
    private BigDecimal itemUsePrice;
    @ApiCloudField(value="出库单位", example="公斤")
    private String itemUseUnit;
    @ApiCloudField(value="赠品单位", example="公斤")
    private String itemPresentUnit;
    @ApiCloudField(value="赠品数量（小数点3位）", example="1.0")
    private BigDecimal itemPresentQty;
    @ApiCloudField(value="常用单位换算率（小数点3位）", example="1.0")
    private BigDecimal itemUseRate;
    @ApiCloudField(value="明细金额（小数点2位）", example="5.0")
    private BigDecimal itemMoney;
    @ApiCloudField(value="备注", example="备注内容")
    private String itemMemo;
    @ApiCloudField(value="批次号", example="20240422094915")
    private String itemLotNum;
    @ApiCloudField(value="箱码", example="B171375842042853263099")
    private String boxCode;
    @ApiCloudField(value="保质期", example="30")
    private Integer itemValidDay;
    @ApiCloudField(value="生产日期", example="Mon Apr 01 08:00:00 CST 2024")
    private String itemProductDate;
    @ApiCloudField(value="有效日期", example="Mon Apr 01 08:00:00 CST 2024")
    private String itemValidDate;
    @ApiCloudField(value="体积", example="0.0")
    private BigDecimal productVolume;
    @ApiCloudField(value="重量(kg)", example="2.0")
    private BigDecimal productWeight;
}
