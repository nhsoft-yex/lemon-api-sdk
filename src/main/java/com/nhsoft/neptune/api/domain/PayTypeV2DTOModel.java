package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PayTypeV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PayTypeV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="支付方式代码", example="01")
    private String paymentTypeCode;
    @ApiCloudField(value="支付方式名称", example="现金")
    private String paymentTypeName;
    @ApiCloudField(value="支付方式备注", example="备注信息")
    private String paymentTypeMemo;
    @ApiCloudField(value=" 允许POS前台使用(1:允许,0:不允许)", example="1")
    private Integer paymentTypePos;
    @ApiCloudField(value=" 前台缴款单需录入(1:支持,0:不支持)", example="1")
    private Integer paymentNeedCheck;
    @ApiCloudField(value=" 支持前台销售(1:支持,0:不支持)", example="1")
    private Integer posOrderPaymentType;
    @ApiCloudField(value=" 支持卡存款(1:支持,0:不支持)", example="1")
    private Integer posCardPaymentType;
    @ApiCloudField(value=" 支付方式即来源(1:支持,0:不支持)", example="1")
    private Integer posPaymentEqualSource;
    @ApiCloudField(value=" 允许弹出钱箱(1:允许,0:不允许)", example="1")
    private Integer enableEjectCashBox;
    @ApiCloudField(value=" 启用第三方支付方式(1:允许,0:不允许)", example="1")
    private Integer enableThirdPart;
    @ApiCloudField(value=" 应用门店", example="")
    private List<BranchNameV2DTOModel> branchs;
}
