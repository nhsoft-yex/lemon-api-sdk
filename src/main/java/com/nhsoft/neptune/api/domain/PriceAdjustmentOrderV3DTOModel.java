package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PriceAdjustmentOrderV3DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PriceAdjustmentOrderV3DTOModel extends ApiCloudObject {

    @ApiCloudField(value="库存调整单号", example="OO2113990000009")
    private String adjustmentOrderFid;
    @ApiCloudField(value="门店编码", example="99")
    private Integer branchNum;
    @ApiCloudField(value="仓库编码", example="150050001")
    private Integer storehouseNum;
    @ApiCloudField(value="调整日期（yyyy-MM-dd）", example="2021-01-20")
    private String adjustmentOrderDate;
    @ApiCloudField(value="备注", example="备注信息")
    private String adjustmentOrderMemo;
    @ApiCloudField(value="外部流水号", example="A00001")
    private String adjustmentOrderRefBill;
    @ApiCloudField(value="业务员", example="业务员名称")
    private String adjustmentOrderOperator;
    @ApiCloudField(value="创建人", example="管理员")
    private String adjustmentOrderCreator;
    @ApiCloudField(value="创建时间（yyyy-MM-dd HH:mm:ss）", example="2021-01-20 00:00:00")
    private String adjustmentOrderCreateTime;
    @ApiCloudField(value="审核人", example="管理员")
    private String adjustmentOrderAuditor;
    @ApiCloudField(value="审核时间（yyyy-MM-dd HH:mm:ss）", example="2021-01-20 00:00:00")
    private String adjustmentOrderAuditTime;
    @ApiCloudField(value="最后修改时间（yyyy-MM-dd HH:mm:ss）", example="2021-01-20 00:00:00")
    private String adjustmentOrderLastEditTime;
    @ApiCloudField(value="状态编码", example="1")
    private Integer adjustmentOrderStateCode;
    @ApiCloudField(value="状态名称", example="制单")
    private String adjustmentOrderStateName;
    @ApiCloudField(value="调整金额", example="1.0")
    private BigDecimal adjustmentOrderMoney;
    @ApiCloudField(value="明细", example="")
    private List<PriceAdjustmentOrderDetailV3DTOModel> adjustmentOrderDetails;
}
