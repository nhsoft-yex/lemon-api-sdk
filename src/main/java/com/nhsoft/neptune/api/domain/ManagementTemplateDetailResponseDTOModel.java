package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ManagementTemplateDetailResponseDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ManagementTemplateDetailResponseDTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编码", example="434403064")
    private Integer itemNum;
    @ApiCloudField(value="商品代码", example="030010")
    private String itemCode;
    @ApiCloudField(value="商品条码", example="77000763")
    private String itemBarCode;
    @ApiCloudField(value="商品名称", example="苹果")
    private String itemName;
    @ApiCloudField(value="商品规格", example="一箱20只")
    private String itemSpec;
    @ApiCloudField(value="商品基本单位", example="斤")
    private String itemUnit;
    @ApiCloudField(value="商品类别名称", example="水果类")
    private String itemCategory;
    @ApiCloudField(value="商品类别代码", example="03")
    private String itemCategoryCode;
}
