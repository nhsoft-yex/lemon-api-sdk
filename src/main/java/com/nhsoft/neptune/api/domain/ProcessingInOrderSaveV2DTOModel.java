package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ProcessingInOrderSaveV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ProcessingInOrderSaveV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="processing_in_order_fid")
    private String processingInOrderFid;
    @ApiCloudField(value="门店编号", example="1", required=true)
    private Integer branchNum;
    @ApiCloudField(value="仓库编号", example="43440001", required=true)
    private Integer storehouseNum;
    @ApiCloudField(value="操作人", example="管理员", required=true)
    private String processingInOrderOperator;
    @ApiCloudField(value="入库日期(yyyy-mm-dd)", example="2022-01-01", required=true)
    private String processingInOrderDate;
    @ApiCloudField(value="备注", example="")
    private String processingInOrderMemo;
    @ApiCloudField(value="入库明细", example="", required=true)
    private List<ProcessingInOrderSaveDetailV2DTOModel> processingInOrderDetails;
}
