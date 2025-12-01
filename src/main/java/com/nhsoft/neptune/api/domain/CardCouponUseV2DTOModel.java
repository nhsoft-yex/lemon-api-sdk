package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CardCouponUseV2DTO模型
 * 会员卡消费券使用V2DTO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CardCouponUseV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编码", example="99", required=true)
    private Integer branchNum;
    @ApiCloudField(value="消费券编码", example="98001201931170003", required=true)
    private String ticketSendDetailPrintNum;
    @ApiCloudField(value="核券人", example="管理员", required=true)
    private String operator;
    @ApiCloudField(value="外部核销单据号", example="207299203630600004", required=true)
    private String outTradeNo;
    @ApiCloudField(value="券备注", example="备注信息", required=true)
    private String memo;
    @ApiCloudField(value="核销单据金额", example="1.0", required=true)
    private BigDecimal consumeMoney;
    @ApiCloudField(value="券实际抵扣金额（v2接口使用）", example="1.0")
    private BigDecimal money;
}
