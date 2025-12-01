package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MemberV2VO模型
 * 会员信息VO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MemberV2VOModel extends ApiCloudObject {

    @ApiCloudField(value="会员ID", example="207200025932")
    private Integer customerId;
    @ApiCloudField(value="姓名", example="姓名")
    private String name;
    @ApiCloudField(value="手机号", example="18058533000")
    private String phone;
    @ApiCloudField(value="性别", example="MALE")
    private String sex;
    @ApiCloudField(value="生日", example="1990-01-01")
    private String birth;
    @ApiCloudField(value="头像URL地址", example="https://xxxx.jpeg")
    private String pictureUrl;
    @ApiCloudField(value="来源渠道（WECHAT_OFFICIAL-公众号|WECHAT_MP-小程序|WECHAT_PAY-微信支付|ALIPAY_PAY-支付宝支付|MANUAL-导入或新增|OFFLINE-线下开卡|WECOM-企业微信|OMS-第三方平台）", example="WECHAT_MP")
    private String source;
    @ApiCloudField(value="会员等级", example="207200000019")
    private String level;
    @ApiCloudField(value="会员到期时间", example="2022-02-23 23:59:59")
    private String levelDeadline;
    @ApiCloudField(value="会员升级类型（EMPTY-空|PURCHASE-购买|RECEIVE_FREE-免费领取|GIVEN-被赠送|GROWTH-成长）", example="PURCHASE")
    private String levelUpgradeType;
    @ApiCloudField(value="默认绑定卡ID", example="1928")
    private Integer defaultCard;
    @ApiCloudField(value="积分倍数", example="1")
    private Integer pointMultiple;
    @ApiCloudField(value="积分余额", example="20")
    private Integer point;
    @ApiCloudField(value="成长值", example="10")
    private Integer growthValue;
    @ApiCloudField(value="是否是黑名单(0:非黑名单 1:黑名单)", example="0")
    private Integer blackFlag;
    @ApiCloudField(value="创建时间", example="2022-01-24 15:50:42")
    private String createTime;
    @ApiCloudField(value="等级排名(通过手机号查询)", example="2")
    private Integer rank;
    @ApiCloudField(value="是否付费会员(通过手机号查询)", example="true")
    private Boolean isPaidMember;
    @ApiCloudField(value="首次消费时间(通过手机号查询)", example="2019-07-10 15:40:19")
    private String firstConsumeTime;
    @ApiCloudField(value="绑定会员卡列表(通过手机号查询)", example="[207200010,207208566]")
    private List<Integer> cardUserNums;
    @ApiCloudField(value="身份权益集合(ONLINE_VIP-线上会员|OFFLINE_VIP-线下会员价|COUPON-优惠券)(通过手机号查询)", example="COUPON")
    private List<String> privileges;
    @ApiCloudField(value="来源门店名称(通过手机号查询)", example="测试一店")
    private String sourceStoreName;
    @ApiCloudField(value="优惠券数量(通过手机号查询)", example="1")
    private Integer couponCount;
    @ApiCloudField(value="总消费金额(通过手机号查询)", example="0.0")
    private BigDecimal consumeMoney;
    @ApiCloudField(value="总消费次数(通过手机号查询)", example="1")
    private Integer consumeCount;
    @ApiCloudField(value="阿里会员编号", example="1")
    private String alipayUserId;
}
