package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MemberDetailV1VO模型
 * 会员详细信息VO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MemberDetailV1VOModel extends ApiCloudObject {

    @ApiCloudField(value="会员ID", example="207200025932")
    private Integer customerId;
    @ApiCloudField(value="姓名", example="姓名")
    private String nickname;
    @ApiCloudField(value="年龄", example="30")
    private Integer age;
    @ApiCloudField(value="手机号", example="18058533000")
    private String customerPhone;
    @ApiCloudField(value="生日", example="1990-01-01")
    private String birth;
    @ApiCloudField(value="性别", example="MALE")
    private String sex;
    @ApiCloudField(value="来源渠道（WECHAT_OFFICIAL-公众号|WECHAT_MP-小程序|WECHAT_PAY-微信支付|ALIPAY_PAY-支付宝支付|MANUAL-导入或新增|OFFLINE-线下开卡|WECOM-企业微信|OMS-第三方平台）", example="WECHAT_MP")
    private String source;
    @ApiCloudField(value="会员升级类型（EMPTY-空|PURCHASE-购买|RECEIVE_FREE-免费领取|GIVEN-被赠送|GROWTH-成长）", example="PURCHASE")
    private String levelUpgradeType;
    @ApiCloudField(value="创建时间", example="2022-01-24 15:50:42")
    private String createTime;
    @ApiCloudField(value="会员到期时间", example="2022-02-23 23:59:59")
    private String levelDeadline;
    @ApiCloudField(value="会员等级", example="207200000019")
    private String level;
    @ApiCloudField(value="会员等级名称", example="V1")
    private String levelName;
    @ApiCloudField(value="等级排名", example="2")
    private Integer rank;
    @ApiCloudField(value="是否付费会员", example="1")
    private Integer isPaidMember;
    @ApiCloudField(value="成长值", example="10")
    private Integer growthValue;
    @ApiCloudField(value="身份权益集合(ONLINE_VIP-线上会员|OFFLINE_VIP-线下会员价|COUPON-优惠券)", example="COUPON")
    private List<String> privileges;
    @ApiCloudField(value="默认绑定卡ID", example="1928")
    private Integer defaultCard;
    @ApiCloudField(value="积分余额", example="20")
    private Integer point;
    @ApiCloudField(value="来源门店名称", example="测试一店")
    private String sourceStoreName;
    @ApiCloudField(value="来源门店编号", example="1")
    private Integer sourceStoreId;
    @ApiCloudField(value="总消费金额", example="0.0")
    private BigDecimal consumeMoney;
    @ApiCloudField(value="消费次数", example="1")
    private Integer consumeCount;
    @ApiCloudField(value="线上会员信息")
    private List<OnlineMemberInfoModel> mercuryList;
    @ApiCloudField(value="会员更新时间")
    private String updatedAt;
    @ApiCloudField(value="卡余额", example="1.0")
    private BigDecimal cardBalance;
    @ApiCloudField(value="零钱包余额", example="1.0")
    private BigDecimal coinWalletBalance;
    @ApiCloudField(value="最近消费时间")
    private String lastConsumeTime;
    @ApiCloudField(value="绑定微信", example="true")
    private Boolean bindWechat;
    @ApiCloudField(value="省", example="浙江省")
    private String province;
    @ApiCloudField(value="市", example="宁波市")
    private String city;
    @ApiCloudField(value="区", example="江北区")
    private String district;
    @ApiCloudField(value="详细地址", example="浙江省宁波市江北区")
    private String address;
}
