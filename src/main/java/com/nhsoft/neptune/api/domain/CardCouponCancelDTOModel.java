package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CardCouponCancelDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CardCouponCancelDTOModel extends ApiCloudObject {

    @ApiCloudField(value="消费券标志", example="N15LLX284KFRCY6972KT80OQW5VMQDVK", required=true)
    private String ticketSendDetailUuid;
    @ApiCloudField(value="消费券券号", example="98001201931170003", required=true)
    private String ticketSendDetailPrintNum;
    @ApiCloudField(value="作废原因备注", example="备注")
    private String memo;
}
