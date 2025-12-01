package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosImageFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosImageFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编码列表", example="[102200551,102200552]")
    private List<Integer> itemNums;
}
