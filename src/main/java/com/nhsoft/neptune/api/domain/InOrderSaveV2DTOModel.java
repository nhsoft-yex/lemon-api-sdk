package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * InOrderSaveV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class InOrderSaveV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="调入门店编码", example="99", required=true)
    private Integer inBranchNum;
    @ApiCloudField(value="调出门店编码", example="1", required=true)
    private Integer outBranchNum;
    @ApiCloudField(value="创建人", example="管理员", required=true)
    private String inOrderCreator;
    @ApiCloudField(value="备注", example="备注信息")
    private String inOrderMemo;
    @ApiCloudField(value="外部订单号(最大长度50)", example="A0005")
    private String inOrderOutBillNo;
    @ApiCloudField(value="调入日期(yyyy-MM-dd)", example="2021-01-01", required=true)
    private String inOrderDate;
    @ApiCloudField(value="业务员", example="管理员", required=true)
    private String inOrderProposer;
    @ApiCloudField(value="调入仓库编码", example="150050001", required=true)
    private Integer storehouseNum;
    @ApiCloudField(value="关联调出单号", example="MO4344990004979")
    private String outOrderFid;
    @ApiCloudField(value="明细", example="", required=true)
    private List<InOrderSaveDetailV2DTOModel> inOrderDetails;
}
