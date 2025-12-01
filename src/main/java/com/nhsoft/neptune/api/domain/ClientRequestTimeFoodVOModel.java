package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ClientRequestTimeFoodVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ClientRequestTimeFoodVOModel extends ApiCloudObject {

    @ApiCloudField(value="批发订货模板id", example="406")
    private Long clientRequestTimeFoodId;
    @ApiCloudField(value="创建门店编号", example="99")
    private Integer branchNum;
    @ApiCloudField(value="模板名称", example="测试002")
    private String requestTimeName;
    @ApiCloudField(value="要货开始时间", example="2025-07-11 00:00:00")
    private String requestTimeFrom;
    @ApiCloudField(value="要货结束时间", example="2025-07-11 23:59:00")
    private String requestTimeTo;
    @ApiCloudField(value="商品范围", example="按类别")
    private String itemRange;
    @ApiCloudField(value="类别等级", example="一级类别")
    private String categoryLevel;
    @ApiCloudField(value="配送日期", example="当天")
    private String deliveryName;
    @ApiCloudField(value="是否启用", example="true")
    private Boolean enableRequestTime;
    @ApiCloudField(value="应用范围", example="按客户")
    private String clientRange;
    @ApiCloudField(value="创建时间")
    private String createTime;
    @ApiCloudField(value="修改时间")
    private String updateTime;
    @ApiCloudField(value="客户列表")
    private List<String> clientFids;
    @ApiCloudField(value="应用商品编码列表", example="[1]")
    private List<Integer> requestTimeDetails;
    @ApiCloudField(value="备注", example="test")
    private String requestTimeMemo;
    @ApiCloudField(value="客户等级", example="1")
    private Integer clientPriceLevel;
    @ApiCloudField(value="区域列表")
    private List<ClientRegionVOModel> regions;
}
