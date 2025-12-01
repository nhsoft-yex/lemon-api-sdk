package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CustomerByOpenidVO模型
 * 根据OpenID查询的客户信息VO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CustomerByOpenidVOModel extends ApiCloudObject {

    @ApiCloudField(value="会员ID", example="207200025932")
    private String customerId;
    @ApiCloudField(value="姓名", example="姓名")
    private String name;
    @ApiCloudField(value="手机号", example="18058533000")
    private String phone;
    @ApiCloudField(value="性别", example="MALE")
    private String sex;
    @ApiCloudField(value="生日", example="1990-01-01")
    private String birth;
    @ApiCloudField(value="来源渠道（WECHAT_OFFICIAL-公众号|WECHAT_MP-小程序|WECHAT_PAY-微信支付|ALIPAY_PAY-支付宝支付|MANUAL-导入或新增|OFFLINE-线下开卡|WECOM-企业微信|OMS-第三方平台）", example="WECHAT_MP")
    private String source;
    @ApiCloudField(value="创建时间")
    private String createTime;
    @ApiCloudField(value="会员等级", example="207200000019")
    private String level;
    @ApiCloudField(value="会员升级类型（EMPTY-空|PURCHASE-购买|RECEIVE_FREE-免费领取|GIVEN-被赠送|GROWTH-成长）", example="PURCHASE")
    private String levelUpgradeType;
    @ApiCloudField(value="身份类型", example="身份证")
    private String certificateType;
    @ApiCloudField(value="成长值", example="10")
    private Integer growthValue;
    @ApiCloudField(value="默认绑定卡ID", example="1928")
    private Integer defaultCard;
    @ApiCloudField(value="积分余额", example="20")
    private Integer point;
    @ApiCloudField(value="会员入会时间")
    private String memberTime;
    @ApiCloudField(value="首次消费时间(通过手机号查询)")
    private String firstConsumeTime;
    @ApiCloudField(value="会员注册门店编号", example="99")
    private Integer branchNum;
    @ApiCloudField(value="绑定会员卡列表(通过手机号查询)", example="[207200010,207208566]")
    private List<Integer> cardUserNums;
    @ApiCloudField(value="积分倍数", example="1")
    private Integer pointMultiple;
}
