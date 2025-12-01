package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosOrderDetailVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosOrderDetailVOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编码", example="150050001")
    private Integer itemNum;
    @ApiCloudField(value="分级商品编号", example="1")
    private Integer itemGradeNum;
    @ApiCloudField(value="明细编号", example="1")
    private Integer detailNum;
    @ApiCloudField(value="商品名称", example="苹果")
    private String itemName;
    @ApiCloudField(value="商品数量（小数点3位）", example="1.0")
    private BigDecimal itemQty;
    @ApiCloudField(value="商品标准售价（小数点4位）", example="1.0")
    private BigDecimal itemStdPrice;
    @ApiCloudField(value="商品实际价格（小数点4位）", example="1.0")
    private BigDecimal itemPrice;
    @ApiCloudField(value="原价金额")
    private BigDecimal orderDetailSaleDiscount;
    @ApiCloudField(value="商品成本价（小数点4位）", example="1.0")
    private BigDecimal itemCost;
    @ApiCloudField(value="商品折扣（小数点2位）", example="0.1")
    private BigDecimal itemDiscount;
    @ApiCloudField(value="实际应收（小数点2位）", example="1.0")
    private BigDecimal itemPaymentMoney;
    @ApiCloudField(value="商品状态(1:销售,2:囎送,4:退货,8:取消)", example="1")
    private Integer itemStateCode;
    @ApiCloudField(value="商品状态名称", example="销售")
    private String itemStateName;
    @ApiCloudField(value="备注", example="备注信息")
    private String itemMemo;
    @ApiCloudField(value="分摊金额（小数点2位）", example="1.0")
    private BigDecimal itemShareDiscount;
    @ApiCloudField(value="供应商", example="434400001")
    private Integer supplierNum;
    @ApiCloudField(value="经营方式", example="购销")
    private String managementStyleType;
    @ApiCloudField(value="是否有商品组合明细", example="true")
    private Boolean orderDetailHasKit;
    @ApiCloudField(value="销售毛利", example="10.0")
    private BigDecimal orderDetailGrossProfit;
    @ApiCloudField(value="在线商品数量（小数点3位）", example="1.0")
    private BigDecimal orderDetailOnlineQty;
    @ApiCloudField(value="是否手动调价", example="true")
    private Boolean orderDetailManualChanged;
    @ApiCloudField(value="商品组合明细", example="")
    private List<PosOrderKitDetailVOModel> posOrderKitDetails;
    @ApiCloudField(value="促销折扣金额", example="10.0")
    private BigDecimal orderDetailPromotionDiscountMoney;
    @ApiCloudField(value="消费券售价金额分摊", example="20.0")
    private BigDecimal orderDetailCouponSaleShareDiscount;
    @ApiCloudField(value="次卡售价分摊金额", example="10.0")
    private BigDecimal exchangeCardSaleShareDiscount;
    @ApiCloudField(value="促销单据号", example="2072000001")
    private String orderDetailPolicyFid;
    @ApiCloudField(value="促销单据类型", example="1")
    private Integer orderDetailPromotionType;
    @ApiCloudField(value="是否为促销特价", example="true")
    private Boolean orderDetailPolicyPromotionFlag;
    @ApiCloudField(value="是否为超量特价", example="true")
    private Boolean orderDetailPolicyPromotionQuantityFlag;
    @ApiCloudField(value="是否为超额奖励", example="true")
    private Boolean orderDetailPolicyPromotionMoneyFlag;
    @ApiCloudField(value="是否为赠品促销", example="true")
    private Boolean orderDetailPolicyPresentFlag;
    @ApiCloudField(value="是否为超额折扣", example="true")
    private Boolean orderDetailPolicyDiscountFlag;
    @ApiCloudField(value="业务系统未启用进销税项时税率")
    private BigDecimal orderDetailOtherTaxRate;
    @ApiCloudField(value="业务系统未启用进销税项时税额")
    private BigDecimal orderDetailOtherTaxMoney;
    @ApiCloudField(value="商品明细税额")
    private BigDecimal orderDetailTax;
    @ApiCloudField(value="不含税金额")
    private BigDecimal orderDetailNoTaxMoney;
    @ApiCloudField(value="商品成本金额（小数点4位）", example="1.0")
    private BigDecimal orderDetailCostMoney;
    @ApiCloudField(value="实际销售金额", example="1.0")
    private BigDecimal orderDetailRealPaymentMoney;
}
