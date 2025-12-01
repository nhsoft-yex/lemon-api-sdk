package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ItemSpecLocationVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ItemSpecLocationVOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编号", example="1")
    private Integer itemNum;
    @ApiCloudField(value="商品代码", example="A01")
    private String itemCode;
    @ApiCloudField(value="商品名称", example="A01")
    private String itemName;
    @ApiCloudField(value="商品条码", example="A01")
    private String itemBarCode;
    @ApiCloudField(value="速记码", example="A01")
    private String pinyin;
    @ApiCloudField(value="规格编码", example="9966200000369")
    private Long specNum;
    @ApiCloudField(value="规格代码", example="0100002")
    private String specCode;
    @ApiCloudField(value="规格条码", example="A01")
    private String specBarCode;
    @ApiCloudField(value="规格名称", example="A01")
    private String specName;
    @ApiCloudField(value="门店名称", example="门店1")
    private String branchName;
    @ApiCloudField(value="门店编号", example="1")
    private Integer branchNum;
    @ApiCloudField(value="用户中心门店id", example="105657")
    private Long branchId;
    @ApiCloudField(value="库位信息", example="测试1")
    private String storeLocation;
    @ApiCloudField(value="创建人", example="测试1")
    private String creator;
    @ApiCloudField(value="修改人", example="测试1")
    private String updater;
    @ApiCloudField(value="创建时间", example="2021-01-01 00:00:00")
    private String createdAt;
    @ApiCloudField(value="修改时间", example="2021-01-01 00:00:00")
    private String updatedAt;
}
