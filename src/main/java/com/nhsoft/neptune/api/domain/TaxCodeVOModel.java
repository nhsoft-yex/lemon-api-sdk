package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * TaxCodeVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TaxCodeVOModel extends ApiCloudObject {

    @ApiCloudField(value="税收id", example="9965800000001")
    private Long id;
    @ApiCloudField(value="税收编码", example="0528")
    private String taxCode;
    @ApiCloudField(value="税收分类", example="0528测试")
    private String taxCategory;
    @ApiCloudField(value="进项税率", example="1.0")
    private BigDecimal inTax;
    @ApiCloudField(value="销项税率", example="1.0")
    private BigDecimal outTax;
    @ApiCloudField(value="免税标记", example="true")
    private Boolean freeTaxFlag;
    @ApiCloudField(value="开票显示单位", example="公斤")
    private String invoiceUnitName;
    @ApiCloudField(value="基本单位组名称", example="公斤")
    private String invoiceUnitGroupName;
    @ApiCloudField(value="创建人", example="张三")
    private String createdBy;
    @ApiCloudField(value="更新人", example="张三")
    private String updatedBy;
    @ApiCloudField(value="创建时间")
    private String createdAt;
    @ApiCloudField(value="更新时间")
    private String updatedAt;
    @ApiCloudField(value="删除标记", example="true")
    private Boolean deletedFlag;
}
