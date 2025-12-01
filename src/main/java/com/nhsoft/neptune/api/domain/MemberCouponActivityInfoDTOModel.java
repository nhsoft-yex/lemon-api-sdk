package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MemberCouponActivityInfoDTO模型
 * 渠道信息
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MemberCouponActivityInfoDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店编号", example="[1,2,3]")
    private List<Integer> branchIds;
    @ApiCloudField(value="渠道名称", example="可用值:AMA,BARB,CRM,IWM,MER,MER2,WECOM")
    private String channel;
    @ApiCloudField(value="备注", example="")
    private String memo;
}
