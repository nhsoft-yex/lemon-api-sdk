package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ItemSpecLocationSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ItemSpecLocationSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编号", example="1", required=true)
    private Integer itemNum;
    @ApiCloudField(value="规格编码", example="9966200000369", required=true)
    private Long specNum;
    @ApiCloudField(value="用户中心门店id", example="105657", required=true)
    private Long branchId;
    @ApiCloudField(value="库位信息", example="测试1", required=true)
    private String storeLocation;
}
