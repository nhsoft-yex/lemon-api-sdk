package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * UserBasicBranchVO模型
 * 用户中心门店
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class UserBasicBranchVOModel extends ApiCloudObject {

    @ApiCloudField(value="门店ID", example="1")
    private Integer id;
    @ApiCloudField(value="门店类型（SYSTEM | USER）", example="SYSTEM")
    private String type;
    @ApiCloudField(value="公司ID", example="2072")
    private Long companyId;
    @ApiCloudField(value="系统ID", example="1")
    private Integer systemId;
    @ApiCloudField(value="门店代码", example="1")
    private String code;
    @ApiCloudField(value="门店名称", example="一店")
    private String name;
    @ApiCloudField(value="门店拼音", example="yidian")
    private String pinyin;
    @ApiCloudField(value="门店区域ID", example="1")
    private String regionId;
    @ApiCloudField(value="门店区域名称", example="所有区域")
    private String regionName;
    @ApiCloudField(value="加盟商ID", example="1")
    private Integer franchiseeId;
    @ApiCloudField(value="中心标记", example="true")
    private Boolean center;
    @ApiCloudField(value="是否启用", example="true")
    private Boolean enable;
    @ApiCloudField(value="是否删除", example="true")
    private Boolean deleted;
    @ApiCloudField(value="描述", example="门店描述")
    private String description;
    @ApiCloudField(value="联系人", example="杜一凡")
    private String contact;
    @ApiCloudField(value="联系电话", example="18667885599")
    private String phone;
    @ApiCloudField(value="省", example="浙江省")
    private String province;
    @ApiCloudField(value="市", example="宁波市")
    private String city;
    @ApiCloudField(value="区", example="镇海区")
    private String district;
    @ApiCloudField(value="地址", example="浙江省宁波市")
    private String address;
    @ApiCloudField(value="邮编", example="315200")
    private String postcode;
    @ApiCloudField(value="场景（OFFLINE | CATERING | ONLINE | SETTLEMENT）", example="[OFFLINE]")
    private List<String> scenes;
    @ApiCloudField(value="经度", example="121.460096")
    private String longitude;
    @ApiCloudField(value="维度", example="29.948591")
    private String latitude;
    @ApiCloudField(value="门店证书禁用", example="true")
    private Boolean licenseDisable;
}
