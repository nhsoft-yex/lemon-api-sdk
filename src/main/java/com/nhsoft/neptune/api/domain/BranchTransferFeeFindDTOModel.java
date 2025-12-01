package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BranchTransferFeeFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BranchTransferFeeFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="调出门店编码", example="99", required=true)
    private Integer outBranchNum;
    @ApiCloudField(value="调入门店编码", example="99")
    private Integer branchNum;
    @ApiCloudField(value="仓库编码", example="2072000001")
    private Integer storehouseNum;
    @ApiCloudField(value="商品编码列表(长度不超过100)", example="43440001", required=true)
    private List<Integer> itemNums;
}
