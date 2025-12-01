package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PriceTagPrintCustomDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PriceTagPrintCustomDTOModel extends ApiCloudObject {

    @ApiCloudField(value="price_tag_print_custom_id")
    private Integer priceTagPrintCustomId;
    @ApiCloudField(value="price_tag_print_custom_key")
    private String priceTagPrintCustomKey;
    @ApiCloudField(value="price_tag_print_custom_name")
    private String priceTagPrintCustomName;
    @ApiCloudField(value="default_value")
    private String defaultValue;
    @ApiCloudField(value="url")
    private String url;
    @ApiCloudField(value="memo")
    private String memo;
    @ApiCloudField(value="system_book_code")
    private String systemBookCode;
}
