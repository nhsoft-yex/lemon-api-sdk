package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * TransferOutOrderItemExpirationGeneratorDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TransferOutOrderItemExpirationGeneratorDTOModel extends ApiCloudObject {

    @ApiCloudField(value="调出单编号", example="", required=true)
    private String outOrderFid;
    @ApiCloudField(value="门店编码", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="调出门店", required=true)
    private Integer outBranchNum;
    @ApiCloudField(value="审核人", example="管理员", required=true)
    private String outOrderAuditor;
    @ApiCloudField(value="调出单明细", example="管理员", required=true)
    private List<TransferOutOrderItemExpirationDetailDTOModel> details;
}
