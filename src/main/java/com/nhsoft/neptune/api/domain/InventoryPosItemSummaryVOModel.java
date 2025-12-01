package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * InventoryPosItemSummaryVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class InventoryPosItemSummaryVOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编码")
    private Integer itemNum;
    @ApiCloudField(value="汇总条件中的代码", example="")
    private String code;
    @ApiCloudField(value="汇总条件中的名称", example="")
    private String name;
    @ApiCloudField(value="基本单位", example="")
    private String baseUnit;
    @ApiCloudField(value="进项税率")
    private BigDecimal itemInTax;
    @ApiCloudField(value="销项税率")
    private BigDecimal itemOutTax;
    @ApiCloudField(value="上期库存数量")
    private BigDecimal beginAmount;
    @ApiCloudField(value="上期库存辅助数量")
    private BigDecimal beginAssistAmount;
    @ApiCloudField(value="上期库存金额")
    private BigDecimal beginMoney;
    @ApiCloudField(value="采购收货数量")
    private BigDecimal receiveAmount;
    @ApiCloudField(value="采购收货辅助数量")
    private BigDecimal receiveAssistAmount;
    @ApiCloudField(value="采购收货金额")
    private BigDecimal receiveMoney;
    @ApiCloudField(value="采购退货数量")
    private BigDecimal returnAmount;
    @ApiCloudField(value="采购退货辅助数量")
    private BigDecimal returnAssistAmount;
    @ApiCloudField(value="采购退货金额")
    private BigDecimal returnMoney;
    @ApiCloudField(value="调入数量")
    private BigDecimal transferInAmount;
    @ApiCloudField(value="调入辅助数量")
    private BigDecimal transferInAssistAmount;
    @ApiCloudField(value="调入常用单位数量")
    private BigDecimal transferInUseAmount;
    @ApiCloudField(value="调入金额")
    private BigDecimal transferInMoney;
    @ApiCloudField(value="调出数量")
    private BigDecimal transferOutAmount;
    @ApiCloudField(value="调出辅助数量")
    private BigDecimal transferOutAssistAmount;
    @ApiCloudField(value="调出常用单位数量")
    private BigDecimal transferOutUseAmount;
    @ApiCloudField(value="调出金额")
    private BigDecimal transferOutMoney;
    @ApiCloudField(value="盘点报益数量")
    private BigDecimal checkInAmount;
    @ApiCloudField(value="盘点报益辅助数量")
    private BigDecimal checkInAssistAmount;
    @ApiCloudField(value="盘点报益金额")
    private BigDecimal checkInMoney;
    @ApiCloudField(value="盘点报损数量")
    private BigDecimal checkOutAmount;
    @ApiCloudField(value="盘点报损辅助数量")
    private BigDecimal checkOutAssistAmount;
    @ApiCloudField(value="盘点报损金额")
    private BigDecimal checkOutMoney;
    @ApiCloudField(value="转仓入库数量")
    private BigDecimal allocationInAmount;
    @ApiCloudField(value="转仓入库辅助数量")
    private BigDecimal allocationInAssistAmount;
    @ApiCloudField(value="转仓入库金额")
    private BigDecimal allocationInMoney;
    @ApiCloudField(value="转仓出库数量")
    private BigDecimal allocationOutAmount;
    @ApiCloudField(value="转仓出库辅助数量")
    private BigDecimal allocationOutAssistAmount;
    @ApiCloudField(value="转仓出库金额")
    private BigDecimal allocationOutMoney;
    @ApiCloudField(value="前台销售数量")
    private BigDecimal posAmount;
    @ApiCloudField(value="前台销售辅助数量")
    private BigDecimal posAssistAmount;
    @ApiCloudField(value="前台销售金额")
    private BigDecimal posMoney;
    @ApiCloudField(value="前台销售金额")
    private BigDecimal posOrderMoney;
    @ApiCloudField(value="销售毛利")
    private BigDecimal posProfit;
    @ApiCloudField(value="销售毛利率")
    private BigDecimal posProfitRate;
    @ApiCloudField(value="批发销售数量")
    private BigDecimal wholesaleOutAmount;
    @ApiCloudField(value="批发销售辅助数量")
    private BigDecimal wholesaleOutAssistAmount;
    @ApiCloudField(value="批发销售金额")
    private BigDecimal wholesaleOutMoney;
    @ApiCloudField(value="批发退货数量")
    private BigDecimal wholesaleInAmount;
    @ApiCloudField(value="批发退货辅助数量")
    private BigDecimal wholesaleInAssistAmount;
    @ApiCloudField(value="批发退货金额")
    private BigDecimal wholesaleInMoney;
    @ApiCloudField(value="组合拆分(入库)数量")
    private BigDecimal assembleInAmount;
    @ApiCloudField(value="组合拆分(入库)辅助数量")
    private BigDecimal assembleInAssistAmount;
    @ApiCloudField(value="组合拆分(入库)金额")
    private BigDecimal assembleInMoney;
    @ApiCloudField(value="组合拆分(出库)数量")
    private BigDecimal assembleOutAmount;
    @ApiCloudField(value="组合拆分(出库)辅助数量")
    private BigDecimal assembleOutAssistAmount;
    @ApiCloudField(value="组合拆分(出库)金额")
    private BigDecimal assembleOutMoney;
    @ApiCloudField(value="成本调整金额")
    private BigDecimal costAdjustmentMoney;
    @ApiCloudField(value="成本结转调整金额")
    private BigDecimal stockCarryMoney;
    @ApiCloudField(value="成本调整金额(入库)")
    private BigDecimal costAdjustmentMoneyIn;
    @ApiCloudField(value="成本调整金额(出库)")
    private BigDecimal costAdjustmentMoneyOut;
    @ApiCloudField(value="本期入库数量")
    private BigDecimal totalInAmount;
    @ApiCloudField(value="本期入库辅助数量")
    private BigDecimal totalInAssistAmount;
    @ApiCloudField(value="本期入库金额")
    private BigDecimal totalInMoney;
    @ApiCloudField(value="本期出库数量")
    private BigDecimal totalOutAmount;
    @ApiCloudField(value="本期出库辅助数量")
    private BigDecimal totalOutAssistAmount;
    @ApiCloudField(value="本期出库金额")
    private BigDecimal totalOutMoney;
    @ApiCloudField(value="本期库存数量")
    private BigDecimal endAmount;
    @ApiCloudField(value="本期库存辅助数量")
    private BigDecimal endAssistAmount;
    @ApiCloudField(value="本期库存金额")
    private BigDecimal endMoney;
    @ApiCloudField(value="调整金额")
    private BigDecimal posItemLogAdjustMoney;
    @ApiCloudField(value="营业日", example="")
    private String shiftTableBizday;
    @ApiCloudField(value="生产入库单数量")
    private BigDecimal processInAmount;
    @ApiCloudField(value="生产入库单辅助数量")
    private BigDecimal processInAssistAmount;
    @ApiCloudField(value="生产入库单金额")
    private BigDecimal processInMoney;
    @ApiCloudField(value="加工单数量")
    private BigDecimal processAmount;
    @ApiCloudField(value="加工单辅助数量")
    private BigDecimal processAssistAmount;
    @ApiCloudField(value="加工单金额")
    private BigDecimal processMoney;
    @ApiCloudField(value="二次成品单数量")
    private BigDecimal recycledOrderAmount;
    @ApiCloudField(value="二次成品单金额")
    private BigDecimal recycledOrderMoney;
    @ApiCloudField(value="费用分摊单金额")
    private BigDecimal shareMoney;
    @ApiCloudField(value="在途数量")
    private BigDecimal transferonRoadQty;
    @ApiCloudField(value="在途金额")
    private BigDecimal transferonRoadMoney;
    @ApiCloudField(value="实际库存数量")
    private BigDecimal inventoryActualQty;
    @ApiCloudField(value="实际库存金额")
    private BigDecimal inventoryActualMoney;
    @ApiCloudField(value="自定义列", example="")
    private List<Object> nameAndValuesDtos;
    @ApiCloudField(value="积分兑换数量")
    private BigDecimal pointAmount;
    @ApiCloudField(value="积分兑换辅助数量")
    private BigDecimal pointAssistAmount;
    @ApiCloudField(value="积分兑换金额")
    private BigDecimal pointMoney;
    @ApiCloudField(value="兑奖入库数量")
    private BigDecimal prizeRedemptionInAmount;
    @ApiCloudField(value="兑奖入库辅助数量")
    private BigDecimal prizeRedemptionInAssistAmount;
    @ApiCloudField(value="兑奖入库金额")
    private BigDecimal prizeRedemptionInMoney;
    @ApiCloudField(value="兑奖出库数量")
    private BigDecimal prizeRedemptionOutAmount;
    @ApiCloudField(value="兑奖出库辅助数量")
    private BigDecimal prizeRedemptionOutAssistAmount;
    @ApiCloudField(value="兑奖出库金额")
    private BigDecimal prizeRedemptionOutMoney;
    @ApiCloudField(value="精度差异金额列")
    private BigDecimal diffPointMoney;
    @ApiCloudField(value="本期库存差异数量")
    private BigDecimal inventoryDailyDiffQty;
    @ApiCloudField(value="本期库存差异金额")
    private BigDecimal inventoryDailyDiffMoney;
    @ApiCloudField(value="删除标志", example="")
    private Object delTag;
    @ApiCloudField(value="供应商编码")
    private Integer supplierNum;
    @ApiCloudField(value="自定义列名list", example="")
    private List<String> causes;
    @ApiCloudField(value="门店编码")
    private Integer branchNum;
    @ApiCloudField(value="规格", example="")
    private String spec;
    @ApiCloudField(value="商品条码", example="")
    private String itemBarCode;
    @ApiCloudField(value="门店代码", example="")
    private String branchCode;
    @ApiCloudField(value="门店名称", example="")
    private String branchName;
    @ApiCloudField(value="部门", example="")
    private String itemDepartment;
    @ApiCloudField(value="商品类别代码", example="")
    private String itemCategoryCode;
    @ApiCloudField(value="商品类别名称", example="")
    private String itemCategory;
    @ApiCloudField(value="商品顶级类别", example="")
    private String itemCategoryTop;
}
