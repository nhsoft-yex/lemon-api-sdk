package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WmsStorehouseVO模型
 * WMS仓库信息
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WmsStorehouseVOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编号", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="仓库代码", example="99", required=true)
    private String storehouseCode;
    @ApiCloudField(value="仓库名称", example="测试仓库", required=true)
    private String storehouseName;
    @ApiCloudField(value="是否激活", example="true", required=true)
    private Boolean storehouseActived;
    @ApiCloudField(value="是否收货仓库", example="true", required=true)
    private Boolean storehouseReceiveTag;
    @ApiCloudField(value="是否发货仓库", example="true", required=true)
    private Boolean storehouseStoreTag;
    @ApiCloudField(value="是否调拨仓库", example="true", required=true)
    private Boolean storehouseTransferTag;
    @ApiCloudField(value="是否启用库存", example="true", required=true)
    private Boolean storehouseEnableStorage;
    @ApiCloudField(value="是否退货库存", example="true", required=true)
    private Boolean storehouseReturnTag;
    @ApiCloudField(value="创建时间", required=true)
    private String createTime;
    @ApiCloudField(value="创建人", example="admin", required=true)
    private String creator;
    @ApiCloudField(value="修改时间", required=true)
    private String updateTime;
    @ApiCloudField(value="修改人", example="admin", required=true)
    private String updator;
    @ApiCloudField(value="是否自动生成收货任务", example="true", required=true)
    private Boolean autoGenerateReceiveTask;
    @ApiCloudField(value="是否启用入库", example="true", required=true)
    private Boolean inStorehouseFlag;
}
