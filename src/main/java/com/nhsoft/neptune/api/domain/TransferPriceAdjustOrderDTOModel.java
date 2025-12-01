package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * TransferPriceAdjustOrderDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TransferPriceAdjustOrderDTOModel extends ApiCloudObject {

    @ApiCloudField(value="配送价调整单号", example="4344990000318")
    private String priceAdjustmentFid;
    @ApiCloudField(value="应用门店编号列表", example="1")
    private List<Integer> applyBranchNums;
    @ApiCloudField(value="是否所有门店应用", example="true")
    private Boolean isApplyAllBranch;
    @ApiCloudField(value="生效日期", example="2022-01-01")
    private String priceAdjustmentEffectiveDate;
    @ApiCloudField(value="失效日期", example="2022-01-01")
    private String priceAdjustmentInvalidDate;
    @ApiCloudField(value="生效时间(仅允许整点)", example="10:00:00")
    private String priceAdjustmentTimeFrom;
    @ApiCloudField(value="失效时间(仅允许整点)", example="12:00:00")
    private String priceAdjustmentTimeTo;
    @ApiCloudField(value="是否生效（true:已生效，false:未生效）", example="true")
    private Boolean priceAdjustmentEffectiveFlag;
    @ApiCloudField(value="失效后价格（按调整前价格|按当前商品档案价格|随商品档案价格变动）", example="按调整前价格")
    private String priceAdjustmentReturnType;
    @ApiCloudField(value="状态代码", example="1")
    private Integer stateCode;
    @ApiCloudField(value="状态名称", example="制单")
    private String stateName;
    @ApiCloudField(value="备注", example="")
    private String priceAdjustmentMemo;
    @ApiCloudField(value="创建人", example="管理员")
    private String priceAdjustmentCreator;
    @ApiCloudField(value="创建时间", example="2022-01-01 10:00:00")
    private String priceAdjustmentCreateTime;
    @ApiCloudField(value="审核人", example="管理员")
    private String priceAdjustmentAuditor;
    @ApiCloudField(value="审核时间", example="2022-01-01 10:00:00")
    private String priceAdjustmentAuditTime;
    @ApiCloudField(value="明细", example="")
    private List<TransferPriceAdjustOrderDetailDTOModel> details;
}
