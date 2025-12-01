package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * ClientAddressVO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ClientAddressVOModel extends ApiCloudObject {

    @ApiCloudField(value="id", example="")
    private String id;
    @ApiCloudField(value="client_id", example="")
    private String clientId;
    @ApiCloudField(value="contact_name", example="")
    private String contactName;
    @ApiCloudField(value="contact_phone", example="")
    private String contactPhone;
    @ApiCloudField(value="province", example="")
    private String province;
    @ApiCloudField(value="city", example="")
    private String city;
    @ApiCloudField(value="area", example="")
    private String area;
    @ApiCloudField(value="address_detail", example="")
    private String addressDetail;
    @ApiCloudField(value="default_address", example="false")
    private Boolean defaultAddress;
    @ApiCloudField(value="address_id", example="")
    private String addressId;
    @ApiCloudField(value="default_create_flag", example="false")
    private Boolean defaultCreateFlag;
}
