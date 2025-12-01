package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosItemBarV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosItemBarV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编码")
    private Integer itemNum;
    @ApiCloudField(value="条码编码")
    private Integer itemBarNum;
    @ApiCloudField(value="条码", example="")
    private String itemBarCode;
    @ApiCloudField(value="创建时间", example="2021-01-20 00:00:00")
    private String itemBarCreateDate;
    @ApiCloudField(value="换算率")
    private BigDecimal itemBarRate;
}
