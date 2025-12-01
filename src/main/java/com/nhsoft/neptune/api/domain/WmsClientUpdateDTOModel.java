package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WmsClientUpdateDTO模型
 * WMS客户更新
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WmsClientUpdateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="客户编码", example="1966", required=true)
    private String wmsClientNum;
    @ApiCloudField(value="客户类型（门店|批发客户|店铺|客无忧）", example="门店", required=true)
    private String wmsClientType;
    @ApiCloudField(value="配送中心门店编码", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="客户代码", example="9")
    private String wmsClientCode;
    @ApiCloudField(value="客户名称", example="分店9")
    private String wmsClientName;
    @ApiCloudField(value="联系人", example="李总")
    private String wmsClientLinker;
    @ApiCloudField(value="联系方式", example="13586412133")
    private String wmsClientLinkTel;
    @ApiCloudField(value="地址", example="宁波市")
    private String wmsClientAddr;
    @ApiCloudField(value="距离(km)", example="1000")
    private BigDecimal distance;
    @ApiCloudField(value="第三方客户编号", example="111111", required=true)
    private String wmsOutNum;
}
