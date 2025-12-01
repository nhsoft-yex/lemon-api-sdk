package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WavePlanVO模型
 * 波次计划查
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WavePlanVOModel extends ApiCloudObject {

    @ApiCloudField(value="操作门店", example="99")
    private String branchNum;
    @ApiCloudField(value="波次计划单编号", example="BC996589925062000001")
    private String wavePlanFid;
    @ApiCloudField(value="仓库名称", example="系统默认仓库")
    private String storehouseName;
    @ApiCloudField(value="仓库编号", example="996580001")
    private Integer storehouseNum;
    @ApiCloudField(value="创建人", example="admin")
    private String creator;
    @ApiCloudField(value="创建时间")
    private String createTime;
    @ApiCloudField(value="分拣规则", example="混合分拣")
    private String pickRuleName;
    @ApiCloudField(value="品种数量", example="1.0")
    private BigDecimal skuQty;
    @ApiCloudField(value="客户数", example="1")
    private Integer clientNumber;
    @ApiCloudField(value="计划分拣量", example="1.0")
    private BigDecimal planUseQty;
    @ApiCloudField(value="已拣数量", example="1.0")
    private BigDecimal pickedUseQty;
    @ApiCloudField(value="未分拣数量", example="0.0")
    private BigDecimal unPickQty;
    @ApiCloudField(value="波次优先级", example="1")
    private Integer wavePriority;
    @ApiCloudField(value="分拣线路", example="S型路线")
    private String pickLine;
    @ApiCloudField(value="集货位", example="客户绑定+自动分配")
    private String collectingSpace;
    @ApiCloudField(value="分拣方式", example="按单分拣")
    private String pickType;
    @ApiCloudField(value="最大品种数", example="10")
    private Integer maxSku;
    @ApiCloudField(value="商品领取策略", example="按SKU数量")
    private String goodsGetStrategy;
    @ApiCloudField(value="锁定库存", example="不锁定")
    private String generateLockStrategy;
    @ApiCloudField(value="分拣库位(分拣位|存储位|收货暂存)", example="分拣位")
    private String pickPositionType;
    @ApiCloudField(value="拣货状态", example="未拣货")
    private String collectionState;
    @ApiCloudField(value="领取状态", example="未领取")
    private String pickGetState;
    @ApiCloudField(value="发车状态", example="未发车")
    private String carDeliverState;
}
