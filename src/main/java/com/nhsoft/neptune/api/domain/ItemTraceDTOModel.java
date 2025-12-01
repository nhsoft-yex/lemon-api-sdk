package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ItemTraceDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ItemTraceDTOModel extends ApiCloudObject {

    @ApiCloudField(value="单据号", example="4344010000001")
    private String itemTraceLogNo;
    @ApiCloudField(value="门店编码", example="99")
    private Integer branchNum;
    @ApiCloudField(value="商品编码", example="434403453")
    private Integer itemNum;
    @ApiCloudField(value="供应商编码", example="434400008")
    private Integer supplierNum;
    @ApiCloudField(value="收货数量", example="2")
    private BigDecimal itemTraceLogReceiveQty;
    @ApiCloudField(value="生产日期", example="2021-08-02")
    private String itemTraceLogProductDate;
    @ApiCloudField(value="保质天数", example="200")
    private Integer itemTraceLogValidPeriod;
    @ApiCloudField(value="检验检疫号", example="JY20210101")
    private String itemTraceLogQuarantineNo;
    @ApiCloudField(value="备注", example="备注")
    private String itemTraceLogMemo;
}
