package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * BasicStoreVO模型
 * 商城门店
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BasicStoreVOModel extends ApiCloudObject {

    @ApiCloudField(value="门店ID", example="27894")
    private Integer storeId;
    @ApiCloudField(value="门店名称", example="扬帆店")
    private String storeName;
    @ApiCloudField(value="内部门店ID", example="1")
    private Integer offLineStoreId;
    @ApiCloudField(value="分门店名称", example="鼓楼店")
    private String subStoreName;
    @ApiCloudField(value="门店描述", example="描述")
    private String description;
    @ApiCloudField(value="省名称", example="浙江省")
    private String provinceName;
    @ApiCloudField(value="省代码", example="330000")
    private String provinceCode;
    @ApiCloudField(value="市名称", example="宁波市")
    private String cityName;
    @ApiCloudField(value="市CODE", example="330200")
    private String cityCode;
    @ApiCloudField(value="区/县名称", example="海曙区")
    private String districtName;
    @ApiCloudField(value="区/县代码", example="330203")
    private String districtCode;
    @ApiCloudField(value="联系电话", example="185XXXXXXXX")
    private String phone;
    @ApiCloudField(value="是否启用", example="true")
    private Boolean active;
    @ApiCloudField(value="经度", example="121.529692")
    private String longitude;
    @ApiCloudField(value="纬度", example="29.867829")
    private String latitude;
}
