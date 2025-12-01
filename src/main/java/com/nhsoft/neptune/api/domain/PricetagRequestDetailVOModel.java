package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PricetagRequestDetailVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PricetagRequestDetailVOModel extends ApiCloudObject {

    @ApiCloudField(value="明细编号", example="1")
    private Integer pricetagDetailNum;
    @ApiCloudField(value="商品编码", example="207213835")
    private Integer itemNum;
    @ApiCloudField(value="打印数", example="3331")
    private Integer pricetagDetailCopies;
    @ApiCloudField(value="备注", example="测试")
    private String pricetagDetailMemo;
    @ApiCloudField(value="分级编号", example="1024")
    private Integer itemGradeNum;
}
