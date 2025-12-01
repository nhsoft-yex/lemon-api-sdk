package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * TransferInOrderV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TransferInOrderV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="调出单编号", example="")
    private String inOrderFid;
    @ApiCloudField(value="调出时间(yyyy-mm-dd HH:MM:SS)", example="2021-01-20 00:00:00")
    private String inOrderDate;
    @ApiCloudField(value="创建人", example="管理员")
    private String inOrderCreator;
    @ApiCloudField(value="审核人", example="管理员")
    private String inOrderAuditor;
    @ApiCloudField(value="创建时间(yyyy-mm-dd HH:MM:SS)（查询字段,保存不传）", example="2021-01-20 00:00:00")
    private String inOrderCreateTime;
    @ApiCloudField(value="审核时间(yyyy-mm-dd HH:MM:SS)（查询字段,保存不传）", example="2021-01-20 00:00:00")
    private String inOrderAuditTime;
    @ApiCloudField(value="备注", example="备注信息")
    private String inOrderMemo;
    @ApiCloudField(value="门店编码", example="99")
    private Integer branchNum;
    @ApiCloudField(value="门店名称（查询字段,保存不传）", example="管理中心")
    private String branchName;
    @ApiCloudField(value="调入门店")
    private Integer inBranchNum;
    @ApiCloudField(value="调入门店名称（查询字段,保存不传）", example="管理中心")
    private String inBranchName;
    @ApiCloudField(value="仓库编码", example="150050001")
    private Integer storehouseNum;
    @ApiCloudField(value="仓库名称（查询字段,保存不传）", example="存储仓")
    private String storehouseName;
    @ApiCloudField(value="状态编码（查询字段,保存不传）", example="1")
    private Integer orderState;
    @ApiCloudField(value="状态名称（查询字段,保存不传）", example="制单")
    private String orderStateName;
    @ApiCloudField(value="总金额", example="1.0")
    private BigDecimal inOrderTotalMoney;
    @ApiCloudField(value="明细", example="")
    private List<TransferInOrderDetailV2DTOModel> details;
    @ApiCloudField(value="调出单号", example="")
    private String outOrderFid;
    @ApiCloudField(value="是否审核", example="false")
    private Boolean audit;
}
