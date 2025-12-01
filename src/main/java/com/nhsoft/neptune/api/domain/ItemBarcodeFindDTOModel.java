package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ItemBarcodeFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ItemBarcodeFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品", example="6900022222", required=true)
    private List<String> itemBarcodes;
}
