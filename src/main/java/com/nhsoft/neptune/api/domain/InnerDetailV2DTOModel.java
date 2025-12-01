package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * InnerDetailV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class InnerDetailV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编码", example="150113451", required=true)
    private Integer itemNum;
    @ApiCloudField(value="申请单位", example="公斤", required=true)
    private String itemUseUnit;
    @ApiCloudField(value="申请数量", example="1.0", required=true)
    private BigDecimal itemUseQty;
    @ApiCloudField(value="申请单价", example="1.0", required=true)
    private BigDecimal itemUsePrice;
    @ApiCloudField(value="批次号", example="20240101")
    private String itemLotNumber;
    @ApiCloudField(value="生产日期(yyyy-mm-dd)", example="2024-01-01")
    private String itemProductDate;
    @ApiCloudField(value="备注", example="备注信息")
    private String itemMemo;
}
