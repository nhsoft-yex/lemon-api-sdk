package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * StorehouseUpdateV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class StorehouseUpdateV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="仓库编码", example="10001")
    private Integer storehouseNum;
    @ApiCloudField(value="门店编码", example="99")
    private Integer branchNum;
    @ApiCloudField(value="仓库代码", example="0901")
    private String storehouseCode;
    @ApiCloudField(value="仓库名称", example="河西仓库")
    private String storehouseName;
    @ApiCloudField(value="仓库备注", example="备注信息")
    private String storehouseMemo;
    @ApiCloudField(value="联系人", example="联系人名称")
    private String storehouseLinkman;
    @ApiCloudField(value="联系人电话", example="18888888888")
    private String storehouseLinktel;
    @ApiCloudField(value="仓库地址", example="南京市")
    private String storehouseAddr;
    @ApiCloudField(value="仓库是否启用", example="0")
    private Integer storehouseActived;
    @ApiCloudField(value="是否配送仓", example="0")
    private Integer storehouseCenterTag;
    @ApiCloudField(value="是否批发仓", example="0")
    private Integer storehouseWholesaleTag;
    @ApiCloudField(value="是否不允许负库存操作(POS销售除外)", example="0")
    private Integer storehouseOverflow;
    @ApiCloudField(value="关联仓库编码")
    private Integer relationStorehouseNum;
    @ApiCloudField(value="启用车库", example="false")
    private Boolean enableGarage;
}
