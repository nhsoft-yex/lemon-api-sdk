package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * GiftCardCreateDTO模型
 * 礼品卡创建DTO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class GiftCardCreateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="卡类型名称", example="中秋月饼卡", required=true)
    private String cardTypeName;
    @ApiCloudField(value="客户名称", example="浙江省乐檬信息有限公司")
    private String clientName;
    @ApiCloudField(value="客户联系方式", example="17644219987")
    private String clientContact;
    @ApiCloudField(value="操作人", example="admin", required=true)
    private String operator;
    @ApiCloudField(value="发卡数量(不指定手机号时，该字段必填)", example="1")
    private Integer giftCardCount;
    @ApiCloudField(value="面值", example="50.0", required=true)
    private BigDecimal giftMoney;
    @ApiCloudField(value="售价", example="0.0", required=true)
    private BigDecimal giftCash;
    @ApiCloudField(value="到期日", example="Thu Aug 01 08:00:00 CST 2024", required=true)
    private String expireTime;
    @ApiCloudField(value="礼品卡固定密码（不填则为随机密码）", example="123456")
    private String fixedPassword;
    @ApiCloudField(value="指定用户手机号列表（gift_card_phone_list字段和该字段冲突，两者任选其一）", example="[17644219987]")
    private List<String> phones;
    @ApiCloudField(value="指定储值卡发卡（phones字段和该字段冲突，两者任选其一；若该字段和phones同时存在，当前字段优先级更高）")
    private List<GiftCardPhoneDTOModel> giftCardPhoneList;
}
