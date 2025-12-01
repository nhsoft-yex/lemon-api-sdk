package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CheckOrderV3DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CheckOrderV3DTOModel extends ApiCloudObject {

    @ApiCloudField(value="库存盘点单号", example="CR2072010000002")
    private String checkOrderFid;
    @ApiCloudField(value="门店编码", example="99")
    private Integer branchNum;
    @ApiCloudField(value="仓库编码", example="150050001")
    private Integer storehouseNum;
    @ApiCloudField(value="盘点范围", example="单品盘点")
    private String checkOrderScope;
    @ApiCloudField(value="盘点单位", example="公斤")
    private String checkOrderUnit;
    @ApiCloudField(value="创建人", example="管理员")
    private String checkOrderCreator;
    @ApiCloudField(value="盘点日期（yyyy-mm-dd）", example="2021-01-20")
    private String checkOrderDate;
    @ApiCloudField(value="备注", example="备注信息")
    private String checkOrderMemo;
    @ApiCloudField(value="创建时间（yyyy-MM-dd HH:mm:ss）", example="2021-01-20 00:00:00")
    private String checkOrderCreateTime;
    @ApiCloudField(value="审核人", example="管理员")
    private String checkOrderAuditor;
    @ApiCloudField(value="审核时间（yyyy-MM-dd HH:mm:ss）", example="2021-01-20 00:00:00")
    private String checkOrderAuditTime;
    @ApiCloudField(value="状态编码", example="1")
    private Integer checkOrderStateCode;
    @ApiCloudField(value="状态名称", example="制单")
    private String checkOrderStateName;
    @ApiCloudField(value="盘点金额", example="1.0")
    private BigDecimal checkOrderMoney;
    @ApiCloudField(value="最后修改时间", example="2021-01-20 00:00:00")
    private String checkOrderLastEditTime;
    @ApiCloudField(value="快照时间", example="2025-01-01 00:00:00")
    private String checkOrderSnapshotTime;
    @ApiCloudField(value="明细", example="")
    private List<CheckOrderDetailV3DTOModel> checkOrderDetails;
}
