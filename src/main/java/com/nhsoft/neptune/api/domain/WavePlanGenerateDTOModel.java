package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WavePlanGenerateDTO模型
 * 波次计划单生成DTO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WavePlanGenerateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="操作人", example="admin", required=true)
    private String operator;
    @ApiCloudField(value="操作门店", example="99", required=true)
    private String branchNum;
    @ApiCloudField(value="是否有效", example="true")
    private Boolean orderValidIs;
    @ApiCloudField(value="出库订单是否生成过波次计划", example="true")
    private Boolean hasWavePlanBill;
    @ApiCloudField(value="日期类型(审核日期|配送日期)", example="审核日期", required=true)
    private String dateType;
    @ApiCloudField(value="开始时间", required=true)
    private String dateFrom;
    @ApiCloudField(value="结束时间", required=true)
    private String dateTo;
    @ApiCloudField(value="策略名称", example="自定义配置的策略", required=true)
    private String strategyName;
}
