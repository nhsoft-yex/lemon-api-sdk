package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ClientGradePriceFindDTO模型
 * 客户等级价格查询参数
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ClientGradePriceFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="等级名称编码", example="1", required=true)
    private Integer clientLevelNum;
    @ApiCloudField(value="商品编码列表", example="20720001")
    private List<Integer> itemNums;
    @ApiCloudField(value="查询页码", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小", example="10", required=true)
    private Integer pageSize;
}
