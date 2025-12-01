package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ItemCategoryFindV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ItemCategoryFindV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品类别代码", example="10050")
    private String categoryCode;
    @ApiCloudField(value="商品类别名称", example="果蔬")
    private String categoryName;
    @ApiCloudField(value="速记码", example="GS")
    private String categoryShortName;
    @ApiCloudField(value="商品父类代码", example="100")
    private String parentCategoryCode;
    @ApiCloudField(value="允许门店调价", example="1")
    private Integer posItemTypePriceAdj;
    @ApiCloudField(value="负库存不允许销售", example="1")
    private Integer canNotSaleNoStoreItem;
    @ApiCloudField(value="前台销售不显示", example="1")
    private Integer notShowInPos;
    @ApiCloudField(value="商品分类所在等级", example="1")
    private Integer level;
}
