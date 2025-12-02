package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WholesaleInnerOrderApproveDetailDTO模型
 * 售后申请单批复明细
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WholesaleInnerOrderApproveDetailDTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编号", example="4344990000318", required=true)
    private Integer itemNum;
    @ApiCloudField(value="批复数量（小数点3位）", example="1.22", required=true)
    private BigDecimal itemUseQty;
    @ApiCloudField(value="批次号", example="648135487")
    private String innerOrderDetailLotNumber;
    @ApiCloudField(value="生产日期", example="Sat Jan 01 08:00:00 CST 2022")
    private String innerOrderDetailProducingDate;
    @ApiCloudField(value="批复备注", example="")
    private String itemMemo;
    @ApiCloudField(value="仓库编号", example="203000002")
    private Integer storehouseNum;
    @ApiCloudField(value="批复赠品常用数量", example="1.0")
    private BigDecimal itemPresentAuditUseQty;
}
