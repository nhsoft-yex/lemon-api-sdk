package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * SettlementBalanceVO模型
 * 资金支付聚合账户VO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SettlementBalanceVOModel extends ApiCloudObject {

    @ApiCloudField(value="第三方商户号", example="50052100238000018017")
    private String accountNo;
    @ApiCloudField(value="第三方卡号", example="99034720134100697009")
    private String accountCardNo;
    @ApiCloudField(value="第三方账户余额（小数点2位）", example="1.0")
    private BigDecimal totalAmount;
    @ApiCloudField(value="结算户", example="杜一凡")
    private String accountName;
    @ApiCloudField(value="银行卡号", example="6226221906065351")
    private String accountBankCardNo;
}
