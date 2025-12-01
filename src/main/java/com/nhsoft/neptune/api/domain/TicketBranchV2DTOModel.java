package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * TicketBranchV2DTO模型
 * 应用门店列表
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TicketBranchV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编码", example="0")
    private Integer branchNum;
    @ApiCloudField(value="门店名称", example="所有门店")
    private String branchName;
}
