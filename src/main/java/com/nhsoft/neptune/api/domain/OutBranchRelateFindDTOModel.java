package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * OutBranchRelateFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class OutBranchRelateFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="关键字", example="aaa")
    private String keywords;
    @ApiCloudField(value="第三方门店渠道(抖音|美团|口碑|快手|支付宝)", example="抖音", required=true)
    private String outBranchType;
    @ApiCloudField(value="查询页码(全渠道会员查询时此项为必填)", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小(最大分页1000)", example="100", required=true)
    private Integer pageSize;
}
