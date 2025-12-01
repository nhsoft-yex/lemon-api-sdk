package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BranchItemRecordUpdateDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BranchItemRecordUpdateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编码", example="1", required=true)
    private Integer branchNum;
    @ApiCloudField(value="仓库编码", example="43440200001", required=true)
    private Integer storehouseNum;
    @ApiCloudField(value="单据类型(1-收货单;2-调入单;3-盘点单;4-组合拆分单;5-生产入库单;6-成品入库单;7-调整单)", required=true)
    private Integer branchItemRecoredTypeCode;
    @ApiCloudField(value="明细", example="", required=true)
    private List<BranchItemRecordDetailUpdateDTOModel> details;
}
