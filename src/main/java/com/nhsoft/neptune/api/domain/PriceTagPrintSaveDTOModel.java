package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PriceTagPrintSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PriceTagPrintSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="价签打印id", example="1", required=true)
    private Integer priceTagPrintId;
    @ApiCloudField(value="价签打印字段", example="itemNum", required=true)
    private String priceTagPrintKey;
    @ApiCloudField(value="价签打印名称", example="商品编号", required=true)
    private String priceTagPrintName;
    @ApiCloudField(value="价签打印值", example="1", required=true)
    private String priceTagPrintValue;
    @ApiCloudField(value="价签打印模块", example="价签打印", required=true)
    private String priceTagPrintModule;
    @ApiCloudField(value="价签打印项目", example="AMA", required=true)
    private String priceTagPrintProject;
    @ApiCloudField(value="price_tag_print_partner_id")
    private Integer priceTagPrintPartnerId;
    @ApiCloudField(value="价签打印备注", example="测试")
    private String priceTagPrintMemo;
    @ApiCloudField(value="价签打印字段key", example="itemNum")
    private String key;
    @ApiCloudField(value="价签打印字段名称", example="商品编号")
    private String name;
    @ApiCloudField(value="价签打印字段value", example="1232121")
    private String value;
}
