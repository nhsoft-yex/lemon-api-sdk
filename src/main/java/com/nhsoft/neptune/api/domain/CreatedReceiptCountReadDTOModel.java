package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CreatedReceiptCountReadDTO模型
 * 创建收款单数量读取DTO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CreatedReceiptCountReadDTOModel extends ApiCloudObject {

    @ApiCloudField(value="业务类别", example="商品")
    private List<String> businessType;
    @ApiCloudField(value="目标门店用户中心id", example="99")
    private String dstBranchId;
    @ApiCloudField(value="源门店用户中心id", example="1", required=true)
    private String srcBranchId;
    @ApiCloudField(value="目标合作伙伴用户中心id", example="1")
    private String dstPartnerId;
}
