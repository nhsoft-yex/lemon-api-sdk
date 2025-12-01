package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * MercuryCustomerDTO模型
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MercuryCustomerDTOModel extends ApiCloudObject {

    @ApiCloudField(value="openid")
    private String openid;
    @ApiCloudField(value="nickname")
    private String nickname;
    @ApiCloudField(value="sex")
    private String sex;
    @ApiCloudField(value="avatar")
    private String avatar;
    @ApiCloudField(value="platform")
    private String platform;
    @ApiCloudField(value="source")
    private String source;
    @ApiCloudField(value="book_code")
    private String bookCode;
    @ApiCloudField(value="phone")
    private String phone;
    @ApiCloudField(value="labels")
    private List<Long> labels;
    @ApiCloudField(value="store_id")
    private String storeId;
    @ApiCloudField(value="unionid")
    private String unionid;
    @ApiCloudField(value="customer_channel_id")
    private String customerChannelId;
    @ApiCloudField(value="memo")
    private String memo;
    @ApiCloudField(value="check_code")
    private String checkCode;
    @ApiCloudField(value="appid")
    private String appid;
    @ApiCloudField(value="customer_id")
    private Long customerId;
    @ApiCloudField(value="branch_id")
    private Integer branchId;
    @ApiCloudField(value="employee_id")
    private Integer employeeId;
}
