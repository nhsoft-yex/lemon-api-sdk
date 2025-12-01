package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SettlementUnitVO模型
 * 往来单位
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SettlementUnitVOModel extends ApiCloudObject {

    @ApiCloudField(value="单位ID", example="R00001000909")
    private String id;
    @ApiCloudField(value="名称", example="门店1")
    private String name;
    @ApiCloudField(value="类型（BRANCH,SUPPLIER,CLIENT,DISTRIBUTOR）", example="BRANCH")
    private String type;
    @ApiCloudField(value="外部应用类型", example="AMA")
    private String outAppType;
    @ApiCloudField(value="外部应用ID", example="4344")
    private String outAppId;
    @ApiCloudField(value="外部单位ID", example="99")
    private String outUnitId;
    @ApiCloudField(value="group")
    private SettlementUnitGroupVOModel group;
    @ApiCloudField(value="合作伙伴ID", example="1")
    private Integer partnerId;
    @ApiCloudField(value="是否启用", example="true")
    private Boolean enable;
    @ApiCloudField(value="门店ID")
    private Integer branchId;
}
