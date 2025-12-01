package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * RequestOrderCheckFailDetailRespDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RequestOrderCheckFailDetailRespDTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编号")
    private Integer itemNum;
    @ApiCloudField(value="商品代码", example="")
    private String itemCode;
    @ApiCloudField(value="商品名称", example="")
    private String itemName;
    @ApiCloudField(value="详细信息", example="")
    private String detailMsg;
    @ApiCloudField(value="使用单位", example="")
    private String useUnit;
}
