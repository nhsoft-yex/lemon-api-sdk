package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * InnerApproveDetailV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class InnerApproveDetailV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编码", example="207200001", required=true)
    private Integer itemNum;
    @ApiCloudField(value="批复数量", example="1.0", required=true)
    private BigDecimal itemApproveQty;
    @ApiCloudField(value="商品批复备注", example="备注信息")
    private String itemApproveMemo;
    @ApiCloudField(value="批次号", example="20240101")
    private String itemLotNumber;
    @ApiCloudField(value="新批次号", example="20240101")
    private String itemNewLotNumber;
    @ApiCloudField(value="生产日期(yyyy-mm-dd)", example="2024-01-01")
    private String itemProductDate;
    @ApiCloudField(value="仓库编码")
    private Integer inStorehouseNum;
}
