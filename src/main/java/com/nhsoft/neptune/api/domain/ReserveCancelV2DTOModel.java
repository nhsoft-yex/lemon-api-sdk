package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ReserveCancelV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ReserveCancelV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="促销单号", example="434400991000011", required=true)
    private String orderFid;
    @ApiCloudField(value="操作人", example="管理员", required=true)
    private String orderOperator;
}
