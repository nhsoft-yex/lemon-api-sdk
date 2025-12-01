package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * RelatCardResponseDTO模型
 * 储值卡续卡响应
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RelatCardResponseDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编码", example="1")
    private Integer branchNum;
    @ApiCloudField(value="储值卡编码", example="100")
    private Integer relatCardCustNum;
    @ApiCloudField(value="表面卡号", example="18815281234")
    private String relatCardPrintedNum;
    @ApiCloudField(value="物理卡号", example="13038759297")
    private String relatCardPhysicalNum;
    @ApiCloudField(value="续卡前截止日期")
    private String relatCardOldDeadline;
    @ApiCloudField(value="续卡后截止日期")
    private String relatCardNewDeadline;
    @ApiCloudField(value="续卡操作人", example="管理员")
    private String relatCardOperator;
    @ApiCloudField(value="持卡人姓名", example="测试人")
    private String relatCardCustName;
    @ApiCloudField(value="续卡付款方式", example="支付宝")
    private String relatCardPaymentTypeName;
    @ApiCloudField(value="续卡操作日期")
    private String relatCardOperateTime;
    @ApiCloudField(value="门店名称", example="测试一店")
    private String relatCardBranchName;
    @ApiCloudField(value="续卡备注", example="无")
    private String relatCardMemo;
}
