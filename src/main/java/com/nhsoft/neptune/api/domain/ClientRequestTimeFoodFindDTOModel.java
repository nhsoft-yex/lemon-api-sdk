package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ClientRequestTimeFoodFindDTO模型
 * 批发订货模板查询参数
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ClientRequestTimeFoodFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="关键字", example="测试")
    private String keyword;
    @ApiCloudField(value="模板id列表", example="[403]")
    private List<Long> clientRequestTimeFoodIds;
    @ApiCloudField(value="客户id列表", example="[0099675990000001]")
    private List<String> clientFids;
}
