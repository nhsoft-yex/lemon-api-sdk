package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * WmsClientFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WmsClientFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="配送中心门店编码", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="客户类型（门店|批发客户|店铺）", example="[门店]")
    private List<String> wmsClientTypes;
}
