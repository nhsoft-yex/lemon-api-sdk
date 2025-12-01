package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CardClientPointDTO模型
 * 会员客户端积分DTO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CardClientPointDTOModel extends ApiCloudObject {

    @ApiCloudField(value="积分明细编号", example="434400011006078")
    private String pointFid;
    @ApiCloudField(value="会员卡编码", example="100")
    private Integer cardUserNum;
    @ApiCloudField(value="积分使用时间", example="2021-02-22 00:00:00")
    private String pointDate;
    @ApiCloudField(value="积分金额", example="1.0")
    private BigDecimal pointBalance;
    @ApiCloudField(value="积分备注", example="备注名称")
    private String pointMemo;
    @ApiCloudField(value="积分使用门店", example="门店名称")
    private String pointShopName;
    @ApiCloudField(value="积分操作类型", example="消费积分")
    private String pointType;
    @ApiCloudField(value="积分操作员", example="操作员")
    private String pointOperator;
    @ApiCloudField(value="关联单据号", example="434401212143087411")
    private String pointRefBillNo;
}
