package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosClientFindDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosClientFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编号", example="99")
    private Integer branchNum;
    @ApiCloudField(value="客户编码列表", example="[004344990000347]")
    private List<String> clientFids;
}
