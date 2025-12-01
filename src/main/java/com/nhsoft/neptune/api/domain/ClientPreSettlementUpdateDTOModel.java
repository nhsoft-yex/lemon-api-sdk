package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ClientPreSettlementUpdateDTO模型
 * 客户预收结算更新
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ClientPreSettlementUpdateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="客户预收单号", example="YC4344010000010", required=true)
    private String preSettlementNo;
    @ApiCloudField(value="客户编号", example="434400001", required=true)
    private String clientFid;
    @ApiCloudField(value="门店编码", example="1", required=true)
    private Integer branchNum;
    @ApiCloudField(value="地址", example="宁波")
    private String preSettlementAddress;
    @ApiCloudField(value="付款日期 格式：yyyy-MM-dd", example="Wed Jan 20 08:00:00 CST 2021", required=true)
    private String preSettlementDate;
    @ApiCloudField(value="付款方式", example="现金", required=true)
    private String preSettlementPaymentType;
    @ApiCloudField(value="现金银行编号", example="43440001", required=true)
    private Integer accountBankNum;
    @ApiCloudField(value="备注", example="备注")
    private String preSettlementMemo;
    @ApiCloudField(value="操作人", example="管理员", required=true)
    private String preSettlementOperator;
    @ApiCloudField(value="预付金额（小数点2位）", example="1.0", required=true)
    private BigDecimal preSettlementPaid;
    @ApiCloudField(value="关联批发订单号列表", example="[WB203099004]")
    private List<String> wholesaleBookFids;
}
