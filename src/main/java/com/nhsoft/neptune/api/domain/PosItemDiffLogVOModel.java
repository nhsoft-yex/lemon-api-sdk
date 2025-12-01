package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosItemDiffLogVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosItemDiffLogVOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编码列表", example="1")
    private Integer branchNum;
    @ApiCloudField(value="商品编码列表", example="15")
    private Integer itemNum;
    @ApiCloudField(value="变动日期", example="")
    private String date;
    @ApiCloudField(value="库存变动数量")
    private BigDecimal inventoryInOutAmount;
}
