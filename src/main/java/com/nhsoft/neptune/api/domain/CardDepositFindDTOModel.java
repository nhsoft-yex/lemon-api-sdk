package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CardDepositFindDTO模型
 * 储值卡查询DTO
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CardDepositFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="会员卡编码(会员卡与门店二选一进行查询)", example="1")
    private Integer cardUserNum;
    @ApiCloudField(value="门店编码(会员卡与门店二选一进行查询)", example="99")
    private Integer branchNum;
    @ApiCloudField(value="初始时间(yyyy-MM-dd HH:mm:ss)(按门店查询时必传,会员卡查询时选传)")
    private String dateFrom;
    @ApiCloudField(value="结束时间(yyyy-MM-dd HH:mm:ss)(按门店查询时必传,会员卡查询时选传)")
    private String dateTo;
    @ApiCloudField(value="查询页码", example="1")
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小(最大1000)", example="100")
    private Integer pageSize;
}
