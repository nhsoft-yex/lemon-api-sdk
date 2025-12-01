package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * AllocationOrderSaveDetailV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AllocationOrderSaveDetailV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编码", example="150050001", required=true)
    private Integer itemNum;
    @ApiCloudField(value="转仓数量", example="1.0", required=true)
    private BigDecimal itemUseQty;
    @ApiCloudField(value="转仓单位", example="公斤", required=true)
    private String itemUseUnit;
    @ApiCloudField(value="批次号", example="20210120")
    private String itemLotNumber;
    @ApiCloudField(value="生产日期(yyyy-mm-dd)", example="2021-01-20")
    private String itemProductDate;
    @ApiCloudField(value="备注", example="备注信息")
    private String itemMemo;
    @ApiCloudField(value="转入批次号", example="20210120")
    private String itemInLotNumber;
}
