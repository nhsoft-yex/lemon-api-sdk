package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CheckOrderUpdateV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CheckOrderUpdateV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="库存盘点单号", example="CR2072010000002", required=true)
    private String checkOrderFid;
    @ApiCloudField(value="操作人", example="管理员", required=true)
    private String checkOrderOperator;
    @ApiCloudField(value="盘点日期（yyyy-mm-dd）", example="2021-01-20")
    private String checkOrderDate;
    @ApiCloudField(value="备注", example="备注信息")
    private String checkOrderMemo;
    @ApiCloudField(value="明细", example="", required=true)
    private List<CheckOrderSaveDetailV2DTOModel> checkOrderDetails;
}
