package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * TransferOutOrderItemExpirationDetailDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TransferOutOrderItemExpirationDetailDTOModel extends ApiCloudObject {

    @ApiCloudField(value="商品编号", example="1", required=true)
    private Integer itemNum;
    @ApiCloudField(value="批次号", example="202120")
    private String itemLotNumber;
    @ApiCloudField(value="生产日期(yyyy-mm-dd)", example="2021-01-20", required=true)
    private String itemProductDate;
}
