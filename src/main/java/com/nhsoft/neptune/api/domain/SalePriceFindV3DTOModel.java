package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SalePriceFindV3DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SalePriceFindV3DTOModel extends ApiCloudObject {

    @ApiCloudField(value="最后修改时间（yyyy-MM-dd HH:mm:ss）", example="2021-01-01 00:00:00", required=true)
    private String lastDownloadTime;
    @ApiCloudField(value="门店编码", example="99", required=true)
    private Integer branchNum;
}
