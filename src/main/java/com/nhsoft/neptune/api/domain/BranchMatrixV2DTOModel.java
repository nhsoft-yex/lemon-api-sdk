package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BranchMatrixV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BranchMatrixV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="扩展属性value1", example="value1")
    private String branchExtend1;
    @ApiCloudField(value="扩展属性value2", example="value2")
    private String branchExtend2;
    @ApiCloudField(value="扩展属性value3", example="value3")
    private String branchExtend3;
    @ApiCloudField(value="扩展属性value4", example="value4")
    private String branchExtend4;
    @ApiCloudField(value="扩展属性value5", example="value5")
    private String branchExtend5;
    @ApiCloudField(value="扩展属性value6", example="value6")
    private String branchExtend6;
    @ApiCloudField(value="扩展属性value7", example="value7")
    private String branchExtend7;
    @ApiCloudField(value="扩展属性value8", example="value8")
    private String branchExtend8;
    @ApiCloudField(value="扩展属性value9", example="value9")
    private String branchExtend9;
    @ApiCloudField(value="扩展属性value10", example="value10")
    private String branchExtend10;
    @ApiCloudField(value="开业日期", example="2023-05-08")
    private String openingDate;
    @ApiCloudField(value="是否启用乐檬资金结算", example="false")
    private Boolean enableFund;
    @ApiCloudField(value="门店禁止要货", example="true")
    private Boolean branchMatrixForbidRequest;
}
