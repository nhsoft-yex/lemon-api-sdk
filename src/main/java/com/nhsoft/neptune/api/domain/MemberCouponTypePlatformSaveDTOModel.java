package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MemberCouponTypePlatformSaveDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MemberCouponTypePlatformSaveDTOModel extends ApiCloudObject {

    @ApiCloudField(value="券类型id", example="18010055021131225", required=true)
    private String id;
    @ApiCloudField(value="第三方平台信息", required=true)
    private List<MemberCouponPlatformInfoVOModel> platformInfos;
}
