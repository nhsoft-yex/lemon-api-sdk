package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MemberCouponActivityDetailDTO模型
 * 会员优惠券活动明细
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MemberCouponActivityDetailDTOModel extends ApiCloudObject {

    @ApiCloudField(value="活动明细ID", example="1")
    private Integer id;
    @ApiCloudField(value="可用结束时间", example="2022-01-01 00:00:00")
    private String availEnd;
    @ApiCloudField(value="可用开始时间", example="2022-01-01 00:00:00")
    private String availStart;
    @ApiCloudField(value="账套号", example="2072", required=true)
    private String bookCode;
    @ApiCloudField(value="门店编号")
    private List<Integer> branchIds;
    @ApiCloudField(value="发券数量", example="100")
    private Integer count;
    @ApiCloudField(value="渠道信息")
    private List<MemberCouponActivityInfoDTOModel> infos;
    @ApiCloudField(value="发券方式", example="H5")
    private String issueType;
    @ApiCloudField(value="回调地址")
    private String notifyUrl;
    @ApiCloudField(value="仅发券门店可用")
    private Boolean onlyCreateBranchAvail;
    @ApiCloudField(value="外部活动明细ID")
    private String outActivityDetailId;
    @ApiCloudField(value="消费券类型", required=true)
    private Integer typeId;
}
