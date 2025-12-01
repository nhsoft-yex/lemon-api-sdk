package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosOrderMatrixFindV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosOrderMatrixFindV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编码", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="营业日", example="20220324", required=true)
    private String shiftTableBizday;
}
