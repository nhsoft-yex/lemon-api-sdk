package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CardCouponAntiDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CardCouponAntiDTOModel extends ApiCloudObject {

    @ApiCloudField(value="消费券编码", example="98001201931170003", required=true)
    private String ticketSendDetailPrintNum;
    @ApiCloudField(value="关联单据号", example="0451515120", required=true)
    private String ticketSendDetailOrderNo;
}
