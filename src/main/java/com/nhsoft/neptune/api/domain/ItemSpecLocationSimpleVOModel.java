package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ItemSpecLocationSimpleVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ItemSpecLocationSimpleVOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编号", example="1")
    private Integer itemNum;
    @ApiCloudField(value="用户中心门店id", example="105657")
    private Long branchId;
    @ApiCloudField(value="规格编码", example="9966200000369")
    private Long specNum;
    @ApiCloudField(value="库位信息", example="测试1")
    private String storeLocation;
    @ApiCloudField(value="删除标识", example="true")
    private Boolean deletedFlag;
    @ApiCloudField(value="创建时间", example="2021-01-01 00:00:00")
    private String createdAt;
    @ApiCloudField(value="修改时间", example="2021-01-01 00:00:00")
    private String updatedAt;
}
