package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * InventoryFindDTO模型
 * 库存查询DTO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class InventoryFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编号", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="库位编码列表", example="[1]")
    private List<String> positionNums;
    @ApiCloudField(value="商品编码列表", example="[1]")
    private List<Integer> itemNums;
    @ApiCloudField(value="仓库区域编码列表", example="[1]")
    private List<Integer> storehouseAreaNums;
    @ApiCloudField(value="商品分组编码列表", example="[1]")
    private List<Integer> itemGroupNums;
    @ApiCloudField(value="库位类型编码列表", example="[1]")
    private List<String> positionTypes;
    @ApiCloudField(value="商品分类编码列表", example="[1]")
    private List<String> posItemTypeCodes;
    @ApiCloudField(value="商品部门编码列表", example="[1]")
    private List<String> itemDepartments;
    @ApiCloudField(value="过滤库存为零的商品", example="true")
    private Boolean filterZero;
    @ApiCloudField(value="查询锁定库存数量", example="true")
    private Boolean withLock;
    @ApiCloudField(value="查询冻结库存", example="true")
    private Boolean withFrozen;
    @ApiCloudField(value="只查询冻结库存", example="true")
    private Boolean onlyFrozen;
    @ApiCloudField(value="查询异常库存", example="true")
    private Boolean queryAbnormalInventory;
    @ApiCloudField(value="查询一品多位", example="true")
    private Boolean multipleProducts;
    @ApiCloudField(value="只查询休眠商品", example="true")
    private Boolean itemStatus;
    @ApiCloudField(value="查询筐信息", example="true")
    private Boolean queryBasket;
    @ApiCloudField(value="查询页码", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小", example="10", required=true)
    private Integer pageSize;
}
