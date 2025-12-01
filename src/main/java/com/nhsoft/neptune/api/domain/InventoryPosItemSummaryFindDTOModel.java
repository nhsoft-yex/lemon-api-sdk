package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * InventoryPosItemSummaryFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class InventoryPosItemSummaryFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编码列表", example="", required=true)
    private List<Integer> branchNums;
    @ApiCloudField(value="日期类型(操作日期|审核时间)", example="操作日期", required=true)
    private String dateType;
    @ApiCloudField(value="开始日期", example="Mon Jan 01 08:00:00 CST 2024", required=true)
    private String dateStart;
    @ApiCloudField(value="结束日期", example="Tue Jan 02 08:00:00 CST 2024", required=true)
    private String dateEnd;
    @ApiCloudField(value="商品编码列表", example="[1]")
    private List<Integer> itemNums;
    @ApiCloudField(value="商品类别列表", example="[1]")
    private List<String> itemCategoryCodes;
    @ApiCloudField(value="单位类型(基本单位|采购单位|配送单位|批发单位|库存单位|常用单位)", example="基本单位", required=true)
    private String unitType;
    @ApiCloudField(value="仓库编码列表", example="[9959100001]")
    private List<Integer> storehouseNums;
    @ApiCloudField(value="部门", example="小鸡腿")
    private String itemDepartment;
    @ApiCloudField(value="是否过滤删除商品", example="true")
    private Boolean isFilterDeleteItem;
    @ApiCloudField(value="是否过滤删除商品", example="true")
    private Boolean filterZero;
    @ApiCloudField(value="过滤无库存商品", example="true")
    private Boolean filterNoLog;
    @ApiCloudField(value="过滤淘汰商品", example="true")
    private Boolean filterWeekOut;
    @ApiCloudField(value="供应商编码列表", example="[99695001]")
    private List<Integer> supplierNums;
    @ApiCloudField(value="商品查询模板编号", example="996950001")
    private Integer itemFlagNum;
    @ApiCloudField(value="汇总类型(1：按商品；2：按类别；3：按供应商)", example="1", required=true)
    private Integer index;
    @ApiCloudField(value="过滤删除商品", example="true")
    private Boolean filterDel;
    @ApiCloudField(value="过滤停售", example="true")
    private Boolean filterSaleCease;
    @ApiCloudField(value="查询页码", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小", example="10", required=true)
    private Integer pageSize;
    @ApiCloudField(value="查询库存", example="true")
    private Boolean showInventory;
}
