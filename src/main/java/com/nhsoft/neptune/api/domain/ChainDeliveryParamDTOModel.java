package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ChainDeliveryParamDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ChainDeliveryParamDTOModel extends ApiCloudObject {

    @ApiCloudField(value="调入单必须通过调出单生成", example="false")
    private Boolean transferInNeedOut;
    @ApiCloudField(value="调出单若根据调入单生成时，调出价参考调入价", example="false")
    private Boolean transferOutRefInPrice;
    @ApiCloudField(value="调出单统一由中心审核", example="false")
    private Boolean centerAuditOutOrder;
    @ApiCloudField(value="调入单中心调入采用中心成本价入库", example="false")
    private Boolean centerTransferInRefCost;
    @ApiCloudField(value="APP制单组合按明细商品要货", example="false")
    private Boolean itemRequestByFatherItem;
    @ApiCloudField(value="调出单不允许修改调出价", example="false")
    private Boolean unEditTransferOutPrice;
    @ApiCloudField(value="要货单中心库存去除已要货未配送的数量", example="false")
    private Boolean centerInvenoryRemoveRequest;
    @ApiCloudField(value="要货单有效天数")
    private Integer requestOrderValidDays;
    @ApiCloudField(value="采购有效天数")
    private Integer purchaseOrderVaildDays;
    @ApiCloudField(value="直配订单不允许超量收货", example="false")
    private Boolean centerpurchaseNotReceiveMore;
    @ApiCloudField(value="要货单不允许手工添加商品", example="false")
    private Boolean requestOrderNotAllowAdd;
    @ApiCloudField(value="要货单不允许修改计量单位", example="false")
    private Boolean requestOrderNotAllowEditUnit;
    @ApiCloudField(value="要货单不允许选择基本单位", example="false")
    private Boolean requestOrderNotAllowBasicUnit;
    @ApiCloudField(value="下限  要货有效范围")
    private Integer requestOrderAmountLower;
    @ApiCloudField(value="上限")
    private Integer requestOrderAmountUpper;
    @ApiCloudField(value="仅整数有效", example="false")
    private Boolean requestOrderIntegerOnly;
    @ApiCloudField(value="调出单未审核不允许打印", example="false")
    private Boolean outOrderPrintNeedAudit;
    @ApiCloudField(value="采购收货自动维护进货价", example="false")
    private Boolean autoChangeItemCostPrice;
    @ApiCloudField(value="批发销售单不允许打印", example="false")
    private Boolean wholesaleOrderPrintNeedAudit;
    @ApiCloudField(value="缺货商品允许订购", example="false")
    private Boolean wholesaleStockoutOrder;
    @ApiCloudField(value="新批发订单通知", example="false")
    private Boolean newWholeOrderInform;
    @ApiCloudField(value="发货单审核后短信通知收货方", example="false")
    private Boolean sendWholeOrderInform;
    @ApiCloudField(value="客户付款通知", example="false")
    private Boolean paymnetWholeOrderInform;
    @ApiCloudField(value="中心确认到账通知", example="false")
    private Boolean affirmWholeMoneyInform;
    @ApiCloudField(value="批发参数到货通知", example="false")
    private Boolean pickWholeOrderInform;
    @ApiCloudField(value="批发销售单审核通知", example="false")
    private Boolean orderWholeAuditInform;
    @ApiCloudField(value="新批发订单通知内容", example="")
    private String smsNewWholeContext;
    @ApiCloudField(value="发货单审核后短信通知收货方内容", example="")
    private String smsSendWholeContext;
    @ApiCloudField(value="客户付款通知内容", example="")
    private String smsPaymentWholeContext;
    @ApiCloudField(value="中心确认到账通知内容", example="")
    private String smsAffirmWholeContext;
    @ApiCloudField(value="批发参数到货通知内容", example="")
    private String smsPickWholeContext;
    @ApiCloudField(value="批发销售单审核通知内容", example="")
    private String smsAuditWholeContext;
    @ApiCloudField(value="新订单", example="false")
    private Boolean newChainOrderInform;
    @ApiCloudField(value="收款", example="false")
    private Boolean paymnetChainOrderInform;
    @ApiCloudField(value="确认到账", example="false")
    private Boolean affirmChainMoneyInform;
    @ApiCloudField(value="支持到货通知短信提醒参数", example="false")
    private Boolean supportSmsNotice;
    @ApiCloudField(value="门店收货通知", example="false")
    private Boolean branchReceiveOrderInform;
    @ApiCloudField(value="中心调出单审核通知", example="false")
    private Boolean orderChainAuditInform;
    @ApiCloudField(value="新要货单通知可用内容", example="")
    private String smsNewChainContext;
    @ApiCloudField(value="到货通知可用内容", example="")
    private String smsPickChainContext;
    @ApiCloudField(value="门店调入单短信可用内容", example="")
    private String smsBranchChainContext;
    @ApiCloudField(value="中心调出单短信可用内容", example="")
    private String smsAuditChainContext;
    @ApiCloudField(value="发货单审核后短信提醒收货方", example="false")
    private Boolean smsShipOrder;
    @ApiCloudField(value="提醒格式", example="")
    private String smsShipOrderContext;
    @ApiCloudField(value="财务手机号码", example="")
    private String financePhone;
    @ApiCloudField(value="仓库管理员手机号码", example="")
    private String storehousePhone;
    @ApiCloudField(value="批发订单中心库存去除已要货未销售的数量", example="false")
    private Boolean centerInvenoryRemoveWholeBook;
    @ApiCloudField(value="采购订单审核通知供应商", example="false")
    private Boolean purChaseAuditInform;
    @ApiCloudField(value="供应商预付单审核通知供应商", example="false")
    private Boolean preSettlementInform;
    @ApiCloudField(value="格式", example="")
    private String smsPurChaseAuditContext;
    @ApiCloudField(value="格式", example="")
    private String smsPreSettlementContext;
    @ApiCloudField(value="调出单相同商品合并打印", example="false")
    private Boolean printTogetherByChain;
    @ApiCloudField(value="批发销售单相同商品合并打印", example="false")
    private Boolean printTogetherByWholeBook;
    @ApiCloudField(value="订购时忽略中心库存量", example="false")
    private Boolean centerInvenoryIgnore;
    @ApiCloudField(value="要货单显示总部最新生产日期", example="false")
    private Boolean requestShowProductingDate;
    @ApiCloudField(value="批发订单审核时直接生成批发销售单", example="false")
    private Boolean createWholesaleOrderByAudit;
    @ApiCloudField(value="在线订货登陆需短信验证", example="false")
    private Boolean wholesaleLoginSms;
    @ApiCloudField(value="批发订单有效天数")
    private Integer wholesaleBookValidDays;
    @ApiCloudField(value="移动端开单不允许修改单位", example="false")
    private Boolean appCanNotEditWholesaleUnit;
    @ApiCloudField(value="批发销售批次商品允许修改基本数量", example="false")
    private Boolean allowChangeQty;
    @ApiCloudField(value="批发订单仅整数有效", example="false")
    private Boolean wholesaleBookIntegerOnly;
    @ApiCloudField(value="客户下单中心库存量显示为有货/无货", example="false")
    private Boolean clientOrderCenterInvenoryShowQty;
    @ApiCloudField(value="批发订货显示总部最新生产日期", example="false")
    private Boolean wholesaleBookShowProductingDate;
    @ApiCloudField(value="要货订购时忽略中心库存量", example="false")
    private Boolean requestCenterInvenoryIgnore;
    @ApiCloudField(value="要货缺货商品允许在线订购", example="false")
    private Boolean requestStockoutOrder;
    @ApiCloudField(value="批发价取客户最后一次批发价", example="false")
    private Boolean useLastWholePrice;
    @ApiCloudField(value="显示批发客户账户余额", example="false")
    private Boolean showClientBalance;
    @ApiCloudField(value="单据审核后停留明细界面", example="false")
    private Boolean notReturnWholesaleAudit;
    @ApiCloudField(value="总部批发默认按库存单位出库", example="false")
    private Boolean wholesaleInventoryUnit;
    @ApiCloudField(value="批发单据第一次保存时不提示是否审核", example="false")
    private Boolean orderNotAuditFirst;
    @ApiCloudField(value="收货单未审核不允许打印", example="false")
    private Boolean receiveOrderPrintNeedAudit;
    @ApiCloudField(value="批发价低于最低售价不能审核", example="false")
    private Boolean wholesalePriceNotBelowThenMin;
    @ApiCloudField(value="经销商订货中不显示建议零售价", example="false")
    private Boolean wholesaleSalePriceNotShow;
    @ApiCloudField(value="单张配货装车单门店数量")
    private Integer singleTransferSendBranchCount;
    @ApiCloudField(value="门店相同商品要货自动忽略上一次要货量", example="false")
    private Boolean requestIngoreLastRequest;
    @ApiCloudField(value="门店相同商品要货自动忽略XX天内要货量")
    private Integer requestIngoreLastRequestDay;
    @ApiCloudField(value="启用多特性附加费", example="false")
    private Boolean wholesaleMatrixAddOns;
    @ApiCloudField(value="调入单通过调出单生成不允许修改", example="false")
    private Boolean inOrderFromOutNotAllowEdit;
    @ApiCloudField(value="退货单必须通过批发销售单生成", example="false")
    private Boolean wholesaleReturnCreateByOrder;
    @ApiCloudField(value="中心调出单直接生成门店调入单", example="false")
    private Boolean centerOutOrderGenerateBranchInOrder;
    @ApiCloudField(value="中心调出单直接生成门店调入单状态 1 制单 2 审核")
    private Integer centerOutOrderGenerateBranchInOrderState;
    @ApiCloudField(value="启用筐押金", example="false")
    private Boolean purchaseUseBoxDeposit;
    @ApiCloudField(value="手工指定商品启用库存批次转换率 已废弃 使用PosItemParam中的同名参数", example="false")
    private Boolean enableInventoryLnDetailRate;
    @ApiCloudField(value="是否锁定库存", example="false")
    private Boolean enableLockInventory;
    @ApiCloudField(value="锁定调出单天数")
    private Integer transferLockDay;
    @ApiCloudField(value="是否锁定批发库存", example="false")
    private Boolean enableLockWholesaleInventory;
    @ApiCloudField(value="是否启用批发订货模板", example="false")
    private Boolean enableWholesaleBookTemplate;
    @ApiCloudField(value="批发订货审核校验批发价", example="false")
    private Boolean wholesaleBookAuditCheckPrice;
    @ApiCloudField(value="支持订购不允许在线批发商品", example="false")
    private Boolean enableOrderUnAllowOnlineWholesaleGoods;
    @ApiCloudField(value="锁定批发销售单天数")
    private Integer wholesaleLockDay;
    @ApiCloudField(value="手工指定批次商品不允许修改单位", example="false")
    private Boolean notAllowChangeUnit;
    @ApiCloudField(value="业务单据选择商品时显示多特性明细", example="false")
    private Boolean selectOrderPosItemShowItemMatrix;
    @ApiCloudField(value="连锁单据审核后停留明细界面", example="false")
    private Boolean notReturnChainAudit;
    @ApiCloudField(value="采购单据审核后停留明细界面", example="false")
    private Boolean notReturnPurchaseAudit;
    @ApiCloudField(value="采购单据制单", example="false")
    private Boolean notReturnSavePurchase;
    @ApiCloudField(value="采购单据审核", example="false")
    private Boolean notReturnAuditPurchase;
    @ApiCloudField(value="连锁单据制单", example="false")
    private Boolean notReturnSaveChain;
    @ApiCloudField(value="连锁单据审核", example="false")
    private Boolean notReturnAuditChain;
    @ApiCloudField(value="批发单据制单", example="false")
    private Boolean notReturnSaveWholesale;
    @ApiCloudField(value="批发单据审核", example="false")
    private Boolean notReturnAuditWholesale;
    @ApiCloudField(value="统计天数参数1(批发)")
    private Integer calDayParamOneWholesale;
    @ApiCloudField(value="统计天数参数2(批发)")
    private Integer calDayParamTwoWholesale;
    @ApiCloudField(value="0, 1, 2(批发)")
    private Integer outAmountTypeWholesale;
    @ApiCloudField(value="下限 要货有效范围(批发)")
    private Integer wholesaleOrderAmountLower;
    @ApiCloudField(value="上限(批发)")
    private Integer wholesaleOrderAmountUpper;
    @ApiCloudField(value="缺货和非缺货商品一起显示", example="false")
    private Boolean showAllPosItemWholesale;
    @ApiCloudField(value="启用锁定配送单价", example="false")
    private Boolean transferPriceAsProfitRate;
    @ApiCloudField(value="调入单允许修改基本数量", example="false")
    private Boolean transferInOrderEditBaseQty;
    @ApiCloudField(value="配送单位价格取整", example="false")
    private Boolean transferPriceRounding;
    @ApiCloudField(value="起始金额")
    private BigDecimal transferPriceRoundFrom;
    @ApiCloudField(value="舍零方式", example="")
    private String transferPriceRoundType;
    @ApiCloudField(value="精确到", example="")
    private String transferPriceRoundTo;
    @ApiCloudField(value="经销商订货系统默认生成批发订单状态  制单/审核", example="")
    private String wholesaleBookDefaultState;
    @ApiCloudField(value="门店要货不可以超过中心库存量", example="false")
    private Boolean requestNotOverCenterStock;
    @ApiCloudField(value="PAD收货可以修改基本数量", example="false")
    private Boolean padReceiveCanEditBasicQty;
    @ApiCloudField(value="配送中心调出数量扣除皮重", example="false")
    private Boolean outOrderQtySubTareQty;
    @ApiCloudField(value="要货单中心库存量显示为有货/无货", example="false")
    private Boolean requestShowCenterInventoryName;
    @ApiCloudField(value="启用皮重扣除功能", example="false")
    private Boolean enableTransferInSubTareQty;
    @ApiCloudField(value="门店只能调入中心已发车的调出单", example="false")
    private Boolean tranferInNeedOutSended;
    @ApiCloudField(value="启用辅助单位替代常用单位 已废弃 使用PosItemParam中的同名参数", example="false")
    private Boolean enableAssistUnitAsUseUnit;
    @ApiCloudField(value="冲红复制单据不允许修改", example="false")
    private Boolean canNotEditAntiOrder;
    @ApiCloudField(value="批发单位价格取整", example="false")
    private Boolean wholesalePriceRounding;
    @ApiCloudField(value="起始金额")
    private BigDecimal wholesalePriceRoundFrom;
    @ApiCloudField(value="舍零方式", example="")
    private String wholesalePriceRoundType;
    @ApiCloudField(value="精确到", example="")
    private String wholesalePriceRoundTo;
    @ApiCloudField(value="启用要货金额控制", example="false")
    private Boolean enableRequestMoney;
    @ApiCloudField(value="要货金额与销售额 比例值")
    private BigDecimal requestAndSaleRate;
    @ApiCloudField(value="只允许改低收货价", example="false")
    private Boolean enableLowReceivePrice;
    @ApiCloudField(value="收货单根据订单生成只允许改低价格", example="false")
    private Boolean enableLowReceivePriceByPurchase;
    @ApiCloudField(value="采购订单/收货单单价只允许低于约定价格", example="false")
    private Boolean enableLowPriceThanSupplierPrice;
    @ApiCloudField(value="收货单关联订单约定价格取订单价格、收货单关联订单约定价格取当前价格", example="false")
    private Boolean receiveOrderCostPriceReadOrderOrNowPrice;
    @ApiCloudField(value="是否启用关联商品要货", example="false")
    private Boolean enableRequestRefItem;
    @ApiCloudField(value="启用锁定批发单价", example="false")
    private Boolean wholesalePriceAsProfitRate;
    @ApiCloudField(value="超过授信余额不能审核", example="false")
    private Boolean forbidWholesaleAuditOverClientBalance;
    @ApiCloudField(value="仓管中心仅发车已确认商品", example="false")
    private Boolean centerSendConfirmOnly;
    @ApiCloudField(value="已审核的配送任务数量锁定可调出数量", example="false")
    private Boolean taskTransferLockOutOrder;
    @ApiCloudField(value="已审核的配送任务数量锁定可批发数量", example="false")
    private Boolean taskTransferLockWholesaleOrder;
    @ApiCloudField(value="仓管中心要货汇总包含批发订单数量", example="false")
    private Boolean centerIncludeWholesaleBook;
    @ApiCloudField(value="是否启用批发订单搜索", example="false")
    private Boolean enableScanWholesale;
    @ApiCloudField(value="收货单必须根据采购订单生成", example="false")
    private Boolean receiveOrderNeedPurchase;
    @ApiCloudField(value="退货单必须根据收货单生成", example="false")
    private Boolean returnOrderNeedReceive;
    @ApiCloudField(value="启用只能采购有供货关系的商品(无供货关系商品不允许业务操作)", example="false")
    private Boolean enablePurchaseHasRelate;
    @ApiCloudField(value="启用只能调价有供货关系的商品(无供货关系商品不允许供应商商品调价)", example="false")
    private Boolean enableChangePriceHasRelate;
    @ApiCloudField(value="总订店收商品允许门店做收货单", example="false")
    private Boolean enableBranchReceiveCenterItems;
    @ApiCloudField(value="收货单根据订单生成不允许超量收货", example="false")
    private Boolean purchaseReceiveNotReceiveMore;
    @ApiCloudField(value="启用采购直配加点", example="false")
    private Boolean enablePurchaseAppend;
    @ApiCloudField(value="供应商平台直配订单处理完成后自动生成收货单", example="false")
    private Boolean supplierHandleAutoReceive;
    @ApiCloudField(value="供应商平台直配订单处理完成后自动生成收货单状态 1 制单 2 审核")
    private Integer supplierHandleAutoReceiveState;
    @ApiCloudField(value="加盟店之间不允许调拨", example="false")
    private Boolean branchInnerNotAllot;
    @ApiCloudField(value="加盟店采购核价生成中心收货单和调出单", example="false")
    private Boolean enablePurchaseCheckPriceParam;
    @ApiCloudField(value="采购订单只允许添加主供应商的商品", example="false")
    private Boolean onlyAddDefaultSupplierItem;
    @ApiCloudField(value="采购订单只允许添加主供应商的商品(单据)", example="")
    private String defaultSupplierItemOrder;
    @ApiCloudField(value="采购订单审核后通知供应商平台用户", example="false")
    private Boolean purchaseAuditNoticeSupplierUser;
    @ApiCloudField(value="退货单应用合同账期", example="false")
    private Boolean returnOrderApplySupplierAgreementDate;
    @ApiCloudField(value="采购单据第一次保存时不提示是否审核", example="false")
    private Boolean purchaseOrderNotAuditFirst;
    @ApiCloudField(value="连锁单据第一次保存时不提示是否审核", example="false")
    private Boolean chainOrderNotAuditFirst;
    @ApiCloudField(value="启用门店必订货功能", example="false")
    private Boolean enableBoundGoods;
    @ApiCloudField(value="启用门店加单", example="false")
    private Boolean enableBranchAddOrder;
    @ApiCloudField(value="超过交货期限的采购订单不允许生成收货单", example="false")
    private Boolean overDeadlinePurchaseOrderNotReceiveOrder;
    @ApiCloudField(value="中心发车自动生成门店调入单", example="false")
    private Boolean centerShipOrderGenerateBranchInOrder;
    @ApiCloudField(value="批次商品调入允许录入皮重", example="false")
    private Boolean inOrderLnEnableTare;
    @ApiCloudField(value="内部申请单直调申请的调入单按调入门店配送价生成", example="false")
    private Boolean innerOrderRecalInPrice;
    @ApiCloudField(value="启用要货单确认后自动生成调出单", example="false")
    private Boolean requestOrderGenerateOutOrder;
    @ApiCloudField(value="要货单确认后自动生成调出单状态 1 制单 2 审核")
    private Integer requestOrderGenerateOutOrderState;
    @ApiCloudField(value="超过XX小时后自动调入")
    private Integer exceedAutoTransferIn;
    @ApiCloudField(value="门店补货配送天数")
    private Integer requestTransferDay;
    @ApiCloudField(value="加单配送天数")
    private Integer addOrderRequestTransferDay;
    @ApiCloudField(value="手机端门店补货显示订货级别", example="false")
    private Boolean appRequestBoundGoods;
    @ApiCloudField(value="手机端门店补货显示订货级别类型，1全部商品，2顶级类别")
    private Integer appRequestBoundGoodsType;
    @ApiCloudField(value="手机端门店补货显示销售级别", example="false")
    private Boolean appRequestSaleOrder;
    @ApiCloudField(value="手机端门店补货显示销售级别类型，1全部商品，2顶级类别")
    private Integer appRequestSaleOrderType;
    @ApiCloudField(value="商城过滤缺货商品", example="false")
    private Boolean wholesaleFilterStockoutItem;
    @ApiCloudField(value="内部申请单审核即批复", example="false")
    private Boolean innerOrderAuditAndReply;
    @ApiCloudField(value="要货单冻结金额按未调出数量计算", example="false")
    private Boolean requestOrderFrozenMoneyUnOutQtyCount;
    @ApiCloudField(value="APP、小程序成分商品根据制单组合来要货", example="false")
    private Boolean kitItemByFatherItemRequest;
    @ApiCloudField(value="收货单是否允许修改单位", example="false")
    private Boolean enableReceiveOrderEditUnit;
    @ApiCloudField(value="APP明细商品按制单组合要货", example="false")
    private Boolean requestAssembleItem;
    @ApiCloudField(value="配送单价按要货单价格", example="false")
    private Boolean transferUseOrderPrice;
    @ApiCloudField(value="调出单审核校验余额和信用额度", example="false")
    private Boolean outOrderCheckBalance;
    @ApiCloudField(value="余额计算冻结金额", example="false")
    private Boolean balanceContainFrozen;
    @ApiCloudField(value="门店补货单审核校验配送单价", example="false")
    private Boolean requestAuditCheckTransferPrice;
    @ApiCloudField(value="按要货单生成调出单", example="false")
    private Boolean getOutOrderByRequestOrder;
    @ApiCloudField(value="启用门店商品配送属性", example="false")
    private Boolean branchDistributionMatrix;
    @ApiCloudField(value="部分收货采购订单不允许再生成收货单", example="false")
    private Boolean partReceivePurchaseNoAddReceive;
    @ApiCloudField(value="游客默认门店")
    private Integer defaultVisitorBranchNum;
    @ApiCloudField(value="门店补货启用要货周期", example="false")
    private Boolean branchEnableRequestBatch;
    @ApiCloudField(value="采购收货自动维护浮动换算率", example="false")
    private Boolean autoChangeItemAssistRate;
    @ApiCloudField(value="WMS生成调出单按顶级类别拆单", example="false")
    private Boolean wmsOutOrderByTopCategorySplit;
    @ApiCloudField(value="WMS生成批发销售单按顶级类别拆单", example="false")
    private Boolean wmsSaleOrderByTopCategorySplit;
    @ApiCloudField(value="最近进价包含运费金额", example="false")
    private Boolean itemCostPriceIncludeFee;
    @ApiCloudField(value="制单时间or审核时间（0制单时间,1审核时间）")
    private Integer purchaseDateByOrderDate;
    @ApiCloudField(value="门店调出单审核超过xx小时后自动调入")
    private Integer outOrderOverTimeAutoInOrder;
    @ApiCloudField(value="录入商品时不校验中心库存量与上限", example="false")
    private Boolean inItemNoCheckCenterInventory;
    @ApiCloudField(value="供应商平台订单送货数量允许大于采购数量", example="false")
    private Boolean supplierHandleDeliverQtyGtPurchaseQty;
    @ApiCloudField(value="门店补货启用付款确认", example="false")
    private Boolean requestOrderEnablePayConfirm;
    @ApiCloudField(value="批发订货启用付款确认", example="false")
    private Boolean wholesaleBookEnablePayConfirm;
    @ApiCloudField(value="批发订单已要货未销售量按未销售数量计算", example="false")
    private Boolean wholesaleBookUnOutQtyCount;
    @ApiCloudField(value="无客户关系商品不允许下单", example="false")
    private Boolean noCustomerItemRelationUnOrder;
    @ApiCloudField(value="商城下单启用物流运费", example="false")
    private Boolean mallOrderEnableLogisticsFreight;
    @ApiCloudField(value="批发订单审核校验账户余额", example="false")
    private Boolean wholesaleBookCheckLimit;
    @ApiCloudField(value="批发销售单审核校验账户余额", example="false")
    private Boolean wholesaleOrderCheckLimit;
    @ApiCloudField(value="调入调出单允许修改明细基本数量", example="false")
    private Boolean inOutOrderEnableUpdateDetailQty;
    @ApiCloudField(value="存在待处理要货单不允许审核", example="false")
    private Boolean unTreatedRequestOrderUnAudit;
    @ApiCloudField(value="退货单金额超过供应商应付累计不允许审核", example="false")
    private Boolean returnOrderOutPaidUnAudit;
    @ApiCloudField(value="供应商直送单配送单价取直送单单价", example="false")
    private Boolean purchaseOrderTransferPriceOnPurchasePrice;
    @ApiCloudField(value="申请盘点单强制关联盘点任务", example="false")
    private Boolean applyCheckOrderNeedTask;
    @ApiCloudField(value="库存盘点盘盈按最近进价计算", example="false")
    private Boolean checkOrderInByLastPrice;
    @ApiCloudField(value="要货中心库存计算采购在途量", example="false")
    private Boolean requestInventoryPurchaseInQty;
    @ApiCloudField(value="交货期限按审核时间重新计算", example="false")
    private Boolean purchaseDeadlineByAuditDate;
    @ApiCloudField(value="负单价商品盘点单审核生成成本调价单", example="false")
    private Boolean lossPriceItemCheckAuditAdjustment;
    @ApiCloudField(value="库存盘点不应用分割品管理", example="false")
    private Boolean checkOrderNoSeparateItem;
}
