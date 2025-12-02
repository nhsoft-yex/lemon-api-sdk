package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ItemFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ItemFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="最后修改时间（yyyy-MM-dd HH:mm:ss）", example="2021-01-01 00:00:00")
    private String lastDownloadTime;
    @ApiCloudField(value="商品类型", example="1")
    private Integer itemType;
    @ApiCloudField(value="商品类别代码", example="001")
    private String itemCategoryCode;
    @ApiCloudField(value="是否查询销售提成", example="false")
    private Boolean showCommission;
    @ApiCloudField(value="查询页码", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小", example="10", required=true)
    private Integer pageSize;
    @ApiCloudField(value="是否查询分级，关键字搜索时使用", example="true")
    private Boolean queryGradeItem;
    @ApiCloudField(value="item_nums")
    private String itemNums;
    @ApiCloudField(value="item_codes")
    private String itemCodes;
    @ApiCloudField(value="item_types")
    private String itemTypes;
    @ApiCloudField(value="item_category_codes")
    private String itemCategoryCodes;
    @ApiCloudField(value="manage_template_num")
    private Integer manageTemplateNum;
    @ApiCloudField(value="manage_template_nums")
    private String manageTemplateNums;
    @ApiCloudField(value="keyword")
    private String keyword;
    @ApiCloudField(value="item_name")
    private String itemName;
    @ApiCloudField(value="item_code")
    private String itemCode;
    @ApiCloudField(value="item_barcode")
    private String itemBarcode;
    @ApiCloudField(value="query_all")
    private Boolean queryAll;
    @ApiCloudField(value="supplier_num")
    private Integer supplierNum;
    @ApiCloudField(value="item_department")
    private String itemDepartment;
    @ApiCloudField(value="item_departments")
    private List<String> itemDepartments;
    @ApiCloudField(value="item_brand")
    private String itemBrand;
    @ApiCloudField(value="是否查询商品标签", example="true")
    private Boolean queryLabel;
    @ApiCloudField(value="是否过滤休眠商品(true表示过滤)", example="false")
    private Boolean filterSleep;
    @ApiCloudField(value="是否过滤淘汰商品(true表示过滤)", example="false")
    private Boolean filterWeedOut;
}
