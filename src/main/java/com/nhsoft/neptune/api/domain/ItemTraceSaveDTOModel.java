package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ItemTraceSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ItemTraceSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编码", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="商品编码", example="434403453", required=true)
    private Integer itemNum;
    @ApiCloudField(value="供应商编码", example="434400008", required=true)
    private Integer supplierNum;
    @ApiCloudField(value="收货数量", example="2", required=true)
    private BigDecimal itemTraceLogReceiveQty;
    @ApiCloudField(value="生产日期", example="2021-08-02", required=true)
    private String itemTraceLogProductDate;
    @ApiCloudField(value="保质天数", example="200")
    private Integer itemTraceLogValidPeriod;
    @ApiCloudField(value="检验检疫号", example="JY20210101")
    private String itemTraceLogQuarantineNo;
    @ApiCloudField(value="备注", example="备注")
    private String itemTraceLogMemo;
}
