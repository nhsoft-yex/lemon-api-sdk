package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * AssembleSplitSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AssembleSplitSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编码", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="操作时间", required=true)
    private String assembleSplitDate;
    @ApiCloudField(value="商品档案", required=true)
    private Integer itemNum;
    @ApiCloudField(value="仓库编号", required=true)
    private Integer storehouseNum;
    @ApiCloudField(value="方式(组合|拆分)", example="", required=true)
    private String assembleSplitType;
    @ApiCloudField(value="常用数量", required=true)
    private BigDecimal assembleSplitUseAmount;
    @ApiCloudField(value="常用单位", example="", required=true)
    private String assembleSplitUseUnit;
    @ApiCloudField(value="基本单价", required=true)
    private BigDecimal assembleSplitPrice;
    @ApiCloudField(value="批次号", example="")
    private String assembleSplitLotNumber;
    @ApiCloudField(value="备注", example="")
    private String assembleSplitMemo;
    @ApiCloudField(value="生产日期")
    private String assembleSplitProducingDate;
    @ApiCloudField(value="操作人", example="", required=true)
    private String operatorName;
    @ApiCloudField(value="明细", example="", required=true)
    private List<AssembleSplitSaveDetailDTOModel> assembleSplitDetails;
}
