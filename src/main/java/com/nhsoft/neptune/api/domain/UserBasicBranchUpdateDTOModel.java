package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * UserBasicBranchUpdateDTO模型
 * 用户中心门店更新DTO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class UserBasicBranchUpdateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="门店ID", example="1")
    private Integer id;
    @ApiCloudField(value="门店代码", example="1")
    private String code;
    @ApiCloudField(value="门店名称", example="一店")
    private String name;
    @ApiCloudField(value="门店拼音", example="yidian")
    private String pinyin;
    @ApiCloudField(value="门店区域ID", example="1")
    private Long regionId;
    @ApiCloudField(value="加盟商ID", example="1")
    private Integer franchiseeId;
    @ApiCloudField(value="中心标记", example="true")
    private Boolean center;
    @ApiCloudField(value="是否启用", example="true")
    private Boolean enable;
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
    @ApiCloudField(value="经度")
    private BigDecimal longitude;
    @ApiCloudField(value="纬度")
    private BigDecimal latitude;
    @ApiCloudField(value="导航开关", example="true")
    private Boolean navigationFlag;
}
