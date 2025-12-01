package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CardOrderSaveDetailResponseDTO模型
 * 会员卡订单保存明细响应DTO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CardOrderSaveDetailResponseDTOModel extends ApiCloudObject {

    @ApiCloudField(value="单据号", example="BC2072010000002", required=true)
    private String cardOrderFid;
    @ApiCloudField(value="储值卡编号", example="144", required=true)
    private Integer cardUserNum;
    @ApiCloudField(value="表面卡号", example="92000001", required=true)
    private String orderDetailPrintedNum;
    @ApiCloudField(value="物理卡号", example="92000001", required=true)
    private String orderDetailPhysicalNum;
    @ApiCloudField(value="实际付款金额", example="10.0", required=true)
    private BigDecimal orderDetailCash;
    @ApiCloudField(value="付款金额", example="10.0", required=true)
    private BigDecimal orderDetailMoney;
    @ApiCloudField(value="门店编号", example="1", required=true)
    private Integer branchNum;
    @ApiCloudField(value="卡密码", example="454154151", required=true)
    private String cardOrderDetailPassword;
    @ApiCloudField(value="order_detail_repeal_money")
    private BigDecimal orderDetailRepealMoney;
    @ApiCloudField(value="备注", example="454154151", required=true)
    private String cardUserMemo;
}
