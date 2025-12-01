package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosItemLogV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosItemLogV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="出入库明细ID", example="434400099009252351")
    private String logId;
    @ApiCloudField(value="单据号", example="PI4344990007056")
    private String logBillNo;
    @ApiCloudField(value="营业日", example="20210101")
    private String shiftTableBizday;
    @ApiCloudField(value="进出方向 true:进 false:出", example="true")
    private Boolean logInoutFlag;
    @ApiCloudField(value="门店编码")
    private Integer branchNum;
    @ApiCloudField(value="进仓库编号")
    private Integer inStorehouseNum;
    @ApiCloudField(value="出仓库编号")
    private Integer outStorehouseNum;
    @ApiCloudField(value="商品编码", example="434422353")
    private Integer itemNum;
    @ApiCloudField(value="商品代码", example="042112")
    private String itemCode;
    @ApiCloudField(value="商品名称", example="苹果")
    private String itemName;
    @ApiCloudField(value="商品基本单位", example="公斤")
    private String itemUnit;
    @ApiCloudField(value="商品辅助单位", example="公斤")
    private String itemAssistUnit;
    @ApiCloudField(value="规格", example="1箱10件")
    private String itemSpec;
    @ApiCloudField(value="商品类别代码", example="01")
    private String itemCategory;
    @ApiCloudField(value="批次号", example="20210101")
    private String itemLotNumber;
    @ApiCloudField(value="摘要", example="收货单")
    private String logSummary;
    @ApiCloudField(value="进出日期", example="2021-12-20 02:32:09")
    private String logDate;
    @ApiCloudField(value="操作日期", example="2021-12-20")
    private String logOperateDate;
    @ApiCloudField(value="调整前存量（基本单位）", example="0")
    private BigDecimal logItemBalance;
    @ApiCloudField(value="进项或出项数量(小数点3位)", example="50.0")
    private BigDecimal logItemAmount;
    @ApiCloudField(value="进项或辅项辅量(小数点3位)", example="0.0")
    private BigDecimal logItemAssistAmount;
    @ApiCloudField(value="进项或出项均价(小数点4位)", example="10.0")
    private BigDecimal logItemPrice;
    @ApiCloudField(value="进项或出项金额(小数点2位)", example="500.0")
    private BigDecimal logMoney;
    @ApiCloudField(value="调整金额(小数点2位)", example="5.0")
    private BigDecimal logAdjustMoney;
    @ApiCloudField(value="进出单位", example="公斤")
    private String logUseUnit;
    @ApiCloudField(value="进出单价(小数点四位)", example="125.0")
    private BigDecimal logUsePrice;
    @ApiCloudField(value="进出数量(小数点三位)", example="5.0")
    private BigDecimal logUseQty;
    @ApiCloudField(value="调整后存量（基本单位）", example="50.0")
    private BigDecimal afterAdjustmentQty;
    @ApiCloudField(value="调整后金额", example="50.0")
    private BigDecimal afterAdjustmentMoney;
    @ApiCloudField(value="备注", example="备注内容")
    private String logMemo;
    @ApiCloudField(value="操作人", example="管理员")
    private String logOperator;
    @ApiCloudField(value="明细编号", example="1")
    private Integer posItemLogBillDetailNum;
}
