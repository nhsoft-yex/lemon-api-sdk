package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CardLevelUpdateDTO模型
 * 会员卡等级更新参数
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CardLevelUpdateDTOModel extends ApiCloudObject {

    @ApiCloudField(value="用户手机号", example="185XXXXXXXX", required=true)
    private String userPhone;
    @ApiCloudField(value="等级Id", example="2072000000017", required=true)
    private Long levelId;
    @ApiCloudField(value="操作人", example="管理员", required=true)
    private String operator;
    @ApiCloudField(value="购卡类别", example="MONTH:月卡,QUARTER:季卡,SEMI_ANNUAL:半年卡,ANNUAL:年卡")
    private String kind;
}
