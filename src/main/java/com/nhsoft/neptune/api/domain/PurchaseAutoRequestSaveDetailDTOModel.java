package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PurchaseAutoRequestSaveDetailDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PurchaseAutoRequestSaveDetailDTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编码", example="434400001", required=true)
    private Integer itemNum;
    @ApiCloudField(value="是否自动补货(true:开启，false:关闭)", example="true", required=true)
    private Boolean requestOrderFlag;
    @ApiCloudField(value="补货规则", example="根据库存上限", required=true)
    private String requestOrderRule;
}
