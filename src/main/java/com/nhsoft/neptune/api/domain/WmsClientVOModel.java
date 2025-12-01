package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WmsClientVO模型
 * WMS客户
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WmsClientVOModel extends ApiCloudObject {

    @ApiCloudField(value="客户编码", example="1966")
    private String wmsClientNum;
    @ApiCloudField(value="配送中心门店编码", example="99")
    private Integer branchNum;
    @ApiCloudField(value="配送路线编码", example="1213")
    private String transportLineNum;
    @ApiCloudField(value="配送路线代码", example="22")
    private String transportLineCode;
    @ApiCloudField(value="配送路线名称", example="线路22")
    private String transportLineName;
    @ApiCloudField(value="客户代码", example="9")
    private String wmsClientCode;
    @ApiCloudField(value="客户名称", example="分店9")
    private String wmsClientName;
    @ApiCloudField(value="客户速记码", example="FD9")
    private String wmsClientPinYin;
    @ApiCloudField(value="客户类型（门店|批发客户|店铺）", example="门店")
    private String wmsClientType;
    @ApiCloudField(value="联系人", example="李总")
    private String wmsClientLinker;
    @ApiCloudField(value="联系方式", example="13586412133")
    private String wmsClientLinkTel;
    @ApiCloudField(value="地址", example="宁波市")
    private String wmsClientAddr;
    @ApiCloudField(value="客户等级", example="1")
    private String wmsClientGrade;
    @ApiCloudField(value="距离(km)", example="1000")
    private String distance;
    @ApiCloudField(value="库位编码", example="8070")
    private Long positionNum;
    @ApiCloudField(value="库位名称", example="jh001")
    private String positionName;
    @ApiCloudField(value="维度", example="29.941595")
    private String lat;
    @ApiCloudField(value="经度", example="121.469788")
    private String lng;
    @ApiCloudField(value="更新时间")
    private String updateTime;
    @ApiCloudField(value="配送中心", example="false")
    private Boolean transferCenter;
    @ApiCloudField(value="是否激活", example="true")
    private Boolean wmsClientActived;
}
