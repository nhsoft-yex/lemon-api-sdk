package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ItemFindV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ItemFindV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="最后修改时间（yyyy-MM-dd HH:mm:ss）", example="2021-01-01 00:00:00")
    private String lastDownloadTime;
    @ApiCloudField(value="商品类型", example="1")
    private Integer itemType;
    @ApiCloudField(value="商品类别代码", example="001")
    private String itemCategoryCode;
    @ApiCloudField(value="是否查询销售提成", example="false")
    private Boolean showCommission;
    @ApiCloudField(value="商品编码", example="1,2,3")
    private List<Integer> itemNums;
    @ApiCloudField(value="商品代码", example="1,2,3")
    private List<String> itemCodes;
    @ApiCloudField(value="item_types")
    private List<Integer> itemTypes;
    @ApiCloudField(value="manage_template_num")
    private Integer manageTemplateNum;
    @ApiCloudField(value="manage_template_nums")
    private List<Integer> manageTemplateNums;
    @ApiCloudField(value="keyword")
    private String keyword;
    @ApiCloudField(value="supplier_num")
    private Integer supplierNum;
    @ApiCloudField(value="item_departments")
    private List<String> itemDepartments;
    @ApiCloudField(value="item_brand")
    private String itemBrand;
    @ApiCloudField(value="item_name")
    private String itemName;
    @ApiCloudField(value="item_code")
    private String itemCode;
    @ApiCloudField(value="item_bar_code")
    private String itemBarCode;
    @ApiCloudField(value="query_all")
    private Boolean queryAll;
    @ApiCloudField(value="item_category_codes")
    private List<String> itemCategoryCodes;
    @ApiCloudField(value="是否查询商品标签", example="true")
    private Boolean queryLabel;
    @ApiCloudField(value="是否过滤休眠商品(true表示过滤)", example="false")
    private Boolean filterSleep;
    @ApiCloudField(value="是否过滤淘汰商品(true表示过滤)", example="false")
    private Boolean filterWeedOut;
    @ApiCloudField(value="查询页码", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小(最大为1000)", example="10", required=true)
    private Integer pageSize;
    @ApiCloudField(value="是否查询分级，关键字搜索时使用", example="true")
    private Boolean queryGradeItem;
}
