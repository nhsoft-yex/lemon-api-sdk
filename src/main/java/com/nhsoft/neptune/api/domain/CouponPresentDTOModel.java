package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CouponPresentDTO模型
 * 优惠券赠送
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CouponPresentDTOModel extends ApiCloudObject {

    @ApiCloudField(value="券码", example="51521810041", required=true)
    private String barcode;
    @ApiCloudField(value="手机号码(phone card_user_num必传一个，一起传的话phone优先级高)", example="158025872110")
    private String phone;
    @ApiCloudField(value="储值卡编号(phone card_user_num必传一个，一起传的话phone优先级高)", example="158025872110")
    private Integer cardUserNum;
}
