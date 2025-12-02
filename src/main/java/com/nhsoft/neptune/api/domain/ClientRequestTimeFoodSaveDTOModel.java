package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ClientRequestTimeFoodSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ClientRequestTimeFoodSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="创建门店编号", example="99")
    private Integer branchNum;
    @ApiCloudField(value="模板名称", example="测试002")
    private String requestTimeName;
    @ApiCloudField(value="要货开始时间", example="2025-07-11 00:00:00")
    private String requestTimeFrom;
    @ApiCloudField(value="要货结束时间", example="2025-07-11 23:59:00")
    private String requestTimeTo;
    @ApiCloudField(value="商品范围(按商品|按类别|按部门|全部商品|例外商品)", example="按类别")
    private String itemRange;
    @ApiCloudField(value="类别等级(一级类别|二级类别|三级类别|四级类别|五级类别|六级类别|七级类别|八级类别)", example="一级类别")
    private String categoryLevel;
    @ApiCloudField(value="配送日期(当天|一天后|两天后|三天后|四天后|五天后|六天后|七天后)", example="一级类别")
    private String deliveryName;
    @ApiCloudField(value="是否启用", example="true")
    private Boolean enableRequestTime;
    @ApiCloudField(value="应用范围(按客户|按客户等级|按客户区域)", example="按客户")
    private String clientRange;
    @ApiCloudField(value="区域列表", example="")
    private List<ClientRegionVOModel> regions;
    @ApiCloudField(value="创建时间")
    private String createTime;
    @ApiCloudField(value="修改时间")
    private String updateTime;
    @ApiCloudField(value="客户列表", example="")
    private List<String> clientFids;
    @ApiCloudField(value="应用商品编码列表", example="[1]")
    private List<Integer> requestTimeDetails;
    @ApiCloudField(value="备注", example="test")
    private String requestTimeMemo;
    @ApiCloudField(value="客户等级", example="1")
    private Integer clientPriceLevel;
    @ApiCloudField(value="部门列表", example="")
    private List<String> departmentNames;
    @ApiCloudField(value="商品类别列表", example="")
    private List<String> posItemTypeCodes;
}
