package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WmsCheckOrderReadDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WmsCheckOrderReadDTOModel extends ApiCloudObject {

    @ApiCloudField(value="盘点单单号 ", example="PD20729923063000001", required=true)
    private String checkOrderFid;
    @ApiCloudField(value="配送中心门店编号", example="99", required=true)
    private Integer branchNum;
}
