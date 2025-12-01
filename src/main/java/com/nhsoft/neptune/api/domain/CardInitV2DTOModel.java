package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CardInitV2DTO模型
 * 会员卡初始化DTO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CardInitV2DTOModel extends ApiCloudObject {

    @ApiCloudField(value="表面卡号", example="100000000666", required=true)
    private String cardUserPrintedNum;
    @ApiCloudField(value="操作人", example="管理员", required=true)
    private String cardUserOperator;
    @ApiCloudField(value="介质（电子卡，IC卡，磁条卡）", example="IC卡")
    private String cardUserStorage;
    @ApiCloudField(value="操作门店", example="99", required=true)
    private Integer enrollShop;
    @ApiCloudField(value="卡类型名称", example="电子卡", required=true)
    private String cardUserTypeName;
    @ApiCloudField(value="物理卡号", example="20220615", required=true)
    private String cardUserPhysicalNum;
}
