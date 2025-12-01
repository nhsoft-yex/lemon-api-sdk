package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosItemCommissionSaveVO模型
 * 销售提成
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosItemCommissionSaveVOModel extends ApiCloudObject {

    @ApiCloudField(value="提成方式（固定提成金额，按销售利润百分比提成，按销售额百分比提成，没有提成）", example="固定提成金额")
    private String commissionType;
    @ApiCloudField(value="提成金额（比例）", example="1.0")
    private BigDecimal commissionMoney;
    @ApiCloudField(value="基准金额", example="1.0")
    private BigDecimal commissionBase;
    @ApiCloudField(value="是否按标准售价销售时才计算提成", example="true")
    private Boolean commissionWithoutPromotion;
}
