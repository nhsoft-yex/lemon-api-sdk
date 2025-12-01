package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * PosCouponDetailV2DTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PosCouponDetailV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="消费券名称", example="满减券")
    private String couponName;
    @ApiCloudField(value="抵用金额（小数点2位）", example="1.0")
    private BigDecimal couponMoney;
    @ApiCloudField(value="销售金额（小数点2位）", example="1.0")
    private BigDecimal couponSaleMoney;
    @ApiCloudField(value="券状态(1:销售,2:囎送,4:退货,8:取消)")
    private Integer couponStateCode;
    @ApiCloudField(value="备注", example="备注信息")
    private String couponMemo;
    @ApiCloudField(value="券编号", example="9000003153005074")
    private String couponDetailUuid;
    @ApiCloudField(value="券来源", example="内部券")
    private String couponPlatformType;
    @ApiCloudField(value="券类型编号", example="317")
    private Long couponTypeId;
}
