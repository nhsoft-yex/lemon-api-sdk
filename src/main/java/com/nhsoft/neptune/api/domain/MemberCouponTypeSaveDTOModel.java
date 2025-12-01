package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MemberCouponTypeSaveDTO模型
 * 消费券类型保存DTO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MemberCouponTypeSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="basic_info", required=true)
    private MemberCouponTypeBasicInfoDTOModel basicInfo;
    @ApiCloudField(value="online_info")
    private MemberCouponTypeOnlineInfoDTOModel onlineInfo;
    @ApiCloudField(value="offline_info")
    private MemberCouponTypeOfflineInfoDTOModel offlineInfo;
}
