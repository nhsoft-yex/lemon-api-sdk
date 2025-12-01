package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosOrderReadByExternalNoDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosOrderReadByExternalNoDTOModel extends ApiCloudObject {

    @ApiCloudField(value="order_external_no", example="A9918034145711UC", required=true)
    private String orderExternalNo;
    @ApiCloudField(value="branch_num", example="99", required=true)
    private Integer branchNum;
}
