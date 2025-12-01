package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosItemExpirationDeleteDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosItemExpirationDeleteDTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编码列表", example="[1]", required=true)
    private List<Integer> itemNums;
}
