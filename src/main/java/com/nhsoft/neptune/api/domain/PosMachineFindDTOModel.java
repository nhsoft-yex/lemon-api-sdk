package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosMachineFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosMachineFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编码列表", example="1")
    private List<Integer> branchNums;
}
