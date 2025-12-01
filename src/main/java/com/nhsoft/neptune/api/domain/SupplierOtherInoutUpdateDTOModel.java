package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SupplierOtherInoutUpdateDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SupplierOtherInoutUpdateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="费用单号", example="OP2072010000016", required=true)
    private String otherInoutFid;
    @ApiCloudField(value="操作人", example="操作人名称", required=true)
    private String otherInoutOperator;
    @ApiCloudField(value="费用项目", example="运费", required=true)
    private String otherInoutKind;
    @ApiCloudField(value="收支方向(0-支出,1-收入)", example="1", required=true)
    private Integer otherInoutFlag;
    @ApiCloudField(value="费用金额（小数点2位）", example="10.0", required=true)
    private BigDecimal otherInoutMoney;
    @ApiCloudField(value="备注", example="备注信息")
    private String otherInoutMemo;
    @ApiCloudField(value="外部流水号(最大长度25)", example="A00001")
    private String otherInoutRefBill;
    @ApiCloudField(value="业务员", example="业务员名称")
    private String otherInoutSeller;
    @ApiCloudField(value="费用时间 格式：yyyy-MM-dd HH:mm:ss", example="2021-01-01 00:00:00", required=true)
    private String otherInoutDate;
}
