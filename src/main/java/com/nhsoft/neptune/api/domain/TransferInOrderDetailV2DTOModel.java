package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * TransferInOrderDetailV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TransferInOrderDetailV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="主键", example="")
    private String inOrderFid;
    @ApiCloudField(value="明细编号", example="1")
    private Integer inOrderDetailNum;
    @ApiCloudField(value="批次号", example="202120")
    private String itemLotNumber;
    @ApiCloudField(value="生产日期(yyyy-mm-dd HH:MM:SS)", example="2021-01-20 00:00:00")
    private String itemProductDate;
}
