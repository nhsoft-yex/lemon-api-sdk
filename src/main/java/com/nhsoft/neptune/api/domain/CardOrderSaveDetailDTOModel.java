package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CardOrderSaveDetailDTO模型
 * 会员卡订单保存明细
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CardOrderSaveDetailDTOModel extends ApiCloudObject {

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
    @ApiCloudField(value="备注 ", example="454154151", required=true)
    private String cardUserMemo;
    @ApiCloudField(value="会员卡编号（团购储值类型时填写）", example="454154151", required=true)
    private Integer cardUserNum;
}
