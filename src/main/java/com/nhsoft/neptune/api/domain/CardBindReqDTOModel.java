package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CardBindReqDTO模型
 * 储值卡绑定请求DTO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CardBindReqDTOModel extends ApiCloudObject {

    @ApiCloudField(value="储值卡编码", example="2055", required=true)
    private Integer cardUserNum;
    @ApiCloudField(value="会员电话号码", example="17644219971", required=true)
    private String phone;
    @ApiCloudField(value="门店编码", example="1", required=true)
    private Integer branchNum;
    @ApiCloudField(value="操作人", example="管理员", required=true)
    private String operator;
}
