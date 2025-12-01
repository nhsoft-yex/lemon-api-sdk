package com.nhsoft.neptune.api.domain;

import com.nhsoft.neptune.ApiCloudObject;
import com.nhsoft.neptune.ApiCloudField;

import java.math.BigDecimal;

import java.util.*;

import lombok.Data;

import lombok.EqualsAndHashCode;

/**
 * CardDepositBizdayFindDTO模型
 * 储值卡营业日查询
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CardDepositBizdayFindDTOModel extends ApiCloudObject {

    @ApiCloudField(value="操作门店编码", example="1", required=true)
    private Integer branchNum;
    @ApiCloudField(value="营业日", example="20210601")
    private String shiftTableBizday;
    @ApiCloudField(value="营业日开始时间", example="2021-01-21 00:00:00")
    private String dateFrom;
    @ApiCloudField(value="营业日结束时间", example="2021-04-21 00:00:00")
    private String dateTo;
    @ApiCloudField(value="查询分页页码", example="1", required=true)
    private Integer pageNo;
    @ApiCloudField(value="查询分页大小(最大1000)", example="100", required=true)
    private Integer pageSize;
}
