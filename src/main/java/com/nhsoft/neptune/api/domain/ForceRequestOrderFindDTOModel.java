package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ForceRequestOrderFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ForceRequestOrderFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="应用门店编码", example="1")
    private Integer branchNum;
}
