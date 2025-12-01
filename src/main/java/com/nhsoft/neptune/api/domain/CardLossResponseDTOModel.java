package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CardLossResponseDTO模型
 * 储值卡挂失响应参数
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CardLossResponseDTOModel extends ApiCloudObject {

    @ApiCloudField(value="储值卡编码", example="150200002")
    private Integer cardUserNum;
    @ApiCloudField(value="操作人", example="管理员")
    private String cardLossOperator;
    @ApiCloudField(value="门店名称", example="测试门店")
    private String cardLossBranchName;
    @ApiCloudField(value="物理卡号", example="1020020")
    private String cardLossPhysicalNum;
    @ApiCloudField(value="表面卡号", example="223020")
    private String cardLossPrintedNum;
    @ApiCloudField(value="会员名称", example="叶新")
    private String cardLossCustName;
    @ApiCloudField(value="卡片类型", example="99")
    private Integer cardLossCardType;
    @ApiCloudField(value="操作时间")
    private String cardLossOperateTime;
    @ApiCloudField(value="类型（挂失，解挂）", example="挂失")
    private String cardLossOperateName;
    @ApiCloudField(value="备注", example="无")
    private String cardLossMemo;
}
