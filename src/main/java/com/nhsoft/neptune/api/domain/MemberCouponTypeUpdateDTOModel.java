package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MemberCouponTypeUpdateDTO模型
 * 消费券类型修改DTO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MemberCouponTypeUpdateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="basic_info", required=true)
    private MemberCouponTypeBasicInfoUpdateDTOModel basicInfo;
    @ApiCloudField(value="online_info")
    private MemberCouponTypeOnlineInfoDTOModel onlineInfo;
    @ApiCloudField(value="offline_info")
    private MemberCouponTypeOfflineInfoDTOModel offlineInfo;
}
