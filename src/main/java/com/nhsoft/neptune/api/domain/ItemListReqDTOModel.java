package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ItemListReqDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ItemListReqDTOModel extends ApiCloudObject {

    @ApiCloudField(value="last_download_time")
    private String lastDownloadTime;
    @ApiCloudField(value="page_no")
    private Integer pageNo;
    @ApiCloudField(value="page_size")
    private Integer pageSize;
    @ApiCloudField(value="query_top_category")
    private Boolean queryTopCategory;
    @ApiCloudField(value="item_nums")
    private String itemNums;
    @ApiCloudField(value="query_item_area")
    private Boolean queryItemArea;
    @ApiCloudField(value="query_item_assemble")
    private Boolean queryItemAssemble;
    @ApiCloudField(value="query_item_material")
    private Boolean queryItemMaterial;
    @ApiCloudField(value="var")
    private String var;
    @ApiCloudField(value="item_category_codes")
    private String itemCategoryCodes;
    @ApiCloudField(value="query_inventory")
    private Boolean queryInventory;
    @ApiCloudField(value="branch_num")
    private Integer branchNum;
    @ApiCloudField(value="storehouse_num")
    private Integer storehouseNum;
    @ApiCloudField(value="filter_item_type_query")
    private String filterItemTypeQuery;
    @ApiCloudField(value="query_item_has_matrix")
    private Boolean queryItemHasMatrix;
    @ApiCloudField(value="filter_eliminative")
    private Boolean filterEliminative;
}
