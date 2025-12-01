package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PayTypeSaveV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PayTypeSaveV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="支付方式代码", example="01", required=true)
    private String paymentTypeCode;
    @ApiCloudField(value="支付方式名称", example="现金", required=true)
    private String paymentTypeName;
    @ApiCloudField(value="支付方式备注", example="备注信息")
    private String paymentTypeMemo;
    @ApiCloudField(value=" 允许POS前台使用(1:允许,0:不允许)", example="1", required=true)
    private Integer paymentTypePos;
    @ApiCloudField(value=" 前台缴款单需录入(1:支持,0:不支持)", example="1", required=true)
    private Integer paymentNeedCheck;
    @ApiCloudField(value=" 支持前台销售(1:支持,0:不支持)", example="1", required=true)
    private Integer posOrderPaymentType;
    @ApiCloudField(value=" 支持卡存款(1:支持,0:不支持)", example="1", required=true)
    private Integer posCardPaymentType;
    @ApiCloudField(value=" 支付方式即来源(1:支持,0:不支持)", example="1", required=true)
    private Integer posPaymentEqualSource;
    @ApiCloudField(value=" 允许弹出钱箱(1:允许,0:不允许)", example="1", required=true)
    private Integer enableEjectCashBox;
    @ApiCloudField(value=" 启用第三方支付方式(1:允许,0:不允许)", example="1")
    private Integer enableThirdPart;
    @ApiCloudField(value="积分抵扣、自动抵扣(1:允许,0:不允许)", example="1")
    private Integer autoDeduction;
    @ApiCloudField(value=" 应用门店编码（不传表示全部门店）", example="[10, 12]")
    private List<Integer> branchNums;
}
