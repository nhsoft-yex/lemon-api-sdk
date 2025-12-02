package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WholesaleInnerOrderApproveDTO模型
 * 批发内部申请单批复DTO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WholesaleInnerOrderApproveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="单据编号", example="4344990000318", required=true)
    private String innerOrderFid;
    @ApiCloudField(value="仓库编号", example="203000002", required=true)
    private Integer storehouseNum;
    @ApiCloudField(value="操作人", example="", required=true)
    private String innerOrderOperator;
    @ApiCloudField(value="批复备注", example="")
    private String innerOrderApproveMemo;
    @ApiCloudField(value="明细", example="", required=true)
    private List<WholesaleInnerOrderApproveDetailDTOModel> details;
}
