package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CardRevokeReqDTO模型
 * 储值卡回收请求DTO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CardRevokeReqDTOModel extends ApiCloudObject {

    @ApiCloudField(value="储值卡编码", example="150200002", required=true)
    private Integer cardUserNum;
    @ApiCloudField(value="储值卡回收人", example="管理员", required=true)
    private String cardUserRevoker;
    @ApiCloudField(value="回收原因", example="无")
    private String revokeReason;
    @ApiCloudField(value="回收门店编号", example="1", required=true)
    private Integer cardUserRevokeShop;
    @ApiCloudField(value="班次号", example="22001", required=true)
    private Integer revokeShiftNum;
    @ApiCloudField(value="交班日期(yyyyMMdd)", example="20210221", required=true)
    private String revokeShiftBizday;
    @ApiCloudField(value="表面卡号（仅当储值卡为IC卡时必填）", example="20215613151651")
    private String cardPrintedNum;
}
