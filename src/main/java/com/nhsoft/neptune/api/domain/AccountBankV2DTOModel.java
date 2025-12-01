package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * AccountBankV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AccountBankV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="现金银行编码", example="434400067")
    private Integer accountBankNum;
    @ApiCloudField(value="名称", example="月氏")
    private String accountBankName;
    @ApiCloudField(value="余额", example="3092.54")
    private BigDecimal accountBankBalance;
    @ApiCloudField(value="是否现金账户", example="false")
    private Boolean accountBankCashFlag;
    @ApiCloudField(value="银行账号", example="2323")
    private String accountBankNo;
    @ApiCloudField(value="分店编码", example="99")
    private Integer accountBankBranchNum;
    @ApiCloudField(value="是否启用", example="true")
    private Boolean accountBankEnabled;
    @ApiCloudField(value="开户行", example="5555")
    private String accountBankBank;
    @ApiCloudField(value="开户账户名", example="月氏")
    private String accountBankBankUser;
    @ApiCloudField(value="是否对外", example="false")
    private Boolean accountBankOpened;
}
