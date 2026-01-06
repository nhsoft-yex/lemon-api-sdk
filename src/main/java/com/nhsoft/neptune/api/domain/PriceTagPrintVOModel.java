package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PriceTagPrintVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PriceTagPrintVOModel extends ApiCloudObject {

    @ApiCloudField(value="price_tag_print_id")
    private Integer priceTagPrintId;
    @ApiCloudField(value="price_tag_print_key")
    private String priceTagPrintKey;
    @ApiCloudField(value="price_tag_print_name")
    private String priceTagPrintName;
    @ApiCloudField(value="price_tag_print_value")
    private String priceTagPrintValue;
    @ApiCloudField(value="price_tag_print_module")
    private String priceTagPrintModule;
    @ApiCloudField(value="price_tag_print_project")
    private String priceTagPrintProject;
    @ApiCloudField(value="price_tag_print_partner_id")
    private Integer priceTagPrintPartnerId;
    @ApiCloudField(value="price_tag_print_memo")
    private String priceTagPrintMemo;
    @ApiCloudField(value="key")
    private String key;
    @ApiCloudField(value="name")
    private String name;
    @ApiCloudField(value="value")
    private Object value;
    @ApiCloudField(value="url")
    private String url;
}
