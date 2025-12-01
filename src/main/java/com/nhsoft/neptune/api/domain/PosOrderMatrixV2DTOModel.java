package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosOrderMatrixV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosOrderMatrixV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="单据号", example="1")
    private String orderNo;
    @ApiCloudField(value="门店编码", example="2")
    private Integer branchNum;
    @ApiCloudField(value="营业日", example="1")
    private String shiftTableBizday;
    @ApiCloudField(value="全渠道会员ID", example="1")
    private String customerId;
    @ApiCloudField(value="微信ID", example="1")
    private String openId;
    @ApiCloudField(value="支付宝用户ID", example="1")
    private String alipayUserId;
    @ApiCloudField(value="班次号", example="1")
    private Integer shiftTableNum;
}
