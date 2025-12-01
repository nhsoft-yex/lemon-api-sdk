package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CardUserUpdateDTO模型
 * 会员卡更新参数
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CardUserUpdateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="会员卡编码", example="150200002", required=true)
    private Integer cardUserNum;
    @ApiCloudField(value="门店编码", example="1", required=true)
    private Integer branchNum;
    @ApiCloudField(value="操作人", example="管理员", required=true)
    private String appUserName;
    @ApiCloudField(value="卡类型编号", example="1", required=true)
    private Integer cardUserType;
    @ApiCloudField(value="卡密码", example="ckmlcmlv")
    private String cardUserPassword;
    @ApiCloudField(value="客户姓名", example="叶新")
    private String cardUserCustName;
    @ApiCloudField(value="联系电话", example="15821457896")
    private String cardUserPhone;
    @ApiCloudField(value="出生日期", example="2021-01-21 00:00:00")
    private String cardUserBirth;
    @ApiCloudField(value="证件类型", example="身份证")
    private String cardUserIdCardType;
    @ApiCloudField(value="证件号", example="4211XXXXXXXXXXXXXX")
    private String cardUserIdCardNum;
    @ApiCloudField(value="性别(男|女|未知)", example="男")
    private String cardUserCustSex;
    @ApiCloudField(value="卡有效期", example="2030-01-01 00:00:00")
    private String cardUserDeadline;
    @ApiCloudField(value="企业名称", example="浙江乐檬")
    private String cardUserFirm;
    @ApiCloudField(value="省", example="浙江省")
    private String province;
    @ApiCloudField(value="市", example="宁波市")
    private String city;
    @ApiCloudField(value="区", example="江北区")
    private String district;
    @ApiCloudField(value="详细地址", example="浙江省宁波市江北区前洋e商小镇3号楼")
    private String address;
}
