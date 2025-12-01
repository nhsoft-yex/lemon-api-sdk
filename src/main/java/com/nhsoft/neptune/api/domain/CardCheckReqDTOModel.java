package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CardCheckReqDTO模型
 * 储值卡校验请求DTO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CardCheckReqDTOModel extends ApiCloudObject {

    @ApiCloudField(value="储值卡编码", example="2055", required=true)
    private Integer cardUserNum;
    @ApiCloudField(value="门店编码", example="1", required=true)
    private Integer branchNum;
    @ApiCloudField(value="储值卡密码", example="123456", required=true)
    private String cardUserPassword;
}
