package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * StoreItemClientVO模型
 * 客户批发价
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class StoreItemClientVOModel extends ApiCloudObject {

    @ApiCloudField(value="客户编码", example="002072990000117")
    private String clientFid;
    @ApiCloudField(value="商品编码", example="20720401")
    private Integer itemNum;
    @ApiCloudField(value="门店编码", example="99")
    private Integer branchNum;
    @ApiCloudField(value="客户批发价", example="100.0")
    private BigDecimal clientAgreementPrice;
    @ApiCloudField(value="最近售价", example="150.0")
    private BigDecimal clientLastestPrice;
    @ApiCloudField(value="最高价", example="150.0")
    private BigDecimal clientMaxPrice;
    @ApiCloudField(value="最低价", example="150.0")
    private BigDecimal clientMinPrice;
    @ApiCloudField(value="备注", example="测试")
    private String memo;
    @ApiCloudField(value="是否允许在线批发")
    private Integer clientSaleCase;
    @ApiCloudField(value="供应商编码", example="4344990000318")
    private Integer supplierNum;
}
